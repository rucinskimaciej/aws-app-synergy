1.
Device capabilities are set with JSON file located in "src/test/resources/capabilitiesJson"
basing on this guide: https://stash.mtvi.com/projects/DTE/repos/synergy-java/browse/docs/AndroidNative.md#devicecapabilities

2.
Set CAPABILITIES and SERVER_URL in "src/test/java/online/rumac/tests/common/DriverGenerator.java"

3.
Run tests with "mvn clean test -Dgroups=groupName" (for multiple groups -Dgroups=group1,group2).
Groups are defined in testng.xml.