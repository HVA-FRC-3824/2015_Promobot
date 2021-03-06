// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3824.Promobot.subsystems;

import org.usfirst.frc3824.Promobot.Constants;
import org.usfirst.frc3824.Promobot.Robot;
import org.usfirst.frc3824.Promobot.RobotMap;
import org.usfirst.frc3824.Promobot.commands.*;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class CannonActuator extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController motor = RobotMap.cannonActuatorMotor;
    Encoder encoder = RobotMap.cannonActuatorEncoder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    PIDController positionUpPID = new PIDController(
	        Constants.CANNON_ACTUATOR_UP_POSITION_P,
	        Constants.CANNON_ACTUATOR_UP_POSITION_I,
	        Constants.CANNON_ACTUATOR_UP_POSITION_D, 
	        encoder, 
	        motor);
    
    PIDController positionDownPID = new PIDController(
	        Constants.CANNON_ACTUATOR_DOWN_POSITION_P,
	        Constants.CANNON_ACTUATOR_DOWN_POSITION_I,
	        Constants.CANNON_ACTUATOR_DOWN_POSITION_D, 
	        encoder, 
	        motor);
    
    PIDController flappingWingsPID = new PIDController(
	        Constants.CANNON_ACTUATOR_FLAPPING_POSITION_P,
	        Constants.CANNON_ACTUATOR_FLAPPING_POSITION_I,
	        Constants.CANNON_ACTUATOR_FLAPPING_POSITION_D, 
	        encoder, 
	        motor);
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public double getPosition()
	{
		return encoder.get();
	}
    
    public void resetEncoder()
	{
		encoder.reset();
	}
    
    public void setPositionUpSetpoint(double setpoint)
	{
		positionUpPID.setSetpoint(setpoint);
	}
    
    public void setPositionDownSetpoint(double setpoint)
	{
		positionDownPID.setSetpoint(setpoint);
	}
    
    public void setPositionFlappingSetpoint(double setpoint)
	{
		positionDownPID.setSetpoint(setpoint);
	}
    
    public boolean isPositionUpPIDEnabled()
	{
		return positionUpPID.isEnable();
	}
    
    public boolean isPositionDownPIDEnabled()
	{
		return positionDownPID.isEnable();
	}
    
    public boolean isPositionFlappingPIDEnabled()
	{
		return flappingWingsPID.isEnable();
	}
    
    public double getPositionUpSetpoint()
	{
		return positionUpPID.getSetpoint();
	}
    
    public double getPositionDownSetpoint()
	{
		return positionDownPID.getSetpoint();
	}
    
    public double getPositionFlappingSetpoint()
	{
		return flappingWingsPID.getSetpoint();
	}
    
    public void enablePositionUpPID()
	{
		positionUpPID.enable();
	}
    
    public void enablePositionDownPID()
	{
		positionDownPID.enable();
	}
    
    public void disablePositionUpPID()
	{
		positionUpPID.disable();
	}
    
    public void disablePositionDownPID()
	{
		positionDownPID.disable();
	}
    
    public void enablePositionFlappingPID()
	{
		flappingWingsPID.enable();
	}
    
    public double getUpError()
	{
		return positionUpPID.getError();
	}
    
    public double getDownError()
	{
		return positionDownPID.getError();
	}
	
	public double getOutput()
	{
		return motor.get();
	}
	
	public void resetPID()
	{
		positionUpPID.reset();
		positionDownPID.reset();
		flappingWingsPID.reset();
	}
	
	public void setContinuous()
	{
		positionUpPID.setContinuous();
		positionDownPID.setContinuous();
		flappingWingsPID.setContinuous();
	}
	
	public void setOutputRange()
	{
		positionUpPID.setOutputRange(-Constants.MOTOR_LIMIT, Constants.MOTOR_LIMIT);
		positionDownPID.setOutputRange(-Constants.MOTOR_LIMIT, Constants.MOTOR_LIMIT);
		flappingWingsPID.setOutputRange(-Constants.MOTOR_LIMIT, Constants.MOTOR_LIMIT);
	}
	
	public void setMotorPower(double motorPower)
	{
		motor.set(motorPower);
	}
	
//    public void setUpTolerance() {
//		
//		positionUpPID.setTolerance(Constants.UP_TOLERANCE);
//		
//	}
	
//	public void setDownTolerance() {
//		
//		positionDownPID.setTolerance(Constants.DOWN_TOLERANCE);
//		
//	}
	
//	public void setProportion(double P) {
//		
//		positionPID.setPID(P, Constants.CANNON_ACTUATOR_POSITION_I, Constants.CANNON_ACTUATOR_POSITION_D);
//		
//	}
}

