package online.rumac.util.deviceCapabilitiesInjector;

import com.synergy.core.driver.DeviceCapabilities;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class DeviceCapabilitiesGenerator {

    public static DeviceCapabilities fromJson(String activityName) {
        JSONObject json = (JSONObject) parse("src/test/resources/capabilitiesJson/" + activityName + ".json");
        DeviceCapabilities caps = new DeviceCapabilities();
        for (Object o : json.keySet()) {
            String s = (String) o;
            caps.addCapability(s, json.get(o));
        }
        return caps;
    }

    private static Object parse(String source) {
        JSONParser parser = new JSONParser();
        try {
            return parser.parse(new FileReader(source));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        throw new NullPointerException();
    }
}