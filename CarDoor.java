package Elevator;

public class CarDoor {

    private ElevatorCar elevatorCar;
    public CarDoor(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }

    public void openDoor() {
        try {
            Thread.sleep(1000L);
        } catch(InterruptedException ie) {
        }
        closeDoor();
    }

    public void closeDoor() {
        try {
            Thread.sleep(1000L);
        } catch(InterruptedException ie) {
        }
        elevatorCar.moveCar();
    }
}
