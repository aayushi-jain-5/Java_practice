// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        prime(x);
    }
    public static void prime(int x){
        for(int i=2;i<=x/2;i++){
            while(x%i==0 && x>1){
                x = x/i;
                System.out.println(i);
            }
        }
        // return 0;
    }
}
