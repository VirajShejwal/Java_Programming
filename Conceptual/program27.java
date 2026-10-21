import java.util.Scanner;


class program27
{
    public static void main (String A[])
    {
        Scanner scanner = null ;
        String sName = null;
        int iAge = 0;
        float fmarks = 0.0;         //error

        scanner = new Scanner (System.in);

        System.out.println("Enter your name :");
        sName = scanner.next();

        System.out.println("Enter your age :");
        iAge = scanner.nextInt();

        System.out.println("Enter your marks :");
        fmarks = scanner.nextFloat();

        System.out.println("Welcome "+sName);
        System.out.println("Your Age is :"+iAge);
        System.out.println("Your marks :"+fmarks);

    }
}