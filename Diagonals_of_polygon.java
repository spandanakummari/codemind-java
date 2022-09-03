import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        r=((int)n*(n-3))/2;
        System.out.println(r);
    }
}