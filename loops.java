

import java.util.Scanner;

public class loops {

    public static void main(String[] args) {

        char ans;
        int choice,ch1;
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t----\t Food Corner\t----\t\t");
        do
        {
            System.out.println("1:Starters\n2:Main Course\n3:Desert");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Starters Items");
                    System.out.println("1:Cheese corn balls ");
                    System.out.println("2:Paneer crispy");
                    System.out.println("3:Veg crispy");
                    System.out.println("4:Masala papad");
                    ch1=sc.nextInt();
                    break;
                case 2:
                    System.out.println("Main Course Items");
                    System.out.println("1:Paneer bhurji");
                    System.out.println("2:veg makhanwala");
                    System.out.println("3:roti ");
                    System.out.println("4:butter naan");
                    ch1=sc.nextInt();
                    break;
                case 3:
                    System.out.println(" Desert Items");
                    System.out.println("1:ice cream");
                    System.out.println("2:brownie");
                    System.out.println("3:Apple pie");
                    System.out.println("4:lemon tart");
                    ch1=sc.nextInt();
                    break;
                default:
                    System.out.println("Invalid Item");
                    break;

            }
            System.out.println("Do you want to add another Item Yes/No");
            ans=sc.next().charAt(0);

        }
        while(ans=='y'||ans=='Y');
        System.out.println("Thanks For coming");

    }

}
