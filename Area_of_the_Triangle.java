import java.util.*;
class area{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        float s;
        s=(float)(a+b+c)/2;
       float  area;
        area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
    //float d=Math.sqrt(area);
        System.out.format("%.2f",area);
        
        
    }
}