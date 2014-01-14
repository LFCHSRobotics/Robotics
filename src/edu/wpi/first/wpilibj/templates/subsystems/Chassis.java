/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.DriveWithJoystick;

/**
 *
 * @author zanish
 */
public class Chassis extends Subsystem{
    
    RobotDrive drive;
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoystick());
    }
    
    public Chassis(){
        drive = new RobotDrive(RobotMap.leftMotorPort, RobotMap.rightMotorPort);
        drive.setSafetyEnabled(false);
    }
    
    public void driveWithJoysitck(Joystick leftStick, Joystick rightStick){
        drive.tankDrive(leftStick, rightStick);
    }
    
    public void setSpeed(double speed){
        drive.setMaxOutput(speed);
    }
    
}
