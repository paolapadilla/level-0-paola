import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot potato = new Robot();

	public static void main(String[] args) {
		//drawSquare();
		//drawtriangle();
		drawcircle();
	}
		private static void drawtriangle(){
		potato.penUp();
		potato.setSpeed(100);
		potato.move(300);
		potato.penDown();
		potato.turn(46);
		potato.move(100);
		potato.turn(90);
		potato.move(100);
		potato.turn(130);
		potato.move(150);

	}

	private static void drawSquare() {
		potato.penDown();
		potato.setSpeed(100);
		potato.move(200);
		potato.turn(90);
		potato.move(200);
		potato.turn(90);
		potato.move(200);
		potato.turn(90);
		potato.move(200);
		potato.turn(90);
		potato.move(100);
	}

	private static void drawcircle() {
		potato.penUp();
		potato.setSpeed(100);
		potato.penDown();
		for(int i=0;i<10;i++)
		potato.turn(-60);
		
	}
}
