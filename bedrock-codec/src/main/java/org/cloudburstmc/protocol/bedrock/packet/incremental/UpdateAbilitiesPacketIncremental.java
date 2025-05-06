package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.UpdateAbilitiesPacket;

@Getter
@Setter
public class UpdateAbilitiesPacketIncremental extends UpdateAbilitiesPacket {
    private int uniqueEntityIdIndex;
    private int uniqueEntityIdSize;

    private int playerPermissionIndex;
    private int playerPermissionSize;

    private int commandPermissionIndex;
    private int commandPermissionSize;

    private int abilityLayersIndex;
    private int abilityLayersSize;
}

