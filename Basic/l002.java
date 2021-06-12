import java.util.*;

public class l002 {
    public static Scanner scn = new Scanner(System.in);

    public static boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }

    public static boolean isPrime(){
       int t= scn.nextInt();

        for(int i=0; i<t; i++){
            int n= scn.nextInt();

            int count =0;
            for(int div =2; div*div <= n; div++){
                if(n%div ==0){
                    count ++;
                    break;

                }
            }

            if(count ==0){
                System.out.println("prime");}

            else{
                System.out.println("not prime");
            }    
            }

        }


    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        boolean res = isPrime(n);
        //System.out.println(res);
      
    }
}