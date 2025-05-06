package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SetMovementAuthorityPacket;

@Getter
@Setter
public class SetMovementAuthorityPacketIncremental extends SetMovementAuthorityPacket {
    private int movementModeIndex;
    private int movementModeSize;
}