package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.OnScreenTextureAnimationPacket;

@Getter
@Setter
public class OnScreenTextureAnimationPacketIncremental extends OnScreenTextureAnimationPacket {
    private int effectIdIndex;
    private int effectIdSize;
}

