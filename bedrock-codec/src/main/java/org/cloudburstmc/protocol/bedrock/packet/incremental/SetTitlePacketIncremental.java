package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SetTitlePacket;

@Getter
@Setter
public class SetTitlePacketIncremental extends SetTitlePacket {
    private int typeIndex;
    private int typeSize;

    private int textIndex;
    private int textSize;

    private int fadeInTimeIndex;
    private int fadeInTimeSize;

    private int stayTimeIndex;
    private int stayTimeSize;

    private int fadeOutTimeIndex;
    private int fadeOutTimeSize;

    private int xuidIndex;
    private int xuidSize;

    private int platformOnlineIdIndex;
    private int platformOnlineIdSize;

    private int filteredTitleTextIndex;
    private int filteredTitleTextSize;
}

