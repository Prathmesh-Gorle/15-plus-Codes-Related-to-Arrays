public class A_Array_BubbleSort {
    public static void PrintArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,45,2,66,8,88,98};
        //time Compelexcity of bubble sort = O(n^2)
        //bubble sort
        int n =arr.length;
        for (int i = 0; i <n  - 1; i++) {
            for (int j = 0; j < n- i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        PrintArray(arr,n);
    }
}