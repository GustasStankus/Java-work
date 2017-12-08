import java.io.*;
import java.util.Scanner;
public class FileWritingApp
{
    public static void main(){
        String inputFilename = "marks.txt";
        String outputFilename = "fakemarks.txt";
        PrintWriter outFile;
        try{
            outFile = new PrintWriter(new FileWriter(outputFilename), true);
            File file = new File(inputFilename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.contains("Gustas")){
                    outFile.println("Gustas,1,1");
                }else{
                    outFile.println(line);
                }
            }
            outFile.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
