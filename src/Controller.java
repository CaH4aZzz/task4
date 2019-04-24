import java.io.IOException;
import java.util.ArrayList;

class Controller {
    private ConsoleWriter writer;
    private FileManager fileManager;
    private ContentWorker contentWorker;

    Controller() {
        writer = new ConsoleWriter();
        fileManager = new FileManager();
        contentWorker  = new ContentWorker();
    }

    void start(String[] params) {
        int len = params.length;

        if (len == 2) {
            String filePath = params[0];
            String search = params[1];
            getCountOfEntries(filePath, search);
        } else if (len == 3) {
            String filePath = params[0];
            String search = params[1];
            String replacement = params[2];
            changeLines(filePath, search, replacement);
        } else {
            writer.printInstruction();
        }
    }

    private void getCountOfEntries(String filePath, String search) {
        try {
            ArrayList<String> lines = fileManager.readFile(filePath);
            writer.printText("Line \"" + search + "\" was found " + contentWorker.getLineEntries(lines, search) + " times");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void changeLines(String filePath, String search, String replacement) {
        try {
            ArrayList<String> list = fileManager.readFile(filePath);
            fileManager.writeFile(contentWorker.replaceLines(list, search, replacement), filePath);
        } catch (IOException e) {
            writer.printException(e);
        }
    }
}
