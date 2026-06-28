public class MaxWealth {
    public static void main(String[] args) {
    int [] [] nums= {
                    {1,2,3},
                    { 2,3,7 }
        };

    }
    static int maximumWealth(int[][] accounts){
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < accounts.length ; i++) {
            int sum=0;
            for (int j =0 ; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
                if(sum>ans){
                    ans= sum;
                }
            }
        return ans;
        }

    }

