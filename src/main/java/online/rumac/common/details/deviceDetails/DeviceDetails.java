package online.rumac.common.details.deviceDetails;

import online.rumac.common.JsonParserUtil;
import online.rumac.common.details.Details;

public class DeviceDetails extends Details {

    public DeviceDetails() {
        map.putAll(JsonParserUtil.parseJson(filePath, map));
        checkUnlockStrategy();
    }

    private void checkUnlockStrategy() {
        String unlockStrategy = "UnlockStrategy";
        String systemVariable = System.getProperty("unlock.strategy");
        String unlockProperty = map.get(unlockStrategy);
        if (systemVariable == null) return;
        if (unlockProperty != null) {
            if ("false".equalsIgnoreCase(systemVariable) && !unlockProperty.isEmpty()) map.remove(unlockStrategy);
            else map.put(unlockStrategy, unlockProperty);
        }
    }

    @Override
    protected String getFilePath() {
        return directory + "\\devices\\" + System.getProperty("json.deviceInfo") + ".json";
    }
}
