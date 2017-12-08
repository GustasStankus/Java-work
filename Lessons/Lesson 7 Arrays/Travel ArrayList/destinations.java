import java.util.ArrayList;
import java.util.Scanner;
public class destinations
{
    public static void main(){
        int end = 0;
        ArrayList<String> destinations = new ArrayList();
        /*destinations.add("San Francisco");
        destinations.add("Rio de Janeiro");
        destinations.add("Singapore");
        destinations.add("Tokyo");
        destinations.add("London");
        destinations.add("Berlin");*/
        Scanner imput = new Scanner(System.in);
        
        while (end == 0){
            System.out.println("Do you wnat to add or remove destinations");
            String addOrRemove = imput.next();
            switch(addOrRemove){
                case "add" : 
                    end = 1;
                    System.out.println("What destination do you want to add");
                    Scanner destination = new Scanner(System.in);
                    String addDestination = imput.next();
                    destinations.add(addDestination);
                    
                case "remove" : 
                    end = 1;
                    
                default: 
                    System.out.println("Type in add or remove");
            }
        }
        for (int i = 0 ; i < destinations.size() ; i++){
            System.out.println(destinations.get(i));
        }
    }
}
