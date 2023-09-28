public class J_CommonBetweentwoArrays{
    public static void printinter(int arr1[],int arr2[],int m,int n){

       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               if(arr1[i]==arr2[j]){
                   System.out.println(arr1[i]);
               }
           }
       }
    }

    public static void main(String[] args) {
        int arr1[]={1,3,4,6,7,8};
        int arr2[]={4,8,5,9};
        int m =arr1.length;
        int n =arr2.length;
        printinter(arr1,arr2,m,n);
    }
}