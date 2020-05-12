package ua.lviv.lgs;

public class Airplane—ontrol {
	 void mUp() {
		int distance = (int) (Math.random() * 10000);
		System.out.println(
				"\n" + "Plane is moving up on " + distance + " km" + "\n" + "___________________________________");
	}

	 void mDown() {
		int distance = (int) (Math.random() * 10000);
		System.out.println(
				"\n" + "Plane is moving down on " + distance + " km" + "\n" + "___________________________________");
	}

	 void mLeft() {
		int distance = (int) (Math.random() * 10000);
		System.out.println(
				"\n" + "Plane is moving left on " + distance + " km" + "\n" + "___________________________________");
	}

	 void mRight() {
		int distance = (int) (Math.random() * 10000);
		System.out.println(
				"\n" + "Plane is moving right on " + distance + " km" + "\n" + "___________________________________");
	}

}
