/*
Temas: Exceptions. Throwing Exceptions
https://materiaalit.github.io/2013-oo-programming/part2/week-9/
*/

package validation;

public class Calculator {

    public int multiplication(int fromInteger) {
        if (fromInteger < 0) {
            throw new IllegalArgumentException("multiplication needs an argument >= 0.");
        }
        int multiplication = 1;
        for (int i = 1; i <= fromInteger; i++) {
            multiplication *= i;
        }

        return multiplication;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
          if (setSize < 0 || subsetSize < 0 && subsetSize > setSize) {
            throw new IllegalArgumentException("Arguments need to be > 0 and setSize < subSetSize");
        }
        int numerator = multiplication(setSize);
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);

        return numerator / denominator;
    }
}
