import java.util.Scanner;
public class Cir{
    public static double Cir(int r1){
        return 2*3.142*r1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int r1 = scan.nextInt();
        System.out.println("Circumference is: "+Cir(r1));
    }
}
