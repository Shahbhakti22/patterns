import java.util.Scanner;
public class Switch_02 {
    public static void main (String args[])
    {
        int ch;
        System.out.println("Enter your choice \n 1:Greater between 2 no \t 2:Profit n loss \t 3:Area of rectange \t 4:even odd");
        Scanner sc=new Scanner(System.in);
        ch= sc.nextInt();

        switch (ch)
        {
            case 1:
                System.out.println("Greater number");
                int num1,num2;
                System.out.println("enter 2 no");
                num1= sc.nextInt();
                num2= sc.nextInt();

                if (num1>num2)
                {
                    System.out.println("num1 is greater");
                }else
                {
                    System.out.println("num2 is greater");
                }
                break;

            case 2:
                System.out.println("Profit loss");
                int sp,cp,profit;
                System.out.println("Enter cost price:");
                cp=sc.nextInt();
                System.out.println("Enter selling price:");
                sp=sc.nextInt();

                profit= sp - cp;
                System.out.println("Profit:" + profit);



                break;


            case 3:
                System.out.println("Area of rectangle");
                int l,b,Ar;
                System.out.println("Enter length:");
                l=sc.nextInt();
                System.out.println("Enter breadth:");
                b=sc.nextInt();
                Ar=l*b;
                System.out.println("Area of rect:" + Ar);
                break;



            case 4:
                System.out.println("Even odd");
                int num;
                System.out.println("enter a number");
                num= sc.nextInt();
                if (num%2==0)
                {
                    System.out.println("number is even");
                }else
                {
                    System.out.println("number is odd");
                }
                break;


            default:
                System.out.println("invalid choice");
                break;


        }

    }

}
