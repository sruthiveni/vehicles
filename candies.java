import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]={0,1,2,1};
        int final1[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            final1[i]=1;
        }
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>a[i-1])
            {
            final1[i]=final1[i-1]+1;
            }
        }
        for(int i=a.length-2;i>=0;i--)
        {
            if(a[i]>a[i+1])
            {
                int m=Math.max(final1[i],final1[i+1]+1);
                final1[i]=m;
            }
        }
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=final1[i];
        }
        System.out.println(sum);
    }
}
    
    
