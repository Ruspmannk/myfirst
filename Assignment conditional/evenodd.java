// Question 1->
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        EvenOdd(n);
        
        
    }


    public static void EvenOdd(int p){
        if(p%2==0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }
    
}
}
