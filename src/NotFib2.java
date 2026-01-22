import java.util.Scanner;

public class NotFib2 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sequence Amount: ");
        int n = scan.nextInt();

        if(n<= 0)
        {
            System.out.println("Enter Positive");
            return;
        }
        long[] sq = new long[n];
        //Initial value of 0,1
        sq[0] = 0;
        if(n>1)
        {

            sq[1] = 2;
        }
        for(int i = 2; i < n; i++)
        {
            //same calc as show in the assignment
            double calc = (1.5* sq[i-1]) + (2* sq[i - 2]);

            sq[i] = (long) Math.floor(calc);
        }

        System.out.println("Input: " + n);

        System.out.print("Output: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(sq[i]);
            if(i < n -1)
            {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}
//This one had the correct output