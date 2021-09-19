public class Product_A implements Product {
    private double price;
    @Override
    public String ProductName() {
        return "iPhone 13 Pro max";
    }

    @Override
    public boolean ProductPrice(double price) {
        this.price = price;
        return true;
    }
}
