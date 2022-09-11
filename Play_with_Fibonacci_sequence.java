import java.util.*;
class Fibonacci
{
    public static void main(String args[])
    {
        int a=0,b=1,c,n,f=3;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.print(a+" "+b+" ");
        c=a+b;
        while(f<=n)
        {
            //if(c==n)
            //{
                //f=1;
                //break;
            //}
              c=a+b;
             a=b;
               b=c;
               System.out.print(c+" ");
              f++;
        }
        //if(f==1)
            //System.out.println("True");
        //else
            //System.out.println("False");
            }
        }