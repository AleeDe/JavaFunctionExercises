import java.util.Scanner;
public class numberCounter {
    static int p=0,n=0,z=0;
    public static void Checker(int num){

        if (num>0)  p++;
        else if (num<0)  n++;
        else z++;
     
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean cond=true;
        while(cond){
            System.out.println("Enter a number");
            int num = scan.nextInt();
            Checker(num);
            System.out.println("if you want more number to any digit else press \"x\"");
            char chec = scan.next().charAt(0);
            if (chec=='x'){
                cond =false;
            }
            else{
                continue;
            }
        }
        System.out.println("Total Postive Numbers are: "+p);
        System.out.println("Total Negtive Numbers are: "+n);
        System.out.println("Total zeros are: "+z);
    }
}
