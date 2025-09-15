package com.tnsif.second;

public class prime {

	public static void main(String[] args) {
		int count = 0;
        int number = 2;

        while (count < 100) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

	}

}
