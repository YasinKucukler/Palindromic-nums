import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(iSPalindrome(num));
    }
    static boolean iSPalindrome(int n)
    {
        int temp = n, res  =0, division;
        do
        {
           division = temp % 10;
           res += division;
           if ((temp / 10) != 0)
           {
               res *= 10;
           }
            temp /= 10;
        }while((temp != 0));
        return n == res;
    }
}