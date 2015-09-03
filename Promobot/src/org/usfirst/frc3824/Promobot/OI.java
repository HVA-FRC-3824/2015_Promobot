// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3824.Promobot;

import org.usfirst.frc3824.Promobot.commands.*;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton high;
    public JoystickButton low;
    public JoystickButton normal;
    public JoystickButton cannon1;
    public JoystickButton cannon2;
    public JoystickButton cannon3;
    public JoystickButton cannon4;
    public JoystickButton allCannons;
    public JoystickButton up;
    public JoystickButton down;
    public JoystickButton holdDown;
    public JoystickButton holdUp;
    public JoystickButton override;
    public JoystickButton deoverride;
    public JoystickButton flap;
    public Joystick joystick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystick = new Joystick(0);
        
        flap = new JoystickButton(joystick, 8);
        flap.whenPressed(new FlapTheWingsOfTheAlmightyHawk());
        deoverride = new JoystickButton(joystick, 7);
        deoverride.whenReleased(new DeoverrideSafetyLock());
        override = new JoystickButton(joystick, 7);
        override.whenPressed(new OverrideSafetyLock());
        holdUp = new JoystickButton(joystick, 12);
        holdUp.whenReleased(new HoldPosition());
        holdDown = new JoystickButton(joystick, 11);
        holdDown.whenReleased(new HoldPosition());
        down = new JoystickButton(joystick, 11);
        down.whileHeld(new AimCannonsDown());
        up = new JoystickButton(joystick, 12);
        up.whileHeld(new AimCannonsUp());
        allCannons = new JoystickButton(joystick, 1);
        allCannons.whenPressed(new FireAllCannons());
        cannon4 = new JoystickButton(joystick, 6);
        cannon4.whenPressed(new FireCannon4());
        cannon3 = new JoystickButton(joystick, 4);
        cannon3.whenPressed(new FireCannon3());
        cannon2 = new JoystickButton(joystick, 3);
        cannon2.whenPressed(new FireCannon2());
        cannon1 = new JoystickButton(joystick, 5);
        cannon1.whenPressed(new FireCannon1());
        normal = new JoystickButton(joystick, 2);
        normal.whenPressed(new AimNormal());
        low = new JoystickButton(joystick, 9);
        low.whenPressed(new AimLow());
        high = new JoystickButton(joystick, 10);
        high.whenPressed(new AimHigh());

	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Do Nothing", new AutonomousDoNothing());

        SmartDashboard.putData("Drive with Joystick", new DrivewithJoystick());

        SmartDashboard.putData("Fire Cannon 1", new FireCannon1());

        SmartDashboard.putData("Fire Cannon 2", new FireCannon2());

        SmartDashboard.putData("Fire Cannon 3", new FireCannon3());

        SmartDashboard.putData("Fire Cannon 4", new FireCannon4());

        SmartDashboard.putData("Aim High", new AimHigh());

        SmartDashboard.putData("Aim Low", new AimLow());

        SmartDashboard.putData("Aim Normal", new AimNormal());

        SmartDashboard.putData("Aim Cannons Up", new AimCannonsUp());

        SmartDashboard.putData("Aim Cannons Down", new AimCannonsDown());

        SmartDashboard.putData("Hold Position", new HoldPosition());

        SmartDashboard.putData("Fire All Cannons", new FireAllCannons());

        SmartDashboard.putData("Reset Encoder", new ResetEncoder());

        SmartDashboard.putData("Override Safety Lock", new OverrideSafetyLock());

        SmartDashboard.putData("Deoverride Safety Lock", new DeoverrideSafetyLock());

        SmartDashboard.putData("Flap The Wings Of The Almighty Hawk", new FlapTheWingsOfTheAlmightyHawk());


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS)
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick() {
        return joystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

