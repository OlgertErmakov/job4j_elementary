package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMulty(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndFis(double first, double second) {
        return subtracting(first, second)
                + fission(first, second);
    }

    public static double sumAndMultyAndSubAndFis(double first, double second) {
            return sum(first, second)
                    + multiply(first, second)
                    + subtracting(first, second)
                    + fission(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMulty(10, 20) + ", "
                + subAndFis(10, 20) + ", " + sumAndMultyAndSubAndFis(10, 20));
    }
}
