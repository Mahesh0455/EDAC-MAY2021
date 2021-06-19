class Theatre implements Runnable{
	String str;
	Theatre(String str){
		this.str=str;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(str+" : "+i);
			try {
			Thread.sleep(1500);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
public class p5 {

	public static void main(String[] args) {
		Theatre th1=new Theatre("Cut the ticket");
		Theatre th2=new Theatre("Show the seat");
		Thread t1=new Thread(th1);
		Thread t2=new Thread(th2);
		
		t1.start();
		t2.start();
	}

}
