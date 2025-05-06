package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SetLocalPlayerAsInitializedPacket;

@Getter
@Setter
public class SetLocalPlayerAsInitializedPacketIncremental extends SetLocalPlayerAsInitializedPacket {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;
}

