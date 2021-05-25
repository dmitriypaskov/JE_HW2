package pashkov;

public class ConsoleWriter implements Writer {

    @Override
    public void write(String value) {
        System.out.println(value);
    }
}
