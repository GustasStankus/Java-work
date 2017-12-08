
public class Crack
{
    public static void decrypt(){
        String decrypt = "yrg gur qvr or pnfg";
        for (int x = 1 ; x < 27 ; x++){
            //System.out.println(x);
            String newDecript = "";
            for (int y = 0 ; y < decrypt.length() ; y++ ){
                //System.out.print(decrypt.charAt(y));
                char letter = decrypt.charAt(y);
                int ascii = (int)letter;
                int newAscii = ascii - x;
                if (newAscii < 97){
                    newAscii += 26;
                }
                char newletter = (char)newAscii;
                
                newDecript += newletter;
               
            }
            System.out.println(newDecript);
        }
    }
}
