# FooFuu-Trcka

This Java project prints numbers from 1 to 100 to the console, each on a new line.
For each number:
- If the number is divisible by 2, it prints `"foo"` instead
- If the number is divisible by 4, it prints `"fuu"` instead
- If both conditions are true, it prints `"foofuu"`
- Otherwise, it prints the number itself

## Example Output

1
foo
3
foofuu
5
...

## How to Run

Make sure you have Java and Maven installed.
Then, from the root folder of the project, run:

```bash
mvn compile exec:java