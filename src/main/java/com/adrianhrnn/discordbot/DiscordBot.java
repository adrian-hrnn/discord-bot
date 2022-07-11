package com.adrianhrnn.discordbot;

import com.adrianhrnn.discordbot.commands.CommandManager;
import com.adrianhrnn.discordbot.listeners.EventListener;
import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;

public class DiscordBot {
    private final Dotenv config;
    private final ShardManager shardManager;

//main config

    public DiscordBot() throws LoginException {
        config = Dotenv.configure().load();
        String token = config.get("TOKEN");

        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(token);
        builder.setStatus(OnlineStatus.ONLINE);
        builder.setActivity(Activity.watching("Kasel'o'mat"));
        builder.enableIntents(GatewayIntent.GUILD_PRESENCES, GatewayIntent.GUILD_MEMBERS, GatewayIntent.GUILD_MESSAGES);
        //caching
        builder.setMemberCachePolicy(MemberCachePolicy.ALL);
        builder.setChunkingFilter(ChunkingFilter.ALL);
        builder.enableCache(CacheFlag.ACTIVITY, CacheFlag.ONLINE_STATUS, CacheFlag.EMOTE);
        shardManager = builder.build();

        //Listeners Register
        shardManager.addEventListener(new EventListener(), new CommandManager());
    }

//return

    public Dotenv getConfig() {
        return config;
    }

    public ShardManager getShardManager() {
        return shardManager;
    }

//main class

    public static void main(String[] args) {
        try {
            DiscordBot bot = new DiscordBot();
        } catch (LoginException e) {
            System.out.println("ERROR: Bot token is invalid!");
        }
    }
}

