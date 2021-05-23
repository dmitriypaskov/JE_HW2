package pashkov;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter implements Writer {

    @Override
    public void write(String value) {
        try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter("HomeWork.txt"))) {
            writer.write(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}