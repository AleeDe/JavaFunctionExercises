import java.util.Scanner;
public class VoteChecker {

    public static void VoteChecker(int age){
        if (age>=18){
            System.out.println("You are Eligiable for vote");
        }
        else{
            System.out.println("You are Not Eligiable for vote");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = scan.nextInt();
        VoteChecker(age);
    }
}
