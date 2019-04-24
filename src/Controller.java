import java.io.IOException;
import java.util.ArrayList;

public class Controller {


    public void start() {
        ConsoleWriter writer = new ConsoleWriter();
        FReader fReader = new FReader();
        FileManager fileManager = new FileManager();

        ArrayList<String> list;
        try {
            list = fReader.readFile("test.txt");
            fReader.writeFile(fileManager.replaceLines(list, "________", "++++++++"), "test.txt");
        } catch (IOException e) {
            writer.print(e);
        }
    }

}
