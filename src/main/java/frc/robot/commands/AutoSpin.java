// /*----------------------------------------------------------------------------*/
// /* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
// /* Open Source Software - may be modified and shared by FRC teams. The code   */
// /* must be accompanied by the FIRST BSD license file in the root directory of */
// /* the project.                                                               */
// /*----------------------------------------------------------------------------*/

// package frc.robot.commands;

// import edu.wpi.first.wpilibj.Timer;
// import edu.wpi.first.wpilibj.command.Command;
// import frc.robot.subsystems.DriveTrain;

// public class AutoSpin extends Command {
//   private DriveTrain drive = new DriveTrain();
//   private double xSpeed, zRotation;
//   private Timer time = new Timer();
//   private int seconds;

//   public AutoSpin(int secondS) {
//     // Use requires() here to declare subsystem dependencies
//     // eg. requires(chassis);
//     seconds = secondS;
//   }

//   // Called just before this Command runs the first time
//   @Override
//   protected void initialize() {
//     time.reset();
//     time.start();
//   }

//   // Called repeatedly when this Command is scheduled to run
//   @Override
//   protected void execute() {
//     drive.drive(0, 0.5);
//   }

//   // Make this return true when this Command no longer needs to run execute()
//   @Override
//   protected boolean isFinished() {
//     return time.get() > seconds;
//   }

//   // Called once after isFinished returns true
//   @Override
//   protected void end() {
//     drive.drive(0, 0);
//   }

//   // Called when another command which requires one or more of the same
//   // subsystems is scheduled to run
//   @Override
//   protected void interrupted() {
//   }
// }
