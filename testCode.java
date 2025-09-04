package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="firstTele", group = "pushbot")
public class testCode extends OpMode {

    DcMotor motor1;
    DcMotor motor2;
    double power1;
    double power2;

    @Override
    public void init() {
        motor1 = hardwareMap.get(DcMotor.class, "leftMotor");
        motor2 = hardwareMap.get(DcMotor.class, "rightMotor");
    }

    @Override
    public void loop() {
        power1 = gamepad1.left_stick_y;
        power2 = gamepad1.right_stick_y;

        motor1.setPower(power1);
        motor2.setPower(power2);
    }
}
