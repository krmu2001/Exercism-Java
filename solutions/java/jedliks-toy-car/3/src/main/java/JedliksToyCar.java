public class JedliksToyCar {
    private int metersDriven = 0;
    private int batteryPercent = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", metersDriven);
    }

    public String batteryDisplay() {
        if (batteryPercent <= 0) {
            return "Battery empty";
        }
        return String.format("Battery at %d%%", batteryPercent);
    }

    public void drive() {
        if (batteryPercent > 0) {
            metersDriven += 20;
            batteryPercent--;
        }
    }
}
