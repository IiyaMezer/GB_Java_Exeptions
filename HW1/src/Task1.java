public class Task1 {


    /**Основная логика с пробрасываеинем исключения при нулевом знаменателе
     */
    private static float divide(float num1 , float num2) throws DivByZeroExeption {

        if (num2 == 0 & num1 != 0 )
            throw new DivByZeroExeption("Делить на ноль нельзя", num2);
        return num1 / num2 ;
    }
    /**Выполнение логики и обработка исключений
     */
    public static void divison(float num1 , float num2){
        try {
            float result = divide(num1, num2);
                System.out.println(result);
        }
        catch (DivByZeroExeption e){
            System.out.println(e.getMessage());
        }
    }
    public static void getArrayNode(int[] array , int nodeNum){
         try {
             System.out.println(array[nodeNum]);
         }
         catch (ArrayIndexOutOfBoundsException e) {
             System.out.println(e.getMessage());
         }
    }
}

