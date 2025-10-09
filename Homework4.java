import java.util.Scanner;

class GCD{
    int gcdRecursive(int m, int n){
        if (n == 0) {return m;}
        if (m>n){
            return gcdRecursive(n,m%n);
        }
        else{
            return gcdRecursive(m, n%m);
        }
    }

    int gcdIterative(int m, int n){
        if (n==0) {return m;}
        if (m>n){
            while (n!=0){
                int temp = m%n;
                m = n;
                n = temp;
            }
            return m;
        }
        else {
            while (m!=0){
                int temp = n%m;
                n = m;
                m = temp;
            }
            return n;
        }
    }
}
public class Homework4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        GCD GCD = new GCD();
        System.out.print("두 수를 입력하세요 :");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.err.println("두 수의 최대공약수는 "+GCD.gcdRecursive(m, n)+"입니다.");
        System.err.println("두 수의 최대공약수는 "+GCD.gcdIterative(m, n)+"입니다.");
        sc.close();
    }
}