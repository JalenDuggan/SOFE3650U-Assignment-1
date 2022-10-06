import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public interface Product {
    String getName();

    float getPrice();

    void findPrice() throws FileNotFoundException;
}
