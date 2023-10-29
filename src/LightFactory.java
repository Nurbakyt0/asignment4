public class LightFactory implements SmartDeviceFactory {
    @Override
    public SmartDevice createSmartDevice() {
        return new SmartLightDevice();
    }
}