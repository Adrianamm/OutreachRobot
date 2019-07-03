/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import frc.robot.RobotMap;
import frc.robot.commands.ArcadeDriveCmd;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;

/**
 * Add your docs here.
 */
  public class DriveTrain extends Subsystem {

    // CANTalon refers to a motor controller, so it means a motor for all
    // intents & purposes.
    private Spark left1;
    private Spark left2;
    private Spark right1;
    private Spark right2;

    // Sensors
    private ADXRS450_Gyro gyro = new ADXRS450_Gyro();
  
    //TODO make this an enum
    public static int fowardOrReverse = -1;
  
  
    /**
     * Constructor, sets up motors, prevents brownouts and minimizes pedestrian
     * casualties.
     */
    public DriveTrain() {
      left1 = new Spark(RobotMap.LEFT_DRIVE1);
      left2 = new Spark(RobotMap.LEFT_DRIVE2);
      right1 = new Spark(RobotMap.RIGHT_DRIVE1);
      right2 = new Spark(RobotMap.RIGHT_DRIVE2);

      left1.setInverted(true);
      left2.setInverted(true);
  
  
    }
  
    /**
     * ArcadeDriveCmd will always run when other commands are not busy. This
     * will allow operator control when the robot is not driving itself around.
     */
    public void initDefaultCommand() {
  
      setDefaultCommand(new ArcadeDriveCmd());
      
    }
  
    /**
     * Updates the motors with what speed to drive at. TODO: what is the robot
     * "Front", and what value is that? 1 or -1? TODO: Use the custom joystick
     * that Owen made
     * 
     * @param leftPower
     *            Double speed of left motors. Range -1 to 1
     * @param rightPower
     *            Double speed of right motors. Range -1 to 1
     */
    
    public void driveLR(double leftPower, double rightPower) {

      
      if (fowardOrReverse == -1) {
        left1.set(leftPower);
        left2.set(leftPower);
        right1.set(rightPower);
        right2.set(rightPower);	
        
      }
      
      else {
        left1.set(leftPower);
        left2.set(leftPower);
        right1.set(rightPower);
        right2.set(rightPower);

      }
  
    }
  
    /**
     * Sets the motors to be off.
     */
    public void stop() {
  
      this.driveLR(0, 0);
  
    }
  
    /**
     * Calibrates gyro (takes 5 seconds while robot does nothing) Do this when
     * robot first turns on.
     */
    public void calibrateGyro() {
  
      gyro.calibrate();
  
    }
  
    /**
     * Sets the drivetrain gyro back to 0 degrees
     */
    public void resetGyro() {
  
      gyro.reset();
  
    }
  
    /**
     * @return the current rate of turning in degrees per second
     */
    public double getGyroRate() {
  
      return gyro.getRate();
  
    }
  
    /**
     * 
     * @return gets an approximation of the gyro angle since reset was last
     *         called from an accumulation using the FPGA. Will accumulate error
     *         over time.
     * 
     */
    public double getGyroAngle() {
  
      return gyro.getAngle();
  
    }
  }
