package com.serverworld.McswDiscordBot;

import static com.serverworld.McswDiscordBot.MainBot.initialization_Main;

public class main {
    public static void main(String[] args) throws Exception{
        Config.LoadConfig(null);
        initialization_Main(Config.Token);
    }
}
