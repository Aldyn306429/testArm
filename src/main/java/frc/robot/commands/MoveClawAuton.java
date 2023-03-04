// // Copyright (c) FIRST and other WPILib contributors.
// // Open Source Software; you can modify and/or share it under the terms of
// // the WPILib BSD license file in the root directory of this project.

// package frc.robot.commands;

// import edu.wpi.first.wpilibj2.command.CommandBase;
// import frc.robot.Constants;
// import frc.robot.subsystems.Claw;

// public class MoveClawAuton extends CommandBase {
//   Claw m_claw;
//   boolean isOuttake;
//   /** Creates a new MoveClawAuton. */
//   public MoveClawAuton(Claw c, boolean o) {
//     m_claw = c;
//     isOuttake = o;
//     addRequirements(c);
//     // Use addRequirements() here to declare subsystem dependencies.
//   }

//   // Called when the command is initially scheduled.
//   @Override
//   public void initialize() {}

//   // Called every time the scheduler runs while the command is scheduled.
//   @Override
//   public void execute() {
//     if(isOuttake) {
//       if(m_claw.autonClawOuttake()) m_claw.setClawSpeed(Constants.ClawConstants.clawSpeed);
//       else isFinished();
//     } else {
//       if(m_claw.autonClawIntake()) m_claw.setClawSpeed(Constants.ClawConstants.clawSpeed);
//       else isFinished();
//     }
//   }

//   // Called once the command ends or is interrupted.
//   @Override
//   public void end(boolean interrupted) {}

//   // Returns true when the command should end.
//   @Override
//   public boolean isFinished() {
//     return true;
//   }
// }
