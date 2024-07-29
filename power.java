import java.util.Scanner;
public class power {
    public static int pow(int n1,int n2){
        int sum = 1;
        for (int a=1;a<=n2;a++){
            sum*=n1;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number and its power");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        System.out.println("Value is: " +pow(n1,n2));
    }
}
