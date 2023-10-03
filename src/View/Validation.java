package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Validation {
    public static  Scanner sc = new Scanner(System.in);
    public static float checkInputFloat() {
        while (true) {
            try {
                String input = sc.nextLine().trim();
                float result = Float.parseFloat(input);
                    return result;
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid float:");
            }
        }
    }
    public static void displayOddEvenSquare(float... numbers) {
        List<Float> oddNumbers = new ArrayList<>();
        List<Float> evenNumbers = new ArrayList<>();
        List<Float> perfectSquareNumbers = new ArrayList<>();

        for (float number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }

            if (isPerfectSquare(number)) {
                perfectSquareNumbers.add(number);
            }
        }

        System.out.println("Odd Number(s):" + formatList(oddNumbers));
        System.out.println("Number is Even:" + formatList(evenNumbers));
        System.out.println("Number is Perfect Square:" + formatList(perfectSquareNumbers));
    }
    public static boolean isPerfectSquare(float number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }
    public static String formatList(List<Float> list) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            builder.append(list.get(i));
            if (i < list.size() - 1) {
                builder.append(", ");
            }
        }
        return builder.toString();
    }
}
