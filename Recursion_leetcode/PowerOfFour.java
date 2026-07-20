public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOffour(16));
    }
    static boolean isPowerOffour(int n){
        //base 
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n % 4 !=0){
            return false;
        }
        return isPowerOffour(n/4);
        
        
    }
}

