import java.util.Scanner;

public class NotFib {

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

        sq[0] = 0;
        if(n>1)
        {
            sq[1] = 1;
        }
        for(int i = 2; i < n; i++)
        {
            // the assignment also said to multiply it by 3 so tried that as well
            double calc = (3* sq[i-1]) + (2* sq[i - 2]);

            sq[i] = (long) Math.floor(calc);
        }

        System.out.println("Input: " + n);

        System.out.print("Output: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(sq[i]);
            System.out.print(", ");
        }

        System.out.println();
    }
}
