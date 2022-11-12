//Реализовать метод, который на вход принимает строку, а на выход отдает перевернутую строку.
//К примеру есть текст "Привет этот дивный мир", на выходе мы должны иметь
//новую строку вида "рим йынвид тотэ тевирП".

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        String stringValue = "Привет этот дивный мир";
        System.out.println(stringValue);
        System.out.println(metRevers(stringValue));
    }
    public static String metRevers(String textMetod) {
        StringBuilder value1 = new StringBuilder();

        for (int i = textMetod.length(); i > 0; i--) {
            value1.append(textMetod.substring(i-1, i));
        }
        textMetod = value1.toString();
     return textMetod;
    }
}
