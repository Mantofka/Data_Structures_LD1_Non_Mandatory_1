import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class InOutUtils {
    public static String ReadInputLine(String filePath){

        String inputLine = "";

        Scanner scanner = null;
        FileInputStream fileStream = null;
        try {
            fileStream = new FileInputStream(filePath);
            scanner = new Scanner(fileStream, "UTF-8");

            while(scanner.hasNextLine()){
                inputLine = scanner.nextLine();
            }
            fileStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(scanner != null){
                scanner.close();
            }
        }

        return inputLine;
    }
}
