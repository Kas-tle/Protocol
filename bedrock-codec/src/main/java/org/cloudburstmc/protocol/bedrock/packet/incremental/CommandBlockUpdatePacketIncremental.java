package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CommandBlockUpdatePacket;

@Getter
@Setter
public class CommandBlockUpdatePacketIncremental extends CommandBlockUpdatePacket implements BedrockPacketIncremental {
    private int blockIndex;
    private int blockSize;

    private int blockPositionIndex;
    private int blockPositionSize;

    private int modeIndex;
    private int modeSize;

    private int redstoneModeIndex;
    private int redstoneModeSize;

    private int conditionalIndex;
    private int conditionalSize;

    private int minecartRuntimeEntityIdIndex;
    private int minecartRuntimeEntityIdSize;

    private int commandIndex;
    private int commandSize;

    private int lastOutputIndex;
    private int lastOutputSize;

    private int nameIndex;
    private int nameSize;

    private int filteredNameIndex;
    private int filteredNameSize;

    private int outputTrackedIndex;
    private int outputTrackedSize;

    private int tickDelayIndex;
    private int tickDelaySize;

    private int executingOnFirstTickIndex;
    private int executingOnFirstTickSize;
}

