public class K_UnionofArrays {
    public static void printunion(int arr1[],int arr2[],int m,int n){
        int i=0, j=0;
        while(i<m && j<n){
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i]);
                i++;
            }
           else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[j]);
                j++;
            }
            else{
                System.out.print(arr1[i]);
                i++;
                j++;
            }
        }
        while(i<m){
            System.out.print(arr1[i]);
            i++;
        }
        while(j<n){
            System.out.print(arr2[j]);
            j++;
        }

    }

    public static void main(String[] args) {
        int arr1[]={1,3,4,6,7,8};
        int arr2[]={4,2,5,9};
        int m =arr1.length;
        int n =arr2.length;
        printunion(arr1,arr2,m,n);
    }
}