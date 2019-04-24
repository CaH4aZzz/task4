import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContentWorker {

    public int getLineEntries(List<String> list, String searchLine) {
        int counter = 0;
        Pattern p = Pattern.compile(searchLine);
        for (String s : list) {
            Matcher m = p.matcher(s);
            while (m.find()) {
                counter++;
            }
        }
        return counter;
    }

    public ArrayList<String> replaceLines(ArrayList<String> lineList, String searchLine, String replaceLine) {
        ArrayList<String> resultList = new ArrayList<>();
        for (String s : lineList) {
            resultList.add(s.replace(searchLine, replaceLine));
        }
        return resultList;
    }
}
