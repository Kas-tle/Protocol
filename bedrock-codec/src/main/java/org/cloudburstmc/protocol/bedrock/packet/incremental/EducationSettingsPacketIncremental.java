package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.EducationSettingsPacket;

@Getter
@Setter
public class EducationSettingsPacketIncremental extends EducationSettingsPacket implements BedrockPacketIncremental {
    private int codeBuilderUriIndex;
    private int codeBuilderUriSize;

    private int codeBuilderTitleIndex;
    private int codeBuilderTitleSize;

    private int canResizeCodeBuilderIndex;
    private int canResizeCodeBuilderSize;

    private int disableLegacyTitleIndex;
    private int disableLegacyTitleSize;

    private int postProcessFilterIndex;
    private int postProcessFilterSize;

    private int screenshotBorderPathIndex;
    private int screenshotBorderPathSize;

    private int entityCapabilitiesIndex;
    private int entityCapabilitiesSize;

    private int overrideUriIndex;
    private int overrideUriSize;

    private int quizAttachedIndex;
    private int quizAttachedSize;

    private int externalLinkSettingsIndex;
    private int externalLinkSettingsSize;
}
