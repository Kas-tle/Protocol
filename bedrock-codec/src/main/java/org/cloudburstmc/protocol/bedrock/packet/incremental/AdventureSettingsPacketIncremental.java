package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.AdventureSettingsPacket;
import org.cloudburstmc.protocol.bedrock.packet.UpdateAbilitiesPacket;
import org.cloudburstmc.protocol.bedrock.packet.UpdateAdventureSettingsPacket;

/**
 * @deprecated Removed in 1.19.30 (553). Use {@link UpdateAbilitiesPacket} and {@link UpdateAdventureSettingsPacket} instead.
 */
@Getter
@Setter
public class AdventureSettingsPacketIncremental extends AdventureSettingsPacket implements BedrockPacketIncremental {
    private int settingsIndex;
    private int settingsSize;

    private int commandPermissionIndex;
    private int commandPermissionSize;

    private int playerPermissionIndex;
    private int playerPermissionSize;

    private int uniqueEntityIdIndex;
    private int uniqueEntityIdSize;
}

