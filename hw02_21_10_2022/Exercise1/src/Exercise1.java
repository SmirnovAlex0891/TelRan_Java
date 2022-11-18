//Создать программу, выводящую на экран ближайшее к 10 из двух чисел,
// записанных в переменные valueOne и valueTwo.
import java.util.Scanner;

public class Exercise1 {
         public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter first digit ");
            int valueOne = input.nextInt();
            System.out.println("Enter second digit ");
            int valueTwo = input.nextInt();

            int temp1 = Math.abs(10 - valueOne);
            int temp2 = Math.abs(10 - valueTwo);

            if (temp1 == temp2) {
                System.out.println("First digit and Second digit");
            } else {
                if (temp1 < temp2) {
                    System.out.println("First digit " + valueOne);
                } else {
                    System.out.println("Second digit " + valueTwo);
                }
            }


        }
    }

