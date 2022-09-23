import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,x[],i,found=0,sum=0;
        float avg;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
         sum=sum+x[i];
        }
        avg=sum/n;
        for(i=0;i<n;i++)
        {
        if(avg==x[i])
           found++;
          
        }
        if(found!=0)
          System.out.println("True");
        else
          System.out.println("False");
         
    }
}