package com.serverworld.McswDiscordBot.lib;

import net.dv8tion.jda.api.entities.Message;

import java.util.concurrent.TimeUnit;

public class Utils {

    /**
     * Send message and delete after delay.
     * @param message Message to send.
     * @param delay Second before delete message.
     */
    public static void deleteAfter(Message message, int delay) {message.delete().queueAfter(delay, TimeUnit.SECONDS);
    }
}
