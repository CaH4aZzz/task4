import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.util.ArrayList;


class FileManager {

    ArrayList<String> readFile(String fileName) throws IOException{
        File file = new File(fileName);
        ArrayList<String> list;
        try {
            list = (ArrayList<String>) Files.readAllLines(file.toPath());
        }catch (InvalidPathException e){
            throw new IllegalArgumentException("Error! File " + fileName + " was not found");
        }catch (IOException e) {
            throw new IOException("Error while reading from file");
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
