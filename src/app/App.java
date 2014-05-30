package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("A = ");
        long a = keyboard.nextLong();
        System.out.print("B = ");
        long b = keyboard.nextLong();
        
        for (long i = a; i <= b; i++){
            System.out.print(i+" ");
        }
    }
    
}
    
