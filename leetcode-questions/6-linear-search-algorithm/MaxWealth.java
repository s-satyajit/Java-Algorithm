public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,3},
            {3,2,1,5}
        };
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int wealthier = Integer.MIN_VALUE;
        for(int[] ints : accounts) {
            int sumOfWealth = 0;
            for(int anInt : ints) {
                sumOfWealth += anInt;
            }
            if(sumOfWealth > wealthier)
                wealthier = sumOfWealth;
        }
        return wealthier;
    }
}