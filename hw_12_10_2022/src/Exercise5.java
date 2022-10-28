public class Exercise5 {
    public static void main(String[] args) {
        //Объявите 10 переменных типа int со значениями 0,1, 2, 3, 4, 5, 6, 7, 8, 9.
        // Объявите ещё одну переменную int и сохраните в неё сумму этих переменных,
        // деленную на 10. Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
        // Распечатайте её через println.

        double[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        double result = 0;
        for (double m : nums) {

            result += m;}
            System.out.println("Значение среднего арифметического равно: " + result / nums.length);

    }
}
