public class BananaFactory implements GroceryProductFactory{
@Override
    public Product createProduct(){
    return new Banana();
}
}
