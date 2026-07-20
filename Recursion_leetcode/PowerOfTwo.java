//https://leetcode.com/problems/power-of-two/
public class PowerOfTwo{
    public static void main(String[] args) {
        System.out.println(isPowerOftwo(16));
        System.out.println(isPowerOftwo(18));
    }
    static boolean isPowerOftwo(int n){
        //base 
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n % 2 !=0){
            return false;
        }
        return isPowerOftwo(n/2);
        
        
    }
}