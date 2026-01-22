import java.util.Scanner;

public class WhereInSequence {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number: ");

        long x = scan.nextLong();

        if (x < 0){
            System.out.println("Output: -1");
            return;
        }
        if(x == 0){
            System.out.println("Output: 0");
        }
        if(x == 2){
            System.out.println("Output: 1");
        }

        long nm1 = 2;
        long nm2 = 0;
        int index = 1;

        while(true){

            double calc = (1.5 * nm1) + (2*nm2);
            long c = (long)Math.floor(calc);
            index++;

            if(c == x){
                System.out.println("Input: "+ x);
                System.out.println("Output: " + index);
                return;
            }
            if(c > x){
                System.out.println("Input: "+ x);
                System.out.println("Output: " + (index - 1));
                return;
            }

            nm2 = nm1;
            nm1 = c;
        }



    }


}
