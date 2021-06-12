import java.util.*;

public static int flindex(int[] arr, int data) {
    public static Scanner scn = new Scanner(System.in);
    int si = 0, ei = arr.length - 1;
    while (si <= ei) {
        int mid = (si + ei) / 2;
        if (arr[mid] == data)
            return mid;
        else if (arr[mid] < data)
            si = mid + 1;
        else
            ei = mid - 1;
    }

    return -1;
}

public static void main(String[] args) {
    int n = scn.nextInt();
    int[] arr = new int[n];
    input1(arr);
    int data = scn.nextInt();
    
    flindex();
}
}