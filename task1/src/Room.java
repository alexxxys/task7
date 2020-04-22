import java.util.ArrayList;
import java.util.List;

public class Room {
    private List<Furniture> furniture = new ArrayList<>();

    public int getFurnitureVatPrices(){
//        return furniture.forEach();
        return furniture.stream().mapToInt(value -> value.getPrice(15)).sum();
    }

    public Room(List<Furniture> furniture) {
        this.furniture = furniture;
    }
}
