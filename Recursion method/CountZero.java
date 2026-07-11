public class CountZero {
    public static void main(String[] args) {
        int ans = countZero(1300);
        System.out.println(ans);
    }
    static int countZero(int n){
        return helper(n,0);
    }
    private static int helper(int n, int count){
        if(n==0){
            return count;
        }

        int rem= n%10;

        if(rem == 0){
           return  helper(n/10, count+1);
        }
        return helper(n/10, count);
    }
}

