import java.util.ArrayList;

/**
 * Created by avokado on 23.04.2019.
 */
public class ConsoleWriter {

    public void print(Exception e){
        System.out.println(e.getMessage());
    }

    public void print(String text){
        System.out.println(text);
    }

    public void print(ArrayList<String> list) {
        for (String s:list) {
            System.out.println(s);
        }
    }
}
