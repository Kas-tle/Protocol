package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.MobArmorEquipmentPacket;

@Getter
@Setter
public class MobArmorEquipmentPacketIncremental extends MobArmorEquipmentPacket implements BedrockPacketIncremental {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int helmetIndex;
    private int helmetSize;

    private int chestplateIndex;
    private int chestplateSize;
    
    private int leggingsIndex;
    private int leggingsSize;

    private int bootsIndex;
    private int bootsSize;

    private int bodyIndex;
    private int bodySize;
}

