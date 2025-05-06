package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.NpcDialoguePacket;

@Getter
@Setter
public class NpcDialoguePacketIncremental extends NpcDialoguePacket {
    private int uniqueEntityIdIndex;
    private int uniqueEntityIdSize;

    private int actionIndex;
    private int actionSize;

    private int dialogueIndex;
    private int dialogueSize;

    private int sceneNameIndex;
    private int sceneNameSize;

    private int npcNameIndex;
    private int npcNameSize;

    private int actionJsonIndex;
    private int actionJsonSize;
}

