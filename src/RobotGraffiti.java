import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

	public static void main(String[] args) {
		Robot master = new Robot();
		master.setSpeed(10);
		master.penDown();
		master.move(160);
		master.turn(90);
        master.move(100);
        master.turn(90);
        master.move(100);
        master.turn(90);
        master.move(100);
        master.penUp();
        master.move(100);
	}

}
