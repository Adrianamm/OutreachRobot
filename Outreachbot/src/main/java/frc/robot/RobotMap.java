/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // Joystick
	public static final int LOGITECH = 0;
	public static final int LOGITECH_X_AXIS = 0;
	public static final int LOGITECH_Y_AXIS = 1;
	public static final int LOGITECH_ROTATE_AXIS = 2;
	public static final int LOGITECH_SLIDER_AXIS = 3;

	// Drive Train
	public static final int LEFT_DRIVE1 = 0;
	public static final int LEFT_DRIVE2 = 2;
	public static final int RIGHT_DRIVE1 = 1;
  public static final int RIGHT_DRIVE2 = 3;
  
  //Middle Motor for changing the angle of the cannons
  public static final int MIDDLE = 4;
}
