package factoryDevices;

public class FactoryDevice {
    public static IDevice make(String typeDevice) {
        IDevice device;

        switch (typeDevice.toLowerCase()) {
            case "android":
                device = new Android();
                break;
            case "ios":
                device = new Ios();
                break;
            default:
                device = new AndroidCloud();
                break;
        }

        return device;
    }
}
