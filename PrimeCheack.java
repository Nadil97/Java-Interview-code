public class PrimeCheack {
    public static void main(String []args){
        System.out.println(primeCheck(10));
        System.out.println(primeCheck(3));

    }
    public static boolean primeCheck (int n){
        if(n == 0 || n==1){
            return false;
        }if(n==2){
            return true;
        }for(int i=2; i <= n/2; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
