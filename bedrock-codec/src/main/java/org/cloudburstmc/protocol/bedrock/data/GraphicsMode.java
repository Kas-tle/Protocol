package org.cloudburstmc.protocol.bedrock.data;
import org.cloudburstmc.protocol.common.util.NullableEnum;

public enum GraphicsMode {
    SIMPLE,
    FANCY,
    ADVANCED,
    RAY_TRACED;

    private static final GraphicsMode[] VALUES = values();

    public static GraphicsMode from(int id) {
        return NullableEnum.get(VALUES, id);
    }
}