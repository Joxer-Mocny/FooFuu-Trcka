package org.example.engine;

/**
 * ConsoleOutput is a concrete implementation of the Output interface.
 * It prints each line to the system console.
 */
public class ConsoleOutput implements Output {

    /**
     * Prints the given line to the console.
     *
     * @param line the line of text to print
     */
    @Override
    public void printLine(String line) {
        System.out.println(line);
    }
}
