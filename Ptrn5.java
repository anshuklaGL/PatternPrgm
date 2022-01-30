package PracticePtrn;

public class Ptrn5 {

    /*
    7
    7 6
    7 6 5
    7 6 5 4
    7 6 5 4 3
    7 6 5 4 3 2
    7 6 5 4 3 2 1
     */
    public static void main(String[] args){

        int n=7;
        for(int i=1;i<=n;i++){
            for(int j=7;j>n-i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
