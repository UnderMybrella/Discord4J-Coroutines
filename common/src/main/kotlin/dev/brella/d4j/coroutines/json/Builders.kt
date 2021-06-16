package dev.brella.d4j.coroutines.json

import discord4j.discordjson.json.*

public inline fun buildActivityAssetsData(builder: ImmutableActivityAssetsData.Builder.() -> Unit): ActivityAssetsData =
    ImmutableActivityAssetsData.builder().apply(builder).build()

public inline fun buildActivityData(builder: ImmutableActivityData.Builder.() -> Unit) =
    ImmutableActivityData.builder().apply(builder).build()

public inline fun buildActivityEmojiData(builder: ImmutableActivityEmojiData.Builder.() -> Unit) =
    ImmutableActivityEmojiData.builder().apply(builder).build()

public inline fun buildActivityPartyData(builder: ImmutableActivityPartyData.Builder.() -> Unit) =
    ImmutableActivityPartyData.builder().apply(builder).build()

public inline fun buildActivitySecretsData(builder: ImmutableActivitySecretsData.Builder.() -> Unit) =
    ImmutableActivitySecretsData.builder().apply(builder).build()

public inline fun buildActivityTimestampsData(builder: ImmutableActivityTimestampsData.Builder.() -> Unit) =
    ImmutableActivityTimestampsData.builder().apply(builder).build()

public inline fun buildActivityUpdateRequest(builder: ImmutableActivityUpdateRequest.Builder.() -> Unit) =
    ImmutableActivityUpdateRequest.builder().apply(builder).build()

public inline fun buildAllowedMentionsData(builder: ImmutableAllowedMentionsData.Builder.() -> Unit) =
    ImmutableAllowedMentionsData.builder().apply(builder).build()

public inline fun buildApplicationCommandData(builder: ImmutableApplicationCommandData.Builder.() -> Unit) =
    ImmutableApplicationCommandData.builder().apply(builder).build()

public inline fun buildApplicationCommandInteractionData(builder: ImmutableApplicationCommandInteractionData.Builder.() -> Unit) =
    ImmutableApplicationCommandInteractionData.builder().apply(builder).build()

public inline fun buildApplicationCommandInteractionOptionData(builder: ImmutableApplicationCommandInteractionOptionData.Builder.() -> Unit) =
    ImmutableApplicationCommandInteractionOptionData.builder().apply(builder).build()

public inline fun buildApplicationCommandInteractionResolvedData(builder: ImmutableApplicationCommandInteractionResolvedData.Builder.() -> Unit) =
    ImmutableApplicationCommandInteractionResolvedData.builder().apply(builder).build()

public inline fun buildApplicationCommandOptionChoiceData(builder: ImmutableApplicationCommandOptionChoiceData.Builder.() -> Unit) =
    ImmutableApplicationCommandOptionChoiceData.builder().apply(builder).build()

public inline fun buildApplicationCommandOptionData(builder: ImmutableApplicationCommandOptionData.Builder.() -> Unit) =
    ImmutableApplicationCommandOptionData.builder().apply(builder).build()

public inline fun buildApplicationCommandPermissionsData(builder: ImmutableApplicationCommandPermissionsData.Builder.() -> Unit) =
    ImmutableApplicationCommandPermissionsData.builder().apply(builder).build()

public inline fun buildApplicationCommandRequest(builder: ImmutableApplicationCommandRequest.Builder.() -> Unit) =
    ImmutableApplicationCommandRequest.builder().apply(builder).build()

public inline fun buildApplicationInfoData(builder: ImmutableApplicationInfoData.Builder.() -> Unit) =
    ImmutableApplicationInfoData.builder().apply(builder).build()

public inline fun buildApplicationTeamData(builder: ImmutableApplicationTeamData.Builder.() -> Unit) =
    ImmutableApplicationTeamData.builder().apply(builder).build()

public inline fun buildApplicationTeamMemberData(builder: ImmutableApplicationTeamMemberData.Builder.() -> Unit) =
    ImmutableApplicationTeamMemberData.builder().apply(builder).build()

public inline fun buildAttachmentData(builder: ImmutableAttachmentData.Builder.() -> Unit) =
    ImmutableAttachmentData.builder().apply(builder).build()

