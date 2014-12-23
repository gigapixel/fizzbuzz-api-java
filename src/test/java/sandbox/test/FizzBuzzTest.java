package sandbox.test;

import org.junit.*;
import static org.junit.Assert.*;

import sandbox.play.FizzBuzz;

public class FizzBuzzTest {

    @Test
    public void test_Input0_ReturnFizzBuzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(fizzbuzz.translate(0).getResult(), "FizzBuzz");
    }

    @Test
    public void test_Input1_Return1() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(fizzbuzz.translate(1).getResult(), "1");
    }

    @Test
    public void test_Input2_Return2() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(fizzbuzz.translate(2).getResult(), "2");
    }

    @Test
    public void test_Input3_ReturnFizz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(fizzbuzz.translate(3).getResult(), "Fizz");
    }

    @Test
    public void test_Input4_Return4() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(fizzbuzz.translate(4).getResult(), "4");
    }

    @Test
    public void test_Input5_ReturnBuzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(fizzbuzz.translate(5).getResult(), "Buzz");
    }

    @Test
    public void test_Input6_ReturnFizz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(fizzbuzz.translate(6).getResult(), "Fizz");
    }

    @Test
    public void test_Input10_ReturnBuzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(fizzbuzz.translate(10).getResult(), "Buzz");
    }

    @Test
    public void test_Input15_ReturnFizzBuzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals(fizzbuzz.translate(15).getResult(), "FizzBuzz");
    }

}
