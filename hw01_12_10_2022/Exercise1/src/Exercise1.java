//В методе main инициализировать все целочисленные примитивные
// типы и вывести их в консоль в примерном виде "Переменная с типом
// <Здесь вы выводите название типа переменной> и названием <Здесь
// вы выводите название вашей переменной> имеет значение равное
// <Здесь вы выводите значение вашей переменной>"

public class Exercise1 {
    public static void main(String[] args) {

        byte byteValue = 112;
        short shortValue = 31500;
        int intValue = 222_500_000;
        long longValue = 999_777_444_333L;

        System.out.print("Переменная с типом byte и названием byteValue имеет значение равное ");
        System.out.println(byteValue);

        System.out.print("Переменная с типом short и названием shortValue имеет значение равное ");
        System.out.println(shortValue);

        System.out.print("Переменная с типом int и названием intValue имеет значение равное ");
        System.out.println(intValue);

        System.out.print("Переменная с типом long и названием longValue имеет значение равное ");
        System.out.println(longValue);

    }
}