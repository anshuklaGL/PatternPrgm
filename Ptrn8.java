package PracticePtrn;

public class Ptrn8 {

    /*
    3 2 1
    2 1
    1
    */

    public static void main(String[] args){
        int n=3;
        for(int i=3;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
