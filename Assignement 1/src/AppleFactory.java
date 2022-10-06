public class AppleFactory implements GroceryProductFactory{
    @Override
    public Product createProduct(){
        return new Apple();
    }
}
