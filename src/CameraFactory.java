public class CameraFactory implements SmartDeviceFactory {
    @Override
    public SmartDevice createSmartDevice() {
        return new SmartCameraDevice();
    }
}