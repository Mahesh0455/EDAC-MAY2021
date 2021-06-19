class mythread extends Thread{
	public void run() {
		Thread th1=Thread.currentThread();
		System.out.println("th1:"+th1);
		for(int i=0;i<100;i++) {
			System.out.println("Hello : "+i);
		}
	}
}
public class p2 {

	public static void main(String[] args) {
		mythread obj =new mythread();
		Thread t=new Thread(obj);
		t.start();
		Thread th=Thread.currentThread();
		System.out.println(th);
		
	}

}
