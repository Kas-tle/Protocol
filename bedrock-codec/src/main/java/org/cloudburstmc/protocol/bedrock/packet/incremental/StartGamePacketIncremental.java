package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.StartGamePacket;

@Getter
@Setter
public class StartGamePacketIncremental extends StartGamePacket {
    private int gamerulesIndex;
    private int gamerulesSize;

    private int uniqueEntityIdIndex;
    private int uniqueEntityIdSize;

    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int playerGameTypeIndex;
    private int playerGameTypeSize;

    private int playerPositionIndex;
    private int playerPositionSize;

    private int rotationIndex;
    private int rotationSize;

    private int seedIndex;
    private int seedSize;

    private int spawnBiomeTypeIndex;
    private int spawnBiomeTypeSize;

    private int customBiomeNameIndex;
    private int customBiomeNameSize;

    private int dimensionIdIndex;
    private int dimensionIdSize;

    private int generatorIdIndex;
    private int generatorIdSize;

    private int levelGameTypeIndex;
    private int levelGameTypeSize;

    private int difficultyIndex;
    private int difficultySize;

    private int defaultSpawnIndex;
    private int defaultSpawnSize;

    private int achievementsDisabledIndex;
    private int achievementsDisabledSize;

    private int dayCycleStopTimeIndex;
    private int dayCycleStopTimeSize;

    private int eduEditionOffersIndex;
    private int eduEditionOffersSize;

    private int eduFeaturesEnabledIndex;
    private int eduFeaturesEnabledSize;

    private int educationProductionIdIndex;
    private int educationProductionIdSize;

    private int rainLevelIndex;
    private int rainLevelSize;

    private int lightningLevelIndex;
    private int lightningLevelSize;

    private int platformLockedContentConfirmedIndex;
    private int platformLockedContentConfirmedSize;

    private int multiplayerGameIndex;
    private int multiplayerGameSize;

    private int broadcastingToLanIndex;
    private int broadcastingToLanSize;

    private int xblBroadcastModeIndex;
    private int xblBroadcastModeSize;

    private int platformBroadcastModeIndex;
    private int platformBroadcastModeSize;

    private int commandsEnabledIndex;
    private int commandsEnabledSize;

    private int texturePacksRequiredIndex;
    private int texturePacksRequiredSize;

    private int experimentsIndex;
    private int experimentsSize;

    private int experimentsPreviouslyToggledIndex;
    private int experimentsPreviouslyToggledSize;

    private int bonusChestEnabledIndex;
    private int bonusChestEnabledSize;

    private int startingWithMapIndex;
    private int startingWithMapSize;

    private int trustingPlayersIndex;
    private int trustingPlayersSize;

    private int defaultPlayerPermissionIndex;
    private int defaultPlayerPermissionSize;

    private int serverChunkTickRangeIndex;
    private int serverChunkTickRangeSize;

    private int behaviorPackLockedIndex;
    private int behaviorPackLockedSize;

    private int resourcePackLockedIndex;
    private int resourcePackLockedSize;

    private int fromLockedWorldTemplateIndex;
    private int fromLockedWorldTemplateSize;

    private int usingMsaGamertagsOnlyIndex;
    private int usingMsaGamertagsOnlySize;

    private int fromWorldTemplateIndex;
    private int fromWorldTemplateSize;

    private int worldTemplateOptionLockedIndex;
    private int worldTemplateOptionLockedSize;

    private int onlySpawningV1VillagersIndex;
    private int onlySpawningV1VillagersSize;
    
    private int vanillaVersionIndex;
    private int vanillaVersionSize;

    private int limitedWorldWidthIndex;
    private int limitedWorldWidthSize;

    private int limitedWorldHeightIndex;
    private int limitedWorldHeightSize;

    private int netherTypeIndex;
    private int netherTypeSize;

    private int eduSharedUriResourceIndex;
    private int eduSharedUriResourceSize;

    private int forceExperimentalGameplayIndex;
    private int forceExperimentalGameplaySize;

    private int chatRestrictionLevelIndex;
    private int chatRestrictionLevelSize;

    private int disablingPlayerInteractionsIndex;
    private int disablingPlayerInteractionsSize;

    private int disablingPersonasIndex;
    private int disablingPersonasSize;

    private int disablingCustomSkinsIndex;
    private int disablingCustomSkinsSize;

    private int levelIdIndex;
    private int levelIdSize;

    private int levelNameIndex;
    private int levelNameSize;

    private int premiumWorldTemplateIdIndex;
    private int premiumWorldTemplateIdSize;

    private int trialIndex;
    private int trialSize;

    private int authoritativeMovementModeIndex;
    private int authoritativeMovementModeSize;

    private int rewindHistorySizeIndex;
    private int rewindHistorySizeSize;

    private int serverAuthoritativeBlockBreakingIndex;
    private int serverAuthoritativeBlockBreakingSize;

    private int currentTickIndex;
    private int currentTickSize;

    private int enchantmentSeedIndex;
    private int enchantmentSeedSize;

    private int blockPaletteIndex;
    private int blockPaletteSize;

    private int blockPropertiesIndex;
    private int blockPropertiesSize;

    private int itemDefinitionsIndex;
    private int itemDefinitionsSize;

    private int multiplayerCorrelationIdIndex;
    private int multiplayerCorrelationIdSize;

    private int inventoriesServerAuthoritativeIndex;
    private int inventoriesServerAuthoritativeSize;

    private int serverEngineIndex;
    private int serverEngineSize;

    private int playerPropertyDataIndex;
    private int playerPropertyDataSize;

    private int blockRegistryChecksumIndex;
    private int blockRegistryChecksumSize;

    private int worldTemplateIdIndex;
    private int worldTemplateIdSize;

    private int worldEditorIndex;
    private int worldEditorSize;

    private int clientSideGenerationEnabledIndex;
    private int clientSideGenerationEnabledSize;

    private int emoteChatMutedIndex;
    private int emoteChatMutedSize;

    private int blockNetworkIdsHashedIndex;
    private int blockNetworkIdsHashedSize;

    private int createdInEditorIndex;
    private int createdInEditorSize;

    private int exportedFromEditorIndex;
    private int exportedFromEditorSize;

    private int networkPermissionsIndex;
    private int networkPermissionsSize;

    private int hardcoreIndex;
    private int hardcoreSize;

    private int serverIdIndex;
    private int serverIdSize;

    private int worldIdIndex;
    private int worldIdSize;

    private int scenarioIdIndex;
    private int scenarioIdSize;
}

