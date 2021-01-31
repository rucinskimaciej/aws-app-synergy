1. There are two strategies for providing capabilities:


    I) (recommended) with App and Device related JSON files located in "src/test/resources/json/..."
    - .../devices/ directory stores device-related capabilities (see template: deviceInfo.json);
    - .../apps/ directory stores app-related capabilities (see template: appInfo.json).
     
    Maven run properties: `-Djson.deviceInfo=deviceInfo` `-Djson.appInfo=appInfo` (both are required)


    II) with Device capabilities JSON file located in "src/test/resources/capabilitiesJson/" (see template: RequiredCapabilities.json)
    
    Maven run property: `-Djson.capabilities=RequiredCapabilities`

See guide to device capabilities setting:  
- Android: https://stash.mtvi.com/projects/DTE/repos/synergy-java/browse/docs/AndroidNative.md#devicecapabilities
- iOS https://stash.mtvi.com/projects/DTE/repos/synergy-java/browse/docs/IOSNative.md#devicecapabilities

2. Run tests with `mvn clean test -Dgroups=groupName -Djson.deviceInfo=deviceInfo -Djson.appInfo=appInfo` 
- if both `-Djson.deviceInfo=deviceInfo -Djson.appInfo=appInfo` and `-Djson.capabilities=RequiredCapabilities` 
  are provided, "json.capabilities" property is ignored;
- default server url `http://127.0.0.1:7777` can be customized with `-Dsynergy.server.url="url"`;
- groups are defined in testng.xml;
- for multiple groups `-Dgroups=group1,group2`.