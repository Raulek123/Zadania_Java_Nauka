package TabliceISterowanie.FizzBuzz;


import java.util.stream.IntStream;

public class FizzBuzzExercise {
    public static void main(String[] args) {
/*        for (int i = 1; i < 101; i++) {
            if(i % 15 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }*/

        IntStream.rangeClosed(1, 100)
                .forEach(number -> {
                    if (number % 15 == 0) {
                        System.out.println(number + " Fizz Buzz");
                    } else if (number % 5 == 0) {
                        System.out.println(number + " Buzz");
                    } else if (number % 3 == 0) {
                        System.out.println(number + " Fizz");
                    }
                });

    }
}