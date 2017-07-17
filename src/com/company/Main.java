package com.company;

import java.util.*;

        public class Main {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.println("Enter number.");
                String firstInput = input.next();
                System.out.println("Enter ANOTHER number.");
                String secondInput = input.next();

                System.out.println(firstInput);
                System.out.println(secondInput);

                double operand1 = Double.parseDouble(firstInput);
                double operand2 = Double.parseDouble(secondInput);

                double sum = operand1 + operand2;

                System.out.println("sum: " + sum);

                double difference = operand1 - operand2;

                System.out.println("difference: " + difference);

                double division = operand1/operand2;

                System.out.println("division: " + division);

                double multiplication = operand1 * operand2;

                System.out.println("multiplication: " + multiplication);

                double remainder = operand1 % operand2;

                System.out.println("remainder: " + remainder);
            }

                public static void showResults(Double[] args) {
                    System.out.println("The sum is: " + sum);
                    System.out.println("The difference is: " + difference);
                    System.out.println("The divided amount is: " + division);
                    System.out.println("The multiplied amount is: " + multiplication);
                    System.out.println("The remainder is: " + remainder);
                }

                Main.showResults(double sum, double difference,
            double division, double multiplication, double remainder);


                }


