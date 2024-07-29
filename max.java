import java.util.Scanner;
public class max{
    public static void max(int n1,int n2){
        if (n1>n2){
            System.out.println("Max is: "+n1);
        }
        else if(n2>n1){
            System.out.println("Max is: "+n2);
        }
        else{
            System.out.println("Number are equal");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the two Number");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        max(n1,n2);
    }
}
