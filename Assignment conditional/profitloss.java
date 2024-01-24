import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sellingprice =sc.nextInt();
        int costprice = sc.nextInt();

        int profitorloss = sellingprice - costprice;

        if(profitorloss>0){
            System.out.println("Profit");
        }
        else if(profitorloss<0){
            System.out.println("Loss");
        }
        else {
            System.out.println("Neither loss nor profit");
        }

        



    }
}
