package online.rumac.common.appDetails;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import online.rumac.common.util.Platform;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class AppDetails {

    private final Map<String, Map<String, String>> json;
    private final String platform;
    public final String APP_NAME;
    public final String APP_PACKAGE;
    public final String LAUNCH_ACTIVITY;
    private static final String fileName = System.getProperty("app.details.json");
    private static final String directory = "src\\test\\resources\\capabilitiesJson\\";
    private static final String filePath = directory + fileName + ".json";

    public AppDetails(Platform platform) {
        this.platform = platform.name().toLowerCase();
        this.json = parseJson();
        this.APP_NAME = extractAppName();
        this.APP_PACKAGE = extractAppPackage();
        this.LAUNCH_ACTIVITY = extractLaunchActivity();
    }

    private String extractAppName() throws IllegalArgumentException {
        String output = json.get("appName").get(platform);
        throwExceptionIfEmpty(output, "appName");
        return output;
    }

    private String extractLaunchActivity() throws IllegalArgumentException {
        String output = APP_PACKAGE + "." + json.get("launchActivity").get("mainActivity");
        throwExceptionIfEmpty(output, "launchActivity");
        return output;
    }

    private void throwExceptionIfEmpty(String output, String method) throws IllegalArgumentException {
        if (output == null) throw new IllegalArgumentException(
                String.format("%s in %s.json is required while was found empty.", method, fileName));
    }


    private String extractAppPackage() {
        return json.get("appPackage").get(platform);
    }


    private Map<String, Map<String, String>> parseJson() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File(filePath), new TypeReference<Map<String, Map<String, String>>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException(String.format("\"%s\" is not valid JSON file name", fileName));
    }
}
