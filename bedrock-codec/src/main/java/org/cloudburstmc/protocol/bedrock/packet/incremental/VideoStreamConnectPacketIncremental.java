package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.VideoStreamConnectPacket;

@Getter
@Setter
public class VideoStreamConnectPacketIncremental extends VideoStreamConnectPacket {
    private int addressIndex;
    private int addressSize;

    private int screenshotFrequencyIndex;
    private int screenshotFrequencySize;

    private int actionIndex;
    private int actionSize;

    private int widthIndex;
    private int widthSize;

    private int heightIndex;
    private int heightSize;
}

