abstract class Product_Abstract_Factory {
protected abstract Product CreateProduct();
public Product GetProduct(){
    return this.CreateProduct();
}

}
