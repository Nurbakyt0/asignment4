public class SmartSecurityCamera implements Observer {
    private String name;

    public SmartSecurityCamera(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println("Smart Security Camera '" + name + "' received event: " + event);
        // Implement action based on the event (e.g., start recording)
    }
}

