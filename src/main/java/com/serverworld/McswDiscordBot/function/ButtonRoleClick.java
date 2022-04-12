package com.serverworld.McswDiscordBot.function;

import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Objects;

public class ButtonRoleClick extends ListenerAdapter {
    public void onButtonInteraction (ButtonInteractionEvent event) {
        event.deferEdit().queue();

        switch (Objects.requireNonNull(event.getButton().getId())) {
            default:break;
            case "Button1":{
                event.getChannel().sendMessage("Button1 clicked!").queue();
                break;
            }
        }
    }
}
