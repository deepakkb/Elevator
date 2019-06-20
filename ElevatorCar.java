package Elevator;

public class ElevatorCar {
    public Direction currentDirection;
    public CarButton[] carButtons;
    public int currentFloor;
    public CarDoor carDoor;

    public ElevatorCar() {
        carButtons = new CarButton[ElevatorController.totalFloors];
        for (int i=0; i<ElevatorController.totalFloors; i++) {
            carButtons[i] = new CarButton(i);
        }
        currentFloor = 0;
        carDoor = new CarDoor(this);
        currentDirection = Direction.UP;
    }

    public void moveCar() {
        while(true) {
            while (currentDirection == Direction.UP) {
                System.out.format("Going %s to floor%d\n", currentDirection.toString(), currentFloor);
                if (currentFloor < ElevatorController.totalFloors-1) {
                    currentFloor++;
                }
                if (ElevatorController.floors[currentFloor].hallButtonUp.isPressed) {
                    ElevatorController.floors[currentFloor].hallButtonUp.isPressed = false;
                    stopCar();
                }
                if (carButtons[currentFloor].isPressed) {
                    carButtons[currentFloor].isPressed = false;
                    stopCar();
                }
                if (currentFloor == ElevatorController.totalFloors - 1) {
                    currentDirection = Direction.DOWN;
                }
            }
            while (currentDirection == Direction.DOWN) {
                System.out.format("Going %s to floor%d\n", currentDirection.toString(), currentFloor);
                if (currentFloor > 0) {
                    currentFloor--;
                }
                if (ElevatorController.floors[currentFloor].hallButtonDown.isPressed) {
                    ElevatorController.floors[currentFloor].hallButtonDown.isPressed = false;
                    stopCar();
                }
                if (carButtons[currentFloor].isPressed) {
                    carButtons[currentFloor].isPressed = false;
                    stopCar();
                }
                if (currentFloor == 0) {
                    currentDirection = Direction.UP;
                }
            }
        }
    }

    public void stopCar() {
        System.out.format("Stopping %s at floor%d\n", currentDirection.toString(), currentFloor);
        try {
            Thread.sleep(1000L);
        } catch(InterruptedException ie) {

        }
        carDoor.openDoor();
    }
}
