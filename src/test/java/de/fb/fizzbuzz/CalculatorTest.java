package de.fb.fizzbuzz;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Test
    void singleTest() {
        assertThat(calculator.calculateSingle(0)).isEqualTo("0");
        assertThat(calculator.calculateSingle(1)).isEqualTo("1");
        assertThat(calculator.calculateSingle(3)).isEqualTo("Fizz");
        assertThat(calculator.calculateSingle(5)).isEqualTo("Buzz");
        assertThat(calculator.calculateSingle(15)).isEqualTo("Fizz-Buzz");
    }
}
