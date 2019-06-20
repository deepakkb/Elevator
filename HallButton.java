package Elevator;

public class HallButton {
    public Direction direction; //The direction UP/DOWN for the button outside the elevator in the hall
    public boolean isPressed;

    public HallButton(Direction direction) {
        this.direction = direction;
        this.isPressed = false;
    }

    public void buttonPressed() {
        this.isPressed = true;
    }
}
