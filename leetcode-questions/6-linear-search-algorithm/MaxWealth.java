public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,3},
            {3,2,1}
        };
        System.out.println(wealthier(accounts));
    }

    static int wealthier(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;

        for(int person = 0; person < accounts.length; person++) {
            int accountSum = 0;
            for(int account = 0; account < accounts[person].length; account++) {
                accountSum += accounts[person][account];
            }
            if(accountSum > maxWealth) {
                maxWealth = accountSum;
            }
        }
        return maxWealth;
    }
}