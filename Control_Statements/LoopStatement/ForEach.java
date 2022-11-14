public class ForEach{
    public static void main (String[] args){
        String[] names = {"Java", "C", "C++","Python","JavaScript"};
        System.out.println("The popular languages are:\n ");
        for(String languages : names){
            System.out.println(languages);    
                }
    }
}