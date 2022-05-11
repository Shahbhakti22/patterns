import java.util.Scanner;
public class even_display_square {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,num1;
        System.out.println("Enter a number:");
        num1= sc.nextInt();

        if (num1%2==0)
        {
            num=num1*num1;
            System.out.println("the number is even ");
            System.out.println("the square is:" +num);

        }else
        {
            System.out.println("number is not even");
        }
    }
}
