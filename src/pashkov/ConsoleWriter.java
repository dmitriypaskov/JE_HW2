package pashkov;

public class ConsoleWriter implements Writer {

    StringWorker finderCoincidence = new FinderCoincidence();
    StringWorker repetitionCounter = new RepetitionCounter();
    StringWorker sortingRedactor = new StringRedactor();

    @Override
    public void write(String value) {
        System.out.println(value);
    }
}
