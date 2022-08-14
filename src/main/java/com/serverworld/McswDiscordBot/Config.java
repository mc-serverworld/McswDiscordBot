package com.serverworld.McswDiscordBot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
    /**
     * Load config value form config.properties.
     * @param configFileDir Directory of config.
     * @throws IOException When fail to load config.
     * @throws Exception when
    */
    public static void LoadConfig(String configFileDir) throws Exception{
        Properties properties = new Properties();
        if(configFileDir==null||configFileDir.isEmpty())
            configFileDir = "config/config.properties";
        try {
            properties.load(new FileInputStream(configFileDir));
        } catch (IOException ex) {
            throw new IOException("Fail to load config file!");
        }

        Token = properties.getProperty("token", "");
        //If token not set
        if(Token ==null|| Token.isEmpty())
            throw new Exception("Token not found!");

    }
    /** Token of discord bot */
    public static String Token = "";

}
