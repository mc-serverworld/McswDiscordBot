package com.serverworld.McswDiscordBot;

import com.serverworld.McswDiscordBot.function.ButtonRole;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class MainBot {
    public static JDABuilder botBuilder_Main = null;
    public static JDA bot_Main= null;

    /**
     * Initialization bot
     * @param token Token of discord bot
     * */
    public static boolean initialization_Main(String token){
        try {
            botBuilder_Main = JDABuilder.createDefault(token);
            botBuilder_Main.setActivity(Activity.playing("Hello discord!"));
            botBuilder_Main.enableIntents(GatewayIntent.MESSAGE_CONTENT);

            botBuilder_Main.addEventListeners(new ButtonRole());
            bot_Main = botBuilder_Main.build();

            Thread.sleep(1000);
            TextChannel channel = bot_Main.getTextChannelById("963278132155142154");

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
