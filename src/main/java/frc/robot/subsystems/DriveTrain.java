// /*----------------------------------------------------------------------------*/
// /* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
// /* Open Source Software - may be modified and shared by FRC teams. The code   */
// /* must be accompanied by the FIRST BSD license file in the root directory of */
// /* the project.                                                               */
// /*----------------------------------------------------------------------------*/

// package frc.robot.subsystems;

// import static frc.robot.Constants.*;
// import edu.wpi.first.wpilibj.PWMVictorSPX;
// import edu.wpi.first.wpilibj.command.Subsystem;
// import edu.wpi.first.wpilibj.drive.DifferentialDrive;

// /**
//  * Add your docs here.
//  */
// public class DriveTrain extends Subsystem {
//   // Put methods for controlling this subsystem
//   // here. Call these from Commands.

//   private PWMVictorSPX victor = new PWMVictorSPX(DRIVE_LEFT_PWM);
//   private PWMVictorSPX victor2 = new PWMVictorSPX(DRIVE_RIGHT_PWM);
//   private DifferentialDrive drive = new DifferentialDrive(victor, victor2);

//   @Override
//   public void initDefaultCommand() {
//     // Set the default command for a subsystem here.
//     // setDefaultCommand(new MySpecialCommand());
//   }

//   public void drive(double speed, double rotation) {
//     drive.arcadeDrive(speed, rotation);
//   }
// }
