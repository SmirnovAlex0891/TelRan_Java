//Из массива цифр [12, 1, 32, 90, 10, 11, 30, 49, 33, 34, 27, 7, 21]
//сформировать новый массив, который будет содержать только нечетные числа.
//Вывести на экран новый массив и найти в нем самое большое число и также вывести на экран.

public class Exercise2 {
    public static void main(String[] args) {
        int arrayFirst[] = {12, 1, 32, 90, 10, 11, 30, 49, 33, 34, 27, 7, 21};
        int arraySecond[] = new int[defOddNumder(arrayFirst)];

        copyOddNumber(arrayFirst, arraySecond);
        printArray(arraySecond);
        largNumbArray(arraySecond);
    }

    private static void largNumbArray(int[] arraySecondMet) {
        int largestNumber = arraySecondMet[0];
        for (int index = 0; index < arraySecondMet.length; index++) {
            if (arraySecondMet[index] > largestNumber) {
                largestNumber = arraySecondMet[index];
            }
        }
        System.out.println("Самое большое число = " + largestNumber);
    }

    private static void copyOddNumber(int[] arrayFirstMet, int[] arraySecondMet) {
        int indexArraySecond = 0;
        for (int index = 0; index < arrayFirstMet.length; index++) {
            if (arrayFirstMet[index] % 2 != 0) {
                arraySecondMet[indexArraySecond] = arrayFirstMet[index];
                indexArraySecond++;
            }
        }
    }

    public static int defOddNumder(int[] arrayMet) {
        int length = arrayMet.length;
        int temp = 0;
        for (int index = 0; index < length; index++) {
            if (arrayMet[index] % 2 != 0) {
                temp++;
            }
        }
        return temp;
    }

    public static void printArray(int[] arrayMetPrint) {
        int length = arrayMetPrint.length;
        for (int index = 0; index < length; index++) {
            System.out.println(arrayMetPrint[index]);
        }
    }
}
