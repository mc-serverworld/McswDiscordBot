package com.serverworld.McswDiscordBot.lib;

import net.dv8tion.jda.api.entities.Message;

import java.util.concurrent.TimeUnit;

public class utils {
    public static void deleteAfter(Message message, int delay) {message.delete().queueAfter(delay, TimeUnit.SECONDS);
    }
}
