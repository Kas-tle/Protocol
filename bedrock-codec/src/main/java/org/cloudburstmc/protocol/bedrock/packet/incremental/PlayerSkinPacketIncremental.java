package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PlayerSkinPacket;

@Getter
@Setter
public class PlayerSkinPacketIncremental extends PlayerSkinPacket {
    private int uuidIndex;
    private int uuidSize;

    private int skinIndex;
    private int skinSize;

    private int newSkinNameIndex;
    private int newSkinNameSize;

    private int oldSkinNameIndex;
    private int oldSkinNameSize;

    private int trustedSkinIndex;
    private int trustedSkinSize;
}

