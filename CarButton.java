package Elevator;

public class CarButton {
    public int floorNumber; //The floor number where this button is meant to go

    public CarButton(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void buttonPressed() {
        ElevatorController.userInfo.floors[this.floorNumber]++;
    }
}
