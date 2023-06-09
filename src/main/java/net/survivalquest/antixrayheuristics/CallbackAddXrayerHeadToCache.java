package net.survivalquest.antixrayheuristics;

import org.bukkit.inventory.ItemStack;

public interface CallbackAddXrayerHeadToCache {
    void onFetchUpdateDone(ItemStack xrayerSkull);
}
