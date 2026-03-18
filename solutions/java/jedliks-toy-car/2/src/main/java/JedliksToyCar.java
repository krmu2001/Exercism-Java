public class JedliksToyCar {
    private int metersDriven = 0;
    private int batteryPercent = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        int distance = metersDriven;
        return String.format("Driven %s meters", distance);
    }

    public String batteryDisplay() {
        if (batteryPercent <= 0) {
            return "Battery empty";
        }
        int percentage = batteryPercent;
        return String.format("Battery at %s", percentage + "%");
    }

    public void drive() {
        if (batteryPercent > 0) {
            metersDriven += 20;
            batteryPercent--;
        }
    }
}
