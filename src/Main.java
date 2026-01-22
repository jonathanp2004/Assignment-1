public class Main {


    public int longestCommonSubsequence(String firstText, String secondText){

        int a = firstText.length();
        int b = secondText.length();

        int [][] table = new int[a +1][b + 1];

        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= b; j++ )
            {
                if(firstText.charAt(i-1) == secondText.charAt(j-1))
                {
                    table [i][j] = table[i-1][j-1]+1;
                } else{
                    table [i][j] = Math.max(table[i-1][j], table[i][j-1]);
                }
            }
        }

        return table[a][b];
    }

    public static String longestCommonSubstring(String fText, String sText){

        int a = fText.length();
        int b = sText.length();

        int [][] ta = new int[a+1][b+1];



    }

}
