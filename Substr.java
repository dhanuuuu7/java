public class Substr {
   
    public static void main(String[] args) {
        
    
    //Substring() = A method used to extract a portion of a string.
    // substring(start, end);

    String email = "dhanunjaynadiminti@gmail.com";
    String username = email.substring(0,5);
    String Domain  = email.substring(email.indexOf("@"));

    System.out.print("username is "+username);

    System.out.println("Domain :"+ Domain);
   

    }
}
