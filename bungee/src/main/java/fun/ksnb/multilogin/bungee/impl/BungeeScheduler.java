package fun.ksnb.multilogin.bungee.impl;

import moe.caa.multilogin.api.plugin.BaseScheduler;

public class BungeeScheduler extends BaseScheduler {
    @Override
    public void runTask(Runnable run, long delay) {
        runTaskAsync(run, delay);
    }

    @Override
    public void runTask(Runnable run) {
        runTaskAsync(run);
    }
}