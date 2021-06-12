import java.util.*;
 public class prime{


         public static Scanner scn = new Scanner(System.in);

          public static boolean isPrime(int n){

            for(int i=2; i*i<n; i++){

            if(n%i==0)
                 return false; }

             
                return true; 
             }
          
      public static void solve() {
          int n= scn.nextInt();
          boolean res= isPrime(n);
          if(true){
             System.out.println("prime");
          }
          else{
              System.out.println("not prime");
          }
        }

          public static void main(String[]args) {
            int t= scn.nextInt();
             for(int i=1; i<t; i++){
              solve();
              
          }
      



        }

 }