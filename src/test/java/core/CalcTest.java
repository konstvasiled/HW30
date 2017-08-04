package core;
import static com.sun.javafx.fxml.expression.Expression.divide;
import static org.junit.Assert.*;
import org.junit.*;

public class CalcTest {
    static double add(double a, double b) {
        return a + b;
    }
    static double add(double a, double b, double c) {
        return a + b + c;
    }
    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }
    static double subst(double a, double b) {
        return a - b;
    }
    static double subst(double a, double b, double c) {
        return a - b - c;
    }
    static double subst(double a, double b, double c, double d) {
        return a - b - c - d;
    }
    static double mult(double a, double b) {
        return a * b ;
    }
    static double mult(double a, double b, double c) {
        return a * b * c;
    }
    static double mult(double a, double b, double c, double d) {
        return a * b * c * d;
    }
    static double div(double a, double b) {
        return a / b ;
    }
    static double div(double a, double b, double c) {
        return a / b / c;
    }
    static double div(double a, double b, double c, double d) {
        return a / b / c / d;
    }
    @Test // @Ignore
    public void test_01() {
        assertEquals("Not Correct", div(90.0, 7.00), 12.9, 0.09);
    }
    @Test // @Ignore
    public void test_02() {
        assertEquals("Not Correct", add(60.0, 5.0, 7.0), 72.0, 0.09);
    }
    @Test // @Ignore
    public void test_03() {
        assertEquals("Not Correct", subst(100.0, 22.0), 78/0, 0.09);
    }
    @Test // @Ignore
    public void test_04() {
        assertEquals("Not Correct", mult(9.0, 5.0, 2.0), 90.0, 0.09);
    }
}
