package Elevator;

public class CarButton {
    public int floorNumber; //The floor number where this button is meant to go
    public boolean isPressed;

    public CarButton(int floorNumber) {
        this.floorNumber = floorNumber;
        this.isPressed = false;
    }

    public void buttonPressed() {
        this.isPressed = true;
    }
}
