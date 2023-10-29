public class SmartLight implements Observer {
    private String name;

    public SmartLight(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println("Smart Light '" + name + "' received event: " + event);
        // Implement action based on the event (e.g., turn on/off the light)
    }
}

