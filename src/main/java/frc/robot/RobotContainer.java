// package frc.robot;

// import static frc.robot.Constants.*;
// import edu.wpi.first.wpilibj.Joystick;
// import edu.wpi.first.wpilibj.command.Command;
// import frc.robot.commands.AutoSpin;
// import frc.robot.commands.TeleOpDrive;
// import frc.robot.subsystems.DriveTrain;

// public class RobotContainer {

//     private final DriveTrain mdrive = new DriveTrain();
//     private final Joystick gamePad = new Joystick(GAMEPAD);

//     private final Command autoCommand = new AutoSpin(3);

//     public RobotContainer() {
//         mdrive.setDefaultCommand(new TeleOpDrive(gamePad.getY() * 0.6, gamePad.getRawAxis(LEFT_RIGHT_AXIS) * 0.7));
//         configureButtonBindings();
//     }

//     public void configureButtonBindings() {

//     }

//     public Command getAutoCommand() {
//         return autoCommand;
//     }
// }