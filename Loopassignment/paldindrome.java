package Loopassignment;

import java.util.Scanner;

public class paldindrome {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int orginal = n;

        int ans =0;
        while(n>0){
            ans  = ans*10 + n%10;
            n = n/10;
            
        }
        
        System.out.println(ans);
        if(orginal==ans)
        System.out.println("the number is a palindrome ");
        else {
            System.out.println("Not palindrome");
        }

      


       
        
    }
}
