package org.firstinspires.ftc.teamcode.RoadRunner.Tests.Auto;

//Road Runner Imports
import com.acmerobotics.dashboard.config.Config;
import com.acmerobotics.roadrunner.Action;
import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.SequentialAction;
import com.acmerobotics.roadrunner.ftc.Actions;

//Non Road Runner Imports
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.RoadRunner.MecanumDrive;

@Config
@Autonomous
public class Test2 extends LinearOpMode {

    public void runOpMode() {

        //Add Mecanum Drive
        MecanumDrive drive = new MecanumDrive(hardwareMap, new Pose2d(0, 0, Math.toRadians(0)));

        //Create a new Action
        Action testAction;

        //Set what the action will do.
        testAction = drive.actionBuilder(drive.pose)
                .turn(Math.toRadians(180))
                .build();

        //Run testAction
        waitForStart();
        if (opModeIsActive()) {

            Actions.runBlocking(
                    new SequentialAction(
                            testAction
                    )
            );
        }
    }
}