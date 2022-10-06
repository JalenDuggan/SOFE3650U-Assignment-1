import java.io.FileNotFoundException;

public class TestDriver {
    public static void main(String[]args) throws FileNotFoundException {
        var aFactory = new AppleFactory();
        var aProduct = aFactory.createProduct();
        System.out.println(aProduct.getName()+" - "+aProduct.getPrice());

        var bFactory = new BananaFactory();
        var bProduct = bFactory.createProduct();
        System.out.println(bProduct.getName()+" - "+bProduct.getPrice());
    }
}
