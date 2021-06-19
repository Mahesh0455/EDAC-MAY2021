
class TicketReservation extends Thread {
	int available = 2;
	int wanted;

	public TicketReservation(int i) {
		wanted = i;
	}

	public void run() {
			System.out.println("Available Seats: " + available);
			if (available >= wanted) {
				String Name = Thread.currentThread().getName();
				System.out.println(wanted + " Seat Reserved for: " + Name);
				try {
					Thread.sleep(1500);
					available = available - wanted;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else {
				System.out.println("Sorry Seats are not available ");
			}
		
	}
}

public class p6 {

	public static void main(String[] args) {
		TicketReservation tr = new TicketReservation(1);
		Thread t1 = new Thread(tr);
		Thread t2 = new Thread(tr);
		t1.setName("First Person");
		t2.setName("Second Person");

		t1.start();
		t2.start();

	}

}
