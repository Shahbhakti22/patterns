import java.util.Scanner;
public class greater_num {
    public static void main(String args[]){
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();


        if(num>0)
        {
            System.out.println("number is positive.");
        }else
        {
            System.out.println("number is negative");
        }

    }
}
