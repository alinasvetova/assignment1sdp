import models.Car;
import models.Report;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Car car = new Car.Builder()
                .model("Audi A6")
                .color("White")
                .speed(250)
                .year(2023)
                .build();

        System.out.println(car);

        Report report = new Report.Builder()
                .title("Updated Report Example")
                .messages(Arrays.asList(
                        "First updated message",
                        "Second updated message",
                        "Third line added"
                ))
                .build();

        System.out.println(report);

    }

}