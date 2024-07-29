import java.util.*;
class SumOdd{
    public static int SumOdd(int n){
        int sum = 0;
        for (int a=0;a<=n;a++){
            if (a%2!=0){
                sum+=a;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of nth");
        int n = scan.nextInt();
        System.out.println("Sum of odd number til " + n +" is: "+SumOdd(n));
    }
}