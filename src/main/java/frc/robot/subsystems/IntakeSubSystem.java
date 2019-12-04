/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.LimitSwitchNormal;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;


/**
 * Add your docs here.
 */

public class IntakeSubSystem extends Subsystem {
  
  public double intakeSpeed = RobotMap.intakeSpeed;
  //private final DoubleSolenoid testSolenoid = new DoubleSolenoid( Robotmap.intakeSolenoidIn)
  
  WPI_TalonSRX intakeLM = new WPI_TalonSRX(RobotMap.intakeLM);
  WPI_TalonSRX intakeRM = new WPI_TalonSRX(RobotMap.intakeRM);
  DigitalInput intakeSWitch = new DigitalInput(RobotMap.intakeLS);
    
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

    public void stopIntake(){
      intakeLM.set(ControlMode.PercentOutput, 0);
      intakeRM.set(ControlMode.PercentOutput, 0);
    }
    public void intakeWristUp(){
      
    }
    
    public void intakeLS(){
      while (intakeSWitch.get()){
        Timer.delay(10);
      } 
      }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new intakeIn());

  }
}
