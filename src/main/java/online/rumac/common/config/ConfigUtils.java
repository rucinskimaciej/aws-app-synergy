package online.rumac.common.config;

public class ConfigUtils {

    private static final String PATH = "src\\test\\resources\\appPackages\\";
    public static final String PLATFORM = System.getProperty("device.platform");
    public static final String DEVICE_ID = System.getProperty("device.id");
    public static final String APP_PACKAGE = PATH + System.getProperty("app.package");
}
