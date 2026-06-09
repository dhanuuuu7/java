

public class Print_Price{
    public static void main(String [] args){

        //printf() = is a method to format output
        // %[flags][width][.precision][specifier-character]

        // [width]

        // 0 = zero padding 
        // number = right justified padding
        // negative number = left justified padding

    
        double price1 = 9000.99;
        double price2 = 100000.15;
        double price3 = -54000.01;

        System.out.printf("%, .2f\n",price1);
        System.out.printf("%, .2f\n",price2);
        System.out.printf("%, (.2f\n",price3);

        int id1 = 989;
        int id2 = 3423;
        int id3 = 3;
        int id4 = 34;

        System.out.printf("%-4d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);

    }
}