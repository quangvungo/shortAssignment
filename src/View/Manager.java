package View;

import Controller.Caculate;
import Model.Quadratic;
import Model.Superlative;

import java.util.List;
import java.util.Scanner;

public class Manager extends Menu<String>{
    public static Scanner sc = new Scanner(System.in);
    static String[] mc = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"};
    protected Caculate caculator;

    public Manager() {
        super("Equation Program ", mc);
        caculator = new Caculate();
    }
    @Override
    public void execute(String n) {
        switch (n) {
            case "1" -> CaculateSuperlative();
            case "2" -> CaculateQuadratic();
            case "3" -> System.exit(0);
        }
    }

    public void CaculateQuadratic() {
        System.out.println("----- Calculate Quadratic Equation -----");
        System.out.print("Enter A: ");
        float A = Validation.checkInputFloat();
        System.out.print("Enter B: ");
        float B = Validation.checkInputFloat();
        System.out.print("Enter C: ");
        float C = Validation.checkInputFloat();

        List<Float> quadraticSolutions = caculator.calculateQuadraticEquation(new Quadratic(A,B,C));

        if (quadraticSolutions == null) {
            System.out.println("No solution.");
        } else if (quadraticSolutions.isEmpty()) {
            System.out.println("Infinite solutions.");
        } else {
            System.out.print("Solutions:");
            for (Float solution : quadraticSolutions) {
                System.out.printf(" x = %.3f", solution);
            }
            System.out.println();

            Validation.displayOddEvenSquare(A, B, C);
        }

    }

    public void CaculateSuperlative() {
        System.out.println("----- Calculate Equation -----");
        System.out.print("Enter A: ");
        float A = Validation.checkInputFloat();
        System.out.print("Enter B: ");
        float B = Validation.checkInputFloat();
        List<Float> solutions = caculator.calculateEquation(new Superlative(A,B));
        if (solutions == null) {
            System.out.println("No solution.");
        } else if (solutions.isEmpty()) {
            System.out.println("Infinite solutions.");
        } else {
            System.out.print("Solution:");
            for (Float solution : solutions) {
                System.out.printf(" x = %.3f", solution);
            }
            System.out.println();
            Validation.displayOddEvenSquare(A,B );
        }
    }

}
