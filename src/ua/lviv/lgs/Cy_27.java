package ua.lviv.lgs;

public class Cy_27 extends Plane implements Capable {

	private double maxSpeed;
	private String color;
	private AirplaneŅontrol AC_Cy_27 = new AirplaneŅontrol();

	public Cy_27(int length, int width, int weight, double maxSpeed, String color) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	double getMaxSpeed() {
		return maxSpeed;
	}

	public void MoveUp() {
		AirplaneŅontrol.mUp();
	}

	public void MoveDown() {
		AirplaneŅontrol.mDown();
	}

	public void MoveLeft() {
		AirplaneŅontrol.mLeft();
	}

	public void MoveRight() {
		AirplaneŅontrol.mRight();
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