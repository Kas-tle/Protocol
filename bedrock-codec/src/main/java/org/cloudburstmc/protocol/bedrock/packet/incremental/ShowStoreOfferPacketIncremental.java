package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ShowStoreOfferPacket;

@Getter
@Setter
public class ShowStoreOfferPacketIncremental extends ShowStoreOfferPacket {
    private int offerIdIndex;
    private int offerIdSize;

    private int shownToAllIndex;
    private int shownToAllSize;

    private int redirectTypeIndex;
    private int redirectTypeSize;
}

