package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PlayerVideoCapturePacket;

@Getter
@Setter
public class PlayerVideoCapturePacketIncremental extends PlayerVideoCapturePacket {
    private int captureActionIndex;
    private int captureActionSize;

    private int actionIndex;
    private int actionSize;

    private int frameRateIndex;
    private int frameRateSize;

    private int filePrefixIndex;
    private int filePrefixSize;
}