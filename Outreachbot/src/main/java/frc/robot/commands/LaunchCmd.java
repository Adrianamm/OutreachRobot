/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 * Add your docs here.
 */
public class LaunchCmd extends TimedCommand {
  Solenoid s;
	
  public LaunchCmd(double timeout, Solenoid s) {
      super(timeout);
      // Use requires() here to declare subsystem dependencies
      // eg. requires(chassis);
      requires(Robot.pn);
      
      this.s = s;
  }

  // Called just before this Command runs the first time
  protected void initialize(){ 
  
  }
  // Called repeatedly when this Command is scheduled to run
  protected void execute() {
    //sets solenoid on
    s.set(true);
  
  }

  // Called once after timeout
  protected void end() {
    //sets solenoid off
    s.set(false);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  protected void interrupted() {
    this.end();
  }
}