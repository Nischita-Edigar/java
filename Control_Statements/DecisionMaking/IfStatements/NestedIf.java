public class NestedIf {    
    public static void main (String[] args){
        String Address="Delhi, India";
        if(Address.endsWith("India")){
            if(Address.contains("Meerut")){
                System.out.println("Your city is Meerut");
            }
            else if(Address.contains("Bangalore")){
                System.out.println("your city is Bangalore");
            }
            else{
                System.out.println(Address.split(",")[0]);
            }
        
            }else{
                System.out.println("you are not living in India");
            }
        }
    }

  