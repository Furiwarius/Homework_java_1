package simple_calculator;


public class controller {
    public static void main(String[] args) {

        String newInput = inputModule.inputExpression();    
            
        int conclusion = treatmentModule.processing(newInput);
        System.out.println(conclusion);
        }
}

/*        public static void main(String[] args) {
            boolean flag = true;
            while (flag) {
                String newInput = inputModule.inputExpression();    
                
                if (inputModule.exitCheck(newInput)){
                int conclusion = treatmentModule.processing(newInput);
                System.out.println(conclusion);
                }
                else {
                    flag=false;
                }
                }
            }
            я пытался найти рещение этой проблемы в интернете
            ничего не вышло 
            в общем происходит первая итерация цикла 
            на ней все работет 
            после того как программа выведет результат 
            консоль перестает работать корректно 
            если вводить что либо оно не отображается совсем, но и исключение не вылетает 
            просто консоль ожидает ввод данных
            если приостановить выполнение насильно 
            то вылетают ошибки что в гите таких команд нету
*/
