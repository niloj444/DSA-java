public class DigitProd{
    public static void main(String[] args) {
        int ans = pod(105);
        System.out.println(ans);
    }
    static int pod(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) * (n/10);
    }

}