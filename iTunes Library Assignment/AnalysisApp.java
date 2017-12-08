import java.io.*;
import java.util.*;
import java.util.HashMap;
public class AnalysisApp{
    public static void main(String[] args) {
        String inputFilename = "iTunes Music Library.xml";
        String outputFilename = "analysis.txt"; // The program will create this file;
        HashMap<String, Integer>  numOfGenre = new HashMap();
        try {
            PrintWriter outFile = new PrintWriter(new FileWriter(outputFilename),true);
            File inFile = new File(inputFilename);
            Scanner fileScanner= new Scanner(inFile);
            String Genre = "";
            int total = 0;
            
            while (fileScanner.hasNextLine()){
                String str = fileScanner.nextLine();
                if (str.contains("<key>Genre</key>")){
                    int start = str.indexOf("<key>Genre</key><string>") + 24;
                    int end = str.indexOf("</string>");
                    Genre = str.substring(start, end);
                    total += 1;
                    if (numOfGenre.containsKey(Genre) == true){
                        numOfGenre.put(Genre, numOfGenre.get(Genre) + 1);
                    }else {
                        numOfGenre.put(Genre, 1);
                    }
               }  
            }
            
            for (Map.Entry<String, Integer> entry : numOfGenre.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                outFile.println(key + " : "+ value);
            }
            outFile.println("iTunes Libery : " + total);
            outFile.close();
        } catch (IOException e) {
                    e.printStackTrace();
        }
    }
}
