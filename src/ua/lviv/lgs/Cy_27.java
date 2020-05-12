package ua.lviv.lgs;

public class Cy_27 extends Plane implements Capable {

	private double maxSpeed;
	private String color;
	private Airplane—ontrol AC_Cy_27 = new Airplane—ontrol();

	public Cy_27(int length, int width, int weight, double maxSpeed, String color) {
		super();
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	double getMaxSpeed() {
		return maxSpeed;
	}

	public void MoveUp() {
		int distance = (int) (Math.random() * 10000);
		System.out.println(
				"\n" + "Plane is moving up on " + distance + " km" + "\n" + "___________________________________");
	}

	public void MoveDown() {
		int distance = (int) (Math.random() * 10000);
		System.out.println(
				"\n" + "Plane is moving down on " + distance + " km" + "\n" + "___________________________________");
	}

	public void MoveLeft() {
		int distance = (int) (Math.random() * 10000);
		System.out.println(
				"\n" + "Plane is moving left on " + distance + " km" + "\n" + "___________________________________");
	}

	public void MoveRight() {
		int distance = (int) (Math.random() * 10000);
		System.out.println(
				"\n" + "Plane is moving right on " + distance + " km" + "\n" + "___________________________________");
	}

	@Override
	public void TurboAcceleration() {
		double minTurboS = this.maxSpeed;

		double randomTurboS = minTurboS + minTurboS * Math.random();

		System.out.println("Turbo acceleration now (km/h):");
		System.out.printf("%.2f %n", randomTurboS);
		System.out.println("\n" + "--------------------------------");

	}

	@Override
	public void StealthTechnology() {
		double t = Math.random();
		System.out.println("\n" + "Cy-27 isn't visible for (minute): ");
		System.out.printf("%.2f %n", t);
		System.out.println("\n" + "--------------------------------");
	}

	@Override
	public void NuclearStrike() {
		int warheads = (int) (Math.random() * 10);
		System.out.println(
				"\n" + warheads + " nuclear warheads were dropped!" + "\n" + "--------------------------------");

	}

}
//lesson_07