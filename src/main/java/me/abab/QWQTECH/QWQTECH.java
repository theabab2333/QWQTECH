package me.abab.QWQTECH;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.abab.QWQTECH.Task.QWQTECHItemRegister;
import org.bukkit.plugin.java.JavaPlugin;

public class QWQTECH extends JavaPlugin implements SlimefunAddon {

    private static QWQTECH instance;

    public static void register(QWQTECH inst) {
    }

    public JavaPlugin getJavaPlugin() {
        return this;
    }

    public String getBugTrackerURL() {
        return "驱蚊器科技是伟大的赤石科技";
    }
    @Override
    public void onEnable() {
        instance = this;
        QWQTECHItemRegister.run();
    }

    public static QWQTECH getInstance() {

        return instance;

    }

}
