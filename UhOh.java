import java.util.Scanner;
public class UhOh {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter an integer: ");
 
       try {
           int num = in.nextInt();
           System.out.println("You entered: " + num);
       } catch (RuntimeException e) {
           System.out.println("Uh-oh...");
       }
       in.close();
    }
 }