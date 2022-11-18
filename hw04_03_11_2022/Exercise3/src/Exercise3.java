//Дан целочисленный массив типа int. Реализовать метод, который будет на вход принимать массив,
//а на выходе формировать новый массив такого же размера, но который будет содержать только уникальные
//(не повторяющиеся) значения. К примеру, дан массив
//[2, 0, 1, 6, 7, 4, 1, 22, 1, 0, 1, 2, 1, 6, 15, 4, 1], нужен метод, который на вход будет принимать массив,
//а на выход отдавать массив вида [2, 0, 1, 6, 7, 4, 22, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0]

public class Exercise3 {
    public static void main(String[] args) {
        int[] array1 = {2, 0, 1, 6, 7, 4, 1, 22, 1, 0, 1, 2, 1, 6, 15, 4, 1};
        System.out.print("First array = ");
        printArray(array1);
        int[] resultArray = metArrayUnickNumber(array1);
        System.out.print("Result array = ");
        printArray(resultArray);
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
