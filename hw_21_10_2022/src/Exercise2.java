//Создать программу, которая определяет четное число или нет. Должен быть метод,
// который принимает целочисленное значение и в результате работы метод должен
// вернуть булевую переменную либо true либо false. Задача должна быть решена 2 способами.
// Первый - при помощи конструкции if-else, второй способ - при помощи конструкции switch case.
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check ");
        int valueOne = input.nextInt();

        boolean a = variableCheck(valueOne);
        System.out.println(a);

        boolean b = twoVariableCheck(valueOne);
        System.out.println(b);


    }
    public static boolean variableCheck(int valueOne) {
        if (valueOne % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean twoVariableCheck(int valueOne) {
        switch (valueOne % 2) {
            case 0: {
                return true;
            }
            default: {
                return false;
            }

        }
    }

}
