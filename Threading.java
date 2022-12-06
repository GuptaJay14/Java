import java.util.*;

class Seven extends Thread{
	int i;
	public void run()
	{
		for(int i = 1; i<=10; i++)
		{
			System.out.println(" 7 * "+i+" = "+1*i);		
		}
	}
}

class Ten extends Thread{
	int i;
	public void run()
	{
		for(int i = 1; i<=10; i++)
		{
			System.out.println(" 10 * "+i+" = "+10*i);		
		}
	}

}

class Threading
{
	public static void main(String Args[])
	{
		Seven S1 = new Seven();
		Ten T1 = new Ten();

		S1.start();
		T1.start();
	}
}