package com.example.assignment1_calculator;

public class Calculator {

    public int calculate(String expression) {
        int result_num = 0;

        if (expression != null && expression.length() > 0) {
            // Remove the "=" sign at the end if present
            expression = expression.replace("=", "");

            // Split the expression into numbers and operators
            String[] parts = expression.split("[+\\-*/]");

            if (parts.length == 0) {
                // No valid parts found, return 0
                return 0;
            }

            // Start with the first number
            result_num = Integer.parseInt(parts[0]);

            int operatorIndex = parts[0].length(); // Start right after the first number

            for (int i = 1; i < parts.length; i++) {
                // Find the operator used (e.g., +, -, *, /)
                String operator = expression.substring(operatorIndex, operatorIndex + 1);
                operatorIndex += parts[i].length() + 1; // Move the operator index

                int operand = Integer.parseInt(parts[i]);

                switch (operator) {
                    case "+":
                        result_num += operand;
                        break;
                    case "-":
                        result_num -= operand;
                        break;
                    case "*":
                        result_num *= operand;
                        break;
                    case "/":
                        if (operand == 0) {
                            throw new ArithmeticException("Division by zero");
                        }
                        result_num /= operand;
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported operator: " + operator);
                }
            }
        }

        return result_num;
    }
}
