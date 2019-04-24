import java.util.ArrayList;
import java.util.List;

public class FileManager {

    public int getLineEntries(List<String> list, String searchLine){
        int counter = 0;
        for (String s: list) {
            if(s.equals(searchLine))counter++;
        }
        return counter;
    }

    public ArrayList<String> replaceLines(ArrayList<String> lineList,String searchLine, String replaceLine){
        ArrayList<String> resultList = new ArrayList<>();
        for (String s: lineList) {
            resultList.add(s.replace(searchLine, replaceLine));
        }
        return resultList;
    }
}
