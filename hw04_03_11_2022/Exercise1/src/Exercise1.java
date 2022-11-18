//Дано 2 целочисленных массива типа int. Реализовать метод, который будет
//отдавать на выход новый массив, который будет содержать все элементы первого массива
//и все элементы второго. К примеру даны массивы [2, 3, 1, 6, 7, 4] и [20, 1, 33, 2, 55]
//нужен метод, который на вход принимает 2 массива, а в результате работы отдает
//новый массив в виде [2, 3, 1, 6, 7, 4, 20, 1, 33, 2, 55]

public class Exercise1 {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 1, 6, 7, 4, 75, 45, 99, 34, 100};
        int[] array2 = {20, 1, 33, 2, 55};
        System.out.print("First array = ");
        printArray(array1);
        System.out.print("Second array = ");
        printArray(array2);

        int[] resultArray = metArraySum(array1, array2);
        System.out.print("Result array = ");
        printArray(resultArray);
    }

    public static int[] metArraySum(int[] metArrayFirst, int[] metArraySecond) {
        if (metArrayFirst == null || metArraySecond == null) {
            return metArrayFirst;
        }
        int valueLenArraySum = 0;
        int[] metArraySum = new int[metArrayFirst.length + metArraySecond.length];

        for (int i = 0; i < metArrayFirst.length; i++) {
            int value = metArrayFirst[i];
            metArraySum[i] = value;
            valueLenArraySum++;
        }
        for (int i = 0; i < metArraySecond.length; i++) {
            int value = metArraySecond[i];
            metArraySum[valueLenArraySum + i] = value;
        }
        return metArraySum;
    }

    public static void printArray(int[] arrays) {
        if (arrays == null) {
            return;
        }
        for (int array : arrays) {
            System.out.print(array + " ");
        }
        System.out.println();
    }
}