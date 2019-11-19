/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveManuleCommand;

/**
 * Add your docs here.
 */
public class DriveSubSystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  // create moters
  private WPI_VictorSPX leftMaster = new WPI_VictorSPX(RobotMap.leftMasterPort);
  private WPI_VictorSPX leftSlave = new WPI_VictorSPX(RobotMap.leftSlavePort);
  private WPI_VictorSPX rightMaster = new WPI_VictorSPX(RobotMap.rightMasterPort);
  private WPI_VictorSPX rightSlave = new WPI_VictorSPX(RobotMap.rightSlavePort); 



  public DifferentialDrive drive = new DifferentialDrive(leftMaster, rightMaster);

  //creat constructor function 
  public DriveSubSystem() {
    // setting slaves to follow masters 
    leftSlave.follow(leftMaster);
    rightSlave.follow(rightMaster);
  }


 
  public void manualDrive(double move, double turn){
    
    if(move > RobotMap.maxMoveSpeed) move = RobotMap.maxMoveSpeed;
    if(move < RobotMap.minMoveSpeed) move = RobotMap.minMoveSpeed;
    if(turn > RobotMap.maxMoveSpeed) move = RobotMap.maxMoveSpeed;
    if(turn < RobotMap.minMoveSpeed) move = RobotMap.minMoveSpeed;

    drive.arcadeDrive(move, turn);
  }
  



  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveManuleCommand());
  }
  public void driveAuto (double move, double turn){
    
    if(move > RobotMap.maxMoveSpeed) move = RobotMap.maxMoveSpeed;
    if(move < RobotMap.minMoveSpeed) move = RobotMap.minMoveSpeed;
    if(turn > RobotMap.maxMoveSpeed) move = RobotMap.maxMoveSpeed;
    if(turn < RobotMap.minMoveSpeed) move = RobotMap.minMoveSpeed;

    drive.arcadeDrive(move, turn);
  }
}
