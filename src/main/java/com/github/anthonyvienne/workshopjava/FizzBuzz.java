package com.github.anthonyvienne.workshopjava;

public class FizzBuzz {

    public static void main(String... args) {
        for (int i = 1; i <= 200; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i + ": Fizzbuzz");
            else if (i % 3 == 0)
                System.out.println(i + ": Fizz");
            else if (i % 5 == 0)
                System.out.println(i + ": Buzz");
            else
                System.out.println(i);
        }
    }

}
