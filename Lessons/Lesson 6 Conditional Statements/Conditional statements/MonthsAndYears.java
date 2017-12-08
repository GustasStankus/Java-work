import java.util.Scanner;

public class MonthsAndYears
{
    public static void monthDetails(){
       
       Scanner keyboard = new Scanner(System.in);
       System.out.println("What is the number of the month you want to know about");
       int info = keyboard.nextInt();
       
       
       switch( info ) {
           case 1 : 
               System.out.println("January has 31");
               break;
           
           case 2 :
               System.out.println("Year?");
               int year = keyboard.nextInt();          
               if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
               
                   System.out.println("Febuary has 29");
                   
                }else{
                
                    System.out.println("Febuary has 28");
                    
                }            
                break;   
            
            case 3 :             
                System.out.println("March has 31");            
                break;  
            
            case 4 :                    
                System.out.println("April has 30");                                    
                break;
            
            case 5 :            
                System.out.println("May has 31");            
                break;  
            
            case 6 :            
                System.out.println("June has 30");
                break;  
            
            case 7 :            
                System.out.println("July has 31");            
                break;  
            
            case 8:            
                System.out.println("August has 31");      
                break;
            
            case 9:            
                System.out.println("September has 30");            
                break; 
            
            case 10: 
                System.out.println("August has 31");           
                break;    
            
            case 11 :             
                System.out.println("November has 30");            
                break;  
            
            case 12:
                System.out.println("December has 31");
                break;  
            default : 
                System.out.println("The is no " + info + "th month" );
                monthDetails();
           }

        
    }
}
