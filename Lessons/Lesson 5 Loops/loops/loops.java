public class loops
{
    public void tenBack(){
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }
    }
    
    public void fibonacci(){
        int num1 = 0;
        int num2 = 1;
        for(int i = 0; i <= 13; i++){
            int num3 = num1 + num2;
            System.out.println(num1);
            num1 = num2;
            num2 = num3;
        }
    }
    
}
