import java.util.Scanner;

public class greates {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = sc.nextInt();
        System.out.println("Enter the seconnd number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();

        if(a>b&&a>c){
            System.out.println("The number "+a+ " is greatest among  the three numbers");
        }
        else if(b>a&&b>c){
            System.out.println("The number "+b+ " is greatest among  the three numbers"); 
        }
        else {
            System.out.println("The number "+c+ " is greatest among  the three numbers");
        }
        
    }
}
