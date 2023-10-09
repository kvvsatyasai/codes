import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while((t--)>0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int i;
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int max=a[0];
            for(i=0;i<n;i++)
            {
                if(max<a[i])
                {
                    max=a[i];
                }
                System.out.print(max+" ");
            }
            System.out.println();
            int min=a[0];
            for(i=0;i<n;i++)
            {
                if(min>a[i])
                {
                    min=a[i];
                  
                }
                System.out.print(min+" ");
                
            }
            System.out.println();
            System.out.println();
        }
        
    }
}