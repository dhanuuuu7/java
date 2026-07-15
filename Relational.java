public class Relational {
    public static void main(String [] args){
     int p = 20 , q= 10;
     System.out.println(p == q);
     System.out.println(p != q);
     System.out.println(p <= q);
     System.out.println(p >= q);
     System.out.println(p < q);
     System.out.println(p > q);
     if(p<q && p>11){
         System.out.println("greater than all of us.");
     }
     else if (q>p || q==10){
         System.out.println("Q is equal to 10 or more than of that .");
     }
    }
}
