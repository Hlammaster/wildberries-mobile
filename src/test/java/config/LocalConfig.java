package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:properties/local.properties"})
public interface LocalConfig extends Config {

    @Key("localUrl")
    String getLocalUrl();

    @Key("device name")
    String getDeviceName();

    @Key("os_version")
    String getOsVersion();

    @Key("app_package")
    String getAppPackage();

    @Key("app_activity")
    String getAppActivity();
}
