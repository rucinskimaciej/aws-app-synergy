package online.rumac.common.details.appDetails;

import online.rumac.common.details.Details;

import java.util.HashMap;
import java.util.Map;

import static online.rumac.common.JsonParserUtil.*;

public class AppDetails extends Details {

    public AppDetails(String platform) {
        Map<String, Map<String, String>> json = new HashMap<>();
        json.putAll(parseJson(filePath, json));
        map.putAll(json.get(platform));
    }

    @Override
    protected String getFilePath() {
        return directory + "\\apps\\" + System.getProperty("json.appInfo") + ".json";
    }
}
