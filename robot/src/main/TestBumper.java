package main;

import lejos.hardware.Button;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.lcd.GraphicsLCD;
import sensor.Bumper;

public class TestBumper {
	static Bumper b = new Bumper();
	
	public static void main(String[] args){
		GraphicsLCD screen = LocalEV3.get().getGraphicsLCD();
		screen.drawString("Test Bumper", 2, 20, 0);
		for(int i=0; i<2; i++){
			Button.waitForAnyPress();
			if(b.isPressed() ){
				screen.clear();
				screen.drawString("pressed", 2, 20, 0);
			}else{
				screen.clear();
				screen.drawString("Not Pressed", 2, 20, 0);
			}
		}
		Button.waitForAnyPress();
	}
}
