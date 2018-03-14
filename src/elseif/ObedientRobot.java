package elseif;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot Chocolate = new Robot();
public static void main(String[] args) {
	 Chocolate.setSpeed(2100000);
	 Chocolate.penDown();
	 
}
public static void drawSquare() {
	for (int i = 0; i < 4; i++) {
		Chocolate.move(100);
		Chocolate.turn(360/4);
	}
}

}
