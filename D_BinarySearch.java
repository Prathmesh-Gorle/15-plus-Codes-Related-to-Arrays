public class D_BinarySearch {
    public static void main(String[] args) {
        int a[] = {2,4,5,6,8,9,16,78};
        int item= 78;
        int li= 0;
        int hi=a.length-1;
        int mi = (li+hi)/2;
        while ((li<=hi)){
            if(a[mi]==item){
                System.out.println("The element is present at "+mi+" index.");
                break;
            }else if(a[mi]<item){
                li =mi+1;
            }else{
                hi=mi-1;
            }
            mi= (li+hi)/2;
        }


    }
}