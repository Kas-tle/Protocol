package org.cloudburstmc.protocol.bedrock.data.inventory.crafting;

import org.cloudburstmc.protocol.common.util.NullableEnum;

public enum CraftingDataType {
    SHAPELESS,
    SHAPED,
    FURNACE,
    FURNACE_DATA,
    MULTI,
    SHULKER_BOX, // USER_DATA_SHAPELESS
    SHAPELESS_CHEMISTRY,
    SHAPED_CHEMISTRY,
    /**
     * @since v567
     */
    SMITHING_TRANSFORM,
    /**
     * @since v582
     */
    SMITHING_TRIM;

    private static final CraftingDataType[] VALUES = values();

    public static CraftingDataType byId(int id) {
        return NullableEnum.get(VALUES, id);
    }
}
