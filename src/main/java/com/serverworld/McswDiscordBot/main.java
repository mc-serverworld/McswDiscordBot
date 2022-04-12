package com.serverworld.McswDiscordBot;

import com.serverworld.McswDiscordBot.function.ButtonRole;
import com.serverworld.McswDiscordBot.lib.utils;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;

import java.util.ArrayList;

import static com.serverworld.McswDiscordBot.MainBot.initialization_Main;

public class main {


    public static ArrayList<String> admin_main = new ArrayList<String>();
    public static void main(String[] args) throws Exception{
        String tokenMain = "OTM4NzQ2ODk4MDIwNDM4MDc4.YfuyLQ.NvTR8nWeN-Q1NoKR1PJgz10y6BA";
        admin_main.add("285003541951545345");
        initialization_Main(tokenMain);
    }
}
