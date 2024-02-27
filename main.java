import java.util.Scanner;
class main
{

    int addition(int a,int b)
    {
        return a+b;
    }
  
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int add=addition(a,b);
        int sub=diff(a,b);
        System.out.println("Sum is:"+add);
        System.out.println("Diff is:"+sub);
    }
}