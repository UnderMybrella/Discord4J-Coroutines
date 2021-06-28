package dev.brella.d4j.coroutines.rest.entity

import dev.brella.d4j.coroutines.common.await
import dev.brella.d4j.coroutines.common.awaitNone
import dev.brella.d4j.coroutines.common.awaitOrNull
import dev.brella.d4j.coroutines.json.*
import discord4j.common.util.Snowflake
import discord4j.discordjson.json.*
import discord4j.discordjson.json.gateway.ImmutableGuildMemberAdd
import discord4j.rest.entity.RestGuild
import kotlinx.coroutines.reactive.asFlow

public suspend inline fun RestGuild.awaitData(withCounts: Boolean? = null) = getData(withCounts).await()
public suspend inline fun RestGuild.awaitModify(request: GuildModifyRequest, reason: String? = null) = modify(request, reason).await()
public suspend inline fun RestGuild.awaitModify(reason: String? = null, builder: ImmutableGuildModifyRequest.Builder.() -> Unit) = awaitModify(buildGuildModifyRequest(builder), reason)

public suspend inline fun RestGuild.awaitDelete() = delete().awaitNone()
public inline fun RestGuild.channelsFlow() = channels.asFlow()
public suspend inline fun RestGuild.awaitCreateChannel(request: ChannelCreateRequest, reason: String? = null) = createChannel(request, reason).await()
public suspend inline fun RestGuild.awaitCreateChannel(reason: String? = null, builder: ImmutableChannelCreateRequest.Builder.() -> Unit) = awaitCreateChannel(buildChannelCreateRequest(builder), reason)

public inline fun RestGuild.modifyChannelPositionsFlow(requests: List<PositionModifyRequest>) = modifyChannelPositions(requests)
public inline fun RestGuild.modifyChannelPositionsFlow(vararg requests: ImmutablePositionModifyRequest.Builder.() -> Unit) = modifyChannelPositionsFlow(requests.map(::buildPositionModifyRequest))

public suspend inline fun RestGuild.awaitMember(userId: Snowflake) = getMember(userId).await()
public suspend inline fun RestGuild.awaitSelfMember() = selfMember.await()
public inline fun RestGuild.membersFlow() = members.asFlow()
public suspend inline fun RestGuild.awaitAddMember(userId: Snowflake, request: GuildMemberAddRequest) = addMember(userId, request).await()
public suspend inline fun RestGuild.awaitAddMember(userId: Snowflake, builder: ImmutableGuildMemberAddRequest.Builder.() -> Unit) = awaitAddMember(userId, buildGuildMemberAddRequest(builder))

