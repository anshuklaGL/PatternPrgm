package PracticePtrn;

public class Ptrn4 {

    /*
    3 3 3
    2 2
    1
     */

    public static void main(String[] args){
        int n=3;
        for(int i=3;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
