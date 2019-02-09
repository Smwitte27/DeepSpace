/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team2606.robot.subsystems;

public class Intake extends Subsystem {
  private static Intake instance;

  public synchronized static Intake getInstance() {
    if (instance == null) {
      instance = new Intake();
    }
    return instance;
  }

  @Override
  public boolean checkSystem() {
    return false;
  }

  @Override
  public void outputTelemetry() {

  }

  @Override
  public void stop() {

  }
}
