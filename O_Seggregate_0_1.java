//Here simply sorting is done
public class O_Seggregate_0_1 {
    public static void seg(int []a,int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    //Swap
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }

    public static void main(String[] args) {
        int a[] = {0, 0, 0, 1, 0, 1, 1, 1};
        int n= (a.length)-1;
        seg(a,n);
    }
}