package org.example;

import org.example.engine.*;

import java.util.Arrays;
import java.util.List;

/**
 * Entry point of the application.
 * Initializes rules, output mechanism, and triggers the processing logic.
 */
public class Main {
    public static void main(String[] args) {
        // Define the range of numbers to process
        int from = 1;
        int to = 100;

        // Define transformation rules (e.g., divisibility)
        List<Rule> rules = Arrays.asList(
                new DivisibleRule(2, "foo"), // replace if divisible by 2
                new DivisibleRule(4, "fuu")  // replace if divisible by 4
        );

        // Output strategy (currently printing to console)
        Output output = new ConsoleOutput();

        // Process numbers using defined rules and output
        NumberProcessor processor = new NumberProcessor(from, to, rules, output);
        processor.run();
    }
}
