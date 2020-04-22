public class Furniture {
    private String name;
    private int price;
//    private static int VAT = 15;


    public int getPrice() {
        return price;
    }

    public int getPrice(int VAT) {
        return price*(100-VAT)/100;
    }

    public Furniture(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
