package fr.openmc.core.commands;

import fr.openmc.core.OMCPlugin;
import fr.openmc.core.features.city.CityManager;
import fr.openmc.core.features.economy.commands.Baltop;
import fr.openmc.core.features.economy.commands.Money;
import fr.openmc.core.features.economy.commands.Pay;
import fr.openmc.core.commands.fun.Playtime;
import fr.openmc.core.commands.utils.*;
import lombok.Getter;
import revxrsal.commands.bukkit.BukkitCommandHandler;

public class CommandsManager {
    @Getter static CommandsManager instance;
    @Getter static BukkitCommandHandler handler;

    public CommandsManager() {
        instance = this;
        OMCPlugin plugin = OMCPlugin.getInstance();
        handler = BukkitCommandHandler.create(plugin);

        registerSuggestions();
        registerCommands();
    }

    private void registerCommands() {
        handler.register(
                new Socials(),
                new Spawn(),
                new SetSpawn(),
                new Playtime()
        );
    }

    private void registerSuggestions() {}
}
