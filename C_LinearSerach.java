public class C_LinearSerach {
    public static void main(String[] args) {
        int ar[] ={1,23,21,4,5,6,8};
        int n=ar.length;
        int search_ele=5;
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(search_ele==ar[i]){
                System.out.println("Elements found at index "+i);
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Elements not found");
        }
    }
}