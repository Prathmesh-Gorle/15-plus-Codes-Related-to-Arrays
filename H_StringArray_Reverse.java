import java.util.Scanner;
public class H_StringArray_Reverse{
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    // String jbk =sc.nextLine();
    String [] jbk = new String[5];
         //input
         for (int i=0;i<4;i++){
             jbk[i] =sc.nextLine();
         }
         //output
         for(int i=0;i<4;i++){
             System.out.println(jbk[i]);
         }
         //REVRSE THR STRING ARRAY
     for(int i=3;i>=0;i--){
         System.out.print(jbk[i]+" ");
     }


 }
}