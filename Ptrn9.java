package PracticePtrn;

public class Ptrn9 {

    /*
    1
    12
    123
    12
    1
     */

    public static void main(String[] args){

        int n=3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=2;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }



    }
}