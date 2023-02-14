package net.nkremlev.exercism.java;

import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        var input = "❄🌡🤧🤒🏥🕰😀";
        var input2 = "∅⊊ℕ⊊ℤ⊊ℚ⊊ℝ⊊ℂ";
        System.out.println(truncate(input));
        System.out.println(truncate(input2));
    }

    private static String truncate(String input) {
        int limit = 5;
        return input.codePointCount(0, input.length()) > limit ? input.substring(0, input.offsetByCodePoints(0, limit)) : input;
    }
}
