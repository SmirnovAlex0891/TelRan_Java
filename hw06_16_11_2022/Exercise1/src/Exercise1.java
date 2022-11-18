import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.aboutBank();

        bank.hireAndFire(50, false);
        System.out.println();
        Bank.exchangeRates();
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount many ");
        Double many = input.nextDouble();
        System.out.println("Enter type many: 1 - UAH, 2 - USD, 3 - EUR");
        int choice = input.nextInt();
        System.out.println("Enter what currency: 1 - UAH, 2 - USD, 3 - EUR");
        int currency = input.nextInt();
        System.out.println("Your money = " + bank.exchangeMany(many, choice, currency) + " " + bank.typeClientMany(currency));

    }
}