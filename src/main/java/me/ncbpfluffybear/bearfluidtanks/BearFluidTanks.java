package me.ncbpfluffybear.bearfluidtanks;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.mrCookieSlime.Slimefun.cscorelib2.config.Config;
import org.bukkit.plugin.java.JavaPlugin;

public class BearFluidTanks extends JavaPlugin implements SlimefunAddon {

    public static BearFluidTanks instance;

    @Override
    public void onEnable() {

        instance = this;

        // Read something from your config.yml
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // You could start an Auto-Updater for example
        }

        BFTItemSetup.setup(this);
    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    public static BearFluidTanks getInstance() {
        return instance;
    }
}
