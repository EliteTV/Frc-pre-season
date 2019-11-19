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
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  //public static int leftMotor = 1;
  //public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  // controller buttons
    
  public static final boolean xButton = false;
	//PWM
  //DIO
  //CAN
    //drive moters
    public static int leftMasterPort = 0;
    public static int leftSlavePort = 1;
    public static int rightMasterPort = 2;
    public static int rightSlavePort = 3;
    public static final int intakeLM = 4;
    public static final int intakeRM = 0;

  //USB
    //drive joystck
    public static final int driverController = 0;
    
    
  //Button / Axxes
    public static final int driveXButton = 3;
	  public static final int leftStickY = 1;
	  public static final int leftStickX = 0;
	  public static final int rightStickX = 4;
  	public static final int driveAButton = 0;
    public static final int driveYButton = 0;

  //Other
    //Moter Speed
    public static double maxMoveSpeed = .5;
    public static double minMoveSpeed = -.5;
    public static final double intakeSpeed = 0.8;
	
	  

}
