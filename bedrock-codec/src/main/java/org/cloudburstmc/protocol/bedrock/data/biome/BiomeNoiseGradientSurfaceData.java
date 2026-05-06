package org.cloudburstmc.protocol.bedrock.data.biome;

import lombok.Value;

import java.util.List;

@Value
public class BiomeNoiseGradientSurfaceData {

    List<Integer> nonReplaceableBlocks;
    List<Integer> gradientBlocks;
    String noiseSeedString;
    int firstOctave;
    List<Float> amplitudes;
}
