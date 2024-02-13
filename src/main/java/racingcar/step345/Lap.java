package racingcar.step345;

import java.util.*;

public class Lap {

    private final List<Car> cars;

    public Lap(int numberOfCars) {

        cars = new ArrayList<>();
        for (int i = 0; i < numberOfCars; i++) {
            cars.add(new Car());
        }
    }

    public void start(Rule rule) {

        for (Car car : cars) {
            if (!rule.isStop()) car.run();
        }
    }

    public void pause() {

        for (Car car : cars) {
            car.stop();
        }
    }

    public int getTotalDistance() {
        return Arrays.stream(getOdometerList()).sum();
    }

    public int[] getOdometerList() {
        return cars.stream().mapToInt(Car::getOdometer).toArray();
    }
}
