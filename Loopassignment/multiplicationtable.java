package Loopassignment;
import java.util.Scanner;
public class multiplicationtable {
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
     System.out.println("Enter the table we want:");
    int n = sc.nextInt();

    int product =1;
    System.out.print("The table of "+n+" = ");
    for(int i=1;i<=10;i++){
        product= n*i;
        System.out.print(product+" ");
    }
    
    }
  

}
