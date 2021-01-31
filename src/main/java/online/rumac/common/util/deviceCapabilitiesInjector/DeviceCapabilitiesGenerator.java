package online.rumac.common.util.deviceCapabilitiesInjector;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.synergy.core.driver.DeviceCapabilities;
import online.rumac.common.config.CapabilitiesConfig;
import online.rumac.common.exceptions.EmptyCapabilitiesException;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class DeviceCapabilitiesGenerator {

    private static DeviceCapabilitiesGenerator instance = getInstance();
    private final ObjectMapper objectMapper;
    private static final String CAPABILITIES_PROPERTY = "json.capabilities";
    private static final String PROPERTY_JSON = System.getProperty(CAPABILITIES_PROPERTY);

    private DeviceCapabilitiesGenerator() {
        objectMapper = new ObjectMapper();
    }

    private static DeviceCapabilitiesGenerator getInstance() {
        if (instance == null) {
            instance = new DeviceCapabilitiesGenerator();
        }
        return instance;
    }

    public static DeviceCapabilities fromJson(String inputFileName) {
        Map<String, String> jsonMap = map("src/test/resources/capabilitiesJson/" + inputFileName + ".json");
        DeviceCapabilities caps = new DeviceCapabilities();
        for (Map.Entry<String, String> es : jsonMap.entrySet()) {
            caps.addCapability(es.getKey(), es.getValue());
        }
        return caps;
    }

    private static Map<String, String> map(String source) {
        try {
            return instance.objectMapper.readValue(new File(source), new TypeReference<Map<String, String>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("Invalid json path");
    }

    public static DeviceCapabilities getCaps() {
        if (PROPERTY_JSON != null) return fromJson(getJsonCapabilitiesFileName());
        else return new CapabilitiesConfig().getDeviceCapabilities();
    }

    private static String getJsonCapabilitiesFileName() {
        try {
            return System.getProperty(CAPABILITIES_PROPERTY);
        } catch (IllegalArgumentException e) {
            throw new EmptyCapabilitiesException();
        }
    }
}