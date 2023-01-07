package org.example.mymath;

public class FizzBuzzer {
    public String fizzBuzzer(int finalValue) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < finalValue ; i++) {
            boolean isBoring = true;
            if (i % 3 == 0) {
                isBoring = false;
                sb.append("fizz");
            }
            if (i % 5 == 0) {
                isBoring = false;
                sb.append("buzz");
            }
            if (isBoring) {
                sb.append(i);
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
