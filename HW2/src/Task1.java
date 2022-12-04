import java.util.Scanner;

public class Task1 {

    public static float getFloat(){
        float num = 0;
        Scanner scanner = new Scanner(System.in);
        boolean error = true;
        while (error) {
            System.out.println("Bведите число");
            if (scanner.hasNextFloat())
                num = scanner.nextFloat();
            else {
                scanner.next();
                System.out.println("Неверные данные, повторите ввод.");
                continue;
            }
            error = false;
        }
        return num;

    }

}
