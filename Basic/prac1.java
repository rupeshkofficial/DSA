import java.util.*;

public class prac1 {
    public static Scanner scn = new Scanner(System.in);

    public static boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }

    

    public static void main(String[] args) {
        int n = scn.nextInt();
        boolean res = isEven(n);
        System.out.println(res);
    }
}