public inline fun buildAuditEntryInfoData(builder: ImmutableAuditEntryInfoData.Builder.() -> Unit) =
    ImmutableAuditEntryInfoData.builder().apply(builder).build()

public inline fun buildAuditLogChangeData(builder: ImmutableAuditLogChangeData.Builder.() -> Unit) =
    ImmutableAuditLogChangeData.builder().apply(builder).build()

public inline fun buildAuditLogData(builder: ImmutableAuditLogData.Builder.() -> Unit) =
    ImmutableAuditLogData.builder().apply(builder).build()

public inline fun buildAuditLogEntryData(builder: ImmutableAuditLogEntryData.Builder.() -> Unit) =
    ImmutableAuditLogEntryData.builder().apply(builder).build()

//Ah, yes, the letter 'B'

public inline fun buildBanData(builder: ImmutableBanData.Builder.() -> Unit) =
    ImmutableBanData.builder().apply(builder).build()

public inline fun buildBulkDeleteRequest(builder: ImmutableBulkDeleteRequest.Builder.() -> Unit) =
    ImmutableBulkDeleteRequest.builder().apply(builder).build()

public inline fun buildChannelCreateRequest(builder: ImmutableChannelCreateRequest.Builder.() -> Unit) =
    ImmutableChannelCreateRequest.builder().apply(builder).build()

public inline fun buildChannelData(builder: ImmutableChannelData.Builder.() -> Unit) =
    ImmutableChannelData.builder().apply(builder).build()

public inline fun buildChannelMentionData(builder: ImmutableChannelMentionData.Builder.() -> Unit) =
    ImmutableChannelMentionData.builder().apply(builder).build()

public inline fun buildChannelModifyRequest(builder: ImmutableChannelModifyRequest.Builder.() -> Unit) =
    ImmutableChannelModifyRequest.builder().apply(builder).build()

public inline fun buildClientStatusData(builder: ImmutableClientStatusData.Builder.() -> Unit) =
    ImmutableClientStatusData.builder().apply(builder).build()

public inline fun buildConnectionData(builder: ImmutableConnectionData.Builder.() -> Unit) =
    ImmutableConnectionData.builder().apply(builder).build()

public inline fun buildDMCreateRequest(builder: ImmutableDMCreateRequest.Builder.() -> Unit) =
    ImmutableDMCreateRequest.builder().apply(builder).build()

public inline fun buildEmbedAuthorData(builder: ImmutableEmbedAuthorData.Builder.() -> Unit) =
    ImmutableEmbedAuthorData.builder().apply(builder).build()

public inline fun buildEmbedData(builder: ImmutableEmbedData.Builder.() -> Unit) =
    ImmutableEmbedData.builder().apply(builder).build()

public inline fun buildEmbedFieldData(builder: ImmutableEmbedFieldData.Builder.() -> Unit) =
    ImmutableEmbedFieldData.builder().apply(builder).build()

public inline fun buildEmbedFooterData(builder: ImmutableEmbedFooterData.Builder.() -> Unit) =
    ImmutableEmbedFooterData.builder().apply(builder).build()

public inline fun buildEmbedImageData(builder: ImmutableEmbedImageData.Builder.() -> Unit) =
    ImmutableEmbedImageData.builder().apply(builder).build()

public inline fun buildEmbedProviderData(builder: ImmutableEmbedProviderData.Builder.() -> Unit) =
    ImmutableEmbedProviderData.builder().apply(builder).build()

public inline fun buildEmbedThumbnailData(builder: ImmutableEmbedThumbnailData.Builder.() -> Unit) =
    ImmutableEmbedThumbnailData.builder().apply(builder).build()

public inline fun buildEmbedVideoData(builder: ImmutableEmbedVideoData.Builder.() -> Unit) =
    ImmutableEmbedVideoData.builder().apply(builder).build()

public inline fun buildEmojiData(builder: ImmutableEmojiData.Builder.() -> Unit) =
    ImmutableEmojiData.builder().apply(builder).build()

public inline fun buildFollowedChannelData(builder: ImmutableFollowedChannelData.Builder.() -> Unit) =
    ImmutableFollowedChannelData.builder().apply(builder).build()

public inline fun buildGatewayData(builder: ImmutableGatewayData.Builder.() -> Unit) =
    ImmutableGatewayData.builder().apply(builder).build()

