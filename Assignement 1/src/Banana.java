import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
public class Banana implements Product{
String name = "banana";
float price =0;
    @Override
    public String getName(){

        return name;
    }
    @Override
    public float getPrice(){

        return price;
    }
    @Override
    public void findPrice() throws FileNotFoundException {
        String fname;
        File dbase = new File("database.txt");
        Scanner read = new Scanner(dbase);
        while (read.hasNextLine()){
            fname=read.nextLine();
            if (fname.equalsIgnoreCase(name)){
                fname=read.nextLine();
                price = Float.parseFloat(fname);
            }
            else{
                read.nextLine();
            }
        }
    }
}
