import java.util.Arrays;

public class I_ArraysClass_Methods {
    public static void main(String[] args) {
        int a[] ={24,56,5,87,23,54};
        int b[] ={2,45,65,12,32,5};
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println("Third Largest from Array 'a' is : "+a[a.length-3]);
        System.out.println("Second Smallest from Array 'b' is : "+b[1]);
    }
}