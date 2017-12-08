import java.util.HashMap;

public class rhyming
{
   public static void rhyming(){
       HashMap <String, String> rhyming= new HashMap();
       rhyming.put(" ", "");
       for (String word : rhyming.keySet()) {
           String score = rhyming.get(word);
           System.out.println(word + " scored " + score);
        }

    }
}
