package org.example;

public class GCD {


    // Recursive function definition
    public static int gcd(int num1, int num2) {
        // Base case
        System.out.println("   number are num1  " + num1 + " num2 " + num2);
        // Base case
        System.out.println("checking basic " + num2);
        if (num2 == 0) {
            return num1;
        }
        System.out.println("is num 2 != null calling GCD again with num2 " + num2 + "    and num1 % num2 " + num1 % num2);
        return gcd(num2, num1 % num2);
    }

}
