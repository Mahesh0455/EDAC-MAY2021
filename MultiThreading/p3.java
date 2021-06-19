class abc implements Runnable {
	boolean stop = false;

	public void run() {
	
			for (int i = 1; i <= 10; i++) {
				System.out.println("Value: " + i);
				if (stop == true) {
					return;
				}
			}
		
	}

}

class b extends Thread {
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Hello: " + i);
		}
	}
}

public class p3 {

	public static void main(String[] args) throws Exception {
		abc a = new abc();
		Thread t = new Thread(a);
		t.start();
		// System.in.read();
		// a.stop = true;
		b bb = new b();
		Thread t2 = new Thread(bb);
		t2.start();

	}

}
