import java.util.Scanner;

public class trinagleArea {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first side");
        int side1 =sc.nextInt();
        System.out.println("Enter second side");
        int side2 =sc.nextInt();
        System.out.println("Enter thirs side");
        int side3 = sc.nextInt();
        Triangle(side1,side2,side3);

    }

    public static void Triangle(int b,int p,int h){
        if(b==p&&p==h){
            System.out.println("The given sides are the the sides of a eqilateral triangle");
        }
        else if(b==p||b==h || h==p){
            System.out.println("The given sides are the the sides of a isosceles triangle");
        }
        else{
            System.out.println("The given sides are the the sides of a Scalene triangle");
        }
    }
}
