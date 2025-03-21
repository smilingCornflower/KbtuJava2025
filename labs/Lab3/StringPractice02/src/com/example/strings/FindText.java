package Lab3.StringPractice02.src.com.example.strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindText {

    private String fileName = "Labs/Lab3/files/gettys.html";
    private Pattern pattern;
    private Matcher matcher;

    public static void main(String[] args) {
        FindText find = new FindText();
        find.run();
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = "";
            int c = 1;
            pattern = Pattern.compile("<h4>");
            while ((line = reader.readLine()) != null) {
                matcher = pattern.matcher(line);
                if (matcher.find()) {
                    System.out.println(" " + c + " " + line);
                }
                c++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
