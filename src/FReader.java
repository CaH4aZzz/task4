import java.io.*;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;


public class FReader {

    ConsoleWriter writer = new ConsoleWriter();

    public void readFile(String search) throws IOException {
        String s;
        int counter = 0;
        try {
            File file = new File("test.docx");
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());

            HWPFDocument doc = new HWPFDocument(fis);

            WordExtractor we = new WordExtractor(doc);

            String[] paragraphs = we.getParagraphText();

            System.out.println("Total no of paragraph "+ paragraphs.length);
            for (String para : paragraphs) {
                System.out.println(para.toString());
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
