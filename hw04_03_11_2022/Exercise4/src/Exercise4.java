//Дан целочисленный массив типа int. Реализовать метод, который будет на вход
//принимать массив, а на выходе формировать новый массив такого же размера,
//но который будет содержать только уникальные (не повторяющиеся) значения  и значения
//в этом массиве должны быть отсортированными в порядке увеличения. К примеру, дан массив
//[2, 0, 1, 6, 7, 4, 1, 22, 1, 0, 1, 2, 1, 6, 15, 4, 1], нужен метод, который на вход
//будет принимать массив, а на выход отдавать массив вида
//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 4, 6, 7, 15, 22]

public class Exercise4 {
    public static void main(String[] args) {
        int[] array1 = {2, 0, 1, 6, 7, 4, 1, 22, 1, 0, 1, 2, 1, 6, 15, 4, 1, 67, 8, 34, 22, 20};
        System.out.print("First array = ");
        printArray(array1);
        int[] resultArray = metArrayUnickNumber(array1);
        int[] resultArraySort = metArraySort(resultArray);
        System.out.print("Result array = ");
        printArray(resultArraySort);
    }

    public static int[] metArraySort(int[] arrayForSort) {

        int value1;
        int value2;
        boolean test = false;
        while (!test) {
            for (int i = 1; i < arrayForSort.length; i++) {
                value1 = arrayForSort[i];
                if (arrayForSort[i - 1] >= value1) {
                    value2 = arrayForSort[i - 1];
                    arrayForSort[i - 1] = value1;
                    arrayForSort[i] = value2;
                }
            }
            test = true;
            for (int j = 1; j < arrayForSort.length; j++) {
                if (arrayForSort[j] < arrayForSort[j - 1]) {
                    test = false;
                    break;
                }
            }
        }
        return arrayForSort;
    }

    public static int[] metArrayUnickNumber(int[] metArrayFirst) {
        if (metArrayFirst == null) {
            return metArrayFirst;
        }
        int countArraySum = 0;
        int[] metArraySum = new int[metArrayFirst.length];
        boolean test = true;
        int value;
        int temp = 0;


        for (int k : metArrayFirst) {
            value = k;

            for (int j = 0; j <= temp; j++) {
                if (value == metArraySum[j]) {
                    test = true;
                    break;
                } else {
                    test = false;
                }
            }
            if (!test) {
                metArraySum[countArraySum] = value;
                temp = countArraySum;
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
