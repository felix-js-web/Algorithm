package org.example;

public class CommonStringsGCD {

    public String gcdOfStrings(String str1, String str2) {

        int str1Length = str1.length();
        int str2Length = str2.length();

        if (!(str1 + str2).equals(str2 + str1) || str1Length == 0 || str2Length == 0) {
            return "";
        }

        int gcd = str1Length > str2Length ? findGCD(str1Length, str2Length) : findGCD(str2Length, str1Length);

        return str1.substring(0, gcd);

    }

    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }
}
