import java.util.Scanner;

interface test
{
	void disp_TimeInSec();
	void disp_TimeInHr();
}

class TimeMin implements test{
	int t;
	Scanner sc = new Scanner(System.in);
	void acceptMin()
	{
		System.out.println("Enter time in minute");
		t=sc.nextInt();
	}
	
	public void disp_TimeInSec() {
		
		int a;
		a=t*60;
		System.out.println("time in sec = "+a);
	}
	@Override
	public void disp_TimeInHr() {
		
		float f;
		f=t/60f;
		System.out.println("time in hr = "+f);
	}
	
	
}


public class Test2 {

	public static void main(String[] args) {
		

		TimeMin timemin = new TimeMin();
		timemin.acceptMin();
		timemin.disp_TimeInSec();
		timemin.disp_TimeInHr();
	}

}