package dev.negative.library.api.module.impl.npc;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bukkit.Location;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created By LeandroSSJ
 * Created on 06/04/2022
 */
@Setter
@Getter
@Accessors(chain = true)
public class NPC {

    private final UUID uuid;
    private final String name;

    private int entityId;

    private Location location;
    private String skin;


    public NPC(String name, Location location) {
        this.uuid = new UUID(new Random().nextLong(), 0);
        this.entityId = Integer.MAX_VALUE - NPCModule.INSTANCE.getNpcStorage().size();

        this.name = name;
        this.location = location;
    }

}
