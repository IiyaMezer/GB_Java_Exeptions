import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        Task1_2.divison(num1, num2);

        int [] arr = {0,1,2,3,4,5,6};
        int [] arr2 = {};
        int nodeNum = scanner.nextInt();
        Task1_2.getArrayNode(arr, nodeNum);
        Task1_2.getArrayNode(arr2, nodeNum);
        Task1_2.getArrayNode(arr, 7);




    }
}