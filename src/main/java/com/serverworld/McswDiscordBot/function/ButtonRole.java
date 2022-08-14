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
    public void onMessageReceived (MessageReceivedEvent event) {
        Role admin = event.getGuild().getRoleById((938744328774361118L));
        if (event.getMessage().getContentStripped().equalsIgnoreCase("!Callrole")&&event.getMember().getRoles().contains(admin)){
            event.getChannel().sendMessage( "Hello world!\nClick the button to get role\n點擊按鈕即可獲取身分組").
                    setActionRow(sendButtons()).
                    queue();
        }
    }

    private static List<Button> sendButtons(){
        List<Button> buttons = new ArrayList<>();
        buttons.add(Button.secondary("ProjectZomboid","Project Zomboid").withEmoji(Emoji.fromFormatted((Emote.Logo_ProjectZomboid))));
        return buttons;
    }

    public void onButtonInteraction (ButtonInteractionEvent event) {
        event.deferEdit().queue();

        switch (Objects.requireNonNull(event.getButton().getId())) {
            default:break;
            case "ProjectZomboid":{
                //event.getChannel().sendMessage("Button1 clicked!").queue();
                Role mcsw_host_service = event.getGuild().getRoleById((938744047286239302L));
                //event.getChannel().sendMessage("Button1 clicked!").queue();
                if(hasRole(event.getMember(),mcsw_host_service))
                    event.getMember().getGuild().removeRoleFromMember(event.getMember(), mcsw_host_service).queue();
                else
                    event.getMember().getGuild().addRoleToMember(event.getMember(), mcsw_host_service).queue();
                break;
            }
        }
    }

    public static boolean hasRole(Member member, Role role) {
        List<Role> memberRoles = member.getRoles();
        return memberRoles.contains(role);
    }
}
