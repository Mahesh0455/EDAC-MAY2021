class ticketReservation implements Runnable {
	int available = 1;
	int wanted;

	ticketReservation(int i) {
		wanted = i;
	}

	public void run() {
		synchronized (this) {
			System.out.println("Seats available: " + available);

			String Name = Thread.currentThread().getName();
			if (available >= wanted) {
				System.out.println(wanted + " Seat is reserved for: " + Name);
				try {
					Thread.sleep(1500);
					available = available - wanted;

				} catch (Exception e) {
					System.out.println(e.getMessage());

				}
			}else {
				System.out.println("Seat is not available");
			}
		}

	}

}

public class p7 {

	public static void main(String[] args) {

		ticketReservation tr = new ticketReservation(1);
		Thread t1 = new Thread(tr);
		Thread t2 = new Thread(tr);
		t1.setName("First Person");
		t2.setName("Second Person");

		t1.start();
		t2.start();
	}

}
