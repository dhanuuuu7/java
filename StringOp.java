public class StringOp {
    public static void main(String [] args){
        String name = " Dhanunjay";

        int length = name.length();
        char letter = name.charAt(1);
        int index = name.indexOf("n");
        int lastIndex = name.lastIndexOf(name);

        System.out.println("Length of the name is "+ length);
        
        if(name.isEmpty()){
            System.out.println("the name isempty");
            
        }
        else{
            System.out.println("Hello"+ name);
        }

        if(name.contains(" ")){
            System.out.println("your name has spaces.");
        }
        else{
            System.out.println("your name doesn't contains spaces");
        }
        
        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("n","m");
        System.out.println(index);
    }
}
