package com.adrianhrnn.discordbot.listeners;

import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRoleAddEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class EventListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String message = event.getMessage().getContentRaw();

        if (message.contains("Murk")) {
            event.getChannel().sendMessage("Ist das überhaupt richtig?").queue();
        }
        if (message.contains("28")) {
            event.getChannel().sendMessage("Näh").queue();
        }
        if (message.contains("3")) {
            event.getChannel().sendMessage("Ich bin stolz auf dich").queue();
        }
        if (message.contains("10")) {
            event.getChannel().sendMessage("Jetzt wird's Schwieriger").queue();
        }
        if (message.contains("69")) {
            event.getChannel().sendMessage("Schweinekram").queue();
        }
        if (message.equals("100")) {
            event.getChannel().sendMessage("per cento").queue();
        }
        if (message.contains("256")) {
            event.getChannel().sendMessage("Da schlägt mein Herz höher").queue();
        }
        if (message.equals("1000")) {
            event.getChannel().sendMessage("Noch ne 0").queue();
        }
    }

    @Override
    public void onGuildMemberRoleAdd(@NotNull GuildMemberRoleAddEvent event) {
        event.getGuild().getDefaultChannel().sendMessage("Hartmut Murk am Apparat").queue();
    }
}
