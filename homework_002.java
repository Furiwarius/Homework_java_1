/**
 * homework_002
 * Вывести все простые числа от 1 до 1000
 */
public class homework_002 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i+=2) {
            if (enumerationDivisors(i)){
                System.out.println(i);
            }
        }
    }


    public static boolean enumerationDivisors(int number) {
        // проверка на "простоту" методом перебора делителей
    
        for (int i = 2; i < number; i++) {
            if (number%i==0) {
                return false;
            }
        }
        return true;
    }
}
