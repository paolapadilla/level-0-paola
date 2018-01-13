import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	 static Robot potato = new Robot();
	public static void main(String[] args) {
		drawSquare();
potato.penUp();
potato.move(300);
potato.penDown();
potato.turn(45);
potato.move(100);
potato.turn(90);
potato.move(100);
potato.turn(130);

	}
	private static void drawSquare() {
		potato.penDown();
		potato.move(200);
		potato.turn(90);
		potato.move(200);
		potato.turn(90);
		potato.move(200);
		potato.turn(90);
		potato.move(200);
		potato.turn(90);
	}

}
