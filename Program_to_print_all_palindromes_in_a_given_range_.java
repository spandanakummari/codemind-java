import java.util.Scanner;
class Sample
{
    public static boolean ispal(int n)
    {
        int tem=n,rev=0,r;
        while(n>0)
        {
        r=n%10;
        rev=rev*10+r;
        n=n/10;
        }
    if(tem==rev)
      return true;
    else
      return false;
    }
    public static void main(String args[])
    {
        int n,m,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            if(ispal(i))
            {
                System.out.print(i+" ");
            }
        }
        
    }
}