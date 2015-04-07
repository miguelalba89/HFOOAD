package ch3.doorstart;

public class DogDoor {

	private boolean open;

	public DogDoor() {
		this.open = false;
	}

	public void open() {
		System.out.println("The dog door opens.");
		open = true;
	}

	public void close() {
		System.out.println("The dog door closes.");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);

		System.out.println("Fido barks to go outside...");
		remote.pressButton();

		System.out.println("\nFido has gone outside...");
		System.out.println("\nFido's all done...");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {}

		System.out.println("... but he's stuck outside!");

		System.out.println("\nFido starts barking...");
		System.out.println("...so Gina grabs the remote control.");
		remote.pressButton();

		System.out.println("\nFido's back inside...");
	}
}