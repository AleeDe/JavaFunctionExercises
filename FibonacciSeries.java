import java.util.Scanner;
public class FibonacciSeries {
    public static void FibonacciSeries(int n1){
        int a=0,b=1;
        System.out.print(a+" ");
        if (n1>=2){
             System.out.print(b+" ");
        
            for (int i=3;i<=n1;i++){
                int c= a+b;
                a=b;
                b=c;
                System.out.print(c+" ");
            }
        }


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of nth");
        int n1 = scan.nextInt();
        FibonacciSeries(n1);
    }
}
