package org.example.engine;

/**
 * A rule that checks if a number is divisible by a specified divisor.
 * If so, it provides a replacement string.
 */
public class DivisibleRule implements Rule {
    private final int divisor;
    private final String replacement;

    /**
     * Constructs a new DivisibleRule.
     *
     * @param divisor     the number to divide by
     * @param replacement the string to return if the rule applies
     */
    public DivisibleRule(int divisor, String replacement) {
        this.divisor = divisor;
        this.replacement = replacement;
    }

    /**
     * Checks whether the rule applies to the given number.
     *
     * @param number the number to check
     * @return true if the number is divisible by the divisor
     */
    @Override
    public boolean appliesTo(int number) {
        return number % divisor == 0;
    }

    /**
     * Returns the replacement string if the rule applies.
     *
     * @return the replacement text
     */
    @Override
    public String getReplacement() {
        return replacement;
    }
}
