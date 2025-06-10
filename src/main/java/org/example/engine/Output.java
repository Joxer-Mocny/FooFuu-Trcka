package org.example.engine;

/**
 * Output is a strategy interface for handling output operations.
 * Implementations can define how processed results are delivered (e.g., console, file, network).
 */
public interface Output {

    /**
     * Outputs a single line of text.
     *
     * @param line the line to be output
     */
    void printLine(String line);
}
