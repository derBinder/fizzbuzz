package de.fb.fizzbuzz;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
    public String calculateSingle(int input) {
        if (input == 0) {
            return "0";
        }
        if (input == 1) {
            return "1";
        }
        if (isDivisibleBy(input, 3)) return "Fizz";
        if (isDivisibleBy(input, 5)) return "Buzz";
        return null;
    }

    private boolean isDivisibleBy(int input, int divisor) {
        return input % divisor == 0;
    }
}
