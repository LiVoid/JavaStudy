import java.util.Arrays;

public class Calculate {
    public static void main(String[] args)
    {
        // 多维数组
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        // set  interest rates to 10...15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++)
            interestRate[j] = (STARTRATE + j) / 100.0;

        double[][] balances = new double[NYEARS][NRATES];

        // set initial balances to 10000
        Arrays.fill(balances[0], 10000);

        //compute interest in future years
        for( int i = 1; i < balances.length; i++){
            for (int j = 0; j < balances[i].length; j++)
            {
                double oldBalances = balances[i-1][j];

                double interest = oldBalances * interestRate[j];
                balances[i][j] = oldBalances + interest;

            }
        }

        // print one row of interest rates
        for (double v : interestRate) System.out.printf("%9.0f%%", 100 * v);
        System.out.println();

        // print balance table
        for (double [] row : balances)
        {
            for (double b : row )
                System.out.printf("%10.2f",b);
            System.out.println();
        }
    }
}
