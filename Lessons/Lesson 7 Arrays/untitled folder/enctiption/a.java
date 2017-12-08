
public class a
{
    public static void main(){
        String inString = "This is my first attempt at it today";
        int i = 0;
        int c = 0;
        int r = 0;
        char[][] grid = new char[6][6];
        for ( i = 0; i < inString.length(); i++){
            if (c == 6){
                c = 0;
                r += 1;
            }
            grid[r][c] = inString.charAt(i);
            c += 1;
        }
        for (int y = 0; y < c; y++){
            for (int x = 0; x < c; x++){
                System.out.print(grid[x][y]);
            }
        }
    }
}