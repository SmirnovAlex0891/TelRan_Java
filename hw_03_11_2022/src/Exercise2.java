//Даны 2 целочисленных массива типа int. Реализовать метод, который будет отдавать
//на выход новый массив, который будет содержать числа, которые присутствуют в одном
//массиве и отсутствуют в другом. К примеру, даны массивы [2, 0, 1, 6, 7, 4] и [20, 1, 0, 2, 55, 6, 7]
//нужен метод, который на вход принимает 2 массива, а в результате работы отдает новый массив в виде
//[4, 20, 55]
//Примечание: длину выходного массива можно задать как длина 1 массива + длинна 2 массива.
public class Exercise2 {
    public static void main(String[] args) {
        int[] array1 = {2, 0, 1, 6, 7, 4, 8, 13};
        int[] array2 = {20, 1, 0, 2, 55, 6, 7, 9};
        System.out.print("First array = ");
        printArray(array1);
        System.out.print("Second array = ");
        printArray(array2);
        int[] resultArray = metArrayDifNumber(array1, array2);
        System.out.print("Result array = ");
        printArray(resultArray);
    }

    public static int[] metArrayDifNumber(int[] metArrayFirst, int[] metArraySecond) {
        if (metArrayFirst == null || metArraySecond == null) {
            return metArrayFirst;
        }
        int countArraySum = 0;
        int[] metArraySum = new int[metArrayFirst.length + metArraySecond.length];
        boolean test;

        for (int value : metArrayFirst) {
            test = false;
            for (int i : metArraySecond) {
                if (value == i) {
                    test = true;
                }
            }
            if (!test) {
                metArraySum[countArraySum] = value;
                countArraySum++;
            }
        }
        for (int value : metArraySecond) {
            test = false;
            for (int i : metArrayFirst) {
                if (value == i) {
                    test = true;
                }
            }
            if (!test) {
                metArraySum[countArraySum] = value;
                countArraySum++;
            }
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
