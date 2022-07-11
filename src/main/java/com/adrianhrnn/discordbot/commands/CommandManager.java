package com.adrianhrnn.discordbot.commands;
import net.dv8tion.jda.api.events.guild.GuildReadyEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import org.jetbrains.annotations.NotNull;

import java.text.DecimalFormat;
import java.time.format.DecimalStyle;
import java.util.ArrayList;
import java.util.List;
public class CommandManager extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        String command = event.getName();

        if (command.equals("rechne")) {
            OptionMapping num1 = event.getOption("zahl1");
            OptionMapping option = event.getOption("operator");
            OptionMapping num2 = event.getOption("zahl2");
                String inp1 = num1.getAsString();
                String rechenoperator = option.getAsString();
                String inp2 = num2.getAsString();

                String reply = "";
                switch(rechenoperator){
                    case "add" -> {
                        try {
                            Double Zahl1;{
                                if(inp1.equals("pi"))
                                {Zahl1 = 3.14159265359d;}
                                else if(inp1.equals("e"))
                                {Zahl1 = 2.71828182846d;}
                            else if (inp1.contains("/")) {
                                    String[] rat = inp1.split("/");
                                    Zahl1 = Double.parseDouble(rat[0]) / Double.parseDouble(rat[1]);
                                } else {
                                    Zahl1 = Double.parseDouble(inp1);}}

                            Double Zahl2;{
                                if(inp2.equals("pi"))
                                {Zahl2 = 3.14159265359d;}
                                else if(inp2.equals("e"))
                                {Zahl2 = 2.71828182846d;}
                            else if (inp2.contains("/")) {
                                    String[] rat = inp2.split("/");
                                    Zahl2 = Double.parseDouble(rat[0]) / Double.parseDouble(rat[1]);
                                } else {
                                    Zahl2 = Double.parseDouble(inp2);}}


                            Double result = Zahl1 + Zahl2;
                            String solution = Double.toString(result);

                            if(inp1.equals("26")&&inp2.equals("2"))
                            {reply = inp1 +" + "+ inp2 + " = " + "~~28~~";}
                            else {
                                reply = inp1 + " + " + inp2 + " = " + solution;
                            }
                        }
                        catch(NumberFormatException ex) {reply = "Das ist zu viel für mich!";}
                    }
                    case "sub" -> {
                        try {
                            Double Zahl1;{
                                if(inp1.equals("pi"))
                                {Zahl1 = 3.14159265359d;}
                                else if(inp1.equals("e"))
                                {Zahl1 = 2.71828182846d;}
                                else if (inp1.contains("/")) {
                                    String[] rat = inp1.split("/");
                                    Zahl1 = Double.parseDouble(rat[0]) / Double.parseDouble(rat[1]);
                                } else {
                                    Zahl1 = Double.parseDouble(inp1);}}

                            Double Zahl2;{
                                if(inp2.equals("pi"))
                                {Zahl2 = 3.14159265359d;}
                                else if(inp2.equals("e"))
                                {Zahl2 = 2.71828182846d;}
                                else if (inp2.contains("/")) {
                                    String[] rat = inp2.split("/");
                                    Zahl2 = Double.parseDouble(rat[0]) / Double.parseDouble(rat[1]);
                                } else {
                                    Zahl2 = Double.parseDouble(inp2);}}


                            Double result = Zahl1 - Zahl2;
                            String solution = Double.toString(result);
                                reply = inp1 + " - " + inp2 + " = " + solution;
                        }
                        catch(NumberFormatException ex) {reply = "Das ist zu viel für mich!";}
                    }
                    case "mul" -> {
                        try {
                            Double Zahl1;{
                                if(inp1.equals("pi"))
                                {Zahl1 = 3.14159265359d;}
                                else if(inp1.equals("e"))
                                {Zahl1 = 2.71828182846d;}
                                else if (inp1.contains("/")) {
                                    String[] rat = inp1.split("/");
                                    Zahl1 = Double.parseDouble(rat[0]) / Double.parseDouble(rat[1]);
                                } else {
                                    Zahl1 = Double.parseDouble(inp1);}}

                            Double Zahl2;{
                                if(inp2.equals("pi"))
                                {Zahl2 = 3.14159265359d;}
                                else if(inp2.equals("e"))
                                {Zahl2 = 2.71828182846d;}
                                else if (inp2.contains("/")) {
                                    String[] rat = inp2.split("/");
                                    Zahl2 = Double.parseDouble(rat[0]) / Double.parseDouble(rat[1]);
                                } else {
                                    Zahl2 = Double.parseDouble(inp2);}}


                            Double result = Zahl1 * Zahl2;
                            String solution = Double.toString(result);
                            reply = inp1 + " * " + inp2 + " = " + solution;
                        }
                        catch(NumberFormatException ex) {reply = "Das ist zu viel für mich!";}
                    }
                    case "div" -> {
                        try {
                            Double Zahl1;{
                                if(inp1.equals("pi"))
                                {Zahl1 = 3.14159265359d;}
                                else if(inp1.equals("e"))
                                {Zahl1 = 2.71828182846d;}
                                else if (inp1.contains("/")) {
                                    String[] rat = inp1.split("/");
                                    Zahl1 = Double.parseDouble(rat[0]) / Double.parseDouble(rat[1]);
                                } else {
                                    Zahl1 = Double.parseDouble(inp1);}}

                            Double Zahl2;{
                                if(inp2.equals("pi"))
                                {Zahl2 = 3.14159265359d;}
                                else if(inp2.equals("e"))
                                {Zahl2 = 2.71828182846d;}
                                else if (inp2.contains("/")) {
                                    String[] rat = inp2.split("/");
                                    Zahl2 = Double.parseDouble(rat[0]) / Double.parseDouble(rat[1]);
                                } else {
                                    Zahl2 = Double.parseDouble(inp2);}}


                            Double result = Zahl1 / Zahl2;
                            String solution = Double.toString(result);
                            reply = inp1 + " / " + inp2 + " = " + solution;
                        }
                        catch(NumberFormatException ex) {reply = "Das ist zu viel für mich!";}
                    }
            }

                //====reply================================================
                event.reply(reply).complete();
        }
    }



    @Override
    public void onGuildReady(@NotNull GuildReadyEvent event) {
        List<CommandData> commandData = new ArrayList<>();

        OptionData option1 = new OptionData(OptionType.STRING, "zahl1", "Was soll ich rechnen? (e, pi?, 26+2?)", true);
        OptionData option2 = new OptionData(OptionType.STRING, "operator", "Hmm, ja?", true)
               .addChoice("+", "add")
               .addChoice("-", "sub")
               .addChoice("*", "mul")
               .addChoice("/", "div");
        OptionData option3 = new OptionData(OptionType.STRING, "zahl2", "Schwierige Dinge sind das.", true);

        commandData.add(Commands.slash("rechne", "Für den Zahlenraum über 10!").addOptions(option1, option2, option3));

        event.getGuild().updateCommands().addCommands(commandData).queue();
    }
}
