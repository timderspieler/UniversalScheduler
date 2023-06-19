package com.github.Anon8281.universalScheduler.scheduling.schedulers;

import com.github.Anon8281.universalScheduler.scheduling.tasks.MyScheduledTask;
import com.github.Anon8281.universalScheduler.scheduling.tasks.PaperScheduledTask;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class PaperScheduler implements TaskScheduler {

    final JavaPlugin plugin;

    public PaperScheduler(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean isGlobalThread() {
        return Bukkit.getServer().isPrimaryThread();
    }

    @Override
    public boolean isTickThread() {
        return Bukkit.getServer().isPrimaryThread();
    }

    @Override
    public boolean isEntityThread(@NotNull Entity entity) {
        return Bukkit.getServer().isPrimaryThread();
    }

    @Override
    public boolean isRegionThread(@NotNull Location location) {
        return Bukkit.getServer().isPrimaryThread();
    }

    @Override
    public @NotNull MyScheduledTask runTask(@NotNull Runnable runnable) {
        return new PaperScheduledTask(Bukkit.getScheduler().runTask(plugin, runnable));
    }

    @Override
    public @NotNull MyScheduledTask runTaskLater(@NotNull Runnable runnable, long delay) {
        return new PaperScheduledTask(Bukkit.getScheduler().runTaskLater(plugin, runnable, delay));
    }

    @Override
    public @NotNull MyScheduledTask runTaskTimer(@NotNull Runnable runnable, long delay, long period) {
        return new PaperScheduledTask(Bukkit.getScheduler().runTaskTimer(plugin, runnable, delay, period));
    }

    @Override
    public @NotNull MyScheduledTask runTaskAsynchronously(@NotNull Runnable runnable) {
        return new PaperScheduledTask(Bukkit.getScheduler().runTaskAsynchronously(plugin, runnable));
    }

    @Override
    public @NotNull MyScheduledTask runTaskLaterAsynchronously(@NotNull Runnable runnable, long delay) {
        return new PaperScheduledTask(Bukkit.getScheduler().runTaskLaterAsynchronously(plugin, runnable, delay));
    }

    @Override
    public @NotNull MyScheduledTask runTaskTimerAsynchronously(@NotNull Runnable runnable, long delay, long period) {
        return new PaperScheduledTask(Bukkit.getScheduler().runTaskTimerAsynchronously(plugin, runnable, delay, period));
    }

    //Useless? Or...
    public @NotNull MyScheduledTask runTask(JavaPlugin plugin, @NotNull Runnable runnable) {
        return new PaperScheduledTask(Bukkit.getScheduler().runTask(plugin, runnable));
    }

    @Override
    public @NotNull MyScheduledTask runTaskLater(JavaPlugin plugin, @NotNull Runnable runnable, long delay) {
        return new PaperScheduledTask(Bukkit.getScheduler().runTaskLater(plugin, runnable, delay));
    }

    @Override
    public @NotNull MyScheduledTask runTaskTimer(JavaPlugin plugin, @NotNull Runnable runnable, long delay, long period) {
        return new PaperScheduledTask(Bukkit.getScheduler().runTaskTimer(plugin, runnable, delay, period));
    }

    @Override
    public @NotNull MyScheduledTask runTaskAsynchronously(JavaPlugin plugin, @NotNull Runnable runnable) {
        return new PaperScheduledTask(Bukkit.getScheduler().runTaskAsynchronously(plugin, runnable));
    }

    @Override
    public @NotNull MyScheduledTask runTaskLaterAsynchronously(JavaPlugin plugin, @NotNull Runnable runnable, long delay) {
        return new PaperScheduledTask(Bukkit.getScheduler().runTaskLaterAsynchronously(plugin, runnable, delay));
    }

    @Override
    public @NotNull MyScheduledTask runTaskTimerAsynchronously(JavaPlugin plugin, @NotNull Runnable runnable, long delay, long period) {
        return new PaperScheduledTask(Bukkit.getScheduler().runTaskTimerAsynchronously(plugin, runnable, delay, period));
    }

    @Override
    public void cancelTasks() {
        Bukkit.getScheduler().cancelTasks(plugin);
    }

    @Override
    public void cancelTasks(JavaPlugin plugin) {
        Bukkit.getScheduler().cancelTasks(plugin);
    }
}