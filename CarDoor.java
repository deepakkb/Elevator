package Elevator;

public class CarDoor {

    private ElevatorCar elevatorCar;
    public CarDoor(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }

    public void openDoor() {
        try {
            Thread.sleep(5000L);
        } catch(InterruptedException ie) {
        // Exception handling code here, it is a bad practice to leave this scope empty
        }
        closeDoor();
    }

    public void closeDoor() {
        try {
            Thread.sleep(5000L);
        } catch(InterruptedException ie) {
            // Exception handling code here, it is a bad practice to leave this scope empty
        }
        elevatorCar.moveCar();
    }
}
