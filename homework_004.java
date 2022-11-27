import java.util.Random;

/*
 * *+Задано уравнение вида q + w = e. При q, w, e >= 0. 
 * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
 * Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
 */

public class homework_004 {
    public static void main(String[] args) {
        String[] equation = expressionGenerator();
        System.out.println(String.join(" ", equation));
        solution(equation);
    }

    public static String[] expressionGenerator() {
        // генерация уравнения
        String[] result = new String[]{"", "+", "", "=", ""};
        result[4] = Integer.toString((int)(Math.random()*99)+1);
        for (int i = 0; i < result.length-1; i+=2) {
            boolean flag = new Random().nextBoolean();
            if (flag){
                result[i] = Integer.toString((int)(Math.random()*9)+1)+"?";
                }
            else {
                result[i] = "?"+Integer.toString((int)(Math.random()*9)+1);
                }
        }
        return result;
    }

    public static void solution(String[] strArray) {
        // расчет и вывод
        int count = 0;
        String str1, str2;
        for (int i = 0; i < 10; i++) {
            str1 = strArray[0].replace("?", Integer.toString(i));
            for (int j = 0; j < 10; j++) {
                str2 = strArray[2].replace("?", Integer.toString(j));
                if (Integer.parseInt(str1) + Integer.parseInt(str2)==Integer.parseInt(strArray[4])) {
                    System.out.printf("%s + %s = %s\n", str1, str2, strArray[4]);
                    count++;
                }
            }
        }
        if (count==0){
            System.out.println("Нет решения");
        }

    }
}
