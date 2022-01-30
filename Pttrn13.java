package PracticePtrn;

public class Pttrn13 {

    /*
    1 2 3
      1 2
        1
     */

    public static void  main(String[] args){

        int n=3;
        for(int i=3;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
