import java.util.*;
public class l001{

    public static void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static sort01(int[] arr){
        int p=-1, itr = 0;
        while(itr < arr.length){
            if(arr[itr]==0)
            swap(arr,++p,itr);

            itr++;

        }
    }

    public static sort02(int[] arr){
    int n = arr.length, p1 = -1, p2 = n, itr = 0;
    while(itr <= p2){
        if (arr[itr] == 0)
           swap(arr, itr++, ++p1);
        else if(arr[itr] == 2)
            swap(arr,itr,--p2)
               
    }

    }
    public static void main(String [] args){

    }
}

