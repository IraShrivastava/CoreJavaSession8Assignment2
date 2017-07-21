package assignment8;
class PrimeNumber implements Runnable {

	public void run() {
		int num;
		for (num = 2; num <= 100; num++) {
			int cnt = 0;
			for (int i = 2; i <= num / 2; i++)
				if (num % i == 0) {
					cnt++;
					break;
				}
			if (cnt == 0)
				System.out.println(num + " Number is prime");
		}
	}
}
public class Assignment8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			PrimeNumber pn = new PrimeNumber();
			// Instantiate the thread
			Thread th = new Thread(pn);
			// start the thread
			th.start();
		} 
		catch (Exception e) 
		{
		}
	}
}