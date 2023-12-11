package org.exemple.test;
import org.example.Calculator;
import org.example.services.CalculatorService;
import org.example.services.MessageService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
    @Spy
    CalculatorService calculatorService;
    Calculator calculator;

    @BeforeEach
    public void before() {
        calculatorService = mock(CalculatorService.class);
        calculator= new Calculator();
    }
    @DisplayName("Test MessageService.get()")
    @Test
    void testPerform() {
        assertEquals(5, calculator.perform(2,3));
    }
}
