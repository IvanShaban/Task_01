import org.junit.Assert;
import org.junit.Test;
import сom.epam.training.task_01.Triangle;

public class TriangleTest {
    @Test
    public void triangleProportionsT001() {
        double firstCathetus = 5;
        double secondCathetus = 7;
        double hypotenuse;
        double expected = 8.602325267;

        Triangle triangle = new Triangle();
        hypotenuse = triangle.triangleProportions(firstCathetus, secondCathetus);
        Assert.assertEquals(expected, hypotenuse, 0.00000001);
    }

    @Test
    public void triangleProportionsT002() {
        double firstCathetus = 2.25;
        double secondCathetus = 5.5;
        double hypotenuse;
        double expected = 5.942432162;

        Triangle triangle = new Triangle();
        hypotenuse = triangle.triangleProportions(firstCathetus, secondCathetus);
        Assert.assertEquals(expected, hypotenuse, 0.00000001);
    }
}
