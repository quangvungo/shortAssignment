package Controller;

import Model.Quadratic;
import Model.Superlative;

import java.util.ArrayList;
import java.util.List;

public class Caculate {
    public List<Float> calculateEquation(Superlative equation) {
        List<Float> solutions = new ArrayList<>();

        if (equation.getA() == 0) {
            // If 'A' is zero, there are no solutions
            return null;
        } else {
            // Calculate the solution for 'x' (ax + b = 0 => x = -b/a)
            float x = - equation.getB() / equation.getA();
            solutions.add(x);
            return solutions;
        }
    }
    public List<Float> calculateQuadraticEquation(Quadratic equation) {
        List<Float> solutions = new ArrayList<>();

        float A = equation.getA();
        float B = equation.getB();
        float C = equation.getC();

        if (A == 0) {
            // If 'A' is zero, it's not a quadratic equation
            return null;
        }

        // Calculate the discriminant
        float discriminant = B * B - 4 * A * C;

        if (discriminant > 0) {
            // Two real and distinct solutions
            float x1 = (-B + (float) Math.sqrt(discriminant)) / (2 * A);
            float x2 = (-B - (float) Math.sqrt(discriminant)) / (2 * A);
            solutions.add(x1);
            solutions.add(x2);
        } else if (discriminant == 0) {
            // One real solution
            float x = -B / (2 * A);
            solutions.add(x);
        }

        return solutions;
    }

}
