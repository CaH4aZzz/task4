import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;


class FileManager {

    ArrayList<String> readFile(String fileName) throws IOException {
        File file = new File(fileName);
        ArrayList<String> list;
        try {
            list = (ArrayList<String>) Files.readAllLines(file.toPath());
        } catch (IOException e) {
            throw new IOException("\nError! File " + fileName + " was not found");
        }
        return list;
    }

    void writeFile(ArrayList<String> allLines, String fileName) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String s : allLines) {
                s += System.getProperty("line.separator");
                writer.write(s);
            }
        } catch (IOException e) {
            throw new IOException("Error while writing to file " + fileName);
        }
    }
}
