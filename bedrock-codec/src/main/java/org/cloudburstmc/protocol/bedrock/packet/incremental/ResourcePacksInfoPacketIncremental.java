package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ResourcePacksInfoPacket;

import java.util.UUID;

@Getter
@Setter
public class ResourcePacksInfoPacketIncremental extends ResourcePacksInfoPacket {
    private int behaviorPackInfosIndex;
    private int behaviorPackInfosSize;

    private int resourcePackInfosIndex;
    private int resourcePackInfosSize;

    private int forcedToAcceptIndex;
    private int forcedToAcceptSize;

    private int hasAddonPacksIndex;
    private int hasAddonPacksSize;

    private int scriptingEnabledIndex;
    private int scriptingEnabledSize;

    private int forcingServerPacksEnabledIndex;
    private int forcingServerPacksEnabledSize;

    private int worldTemplateIdIndex;
    private int worldTemplateIdSize;

    private int worldTemplateVersionIndex;
    private int worldTemplateVersionSize;

    @Getter
    @Setter
    public static class Entry extends ResourcePacksInfoPacket.Entry {
        Entry(
                UUID packId,
                String packVersion,
                long packSize,
                String contentKey,
                String subPackName,
                String contentId,
                boolean scripting,
                boolean raytracingCapable,
                boolean addonPack,
                String cdnUrl
        ) {
            super(
                    packId,
                    packVersion,
                    packSize,
                    contentKey,
                    subPackName,
                    contentId,
                    scripting,
                    raytracingCapable,
                    addonPack,
                    cdnUrl
            );
        }

        private int packIdIndex;
        private int packIdSize;

        private int packVersionIndex;
        private int packVersionSize;

        private int packSizeIndex;
        private int packSizeSize;

        private int contentKeyIndex;
        private int contentKeySize;

        private int subPackNameIndex;
        private int subPackNameSize;

        private int contentIdIndex;
        private int contentIdSize;

        private int scriptingIndex;
        private int scriptingSize;

        private int raytracingCapableIndex;
        private int raytracingCapableSize;

        private int addonPackIndex;
        private int addonPackSize;

        private int cdnUrlIndex;
        private int cdnUrlSize;
    }
}

