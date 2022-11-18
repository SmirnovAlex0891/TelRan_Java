import java.util.Scanner;

public class Bank {

    private String title = "Bank of CandyLand";
    private int yearOfCreation = 1991;
    private String address = "Capital st. Freedom 1";
    private int numberOfEmployees = 500;
    private static double UAH_USD = 0.027;
    private static double USD_UAH = 36.90;
    private static double UAH_EUR = 0.026;
    private static double EUR_UAH = 38.10;
    private static double USD_EUR = 0.97;
    private static double EUR_USD = 1.03;

    public void aboutBank() {
        System.out.println("Title = " + title + "\n" + "Year of creation = " + yearOfCreation + "\n" + "Address = " + address);
    }

    public void hireAndFire(int amount, boolean action) {
        if (action) {
            numberOfEmployees = numberOfEmployees + amount;
        } else {
            numberOfEmployees = numberOfEmployees - amount;
        }
        System.out.println("Current number after action = " + numberOfEmployees);
    }

    public static void exchangeRates() {
        System.out.println(
                "100 UAH = " + (100 * UAH_USD) + " USD" + "\n" +
                        "100 UAH = " + (100 * UAH_EUR) + " EUR" + "\n" +
                        "1 USD = " + (1 * USD_UAH) + " UAH" + "\n" +
                        "1 EUR = " + (1 * EUR_UAH) + " UAH" + "\n" +
                        "1 USD = " + (1 * USD_EUR) + " EUR" + "\n" +
                        "1 EUR = " + (1 * EUR_USD) + " USD");
    }

    public double exchangeMany(int many, int choice, int currency) {
        double clientMany = 0;
        switch (choice) {
            case 1:
                switch (currency) {
                    case 1:
                        clientMany = many * 1;
                        break;
                    case 2:
                        clientMany = many * UAH_USD;
                        break;
                    case 3:
                        clientMany = many * UAH_EUR;
                        break;
                }
                break;
            case 2:
                switch (currency) {
                    case 1:
                        clientMany = many * USD_UAH;
                        break;
                    case 2:
                        clientMany = many * 1;
                        break;
                    case 3:
                        clientMany = many * USD_EUR;
                        break;
                }
                break;
            case 3:
                switch (currency) {
                    case 1:
                        clientMany = many * EUR_UAH;
                        break;
                    case 2:
                        clientMany = many * EUR_USD;
                        break;
                    case 3:
                        clientMany = many * 1;
                        break;
                }
                break;
        }
        return clientMany;
    }
    public double exchangeMany(double many, int choice, int currency) {
        double clientMany = 0;
        switch (choice) {
            case 1:
                switch (currency) {
                    case 1:
                        clientMany = many * 1;
                        break;
                    case 2:
                        clientMany = many * UAH_USD;
                        break;
                    case 3:
                        clientMany = many * UAH_EUR;
                        break;
                }
                break;
            case 2:
                switch (currency) {
                    case 1:
                        clientMany = many * USD_UAH;
                        break;
                    case 2:
                        clientMany = many * 1;
                        break;
                    case 3:
                        clientMany = many * USD_EUR;
                        break;
                }
                break;
            case 3:
                switch (currency) {
                    case 1:
                        clientMany = many * EUR_UAH;
                        break;
                    case 2:
                        clientMany = many * EUR_USD;
                        break;
                    case 3:
                        clientMany = many * 1;
                        break;
                }
                break;
        }
        return clientMany;
    }
    public String typeClientMany (int currency) {
        String value = "";
        switch (currency) {
            case 1: value = " UAH";
            break;
            case 2: value = " USD";
            break;
            case 3: value = " EUR";
            break;
        }
        return value;
    }
}

