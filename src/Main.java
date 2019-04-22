import java.io.IOException;

/**
 * Created by avokado on 23.04.2019.
 */
public class Main {
    private final static ConsoleWriter writer = new ConsoleWriter();

    public static void main(String[] args) {

        FReader fReader = new FReader();
        try {
            fReader.readFile("Now is the winter of our discontent");
        } catch (IOException e) {
            writer.printException(e);
        }
    }
}
