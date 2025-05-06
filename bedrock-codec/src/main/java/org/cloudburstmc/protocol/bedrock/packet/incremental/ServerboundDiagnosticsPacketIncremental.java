package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ServerboundDiagnosticsPacket;

@Getter
@Setter
public class ServerboundDiagnosticsPacketIncremental extends ServerboundDiagnosticsPacket{
    private int avgFpsIndex;
    private int avgFpsSize;

    private int avgServerSimTickTimeMSIndex;
    private int avgServerSimTickTimeMSSize;

    private int avgClientSimTickTimeMSIndex;
    private int avgClientSimTickTimeMSSize;

    private int avgBeginFrameTimeMSIndex;
    private int avgBeginFrameTimeMSSize;

    private int avgInputTimeMSIndex;
    private int avgInputTimeMSSize;

    private int avgRenderTimeMSIndex;
    private int avgRenderTimeMSSize;

    private int avgEndFrameTimeMSIndex;
    private int avgEndFrameTimeMSSize;

    private int avgRemainderTimePercentIndex;
    private int avgRemainderTimePercentSize;

    private int avgUnaccountedTimePercentIndex;
    private int avgUnaccountedTimePercentSize;
}
