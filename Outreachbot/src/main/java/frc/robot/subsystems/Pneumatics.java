/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Pneumatics extends Subsystem {
  
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
    //For the marshmallow launcher there a 3 solenoids, one for each cannon.
    //For a normal cylinder use DoubleSolenoid instead, it will control motion in both directions.
    public Solenoid solenoid0;
    public Solenoid solenoid1;
    public Solenoid solenoid2;      
    private Compressor c;

	  public Pneumatics(){
      c = new Compressor(0);
      //disables closed loop control
      c.setClosedLoopControl(false);
      
      //port 0 might be broken; trying port 2
      solenoid0 = new Solenoid(3);
      solenoid1 = new Solenoid(1);
      solenoid2 = new Solenoid(2);	
	  }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
}
