package runner;

import com.core.beans.Parking;
import com.core.beans.Place;
import com.core.beans.Transport;
import com.core.controller.MainController;
import com.core.impl.Car;
import com.core.impl.EpamParking;

/**
 * Created by Viachaslau_Karnausha on 8/31/2014.
 */
public class Runner {

    public static void main(String[] args) {
        new Runner().run();
    }

    public void run() {
        MainController mainController = new MainController();
        Parking place = new EpamParking();
        Transport car = new Car();
        car.setRoute(mainController.getRoute(place,mainController.getStartCoordinate()));
        car.move();
    }
}
