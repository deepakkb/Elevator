package Elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorController {
    private List<Floor> floors;
    private ElevatorCar elevatorCar;

    public static Direction currentDirection;
    public static final int totalFloors = 10;   //Elevator has floors from 1 till 10
    public static UserInfo userInfo;


    public ElevatorController() {
        floors = new ArrayList<>();
        for (int i=1; i<=totalFloors; i++) {
            Floor floor = new Floor(i);
            floors.add(floor);
        }
        currentDirection = Direction.UP;
        userInfo = new UserInfo();
        elevatorCar = new ElevatorCar();
    }

    public void startElevator() {
        elevatorCar.moveCar();
    }

}


