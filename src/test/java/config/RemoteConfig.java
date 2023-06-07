package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:properties/remote.properties"})
public interface RemoteConfig extends Config {

    @Key("remoteUrl")
    String getRemoteUrl();

    @Key("user_name")
    String getUserName();

    @Key("password")
    String getPassword();

    @Key("app")
    String getApp();

    @Key("device_name")
    String getDeviceName();

    @Key("os_version")
    String getOsVersion();


}
