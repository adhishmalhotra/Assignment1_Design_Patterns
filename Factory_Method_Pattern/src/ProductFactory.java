public class ProductFactory extends Product_Abstract_Factory {
    public ProductFactory(){
        Product product = CreateProduct();
    }

    @Override
    //here we override the function from the Product_Abstract_Factory class. This function is essentially creating an instance of Product_A and is being called in the constructor function of ProductFactory
    protected Product CreateProduct() {
        Product apple_iPhone = new Product_A();
        return apple_iPhone;
    }


}
