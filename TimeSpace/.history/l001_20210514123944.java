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
    int n = arr.length, p1 = -1, p2 = n-1, itr = 0;
    while(itr <= p2){
        if (arr[itr] == 0)
           swap(arr, itr++, ++p1);
        else if(arr[itr] == 2)
            swap(arr,itr, p2--)
        else
            itr++;

    }

    }


    public static void bubbleSort(int[] arr){
        int n = arr.length;

        for(int li = n-1; li > 0; li--){
            for(int i = 0; i < li; i++)
               if(arr[i] > arr[i+1])
                 swap(arr,i,i-1);
        }
    }


    public static void selectionSort(int[]arr){
        int n = arr.length;
        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[i])
                  swap(arr,i,j);
            }
        }
    }

 public static void insertionSort(int [] arr){
     int n = arr.length;
     for(int i =0; i <n; i++){
        int key = arr[i];
        int j = i-1;
        while(j >=0 && arr[j] > key)
             arr[j+1] = arr[j];
             j = j-1;

     }
     arr[j+1] = key;

 }
  public static void partitionAnArray(int[] arr, int data){
      int n = arr.length, p= -1, itr=0;
      while(itr < n){
          if(arr[itr] <= data )
           swap(arr,itr,++p);

           itr++;
      }

  }

  public static void partitionAnArray2(int[] arr, int data){
    int n = arr.length, p= n-1, itr=0;
    while(itr <= p){
        if(arr[itr] <= data )
         
        itr++;

       else
       swap(arr,p--,itr); 
    }

}

public static void display(int []arr){
    for (int ele : arr)
       System.out.print(ele + "");
       System.out.println();  
}

    public static void main(String [] args){
        int [] arr = {7,-2,4,1,3}

    }
}