public inline fun buildGroupAddRecipientRequest(builder: ImmutableGroupAddRecipientRequest.Builder.() -> Unit) =
    ImmutableGroupAddRecipientRequest.builder().apply(builder).build()

public inline fun buildGroupDMCreateRequest(builder: ImmutableGroupDMCreateRequest.Builder.() -> Unit) =
    ImmutableGroupDMCreateRequest.builder().apply(builder).build()

public inline fun buildGuildCreateData(builder: ImmutableGuildCreateData.Builder.() -> Unit) =
    ImmutableGuildCreateData.builder().apply(builder).build()

public inline fun buildGuildCreateRequest(builder: ImmutableGuildCreateRequest.Builder.() -> Unit) =
    ImmutableGuildCreateRequest.builder().apply(builder).build()

public inline fun buildGuildData(builder: ImmutableGuildData.Builder.() -> Unit) =
    ImmutableGuildData.builder().apply(builder).build()

@Deprecated("Renamed to GuildWidgetData", ReplaceWith("buildGuildWidgetData"))
public inline fun buildGuildEmbedData(builder: ImmutableGuildEmbedData.Builder.() -> Unit) =
    ImmutableGuildEmbedData.builder().apply(builder).build()

@Deprecated("Renamed to GuildWidgetModifyRequest", ReplaceWith("buildGuildWidgetModifyRequest"))
public inline fun buildGuildEmbedModifyRequest(builder: ImmutableGuildEmbedModifyRequest.Builder.() -> Unit): GuildEmbedModifyRequest =
    ImmutableGuildEmbedModifyRequest.builder().apply(builder).build()

public inline fun buildGuildEmojiCreateRequest(builder: ImmutableGuildEmojiCreateRequest.Builder.() -> Unit): GuildEmojiCreateRequest =
    ImmutableGuildEmojiCreateRequest.builder().apply(builder).build()

public inline fun buildGuildEmojiModifyRequest(builder: ImmutableGuildEmojiModifyRequest.Builder.() -> Unit): GuildEmojiModifyRequest =
    ImmutableGuildEmojiModifyRequest.builder().apply(builder).build()

public inline fun buildGuildMemberAddRequest(builder: ImmutableGuildMemberAddRequest.Builder.() -> Unit): GuildMemberAddRequest =
    ImmutableGuildMemberAddRequest.builder().apply(builder).build()

public inline fun buildGuildMemberModifyRequest(builder: ImmutableGuildMemberModifyRequest.Builder.() -> Unit): GuildMemberModifyRequest =
    ImmutableGuildMemberModifyRequest.builder().apply(builder).build()

public inline fun buildGuildModifyRequest(builder: ImmutableGuildModifyRequest.Builder.() -> Unit): GuildModifyRequest =
    ImmutableGuildModifyRequest.builder().apply(builder).build()

public inline fun buildGuildPreviewData(builder: ImmutableGuildPreviewData.Builder.() -> Unit): GuildPreviewData =
    ImmutableGuildPreviewData.builder().apply(builder).build()

public inline fun buildGuildUpdateData(builder: ImmutableGuildUpdateData.Builder.() -> Unit): GuildUpdateData =
    ImmutableGuildUpdateData.builder().apply(builder).build()

public inline fun buildGuildWidgetData(builder: ImmutableGuildWidgetData.Builder.() -> Unit): GuildWidgetData =
    ImmutableGuildWidgetData.builder().apply(builder).build()

public inline fun buildGuildWidgetModifyRequest(builder: ImmutableGuildWidgetModifyRequest.Builder.() -> Unit): GuildWidgetModifyRequest =
    ImmutableGuildWidgetModifyRequest.builder().apply(builder).build()

public inline fun buildHelloData(builder: ImmutableHelloData.Builder.() -> Unit): HelloData =
    ImmutableHelloData.builder().apply(builder).build()

//Immutables

public inline fun buildIntegrationAccountData(builder: ImmutableIntegrationAccountData.Builder.() -> Unit): IntegrationAccountData =
    ImmutableIntegrationAccountData.builder().apply(builder).build()

public inline fun buildIntegrationApplicationData(builder: ImmutableIntegrationApplicationData.Builder.() -> Unit): IntegrationApplicationData =
    ImmutableIntegrationApplicationData.builder().apply(builder).build()

