package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.NetworkSettingsPacket;

@Getter
@Setter
public class NetworkSettingsPacketIncremental extends NetworkSettingsPacket {
    private int compressionThresholdIndex;
    private int compressionThresholdSize;

    private int compressionAlgorithmIndex;
    private int compressionAlgorithmSize;

    private int clientThrottleEnabledIndex;
    private int clientThrottleEnabledSize;

    private int clientThrottleThresholdIndex;
    private int clientThrottleThresholdSize;

    private int clientThrottleScalarIndex;
    private int clientThrottleScalarSize;
}

