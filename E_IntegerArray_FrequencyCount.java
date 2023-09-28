import java.util.Arrays;

public class E_IntegerArray_FrequencyCount {
    public static void main(String[] args) {
        int a [] ={2,45,35,1,45,1,1};
        Arrays.sort(a);
        int n = a.length;
        for(int i=0; i<n;i++){
            int count=1;

            while( i < n-1 && a[i] == a[i+1]){
                i++;
                count++;
            }
            System.out.println(a[i] +" : "+ count);
            //count++ ;

        }
    }
}