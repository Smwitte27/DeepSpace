package frc.team2606.robot;

public class Constants {
   
    /* ROBOT PHYSICAL CONSTANTS */

    // Wheels
    public static final double driveWheelWidthInches = 25.54;
    public static final double driveWheelDiameterInches = 6;
    public static final double driveWheelRadiusInches = driveWheelDiameterInches / 2.0;
    public static final double trackScrubFactor = 1.0; // Tune me!??

    // Tuned dynamics
    public static final double robotLinearInertia = 60.0; // kg TODO tune
    public static final double robotAngularInertia = 10.0; // kg m^2 TODO tune
    public static final double robotAngularDrag = 12.0; // N*m / (rad/sec) TODO tune
    public static final double driveVIntercept = 1.055; // V
    public static final double driveKv = 0.135; // V per rad/s
    public static final double driveKa = 0.012; // V per rad/s^d

    // Geometry
    public static final double bumperLength = 38.25;
    public static final double bumperWidth = 33.75;
    
    public static final double centerToFrontBumperDistance = bumperLength / 2.0;
    public static final double centerToRearBumperDistance = bumperLength / 2.0;
    public static final double centerToSideBumperDistance = bumperWidth / 2.0;

    //Path Constants
    public static final double pathKX = 4.0; // units/s per unit of error
    public static final double pathLookaheadTime = 0.4; // seconds to look ahead along the path for steering
    public static final double pathMinLookaheadDistance = 24.0; // inches
}