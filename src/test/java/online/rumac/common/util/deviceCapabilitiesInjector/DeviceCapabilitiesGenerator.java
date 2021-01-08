package online.rumac.common.util.deviceCapabilitiesInjector;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.synergy.core.driver.DeviceCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class DeviceCapabilitiesGenerator {

    private static DeviceCapabilitiesGenerator instance = getInstance();
    private final ObjectMapper objectMapper;

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
}