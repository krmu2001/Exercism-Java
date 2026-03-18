public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double productionRate = 0;
        if (1 <= speed && speed <= 4) {
            productionRate = speed * 221;
        } else if (5 <= speed && speed <= 8) {
            productionRate = (speed * 221) * 0.9;
        } else if (speed == 9) {
            productionRate = (speed * 221) * 0.8;
        } else {
            productionRate = (speed * 221) * 0.77;
        }
        return productionRate;
    }

    public int workingItemsPerMinute(int speed) {
        int workingItems = (int) (productionRatePerHour(speed) / 60);
        return workingItems;
    }
}
