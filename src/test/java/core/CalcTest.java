package core;
import static com.sun.javafx.fxml.expression.Expression.divide;
import static org.junit.Assert.*;
import org.junit.*;

public class CalcTest {
    static double add(double a, double b) {return a + b;}
    static double add(double a, double b, double c) {return a + b + c;}
    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }
    static double substract(double a, double b) {
        return a - b;
    }
    static double substract(double a, double b, double c) {
        return a - b - c;
    }
    static double substract(double a, double b, double c, double d) {
        return a - b - c - d;
    }
    static double multiply(double a, double b) {
        return a * b ;
    }
    static double multiply(double a, double b, double c) {
        return a * b * c;
    }
    static double multiply(double a, double b, double c, double d) {
        return a * b * c * d;
    }
    static double divide(double a, double b) {
        return a / b ;
    }
    static double divide(double a, double b, double c) {
        return a / b / c;
    }
    static double divide(double a, double b, double c, double d) {
        return a / b / c / d;
    }
    @Test // @Ignore
    public void test_01() {
        assertEquals("Not Correct", divide(90.0, 7.00), 12.9, 0.09);
    }
    @Test // @Ignore
    public void test_02() {
        assertEquals("Not Correct", add(60.0, 5.0, 7.0), 72.0, 0.09);
    }
    @Test // @Ignore
    public void test_03() {
        assertEquals("Not Correct", substract(100.0, 22.0), 78.0, 0.09);
    }
    @Test // @Ignore
    public void test_04() {
        assertEquals("Not Correct", multiply(9.0, 5.0, 2.0), 90.0, 0.09);
    }
}
