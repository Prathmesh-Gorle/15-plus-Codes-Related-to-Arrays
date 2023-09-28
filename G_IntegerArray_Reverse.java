import java.util.Scanner;

public class G_IntegerArray_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int size = sc.nextInt();
        int [] numbers = new int[size];
        //input
        for (int i=0;i<size;i++){
            numbers[i] =sc.nextInt();
        }
      
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }

    //Reverse Array
    for(int i=size-1;i>=0;i--){
        System.out.print(numbers[i]+" ");
    }

    }
}