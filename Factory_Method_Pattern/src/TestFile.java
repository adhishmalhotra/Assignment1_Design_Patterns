
public class TestFile {
    public static void main(String[] args){
        //creating an instance of Product_A
        Product_A product_a = new Product_A();

        //Creating an instance of ProductFactory which would allow us to use the CreateProduct feature later on
        ProductFactory productFactory = new ProductFactory();

        //Calling the Createproduct method from ProductFactory class
        Product phone = productFactory.CreateProduct(); //implementing the Factory method pattern

        //Accessing the features which have been defined in Product_A without creating an instance of Product_A.
        //Henceforth, we have successfully used the factory method pattern
        System.out.println("When Factory Method Pattern is not used");
        System.out.println("Name of the new iPhone Launched:\t" + product_a.ProductName());
        System.out.println("Price of the new iPhone:\t\t\t" + product_a.ProductPrice(1499.99));
        System.out.println("\n\nWhen Factory Method Pattern is used");
        System.out.println("Name of the new iPhone Launched:\t" + phone.ProductName());
        System.out.println("Price of the new iPhone:\t\t\t" + phone.ProductPrice(1099.99));

    }

}