public inline fun buildIntegrationCreateRequest(builder: ImmutableIntegrationCreateRequest.Builder.() -> Unit): IntegrationCreateRequest =
    ImmutableIntegrationCreateRequest.builder().apply(builder).build()

public inline fun buildIntegrationData(builder: ImmutableIntegrationData.Builder.() -> Unit): IntegrationData =
    ImmutableIntegrationData.builder().apply(builder).build()

public inline fun buildIntegrationModifyRequest(builder: ImmutableIntegrationModifyRequest.Builder.() -> Unit): IntegrationModifyRequest =
    ImmutableIntegrationModifyRequest.builder().apply(builder).build()

public inline fun buildInteractionApplicationCommandCallbackData(builder: ImmutableInteractionApplicationCommandCallbackData.Builder.() -> Unit): InteractionApplicationCommandCallbackData =
    ImmutableInteractionApplicationCommandCallbackData.builder().apply(builder).build()

public inline fun buildInteractionData(builder: ImmutableInteractionData.Builder.() -> Unit): InteractionData =
    ImmutableInteractionData.builder().apply(builder).build()

public inline fun buildInteractionResponseData(builder: ImmutableInteractionResponseData.Builder.() -> Unit): InteractionResponseData =
    ImmutableInteractionResponseData.builder().apply(builder).build()

public inline fun buildInviteCreateRequest(builder: ImmutableInviteCreateRequest.Builder.() -> Unit): InviteCreateRequest =
    ImmutableInviteCreateRequest.builder().apply(builder).build()

public inline fun buildInviteData(builder: ImmutableInviteData.Builder.() -> Unit): InviteData =
    ImmutableInviteData.builder().apply(builder).build()

public inline fun buildMemberData(builder: ImmutableMemberData.Builder.() -> Unit): MemberData =
    ImmutableMemberData.builder().apply(builder).build()

public inline fun buildMessageActivityData(builder: ImmutableMessageActivityData.Builder.() -> Unit): MessageActivityData =
    ImmutableMessageActivityData.builder().apply(builder).build()

public inline fun buildMessageApplicationData(builder: ImmutableMessageApplicationData.Builder.() -> Unit): MessageApplicationData =
    ImmutableMessageApplicationData.builder().apply(builder).build()

public inline fun buildMessageCreateRequest(builder: ImmutableMessageCreateRequest.Builder.() -> Unit): MessageCreateRequest =
    ImmutableMessageCreateRequest.builder().apply(builder).build()

public inline fun buildMessageData(builder: ImmutableMessageData.Builder.() -> Unit): MessageData =
    ImmutableMessageData.builder().apply(builder).build()

public inline fun buildMessageEditRequest(builder: ImmutableMessageEditRequest.Builder.() -> Unit): MessageEditRequest =
    ImmutableMessageEditRequest.builder().apply(builder).build()

public inline fun buildMessageInteractionData(builder: ImmutableMessageInteractionData.Builder.() -> Unit): MessageInteractionData =
    ImmutableMessageInteractionData.builder().apply(builder).build()

public inline fun buildMessageReferenceData(builder: ImmutableMessageReferenceData.Builder.() -> Unit): MessageReferenceData =
    ImmutableMessageReferenceData.builder().apply(builder).build()

public inline fun buildNewsChannelFollowRequest(builder: ImmutableNewsChannelFollowRequest.Builder.() -> Unit): NewsChannelFollowRequest =
    ImmutableNewsChannelFollowRequest.builder().apply(builder).build()

public inline fun buildNicknameModifyData(builder: ImmutableNicknameModifyData.Builder.() -> Unit): NicknameModifyData =
    ImmutableNicknameModifyData.builder().apply(builder).build()

public inline fun buildOverwriteData(builder: ImmutableOverwriteData.Builder.() -> Unit): OverwriteData =
    ImmutableOverwriteData.builder().apply(builder).build()

public inline fun buildPartialApplicationInfoData(builder: ImmutablePartialApplicationInfoData.Builder.() -> Unit): PartialApplicationInfoData =
    ImmutablePartialApplicationInfoData.builder().apply(builder).build()

public inline fun buildPartialChannelCreateRequest(builder: ImmutablePartialChannelCreateRequest.Builder.() -> Unit): PartialChannelCreateRequest =
    ImmutablePartialChannelCreateRequest.builder().apply(builder).build()

