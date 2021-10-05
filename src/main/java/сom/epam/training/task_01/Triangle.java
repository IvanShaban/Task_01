package сom.epam.training.task_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.sqrt;

public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину катета 1.");
        double firstCathetus = Integer.parseInt(reader.readLine());
        System.out.println("Введите длину катета 2.");
        double secondCathetus = Integer.parseInt(reader.readLine());
        Triangle task_3 = new Triangle();
        task_3.triangleProportions(firstCathetus, secondCathetus);
    }

    public double triangleProportions(double firstCathetus, double secondCathetus) {
        double hypotenuse = sqrt(firstCathetus * firstCathetus + secondCathetus * secondCathetus);
        System.out.println("P = " + (firstCathetus + secondCathetus + hypotenuse));
        System.out.println("S = " + (firstCathetus * secondCathetus / 2));
        return hypotenuse;
    }
}
