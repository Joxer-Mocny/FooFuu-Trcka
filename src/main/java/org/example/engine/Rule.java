package org.example.engine;

/**
 * Rule is a strategy interface for transforming numbers based on specific conditions.
 * Each implementation defines when the rule applies and what replacement string to return.
 */
public interface Rule {

    /**
     * Determines whether the rule applies to the given number.
     *
     * @param number the number to evaluate
     * @return true if the rule should be applied, false otherwise
     */
    boolean appliesTo(int number);

    /**
     * Returns the replacement string to use when the rule applies.
     *
     * @return the replacement text
     */
    String getReplacement();
}
