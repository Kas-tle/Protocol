package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SetDisplayObjectivePacket;

@Getter
@Setter
public class SetDisplayObjectivePacketIncremental extends SetDisplayObjectivePacket {
    private int displaySlotIndex;
    private int displaySlotSize;

    private int objectiveIdIndex;
    private int objectiveIdSize;
    
    private int displayNameIndex;
    private int displayNameSize;

    private int criteriaIndex;
    private int criteriaSize;

    private int sortOrderIndex;
    private int sortOrderSize;
}

