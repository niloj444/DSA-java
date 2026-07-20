//https://leetcode.com/problems/power-of-three/description/
public class PowerOfThree{
    public static void main(String[] args) {
        System.out.println(isPowerOfthree(-1));
    }
    static boolean isPowerOfthree(int n){
        //base 
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n % 3 !=0){
            return false;
        }
        return isPowerOfthree(n/3);
        
        
    }
}