package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ClientboundDebugRendererPacket;

@Getter
@Setter
public class ClientboundDebugRendererPacketIncremental extends ClientboundDebugRendererPacket implements BedrockPacketIncremental {
    private int debugMarkerTypeIndex;
    private int debugMarkerTypeSize;

    private int markerTextIndex;
    private int markerTextSize;

    private int markerPositionIndex;
    private int markerPositionSize;

    private int markerColorRedIndex;
    private int markerColorRedSize;

    private int markerColorGreenIndex;
    private int markerColorGreenSize;

    private int markerColorBlueIndex;
    private int markerColorBlueSize;

    private int markerColorAlphaIndex;
    private int markerColorAlphaSize;

    private int markerDurationIndex;
    private int markerDurationSize;
}

