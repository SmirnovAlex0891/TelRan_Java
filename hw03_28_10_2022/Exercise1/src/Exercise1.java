//        Автобус движется по маршруту длиной 15 км со скоростью 42 км в час.
//        Каждые 30 секунд вывести на экран информацию о перемещении автобуса в формате:
//        Время движения автобуса = ?
//        Пройденное расстояние = ?
//        В конце вывести итоговую информацию: Общее время движения автобуса = ?

public class Exercise1 {
    public static void main(String[] args) {
        double timeTotal;
        double speedSec = 11.667;
        double longWay = 0;

        for (timeTotal = 0; timeTotal <= 1260; timeTotal += 30) {
            longWay = timeTotal * speedSec;
            System.out.print("Время движения автобуса = " + timeTotal + "c  ");
            System.out.println("Пройденное расстояние = " + longWay + " м");
        }
        timeTotal += (15000-longWay)/speedSec;
        System.out.println("Общее время движения автобуса = " + timeTotal + "c");
    }
}
