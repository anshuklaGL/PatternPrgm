package PracticePtrn;

public class Ptrn1 {

    /*
    1
    1 2
    1 2 3
     */

    public static void main(String[] args){
    // Adding new comment
        int n=3;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
