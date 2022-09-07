/*
 * <one line to give the program's name and a brief idea of what it does.>
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

package com.serverworld.McswDiscordBot.function;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BingChilling extends ListenerAdapter {
    /**
     * Bing chilling!
     */
    public void onMessageReceived (MessageReceivedEvent event) {
        if (event.getMessage().getContentStripped().equalsIgnoreCase("!bing chilling")&&!event.getMember().getUser().isBot()){
            event.getChannel().sendMessage(
                    "good morning china now i have bing chilling\n" +
                    "https://chiliasmstudio.com/img/Bing_Chilling.gif").queue();
        }
    }
}
