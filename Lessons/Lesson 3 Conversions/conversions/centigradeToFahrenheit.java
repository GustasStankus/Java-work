import java.util.Scanner;
public class centigradeToFahrenheit
{
   
    public float centigradeToFahrenheit(){
        Scanner keyboard = new Scanner(System.in);
        int s = keyboard.nextInt();
        
        return s*1.8F+32;
    }
    
    public float fahrenheitToCentigrade(float fahrenheit){
        return (fahrenheit-32) * 5/9;
    }
  
    public boolean oyster(String doYouLiveInLondon, int age){
        return (age >= 16 && age<=19 && doYouLiveInLondon == "yes") ? true : false;  
    }
}