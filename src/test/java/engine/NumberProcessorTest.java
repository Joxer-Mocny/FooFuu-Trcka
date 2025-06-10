package engine;

import org.example.engine.DivisibleRule;
import org.example.engine.NumberProcessor;
import org.example.engine.Output;
import org.example.engine.Rule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NumberProcessorTest {

    @Test
    public void testFooFuuLogic() {
        List<String> result = new ArrayList<>();
        Output mockOutput = result::add;

        List<Rule> rules = Arrays.asList(
                new DivisibleRule(2, "foo"),
                new DivisibleRule(4, "fuu")
        );

        NumberProcessor processor = new NumberProcessor(1, 5, rules, mockOutput);
        processor.run();

        List<String> expected = Arrays.asList("1", "foo", "3", "foofuu", "5");
        assertEquals(expected, result);
    }
}