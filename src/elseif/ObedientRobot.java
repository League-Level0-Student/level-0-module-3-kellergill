package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot Chocolate = new Robot();
public static void main(String[] args) {
	 Chocolate.setSpeed(2100000);
	 Chocolate.penDown();
	 
	 
	 
String Shap = 	 JOptionPane.showInputDialog(null, "wat shap 2 darw????????????????????????");
	 
	 if(Shap.equals("Square")) {
		 drawSquare();
	 }
	 
	 if(Shap.equals("Triangle")) {
		 drawTriangle();
	 }
	 
	 if(Shap.equals("Circle")) {
		 drawCircle();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}
public static void drawSquare() {
	for (int i = 0; i < 4; i++) {
		Chocolate.move(100);
		Chocolate.turn(360/4);
	}
}
public static void drawTriangle() {
	for (int i = 0; i < 3; i++) {
		Chocolate.move(100);
		Chocolate.turn(360/3);
		
	}
}
public static void drawCircle() {
	for (int i = 0; i < 360; i++) {
		Chocolate.move(1);
		Chocolate.turn(360/360);
		
	}
}
}
