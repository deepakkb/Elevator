package Elevator;

public class HallButton {
    public int floorNumber; //The floor number where this button is meant to go

    public HallButton(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void buttonPressed() {
        ElevatorController.userInfo.floors[this.floorNumber]++;
    }
}
