package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ClientCheatAbilityPacket;

/**
 * @since v567
 */

/**
 * Deprecated since v594
 */
@Deprecated
@Getter
@Setter
public class ClientCheatAbilityPacketIncremental extends ClientCheatAbilityPacket implements BedrockPacketIncremental {
    private int uniqueEntityIdIndex;
    private int uniqueEntityIdSize;

    private int playerPermissionIndex;
    private int playerPermissionSize;

    private int commandPermissionIndex;
    private int commandPermissionSize;

    private int abilityLayersIndex;
    private int abilityLayersSize;
}

