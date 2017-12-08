import java.util.Scanner;
public class arrays
{
    public static void main(){
       String[] name =  {"John","Paul","George","Ringo"};
       
       for (int i = 0 ; i < name.length ; i++){
           System.out.println(name[i]);
        }
    }
    public static void powersOfTwo(){
       int[] powersOfTwo = new int[8];
       int curentNum = 2;
       for (int i = 0 ; i <= powersOfTwo.length ; i++){
           powersOfTwo[i] = curentNum;
           System.out.println(powersOfTwo[i]);
           curentNum *= 2;
       }
    }
    public static void split(){
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        String[] listinput = input.split(" ");
        for (int i = 0; i<listinput.length; i++){
            System.out.println(listinput[i]);
        }
    }
    
    public static void folder(){
        float[] price = new float[11];
        float curentPrice = 2.50F;
       for (int i = 0 ; i < price.length ; i++){
           price[i] = curentPrice;
           curentPrice += 0.12F;
        }
       Scanner keyboard = new Scanner(System.in);
       System.out.print("How many dividers do you want \n");
       int input = keyboard.nextInt();
       System.out.print(String.format("%.3g%n", price[input]));
    }
}
