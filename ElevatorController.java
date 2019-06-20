package Elevator;

import java.util.Scanner;

public class ElevatorController {
    private ElevatorCar elevatorCar;

    public static final int totalFloors = 10;   //Elevator has floors from 1 till 10
    public static Floor[] floors;


    public ElevatorController() {
        initializeFloors();
        elevatorCar = new ElevatorCar();
    }

    public void startElevator() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            elevatorCar.moveCar();
            if (scanner.next().equals("STOP")) {
                System.exit(0);
            }
        }
    }

    public void initializeFloors() {
        //Create the objects for all floors
        floors = new Floor[totalFloors];
        for (int i=0; i<totalFloors; i++) {
            floors[i] = new Floor(i);
        }
    }

}


