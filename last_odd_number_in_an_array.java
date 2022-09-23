import java.util.*;
class array{
    public static void main(String args[]){
        int n,arr[];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
                break;
            }
            
        }
    }
}