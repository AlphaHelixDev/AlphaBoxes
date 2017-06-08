package de.alphahelix.alphaboxes;

import org.bukkit.plugin.java.JavaPlugin;

public class AlphaBoxes extends JavaPlugin {

    private static AlphaBoxes instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    public static AlphaBoxes getInstance() {
        return instance;
    }
}
