package HomWor;
// Вычислить n-ое треугольного число(сумма чисел от 1 до n)
import java.util.Scanner;
public class homework1{
    public static void main(String[] args) {
        System.out.print("Input number: ");
        Scanner iScanner = new Scanner(System.in);
        int number = iScanner.nextInt();
        int triangular = number * (number+1)/2;
        System.out.println("Triangular Number for "+number+" is "+triangular);
         
    }
    
}

   
