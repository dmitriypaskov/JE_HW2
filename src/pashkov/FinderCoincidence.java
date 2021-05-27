package pashkov;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinderCoincidence implements StringWorker {

    @Override
    public int execute(String sentence, String word) {
        Pattern pattern = Pattern.compile("\\b" + word + "\\b");
        Matcher matcher = pattern.matcher(sentence);
        if (matcher.find()) {
            return matcher.start();
        } else {
            return -1;
        }
    }
}
