package Elevator;

import java.util.List;

public class Floor {
    public List<HallButton> hallButtons;
    public int floorNumber ;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber ;
        for (int i=1; i<=ElevatorController.totalFloors; i++) {
            if (i == floorNumber) {
                continue;
            }
            HallButton hallButton = new HallButton(i);
            hallButtons.add(hallButton);
        }
    }


}
