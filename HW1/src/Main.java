import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Задание 1*/
        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        Task1.divison(num1, num2);

        int [] arr = {0,1,2,3,4,5,6};
        int [] arr2 = {};
        int nodeNum = scanner.nextInt();
        Task1.getArrayNode(arr, nodeNum);
        Task1.getArrayNode(arr2, nodeNum);
        Task1.getArrayNode(arr, 7);

        /*Задание 2*/
        int[] arr1 = {1,1,1,1,1,1,1,1};
        int[] arr3 = {1,1,1,1,1,1,1};
        System.out.println(Arrays.toString(Task2.arraySum(arr1, arr3)));

        int[] arr4 = {1,1,1,1,1,1,1,};
        int[] arr5 = {1,1,1,1,1,1,1};
        System.out.println(Arrays.toString(Task2.arraySum(arr4, arr5)));
    }
}