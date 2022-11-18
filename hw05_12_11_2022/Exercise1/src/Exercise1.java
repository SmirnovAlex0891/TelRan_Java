//Дан произвольный текст. Создать метод, который на вход принимает данных текст, на выходе отдает массив,
//который будет содержать слова длинной больше 7 символов, причем первая и последняя буква должны быть изменены на большие.
//Например дан текст: "Это предложение содержит какие-то слова с большой длиной". В результате работы метод
//должен отдать массив такого вида: ["ПредложениЕ", "СодержиТ", "Какие-тО", "БольшоЙ"]

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {

        String stringValue = "Это предложение содержит какие-то слова с большой длиной";

        System.out.println(Arrays.toString(metLongWord(stringValue)));
    }

    public static String[] metLongWord(String textMet) {
        String[] array = textMet.split(" ");

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < 7) {
                array[i] = null;
                continue;
            }
            count++;
        }
        String[] arrayResult = new String[count];
        count = 0;

        for (int i = 0; i < array.length; i++) {
           if (array[i] != null) {
               arrayResult[count] = array[i];
               arrayResult[count] = arrayResult[count].substring(0,1).toUpperCase()+arrayResult[count].substring(1, arrayResult[count].length() - 1) + arrayResult[count].substring(arrayResult[count].length()-1).toUpperCase();
               count++;
           }
        }
        return arrayResult;
    }
}
