package 构造;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class MathTi
{
	public static void main(String[] args) throws IOException
	{
		Random rd = new Random();
		int yourGuess=0;
		int g=0,k=0,i=0;
		int d=0,m=0;
			while (i<50)
			{
				int a = rd.nextInt(100);
				int b = rd.nextInt(100);
				int c = rd.nextInt(2);	
				if (c==0)
				{
					d=a+b;
					if (d<100)
					{
						g=d;
						System.out.println(a+"+"+b+"=");
					}
					else	continue;
					Scanner input = new Scanner(System.in);
					yourGuess = input.nextInt();
					if (yourGuess == g)
					{
						System.out.println("答案正确！");
					}
					else
					{
						System.out.println("答案错误！");
					}
				}
				else
				{
					m=a-b;
					if (m>0)
					{
						k=m;
						System.out.println(a+"-"+b+"=");
					}
					else	continue;
					Scanner input = new Scanner(System.in);
					yourGuess = input.nextInt();
					if (yourGuess == k)
					{
						System.out.println("答案正确！");
					}
					else
					{
						System.out.println("答案错误！");
					}
				}
				i++;
			}
	}
}
