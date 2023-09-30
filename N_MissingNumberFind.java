public class N_MissingNumberFind {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        //1+2+3+5 = 11 sum1
        //1+2+3+4+5 =15 sum2
        //missing number = sum2 - sum1 = 4
int sum1 =0;
for(int i=0;i<arr.length;i++){
    sum1 =sum1 +arr[i];                //sum of array elements
}

int sum2 =0;
for(int i=1;i<=5;i++){
    sum2 =sum2 + i;                //Total sum of array elements
}

//missing number 
int missingnumber = sum2 -sum1;
System.out.println("Missing number from Array is "+missingnumber);
    }
}
