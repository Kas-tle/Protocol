package org.cloudburstmc.protocol.bedrock.data;

import lombok.Value;

@Value
public class EntityDiagnosticTimingInfo {
    String displayName;
    String entity;
    long timeInNs;
    byte percentOfTotal;
}
