/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import frc.robot.commands.MiddleMotorDownCmd;
import frc.robot.commands.MiddleMotorUpCmd;
import frc.robot.commands.MiddleMotorStopCmd;
import frc.robot.commands.LaunchCmd;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private Joystick logitech = new Joystick(RobotMap.LOGITECH);
	
	private Button b1 = new JoystickButton(logitech, 1);
	private Button b2 = new JoystickButton(logitech, 1);
	//pneumatics 
	private Button b4 = new JoystickButton(logitech,4);
	private Button b3 = new JoystickButton(logitech,3);
	private Button b5 = new JoystickButton(logitech,5);
	//middle motor
	private Button b11 = new JoystickButton(logitech,11);
	private Button b12 = new JoystickButton(logitech,12);

		/**
	 * @return True if button 1 is pressed, false otherwise.
	 */
	public boolean getButton1() {	
		return b1.get();		
	}
	public boolean getButtonbc2() {
		return b2.get();
	}
	
	public boolean getButtonbc3() {
		return b3.get();
	}
	
	public boolean getButtonbc4() {
		return b4.get();
	}

	public boolean getButtonbc5() {
		return b5.get();
	}
	public boolean getButtonbc11() {
		return b11.get();
	}
	public boolean getButtonbc12() {
		return b12.get();
	}
	
	
	public OI() {	
		Button b12 = new JoystickButton(logitech,12);
		b12.whileHeld(new MiddleMotorUpCmd());
		
		Button b11 = new JoystickButton(logitech,11);
		b11.whileHeld(new MiddleMotorDownCmd());
		
		Button b2 = new JoystickButton(logitech,2);
		b2.whileHeld(new MiddleMotorStopCmd());
		
		//controls solenoid 1
		Button b4 = new JoystickButton(logitech, 4);
		b4.whenPressed(new LaunchCmd(3, Robot.pn.solenoid0));

		//controls solenoid 2
		Button b3 = new JoystickButton(logitech, 3);
		b3.whenPressed(new LaunchCmd(1, Robot.pn.solenoid1));
		
		//controls solenoid 2
		Button b5 = new JoystickButton(logitech, 5);
		b5.whenPressed(new LaunchCmd(2, Robot.pn.solenoid2));
	
	}
	
	/**
	 * @return  a double corresponding to how much the joystick's handle is rotated.
	 * This has a range of -1 to 1. All the way to the right is +1.
	 */
	public double getRotationAxisOfArcade() {
		
		return logitech.getRawAxis(RobotMap.LOGITECH_ROTATE_AXIS);
	}
	
	/**
	 * @return a double corresponding to the position of the joystick in the side to side direction (X axis).
	 * Range of -1 to 1. All the way to the right is +1.
	 */
	public double getXAxisOfArcade() {
		
		return logitech.getRawAxis(RobotMap.LOGITECH_X_AXIS);
	}

	/**
	 * @return a double corresponding to the position of the joystick in the Y axis (front and back).
	 * range of -1 to 1, with all the way forward being 1
	 */
	public double getYAxisOfArcade() {
		
		return logitech.getRawAxis(RobotMap.LOGITECH_Y_AXIS);
		
	}
	
	
	/**
	 * @return a double corresponding to the slider on the joystick roughly under the wrist of someone if they are holding it.
	 * range of -1 or 1, where -1 is pointing the slider up and 1 is pointing it down
	 */
	public double getSliderAxisOfArcade() {
		
		return logitech.getRawAxis(RobotMap.LOGITECH_SLIDER_AXIS);
		
	}
	
}