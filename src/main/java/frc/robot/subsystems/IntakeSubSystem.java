/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;


/**
 * Add your docs here.
 */

public class IntakeSubSystem extends Subsystem {
    
  public double intakeSpeed = RobotMap.intakeSpeed;
  
  WPI_VictorSPX intakeLM = new WPI_VictorSPX(RobotMap.intakeLM);
  WPI_VictorSPX intakeRM = new WPI_VictorSPX(RobotMap.intakeRM);
    
    public void setPower(double intakePower){
      intakeLM.set(intakePower);
      intakeRM.set(intakePower);
    }

    public void intakeIn(){
      intakeLM.set(ControlMode.PercentOutput, intakeSpeed);
      intakeRM.set(ControlMode.PercentOutput, -intakeSpeed);
    }
    
    public void intakeOut(){
      intakeLM.set(ControlMode.PercentOutput, -intakeSpeed);
      intakeRM.set(ControlMode.PercentOutput, intakeSpeed);
    }
    

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new intakeIn());
  }
}
