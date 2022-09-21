import java.util.Scanner;
class main
{
    public static int ispalindrome(int x)
    {
        int r,sum=0,temp=x;
        while(x>0)
        {
            r=x%10;//r=1%10=1
            sum=sum*10+r;//sum=121
            x=x/10;//x=1
        }
        if(temp==sum)
            return 2;
        else
            return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rev;
        n=sc.nextInt();
        n=Math.abs(n);
        rev=ispalindrome(n);
        System.out.println(rev);
    }
}