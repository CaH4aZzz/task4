import java.util.ArrayList;

public class ConsoleWriter {

    public void printException(Exception e) {
        System.out.println(e.getMessage());
    }

    public void printText(String text) {
        System.out.println(text);
    }

    public void print(ArrayList<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

    public void printInstruction() {
        System.out.println("Hello! Let me guide you.\nFor correct work please launch application with parameters.\nThe application has two options of work:" +
                "\n\t1. - Will return you number of all occurrences of a searching line in a file. Format of parameters : [file path] [searching line]" +
                "\n\t2. - Will change all occurrences of a searching line to desired one in a file. Format of parameters : [file path] [searching line] [replacement line]");
    }
}
