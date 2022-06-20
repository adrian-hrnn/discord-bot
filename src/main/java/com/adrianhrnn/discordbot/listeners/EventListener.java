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
        event.getMessage().getInteraction().getMember();
        Member member = event.getMember(); //Who send the message

        if (message.contains("Murk")) {
            event.getChannel().sendMessage("Ist das überhaupt richtig?").queue();
        }
        if (message.contains("28")) {
            event.getChannel().sendMessage("Näh").queue();
        }
        if (message.contains("3")) {
            event.getChannel().sendMessage("Ich bin stolz auf dich").queue();
        }
    }

    @Override
    public void onGuildMemberRoleAdd(@NotNull GuildMemberRoleAddEvent event) {
        event.getGuild().getDefaultChannel().sendMessage("Hartmut Murk am Apparat").queue();
    }
}
