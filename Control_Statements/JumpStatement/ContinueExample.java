public class ContinueExample{
    public static void main (String[] args){
        for(int j =0; j<=2;j++){
            for(int i =0;i<=5;i++){
            if(i==4){
                continue;
            }
            System.out.println(i);
        }
        
        }
    }
}