package HomWor;
import java.util.Scanner;
public class homework3{
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.print(i);
        }
    }
}