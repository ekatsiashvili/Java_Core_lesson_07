package ua.lviv.lgs;

public abstract class Plane {
	int length;
	int width;
	int weight;

	public Plane(int length, int width, int weight) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	void engineStarting() {
		int min = 20;
		int max = 88;
		int t = (int) (Math.random() * ((max - min) + 1)) + min;
		System.out.println("\n" + t + "\n" + "-------");

	}

	void takeOff() {
		double d = Math.random() * 1000;
		System.out.printf("%.2f %n", d);
	}

	void planeLanding() {
		System.out.println("\n" + "The plane is landing..." + "\n" + "--------------------------------");
	}

}
//lesson_07