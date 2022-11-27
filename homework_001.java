/**
 * homework_001
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class homework_001 {
    public static void main(String[] args) {
        
        int a = (int) (Math.random()*15)+1; // [1:15]
        
        int triangular = triangularNumberCalculation(a);
        System.out.printf("%d-ое треугольное число = %d\n", a, triangular);

        long factorialOne = factorialCalculation(a);
        System.out.printf("факториал числа %d =  %d\n", a, factorialOne);
        
        long factorialTwo = recursiveFactorial(a);
        System.out.printf("факториал числа с использованием рекурсии %d =  %d\n", a, factorialTwo);
    }

    public static int triangularNumberCalculation(int num) {
        
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result+=i;
        }
        return result;
    }


    public static long factorialCalculation(int num) {

        long result = 1;
        for (int i = 1; i <= num; i++) {
            result*=i;
        }
        return result;
    }


    public static long recursiveFactorial(int num){
     
        if (num == 1){
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }
}