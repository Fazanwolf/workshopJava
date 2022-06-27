package com.github.anthonyvienne.workshopjava;

public class Fibonacci {

    public static int recursiveFibonacci(int n)
    {
        if (n < 2)
            return (n);
        return (recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2));
    }

    public static int iterativeFibonacci(int n)
    {
        int curr = 0;
        int prev = 1;
        int tmp = curr;

        if (n < 2)
            return (n);
        for (int i = 0; i < n; i++) {
            tmp = curr;
            curr += prev;
            prev = tmp;
        }
        return (curr);
    }

    public static void main(String[] args) {
        int n = (args.length == 1 ? Integer.parseInt(args[0]) : 10);
        System.out.println("Suite de Fibonacci de " + Integer.toString(n) + ":");
        System.out.println("Recursive: " + recursiveFibonacci(n));
        System.out.println("Iterative: " + iterativeFibonacci(n));
    }

}
