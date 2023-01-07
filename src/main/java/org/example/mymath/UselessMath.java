package org.example.mymath;

public class UselessMath {
    public static double slowInverseSqRoot(double a) {
        double squareRoot = Math.sqrt(a);
        double inverseSquareRoot = 1 / squareRoot;

        return inverseSquareRoot;
    }
}
