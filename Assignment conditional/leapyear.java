import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a year ");
        int year = sc.nextInt();
        LeapOrNot(year);

       
}

    public static void LeapOrNot(int year){
        if(year%4==0){
            System.out.println("The given year is a leap year");
        }
        else {
            System.out.println("The given year is not a leap year");
        }
    }
    }


