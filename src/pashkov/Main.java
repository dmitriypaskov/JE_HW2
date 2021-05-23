package pashkov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter text");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println("Please enter your search word");
        String word = scanner.nextLine();
        System.out.println("Enter the item number you need:\n" +
                "1) First match.\n" +
                "2) Number of matches.\n" +
                "3) The number of characters in the text, excluding these words");
        String task = scanner.nextLine();
        StringWorker stringWorker;
        if (task.equals("1")) {
            stringWorker = new FinderCoincidence();
        } else if (task.equals("2")) {
            stringWorker = new RepetitionCounter();
        } else if (task.equals("3")) {
            stringWorker = new StringRedactor();
        } else {
            throw new IllegalArgumentException("Error: unknown issue type");
        }
        int result = stringWorker.execute(sentence, word);
        String resultString = "Result : " + result;
        System.out.println("Select the number of the point where you want to display the result:\n" +
                "1) Console.\n" +
                "2) File \"HomeWork.txt\".");
        int output = scanner.nextInt();
        Writer writer;
        if (output == 1) {
            writer = new ConsoleWriter();
        } else if (output == 2) {
            writer = new FileWriter();
        } else {
            throw new IllegalArgumentException("Error: unknown issue type");
        }
        writer.write(resultString);
    }
}