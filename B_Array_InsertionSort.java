public class B_Array_InsertionSort {
    public static void PrintArray(int arr2[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) { 
   // INSERTION SORT
   int arr2[] = {12, 22, 4, 5, 3, 1};
   //time Compelexcity of insertion sort = O(n^2)
  int n=arr2.length;
   for (int i = 0; i < n- 1; i++) {
       int smallest = i;
       for (int j = i + 1; j < n; j++) {
           if (arr2[smallest] > arr2[j]) {
               smallest = j;
           }
       }
       //Swap
               int temp = arr2[smallest];
               arr2[smallest] = arr2[i];
               arr2[i] = temp;
           }
   PrintArray(arr2,n);
  }
}