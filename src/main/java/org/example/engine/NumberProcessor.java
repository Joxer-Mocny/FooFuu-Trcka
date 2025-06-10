package org.example.engine;

import java.util.List;

/**
 * The NumberProcessor is responsible for iterating over a range of numbers,
 * applying transformation rules, and sending the result to an output target.
 */
public class NumberProcessor {
    private final int start;
    private final int end;
    private final List<Rule> rules;
    private final Output output;

    /**
     * Constructs a new NumberProcessor.
     *
     * @param start  the starting number of the range (inclusive)
     * @param end    the ending number of the range (inclusive)
     * @param rules  a list of rules to apply to each number
     * @param output the output strategy (e.g., console)
     */
    public NumberProcessor(int start, int end, List<Rule> rules, Output output) {
        this.start = start;
        this.end = end;
        this.rules = rules;
        this.output = output;
    }

    /**
     * Executes the main processing logic.
     * For each number in the range:
     * - Applies all rules
     * - Outputs either the concatenated replacement strings or the number itself
     */
    public void run() {
        for (int i = start; i <= end; i++) {
            StringBuilder result = new StringBuilder();

            for (Rule rule : rules) {
                if (rule.appliesTo(i)) {
                    result.append(rule.getReplacement());
                }
            }

            output.printLine(result.length() > 0 ? result.toString() : String.valueOf(i));
        }
    }
}
