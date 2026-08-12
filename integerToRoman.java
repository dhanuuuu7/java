import java.util.*;
public class integerToRoman {
    static String intToRom(int num){
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] Rom = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String res = "";
        for(int i =0;i<values.length;i++){
            if(num>=values[i]){
                res += Rom[i];
                num-=values[i];
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(intToRom(num));
    }
}
