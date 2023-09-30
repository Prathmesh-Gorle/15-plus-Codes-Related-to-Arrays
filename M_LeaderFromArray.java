//if all the element in the right is greator than slected element
public class M_LeaderFromArray {
    public static void main(String[] args) {
        int arr[]={16,17,19,7,8,10};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i] <=arr[j]){
                    break;
                }
                if(j==arr.length-1){
                    System.out.println(arr[i]+" is an leader");
                }
            }
        }
        System.out.println(arr[arr.length-1]+" is an leader");
    }
}
