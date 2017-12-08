import java.util.Scanner;

public class StringManipulation
{
   public static void main(){
       Scanner keyboard = new Scanner(System.in);
       System.out.println("What is your String");
       String word = keyboard.nextLine();
       System.out.println(word.toUpperCase());
       System.out.println(word.toLowerCase());
       System.out.println(word.length());
       String list[] = word.split(" ");
       System.out.println(list[1]);
       
    }
   public static void upper(){
       Scanner keyboard = new Scanner(System.in);
       System.out.println("What is your String");
       String word = keyboard.nextLine();
       System.out.println(word.toUpperCase());
   }
   public static void notSpace(){
       Scanner keyboard = new Scanner(System.in);
       System.out.println("What is your String");
       String word = keyboard.nextLine();
       
       
       String[] listOfWords = word.split(" ");
       for(int i = 0 ; i < listOfWords.length; i++){
           System.out.println(i);
           if (listOfWords[i] == " "){
               System.out.println(listOfWords[i]);
            }
           
        }
       //String oneWords = listOfWords[0].replaceAll(" ", "");
       //System.out.println(oneWords);
       
       
       
       
       /*int letters = 0;
       for (int i = 0 ; i < word.length() ; i++){
           if (word.charAt(i) == ' ' && letters >= 0){
              word = word.replaceAll(" ", "");
           }else{
              letters = letters + 1;
              System.out.println(letters);
           }
        }*/
        //.out.println(word);
    }
}
