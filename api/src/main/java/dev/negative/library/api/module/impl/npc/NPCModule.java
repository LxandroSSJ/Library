package dev.negative.library.api.module.impl.npc;

import dev.negative.library.api.module.Module;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By LeandroSSJ
 * Created on 06/04/2022
 */
@Getter
public enum NPCModule implements Module {

    INSTANCE;

    private List<NPC> npcStorage;

    @Override
    public void onEnable(JavaPlugin plugin) {
        npcStorage = new ArrayList<>();

    }
}

