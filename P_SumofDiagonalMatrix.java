public class P_SumofDiagonalMatrix {
    public static void main(String[] args) {
       int a[][]={{8,7,4,5,},
               {54,2,2,30},
               {1,3,4,6},
               {8,7,4,1}};
       int n=4;     //4*4 matrix
       int pd=0;    //for addition of Primary Diagonal elements add(8+2+4+1=15)
       int sd=0;    //for addition of Secondary Diagonal elements add(5+2+3+8=18)
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) {
                   pd=pd+a[i][j];
                }
                if((i+j)==(n-1)){
                    sd=sd+a[i][j];
                }
            }
        }
        System.out.println(pd);
        System.out.println(sd);
    }
}
