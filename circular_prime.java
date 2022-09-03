import java.util.*;
class main
{
    public static boolean Prime(int x)
    {
        int r,count=0;
        for(int i=2; i<=(int)Math.sqrt(x); i++)
            if(x%i==0)
            {
                count++;
            }
            if(count==0)
               return true;
            else
                return false;
    }
    public static int reverse(int y)
    {
        int sum=0,r;
        while(y>0)
        {
            r=y%10;
            sum=sum*10+r;
            y=y/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int m;
      m=sc.nextInt();
      if(!Prime(m))
            System.out.println("not prime");
      else if(Prime(reverse(m)))
            System.out.println("circular prime");
      else
      System.out.println("prime but not a circular prime");
    }
}    
    
    