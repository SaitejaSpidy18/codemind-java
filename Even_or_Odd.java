import java.util.Scanner;
public class main
{
    public static void main(String args[]){
        Scanner my = new Scanner(System.in);
        int n;
        n = my.nextInt();
        if(n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}