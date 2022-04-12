package com.serverworld.McswDiscordBot.function;

import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ButtonRole extends ListenerAdapter {
    public void onMessageReceived (MessageReceivedEvent event) {
        if (event.getMessage().getContentStripped().startsWith("!Callrole")&&event.getMember().getId().equals(285003541951545345L)){
            event.getChannel().sendMessage( "Hello world!").
                    setActionRow(sendButtons()).
                    queue();
        }
    }

    private static List<Button> sendButtons(){
        List<Button> buttons = new ArrayList<>();
        buttons.add(Button.primary("Button1","Button1"));
        return buttons;
    }

    public void onButtonInteraction (ButtonInteractionEvent event) {
        event.deferEdit().queue();

        switch (Objects.requireNonNull(event.getButton().getId())) {
            default:break;
            case "Button1":{
                event.getChannel().sendMessage("Button1 clicked!").queue();
                Role test = event.getGuild().getRoleById((963321537144958986L));
                event.getChannel().sendMessage("Button1 clicked!").queue();
                event.getMember().getGuild().addRoleToMember(event.getMember(),test).queue();
                break;
            }
        }
    }
}
