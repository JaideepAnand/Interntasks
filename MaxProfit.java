class Main
{
    public static int Maxfit(int[] p)
    {
        int profit = 0;
        int j = 0;
        for (int i = 1; i < p.length; i++)
        {
            
            if (p[i - 1] > p[i]) {
                j = i;
            }
            if (p[i - 1] <= p[i] &&
                (i + 1 == p.length || p[i] > p[i + 1]))
            {
                profit += (p[i] - p[j]);
                System.out.printf("Buy on day %d   -    sell on day %d\n", j + 1, i + 1);
            }
        }
 
        return profit;
    }
 
    public static void main(String[] args)
    {
        int[] p = { 1, 5, 2, 3, 7, 6, 4, 5 };
 
        System.out.print("\nTotal profit " + Maxfit(p));
    } }      
