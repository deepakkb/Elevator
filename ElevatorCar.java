package Elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCar {
    public List<CarButton> carButtons;
    public int currentFloor;
    public CarDoor carDoor;

    public ElevatorCar() {
        carButtons = new ArrayList<>();
        for (int i=1; i<=ElevatorController.totalFloors; i++) {
            CarButton carButton = new CarButton(i);
            carButtons.add(carButton);
        }
        currentFloor = 1;
        carDoor = new CarDoor(this);
    }

    public void moveCar() {
        if (ElevatorController.currentDirection == Direction.UP &&
                currentFloor < ElevatorController.totalFloors &&  ElevatorController.userInfo.floors[currentFloor+1] >0) {
            stopCar();
        }
        if (ElevatorController.currentDirection == Direction.DOWN &&
                currentFloor >1 &&  ElevatorController.userInfo.floors[currentFloor-1] >0) {
            stopCar();
        }
    }

    public void stopCar() {
        if (ElevatorController.currentDirection == Direction.UP) {
            if (currentFloor < ElevatorController.totalFloors) {
                currentFloor++;
            } else if (currentFloor == ElevatorController.totalFloors) {
                currentFloor--;
                ElevatorController.currentDirection = Direction.DOWN;
            }
        } else {
            if (currentFloor >1) {
                currentFloor--;
            } else if (currentFloor == 1) {
                ElevatorController.currentDirection = Direction.UP;
            }
        }
        ElevatorController.userInfo.floors[currentFloor] = 0;
        carDoor.openDoor();
    }
}
