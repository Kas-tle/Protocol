package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ServerboundLoadingScreenPacket;

@Getter
@Setter
public class ServerboundLoadingScreenPacketIncremental extends ServerboundLoadingScreenPacket {
    private int typeIndex;
    private int typeSize;

    private int loadingScreenIdIndex;
    private int loadingScreenIdSize;
}
