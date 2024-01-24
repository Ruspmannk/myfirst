import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();

        if(a<0){
           a = -(a);
           System.out.println(+a);
        }
        else 
        System.out.println(a);
    }
}
