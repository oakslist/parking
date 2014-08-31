package runner;

import com.core.controller.MainController;
import test.JsonTest;

/**
 * Created by Viachaslau_Karnausha on 8/31/2014.
 */
public class Runner {

    public static void main(String[] args) {
        new Runner().run();
    }

    public void run() {
        MainController mainController = new MainController();
//        Parking place = new EpamParking();
//        Transport car = new Car();
//        car.setRoute(mainController.getRoute(place,mainController.getStartCoordinate()));
//        car.move();
        System.out.println("JSON:\n" + new JsonTest().test());
    }
}
