//this is our Prduct_A, and we'd be using this as an example to understand the factory method pattern
public class Product_A implements Product {
    private double price;
    @Override
    public String ProductName() {
        return "iPhone 13 Pro max";
    }

    @Override
    public double ProductPrice(double price) {
        this.price = price;
        return price;
    }
}
