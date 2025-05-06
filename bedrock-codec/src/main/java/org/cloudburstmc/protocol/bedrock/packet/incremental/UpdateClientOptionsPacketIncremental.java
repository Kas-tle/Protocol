package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.UpdateClientOptionsPacket;

@Getter
@Setter
public class UpdateClientOptionsPacketIncremental extends UpdateClientOptionsPacket {
    private int graphicsModeIndex;
    private int graphicsModeSize;
}
