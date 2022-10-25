import java.util.Scanner;

public class PerfectSquares
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int firstnum,lastnum,i;
      System.out.println("Enter the first number:" );
      firstnum=sc.nextInt();
      System.out.println("Enter last number:");
      lastnum=sc.nextInt();
      System.out.println("Perfect square numbers between "+firstnum+" and "+ lastnum+" are:");
      for(i=firstnum;i<=lastnum;i++)
      {
          double perfectsqr=Math.sqrt(i);
          if(perfectsqr-Math.floor(perfectsqr)==0)
              System.out.println(i+" ");
      }
    }
}
