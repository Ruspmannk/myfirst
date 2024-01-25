package Loopassignment;

import java.util.Scanner;

public class fibonaaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto we want the fibonacci series");
        int n = sc.nextInt();

        int firstterm = 0;
        int secondterm = 1;
        System.out.print(firstterm+" "+secondterm);

        int nextterm;

        for(int i=3;i<=n;i++){
            nextterm = firstterm + secondterm;
            System.out.print(" "+nextterm);

            firstterm = secondterm;
            secondterm = nextterm;
        }

    }
}
