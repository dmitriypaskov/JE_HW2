package pashkov;

public class StringRedactor implements StringWorker {

    private int stringLength;
    private StringBuilder builder = new StringBuilder();

    @Override
    public int execute(String sentence, String word) {
        String[] words = sentence.split("\\s");
        for (String s : words) {
            if (!word.equals(s)) {
                builder.append(s).append(" ");
            } else {
                builder.append(" ");
            }
        }
        char[] charsSentence = builder.toString().toCharArray();
        stringLength = charsSentence.length - 1;
        return stringLength;
    }

    public int getStringLength() {
        return stringLength;
    }
}
