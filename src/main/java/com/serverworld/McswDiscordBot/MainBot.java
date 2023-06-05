/*
 * <McswDiscordBot - bot for mc-serverworld discord server>
 *     Copyright (C) 2022-2022 chiliasmstudio
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.serverworld.McswDiscordBot;

import com.serverworld.McswDiscordBot.function.BingChilling;
import com.serverworld.McswDiscordBot.function.ButtonRole;
import com.serverworld.McswDiscordBot.function.HelloWorld;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
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

            botBuilder_Main.addEventListeners(new HelloWorld());

            botBuilder_Main.addEventListeners(new BingChilling());
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
