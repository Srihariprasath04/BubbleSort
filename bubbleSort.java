import java.util.*;
class Sort{ // bubble sort als known as sinking sort and exchange sort
    public static void main(String[] args) {
        // Algorithm
        // 1. In every step we compare the adjacent elements
        // 2.  Eg   arr = [3, 1, 5, 4, 2]
        // compare the first two elements and if first is greater than the second one swap it
        //  after swapping arr=[1, 3, 5, 4, 2]
        // and compare the next two elements and so on
        // WHY USE BUBBLE SORT
        // through the first parse the largest element come to the end
        // after the second parse the second largest element come to the second largest part

        // Space complexity  O(1) constant
        // Time complexity Best Case : O(n) , Worst Case : O(n^2)
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = scanner.nextInt();
        }
        bubble(ar);
        System.out.println(Arrays.toString(ar));
    }
    static void bubble(int[] ar){
        // run the steps(passes) n-1 times
         boolean swapped; // if the array is already sorted then i runs only for index 0;
        for(int i=0;i<ar.length; i++){
            swapped = false;
            // for each step maximum element will come to the end 
            for(int j=1; j<ar.length-i; j++){
                // swap if the element is smaller than the before element
                if(ar[j] < ar[j-1]){
                    int temp = ar[j];
                    ar[j] = ar[j-1];
                    ar[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){  // !false = true;
                break;
            }
        }
    }
}