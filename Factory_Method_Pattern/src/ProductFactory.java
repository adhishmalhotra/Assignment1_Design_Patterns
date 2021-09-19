public class ProductFactory extends Product_Abstract_Factory {
    @Override
    protected Product CreateProduct() {
        Product apple_iPhone = new Product_A();
        apple_iPhone.ProductPrice(1099.99);
        return apple_iPhone;
    }
    public static void main(String[] args){
        Product_Abstract_Factory iPhone = new ProductFactory();
        Product_A test = (Product_A) iPhone.CreateProduct();
        System.out.println(test.ProductName());
        System.out.println(test.ProductPrice(1099.99));

    }

}