public inline fun buildPartialGuildData(builder: ImmutablePartialGuildData.Builder.() -> Unit): PartialGuildData =
    ImmutablePartialGuildData.builder().apply(builder).build()

public inline fun buildPartialMemberData(builder: ImmutablePartialMemberData.Builder.() -> Unit): PartialMemberData =
    ImmutablePartialMemberData.builder().apply(builder).build()

public inline fun buildPartialMessageData(builder: ImmutablePartialMessageData.Builder.() -> Unit): PartialMessageData =
    ImmutablePartialMessageData.builder().apply(builder).build()

public inline fun buildPartialUserData(builder: ImmutablePartialUserData.Builder.() -> Unit): PartialUserData =
    ImmutablePartialUserData.builder().apply(builder).build()

public inline fun buildPermissionsEditRequest(builder: ImmutablePermissionsEditRequest.Builder.() -> Unit): PermissionsEditRequest =
    ImmutablePermissionsEditRequest.builder().apply(builder).build()

public inline fun buildPositionModifyRequest(builder: ImmutablePositionModifyRequest.Builder.() -> Unit): PositionModifyRequest =
    ImmutablePositionModifyRequest.builder().apply(builder).build()

public inline fun buildPresenceData(builder: ImmutablePresenceData.Builder.() -> Unit): PresenceData =
    ImmutablePresenceData.builder().apply(builder).build()

public inline fun buildPruneData(builder: ImmutablePruneData.Builder.() -> Unit): PruneData =
    ImmutablePruneData.builder().apply(builder).build()

public inline fun buildReactionData(builder: ImmutableReactionData.Builder.() -> Unit): ReactionData =
    ImmutableReactionData.builder().apply(builder).build()

public inline fun buildReadyData(builder: ImmutableReadyData.Builder.() -> Unit): ReadyData =
    ImmutableReadyData.builder().apply(builder).build()

public inline fun buildRegionData(builder: ImmutableRegionData.Builder.() -> Unit): RegionData =
    ImmutableRegionData.builder().apply(builder).build()

public inline fun buildResolvedChannelData(builder: ImmutableResolvedChannelData.Builder.() -> Unit): ResolvedChannelData =
    ImmutableResolvedChannelData.builder().apply(builder).build()

public inline fun buildResolvedMemberData(builder: ImmutableResolvedMemberData.Builder.() -> Unit): ResolvedMemberData =
    ImmutableResolvedMemberData.builder().apply(builder).build()

public inline fun buildRoleCreateRequest(builder: ImmutableRoleCreateRequest.Builder.() -> Unit): RoleCreateRequest =
    ImmutableRoleCreateRequest.builder().apply(builder).build()

public inline fun buildRoleData(builder: ImmutableRoleData.Builder.() -> Unit): RoleData =
    ImmutableRoleData.builder().apply(builder).build()

public inline fun buildRoleModifyRequest(builder: ImmutableRoleModifyRequest.Builder.() -> Unit): RoleModifyRequest =
    ImmutableRoleModifyRequest.builder().apply(builder).build()

public inline fun buildRoleTagsData(builder: ImmutableRoleTagsData.Builder.() -> Unit): RoleTagsData =
    ImmutableRoleTagsData.builder().apply(builder).build()

public inline fun buildRoleTemplateData(builder: ImmutableRoleTemplateData.Builder.() -> Unit): RoleTemplateData =
    ImmutableRoleTemplateData.builder().apply(builder).build()

public inline fun buildSerializedSourceGuildData(builder: ImmutableSerializedSourceGuildData.Builder.() -> Unit): SerializedSourceGuildData =
    ImmutableSerializedSourceGuildData.builder().apply(builder).build()

public inline fun buildSessionStartLimitData(builder: ImmutableSessionStartLimitData.Builder.() -> Unit): SessionStartLimitData =
    ImmutableSessionStartLimitData.builder().apply(builder).build()

public inline fun buildStickerData(builder: ImmutableStickerData.Builder.() -> Unit): StickerData =
    ImmutableStickerData.builder().apply(builder).build()

public inline fun buildSuppressEmbedsRequest(builder: ImmutableSuppressEmbedsRequest.Builder.() -> Unit): SuppressEmbedsRequest =
    ImmutableSuppressEmbedsRequest.builder().apply(builder).build()

