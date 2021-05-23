package pashkov;

public class FinderCoincidence implements StringWorker {

    private int numberFirstCoincidence;

    @Override
    public int execute(String sentence, String word) {
        String[] words = sentence.split("\\s");
        for (int i = 0; i < words.length; i++) {
            if (word.equals(words[i])) {
                numberFirstCoincidence = i;
                break;
            }
        }
        return numberFirstCoincidence;
    }

    public int getNumberFirstCoincidence() {
        return numberFirstCoincidence;
    }
}
