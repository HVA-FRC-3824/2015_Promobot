package org.usfirst.frc3824.Promobot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Constants
{	
    public final static double CANNON_ACTUATOR_UP_POSITION_P         =   0.01; //0.01
    public final static double CANNON_ACTUATOR_DOWN_POSITION_P       =   0.0001;
    public final static double CANNON_ACTUATOR_POSITION_I            =   0.0;  //0.0
    public final static double CANNON_ACTUATOR_POSITION_D            =   0.0;  //0.0
    
                                                                     //0.085 distance per pulse is best for angles
    public final static double HIGH_SETPOINT                         =  -500.0;//-50.0;
    public final static double NORMAL_SETPOINT                       =  -350.0;//-35.0;
    public final static double LOW_SETPOINT                          =  -150.0;//-20.0;
    
    public final static double MOTOR_POWER_UP                        =   0.1;
    public final static double MOTOR_POWER_DOWN                      =  -0.1;
    
    public final static double MAX_HEIGHT                            =  -600.0;//-55.0;
    public final static double MIN_HEIGHT                            =  -50.0;//-5.0;
    
    public final static double FIRE_TIME                             =   0.2;
    
    public final static double MOTOR_LIMIT                           =   0.2; //0.2
    
    public final static double HOME_POSITION                         =   0.0;
}
