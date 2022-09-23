import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,x[],i,k,found=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(k==x[i])
              found++;
        }
        if(found>=1)
          System.out.println("True");
        else
          System.out.println("False");
    }
}