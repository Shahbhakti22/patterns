import java.util.Scanner;
public class vowel {

    public static void main (String args[])
    {
        char b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a char");
        b=sc.next().charAt(0);

        if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u')
        {
            System.out.println("it is a vowel");
        }else
        {
            System.out.println("it is not a vowel");
        }


    }

}
