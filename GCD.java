import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y =sc.nextInt();
        System.out.println("The GCD of two numbers is :" + 
        findGCD(x,y));
        
    }
    static int findGCD(int x,int y){
        int r=0,dividend,divisor;
        dividend = (x>y)? x:y;
        divisor= (x<y)?x:y;
        while(divisor!=0){
            r=dividend%divisor;
            dividend =divisor;
            divisor=r;
        }
        return dividend;
    }
}
