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

import com.serverworld.McswDiscordBot.lib.Emote;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.entities.emoji.Emoji;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ButtonRole extends ListenerAdapter {
    /**
     * When received !Callrole will create role selection menu.
     */
    public void onMessageReceived (MessageReceivedEvent event) {
        Role admin = event.getGuild().getRoleById((938744328774361118L));
        if (event.getMessage().getContentStripped().equalsIgnoreCase("!Callrole")&&hasRole(event.getMember(),admin)&&!event.getMember().getUser().isBot()){
            event.getChannel().sendMessage( "Hello world!\nClick the button to get role\n點擊按鈕即可獲取身分組").
                    setActionRow(sendButtons()).
                    queue();
        }
    }

    /**
     * Create role button with emote.
     */
    private static List<Button> sendButtons(){
        List<Button> buttons = new ArrayList<>();
        buttons.add(Button.secondary("ProjectZomboid","Project Zomboid").withEmoji(Emoji.fromFormatted((Emote.Logo_ProjectZomboid))));
        return buttons;
    }

    /**
     * Add role to user when button clicked.
     */
    public void onButtonInteraction (ButtonInteractionEvent event) {
        event.deferEdit().queue();

        switch (Objects.requireNonNull(event.getButton().getId())) {
            default:break;
            case "ProjectZomboid":{
                //event.getChannel().sendMessage("Button1 clicked!").queue();
                Role mcsw_host_service = event.getGuild().getRoleById((938744047286239302L));
                if(hasRole(event.getMember(),mcsw_host_service))
                    event.getMember().getGuild().removeRoleFromMember(event.getMember(), mcsw_host_service).queue();
                else
                    event.getMember().getGuild().addRoleToMember(event.getMember(), mcsw_host_service).queue();
                break;
            }
        }
    }

    /**
     * Check if user has role.
     * @param member User to query.
     * @param role Role to query.
     * @return If user has role return true,otherwise false.
     */
    public static boolean hasRole(Member member, Role role) {
        List<Role> memberRoles = member.getRoles();
        return memberRoles.contains(role);
    }
}