public inline fun buildTemplateCreateGuildRequest(builder: ImmutableTemplateCreateGuildRequest.Builder.() -> Unit): TemplateCreateGuildRequest =
    ImmutableTemplateCreateGuildRequest.builder().apply(builder).build()

public inline fun buildTemplateCreateRequest(builder: ImmutableTemplateCreateRequest.Builder.() -> Unit): TemplateCreateRequest =
    ImmutableTemplateCreateRequest.builder().apply(builder).build()

public inline fun buildTemplateData(builder: ImmutableTemplateData.Builder.() -> Unit): TemplateData =
    ImmutableTemplateData.builder().apply(builder).build()

public inline fun buildTemplateModifyRequest(builder: ImmutableTemplateModifyRequest.Builder.() -> Unit): TemplateModifyRequest =
    ImmutableTemplateModifyRequest.builder().apply(builder).build()

public inline fun buildUnavailableGuildCreateData(builder: ImmutableUnavailableGuildCreateData.Builder.() -> Unit): UnavailableGuildCreateData =
    ImmutableUnavailableGuildCreateData.builder().apply(builder).build()

public inline fun buildUnavailableGuildData(builder: ImmutableUnavailableGuildData.Builder.() -> Unit): UnavailableGuildData =
    ImmutableUnavailableGuildData.builder().apply(builder).build()

public inline fun buildUpdateOthersVoiceStateRequest(builder: ImmutableUpdateOthersVoiceStateRequest.Builder.() -> Unit): UpdateOthersVoiceStateRequest =
    ImmutableUpdateOthersVoiceStateRequest.builder().apply(builder).build()

public inline fun buildUpdateSelfVoiceStateRequest(builder: ImmutableUpdateSelfVoiceStateRequest.Builder.() -> Unit): UpdateSelfVoiceStateRequest =
    ImmutableUpdateSelfVoiceStateRequest.builder().apply(builder).build()

public inline fun buildUserData(builder: ImmutableUserData.Builder.() -> Unit): UserData =
    ImmutableUserData.builder().apply(builder).build()

public inline fun buildUserGuildData(builder: ImmutableUserGuildData.Builder.() -> Unit): UserGuildData =
    ImmutableUserGuildData.builder().apply(builder).build()

public inline fun buildUserModifyRequest(builder: ImmutableUserModifyRequest.Builder.() -> Unit): UserModifyRequest =
    ImmutableUserModifyRequest.builder().apply(builder).build()

public inline fun buildUserWithMemberData(builder: ImmutableUserWithMemberData.Builder.() -> Unit): UserWithMemberData =
    ImmutableUserWithMemberData.builder().apply(builder).build()

public inline fun buildVoiceStateData(builder: ImmutableVoiceStateData.Builder.() -> Unit): VoiceStateData =
    ImmutableVoiceStateData.builder().apply(builder).build()

public inline fun buildWebhookCreateRequest(builder: ImmutableWebhookCreateRequest.Builder.() -> Unit): WebhookCreateRequest =
    ImmutableWebhookCreateRequest.builder().apply(builder).build()

public inline fun buildWebhookData(builder: ImmutableWebhookData.Builder.() -> Unit): WebhookData =
    ImmutableWebhookData.builder().apply(builder).build()

public inline fun buildWebhookExecuteRequest(builder: ImmutableWebhookExecuteRequest.Builder.() -> Unit): WebhookExecuteRequest =
    ImmutableWebhookExecuteRequest.builder().apply(builder).build()

public inline fun buildWebhookMessageEditRequest(builder: ImmutableWebhookMessageEditRequest.Builder.() -> Unit): WebhookMessageEditRequest =
    ImmutableWebhookMessageEditRequest.builder().apply(builder).build()

public inline fun buildWebhookModifyRequest(builder: ImmutableWebhookModifyRequest.Builder.() -> Unit): WebhookModifyRequest =
    ImmutableWebhookModifyRequest.builder().apply(builder).build()

public inline fun buildWebhookModifyWithTokenRequest(builder: ImmutableWebhookModifyWithTokenRequest.Builder.() -> Unit): WebhookModifyWithTokenRequest =
    ImmutableWebhookModifyWithTokenRequest.builder().apply(builder).build()