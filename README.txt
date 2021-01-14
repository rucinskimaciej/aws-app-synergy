1.
Device capabilities are set with JSON file located in "src/test/resources/capabilitiesJson"
basing on this guide: https://stash.mtvi.com/projects/DTE/repos/synergy-java/browse/docs/AndroidNative.md#devicecapabilities

2.
Run tests with "mvn clean test -Djson.capabilities=JsonCapabilities -Dsynergy.server.url="url" -Dgroups=groupName"
- json.capabilities property is required - capabilities simple name (without ".json" suffix) as argument;
- default server url is 127.0.0.1:7777;
- groups are defined in testng.xml;
- for multiple groups -Dgroups=group1,group2