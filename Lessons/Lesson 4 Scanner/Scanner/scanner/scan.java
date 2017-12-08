import java.util.Scanner;

public class scan{
   public static void main(String[] args){
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Enter your name:" );
       String s = keyboard.next();
       System.out.println("Hello, " + s);
    }
   public void centigradeToFahrenheit(){
       Scanner keyboard = new Scanner(System.in);
       System.out.println("What is the temperature in centigrade");
       int s = keyboard.nextInt();
       System.out.println(" " + (s * 1.8F + 32));
   }
}

