import java.util.ArrayList;
import java.util.List;

public class House {
    private static House house_instance = null;

    private List<Room> rooms = new ArrayList<>();
    private String address;
    static int roomsCount = 0;

    private House(String address) {
        this.address = address;
    }

    public static House createHouse(String address) {
        if (house_instance == null)
            house_instance = new House(address);
        return house_instance;
    }

    public void addRoom(Room room) {
        rooms.add(room);
        House.roomsCount++;
    }

    public void addRooms(List<Room> rooms) {
        rooms.addAll(rooms);
        House.roomsCount += rooms.size();
    }

    public int getRoomCount() {
        return roomsCount;
    }

}
