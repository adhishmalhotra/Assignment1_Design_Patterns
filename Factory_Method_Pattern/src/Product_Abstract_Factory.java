abstract class Product_Abstract_Factory {
protected abstract Product CreateProduct();
public Product GetProduct(){ // this is how we implement the factory method
    return this.CreateProduct();
}

}
