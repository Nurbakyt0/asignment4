import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Observer Pattern Example
        SmartHomeController controller = new SmartHomeController();
        SmartLight smartLight = new SmartLight("Living Room Light");
        SmartThermostat smartThermostat = new SmartThermostat("Living Room Thermostat");
        SmartSecurityCamera securityCamera = new SmartSecurityCamera("Front Door Camera");

        controller.addObserver(smartLight);
        controller.addObserver(smartThermostat);
        controller.addObserver(securityCamera);

        // Factory Pattern Example
        SmartDeviceFactory lightFactory = new LightFactory();
        SmartDeviceFactory thermostatFactory = new ThermostatFactory();
        SmartDeviceFactory cameraFactory = new CameraFactory();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Simulate a motion event");
            System.out.println("2. Simulate a high temperature event");
            System.out.println("3. Simulate a security breach");
            System.out.println("4. Create a smart device");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    controller.notifyObservers("Motion detected in the living room.");
                    break;
                case 2:
                    controller.notifyObservers("Temperature is too high in the living room.");
                    break;
                case 3:
                    controller.notifyObservers("Security breach detected at the front door.");
                    break;
                case 4:
                    System.out.println("Choose a smart device to create:");
                    System.out.println("1. Smart Light");
                    System.out.println("2. Smart Thermostat");
                    System.out.println("3. Smart Camera");
                    int deviceChoice = scanner.nextInt();
                    SmartDevice newDevice = null;

                    if (deviceChoice == 1) {
                        newDevice = lightFactory.createSmartDevice();
                    } else if (deviceChoice == 2) {
                        newDevice = thermostatFactory.createSmartDevice();
                    } else if (deviceChoice == 3) {
                        newDevice = cameraFactory.createSmartDevice();
                    }

                    if (newDevice != null) {
                        newDevice.performAction();
                    }
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
