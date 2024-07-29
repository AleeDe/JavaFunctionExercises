import java.util.*;
class Avg{
    public static int avg(int num1, int num2, int num3){
        return (num1+num2+num3)/3;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three number Which you need avergae");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        System.out.println("Average is: "+avg(num1,num2,num3));

        
    }
}