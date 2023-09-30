public class L_OddOcuuranceinArray {
    public static void main(String[] args) {
        int arr [] ={2,3,4,5,11,7};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!= 0){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}