public suspend inline fun RestGuild.awaitModifyMember(userId: Snowflake, request: GuildMemberModifyRequest, reason: String? = null) = modifyMember(userId, request, reason).awaitNone()
public suspend inline fun RestGuild.awaitModifyMember(userId: Snowflake, reason: String? = null, builder: ImmutableGuildMemberModifyRequest.Builder.() -> Unit) = awaitModifyMember(userId, buildGuildMemberModifyRequest(builder), reason)
public suspend inline fun RestGuild.awaitModifyOwnNickname(request: NicknameModifyData) = modifyOwnNickname(request).await()
public suspend inline fun RestGuild.awaitModifyOwnNickname(builder: ImmutableNicknameModifyData.Builder.() -> Unit) = awaitModifyOwnNickname(buildNicknameModifyData(builder))
public suspend inline fun RestGuild.awaitAddMemberRole(userId: Snowflake, roleId: Snowflake, reason: String? = null) = addMemberRole(userId, roleId, reason).awaitNone()
public suspend inline fun RestGuild.awaitRemoveMemberRole(userId: Snowflake, roleId: Snowflake, reason: String? = null) = removeMemberRole(userId, roleId, reason).awaitNone()
public suspend inline fun RestGuild.awaitRemoveGuildMember(userId: Snowflake, reason: String? = null) = removeGuildMember(userId, reason).awaitNone()
public inline fun RestGuild.bansFlow() = bans.asFlow()
public suspend inline fun RestGuild.awaitGetBan(userId: Snowflake) = getBan(userId).await()
public suspend inline fun RestGuild.awaitCreateBan(userId: Snowflake, deleteMessageDays: Int? = null, reason: String? = null) = createBan(userId, deleteMessageDays, reason).await()
public suspend inline fun RestGuild.awaitRemoveBan(userId: Snowflake, reason: String?) = removeGuildBan(userId, reason).awaitNone()
public inline fun RestGuild.rolesFlow() = roles.asFlow()
public suspend inline fun RestGuild.awaitCreateRole(request: RoleCreateRequest, reason: String? = null) = createRole(request, reason).await()
public suspend inline fun RestGuild.awaitCreateRole(reason: String? = null, builder: ImmutableRoleCreateRequest.Builder.() -> Unit) = awaitCreateRole(buildRoleCreateRequest(builder), reason)
public inline fun RestGuild.modifyRolePositionsFlow(requests: List<PositionModifyRequest>) = modifyRolePositions(requests).asFlow()
public inline fun RestGuild.modifyRolePositionsFlow(vararg requests: ImmutablePositionModifyRequest.Builder.() -> Unit) = modifyRolePositionsFlow(requests.map(::buildPositionModifyRequest))
public suspend inline fun RestGuild.awaitModifyRole(roleId: Snowflake, request: RoleModifyRequest, reason: String? = null) = modifyRole(roleId, request, reason).await()
public suspend inline fun RestGuild.awaitModifyRole(roleId: Snowflake, reason: String? = null, builder: ImmutableRoleModifyRequest.Builder.() -> Unit) = awaitModifyRole(roleId, buildRoleModifyRequest(builder), reason)
public suspend inline fun RestGuild.awaitDeleteRole(roleId: Snowflake, reason: String? = null) = deleteRole(roleId, reason).awaitNone()
public suspend inline fun RestGuild.awaitPruneCount(days: Int? = null) = getPruneCount(days).await()
public suspend inline fun RestGuild.awaitBeginGuildPrune(days: Int? = null, computePruneCount: Boolean? = null, reason: String? = null) =
    beginGuildPrune(days, computePruneCount, reason).await()
public inline fun RestGuild.regionsFlow() = regions.asFlow()
public inline fun RestGuild.invitesFlow() = invites.asFlow()
public inline fun RestGuild.integrationsFlow() = integrations.asFlow()
public suspend inline fun RestGuild.awaitCreateIntegration(request: IntegrationCreateRequest) = createIntegration(request).awaitNone()
public suspend inline fun RestGuild.awaitCreateIntegration(builder: ImmutableIntegrationCreateRequest.Builder.() -> Unit) = awaitCreateIntegration(buildIntegrationCreateRequest(builder))
public suspend inline fun RestGuild.awaitModifyIntegration(integrationId: Snowflake, request: IntegrationModifyRequest) = modifyIntegration(integrationId, request).awaitNone()
public suspend inline fun RestGuild.awaitModifyIntegration(integrationId: Snowflake, builder: ImmutableIntegrationModifyRequest.Builder.() -> Unit) = awaitModifyIntegration(integrationId, buildIntegrationModifyRequest(builder))
public suspend inline fun RestGuild.awaitDeleteIntegration(integrationId: Snowflake) = deleteIntegration(integrationId).awaitNone()
public suspend inline fun RestGuild.awaitSyncIntegration(integrationId: Snowflake) = syncIntegration(integrationId).awaitNone()
public suspend inline fun RestGuild.awaitGetWidget() = widget.await()
public suspend inline fun RestGuild.awaitModifyWidget(request: GuildWidgetModifyRequest) = modifyWidget(request).await()
public suspend inline fun RestGuild.awaitModifyWidget(builder: ImmutableGuildWidgetModifyRequest.Builder.() -> Unit) = awaitModifyWidget(buildGuildWidgetModifyRequest(builder))

//TODO Add Get Guild Vanity URL
//TODO Add Get Guild Widget Image
//TODO Add Modify Guild Emoji

public inline fun RestGuild.emojisFlow() = emojis.asFlow()
public suspend inline fun RestGuild.awaitCreateEmoji(request: GuildEmojiCreateRequest, reason: String? = null) = createEmoji(request, reason).await()
public suspend inline fun RestGuild.awaitCreateEmoji(reason: String? = null, builder: ImmutableGuildEmojiCreateRequest.Builder.() -> Unit) = awaitCreateEmoji(buildGuildEmojiCreateRequest(builder), reason)

public inline fun RestGuild.webhooksFlow() = webhooks.asFlow()
public suspend inline fun RestGuild.awaitPreview() = preview.await()
public inline fun RestGuild.templatesFlow() = templates.asFlow()