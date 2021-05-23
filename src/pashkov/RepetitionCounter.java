package pashkov;

public class RepetitionCounter implements StringWorker {

    private int matchesCount;

    @Override
    public int execute(String sentence, String word) {
        String[] words = sentence.split("\\s");
        for (String s : words) {
            if (word.equals(s)) {
                matchesCount += 1;
            }
        }
        return matchesCount;
    }

    public int getMatchesCount() {
        return matchesCount;
    }
}
