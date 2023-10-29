public class ThermostatFactory implements SmartDeviceFactory {
    @Override
    public SmartDevice createSmartDevice() {
        return new SmartThermostatDevice();
    }
}