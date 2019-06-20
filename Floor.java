package Elevator;

public class Floor {
    public HallButton hallButtonUp;
    public HallButton hallButtonDown;
    public int floorNumber ;

    public Floor(int floorNumber) {
        //Add two hall buttons for every floor
        this.floorNumber = floorNumber ;
        hallButtonUp = new HallButton(Direction.UP);
        hallButtonDown = new HallButton(Direction.DOWN);
    }


}
