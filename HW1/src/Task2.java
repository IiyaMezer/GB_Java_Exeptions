public class Task2 {

    public static int[] arraySum(int [] array1, int [] array2){
        int[] res = new int[array1.length];

        try {
            for (int i = 0; i <array1.length; i++){
                res[i] = array1[i] + array2[i];
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Массивы разного размера, сложение не корректно.");
        }
        return res;


    }
}
