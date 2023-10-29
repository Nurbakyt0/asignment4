public class SmartThermostat implements Observer {
    private String name;

    public SmartThermostat(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println("Smart Thermostat '" + name + "' received event: " + event);
        // Implement action based on the event (e.g., adjust temperature)
    }
}
