import java.awt.Color;

import javax.swing.JOptionPane;

//import org.jointheleague.graphical.robot.Robot;
//
//public class ObedientRobot {
//	static Robot potato = new Robot();
//
//	public static void main(String[] args) {
//		potato.setSpeed(10);
//
//		String rocko = JOptionPane.showInputDialog("What shape do you want Triangle, Square, or Circle?");
//		String cat = JOptionPane.showInputDialog("What color do you want red, green, or blue?");
//		if (cat.equalsIgnoreCase("red")) {
//			potato.setPenColor(Color.red);
//		} else if (cat.equalsIgnoreCase("green")) {
//			potato.setPenColor(Color.green);
//		} else if (cat.equalsIgnoreCase("blue")) {
//			potato.setPenColor(Color.BLUE);
//		}
//
//		if (rocko.equalsIgnoreCase("Triangle")) {
//			drawtriangle();
//		} else if (rocko.equalsIgnoreCase("Square")) {
//			drawSquare();
//		} else if (rocko.equalsIgnoreCase("Circle")) {
//			drawcircle();
//		}
//
//	}
//
//	private static void drawtriangle() {
//		potato.penUp();
//		potato.penDown();
//		for(int i =0;i<3;i++) {
//			potato.move(100);
//			potato.turn(120);
//		}
//	
//
//	}
//
//	private static void drawSquare() {
//		potato.penDown();
//		for (int i = 0; i < 4; i++) {
//			potato.move(200);
//			potato.turn(90);
//		}
//		
//		
//	}
//
//	private static void drawcircle() {
//		potato.penUp();
//		potato.penDown();
//		for (int i = 0; i < 360; i++) {
//			potato.move(1);
//			potato.turn(1);
//		}
//
//	}
//}
