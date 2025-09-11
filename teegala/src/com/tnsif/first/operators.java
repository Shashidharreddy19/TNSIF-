package com.tnsif.first;

public class operators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Assignment Operator
        int c = 10;
        c += 5;  // same as c = c + 5
        System.out.println("c after += : " + c);

        // Unary Operators
        int num = 5;
        System.out.println("++num = " + (++num)); // pre-increment
        System.out.println("num++ = " + (num++)); // post-increment
        System.out.println("After num++ value = " + num);
    }
}

