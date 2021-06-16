package dev.brella.d4j.coroutines.rest.entity

import dev.brella.d4j.coroutines.common.await
import dev.brella.d4j.coroutines.common.awaitNone
import dev.brella.d4j.coroutines.common.awaitOrNull
import dev.brella.d4j.coroutines.json.buildChannelModifyRequest
import dev.brella.d4j.coroutines.json.buildEmbedData
import dev.brella.d4j.coroutines.json.buildGroupAddRecipientRequest
import dev.brella.d4j.coroutines.json.buildInviteCreateRequest
import dev.brella.d4j.coroutines.json.buildMessageCreateRequest
import dev.brella.d4j.coroutines.json.buildNewsChannelFollowRequest
import dev.brella.d4j.coroutines.json.buildPermissionsEditRequest
import discord4j.common.util.Snowflake
import discord4j.discordjson.json.*
import discord4j.rest.entity.RestChannel
import discord4j.rest.util.MultipartRequest
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.reactive.asFlow
import org.reactivestreams.Publisher
import reactor.core.publisher.Flux
import kotlin.system.measureTimeMillis

public suspend inline fun RestChannel.awaitData() = data.await()
public suspend inline fun RestChannel.awaitModify(request: ChannelModifyRequest, reason: String? = null) = modify(request, reason).await()
public suspend inline fun RestChannel.awaitModify(reason: String? = null, requestBuilder: ImmutableChannelModifyRequest.Builder.() -> Unit) = awaitModify(buildChannelModifyRequest(requestBuilder), reason)
public suspend inline fun RestChannel.awaitDelete(reason: String? = null) = delete(reason).awaitNone()
public inline fun RestChannel.messagesBeforeFlow(messageId: Snowflake) = getMessagesBefore(messageId).asFlow()
public inline fun RestChannel.messagesAfterFlow(messageId: Snowflake) = getMessagesAfter(messageId).asFlow()

public suspend inline fun RestChannel.awaitCreateMessage(request: MessageCreateRequest) = createMessage(request).await()
public suspend inline fun RestChannel.awaitCreateMessage(builder: ImmutableMessageCreateRequest.Builder.() -> Unit) = awaitCreateMessage(buildMessageCreateRequest(builder))
public suspend inline fun RestChannel.awaitCreateMessage(request: MultipartRequest) = createMessage(request).await()
public suspend inline fun RestChannel.awaitCreateMessage(content: String) = createMessage(content).await()
public suspend inline fun RestChannel.awaitCreateMessage(embed: EmbedData) = createMessage(embed).await()
public suspend inline fun RestChannel.awaitCreateEmbed(builder: ImmutableEmbedData.Builder.() -> Unit) = awaitCreateMessage(buildEmbedData(builder))

// :(
public inline fun RestChannel.bulkDeleteFlow(messageIds: Iterable<Snowflake>) = bulkDeleteFlow(Flux.fromIterable(messageIds))
public inline fun RestChannel.bulkDeleteFlow(messageIds: Publisher<Snowflake>) = bulkDelete(messageIds).asFlow()

public suspend inline fun RestChannel.awaitEditChannelPermissions(targetId: Snowflake, request: PermissionsEditRequest, reason: String? = null) = editChannelPermissions(targetId, request, reason).awaitNone()
public suspend inline fun RestChannel.awaitEditChannelPermissions(targetId: Snowflake, reason: String? = null, builder: ImmutablePermissionsEditRequest.Builder.() -> Unit) =
    awaitEditChannelPermissions(targetId, buildPermissionsEditRequest(builder), reason)

public inline fun RestChannel.invitesFlow() = invites.asFlow()
public suspend inline fun RestChannel.awaitCreateInvite(request: InviteCreateRequest, reason: String? = null) = createInvite(request, reason).await()
public suspend inline fun RestChannel.awaitCreateInvite(reason: String? = null, builder: ImmutableInviteCreateRequest.Builder.() -> Unit) = awaitCreateInvite(buildInviteCreateRequest(builder), reason)
public suspend inline fun RestChannel.awaitDeleteChannelPermission(targetId: Snowflake, reason: String? = null) = deleteChannelPermission(targetId, reason).awaitNone()

public suspend inline fun RestChannel.awaitFollow(request: NewsChannelFollowRequest) = follow(request).await()
public suspend inline fun RestChannel.awaitFollow(builder: ImmutableNewsChannelFollowRequest.Builder.() -> Unit) = awaitFollow(buildNewsChannelFollowRequest(builder))

public suspend inline fun RestChannel.awaitType() = type().awaitOrNull()
public suspend inline fun <T> RestChannel.typing(crossinline block: suspend RestChannel.() -> T): T =
    coroutineScope {
        val typing = launch {
            while (isActive) {
                delay(9_000 - measureTimeMillis { awaitType() })
            }
        }

        try {
            block()
        } finally {
            typing.cancelAndJoin()
        }
    }

public inline fun RestChannel.pinnedMessagesFlow() = pinnedMessages.asFlow()
public suspend inline fun RestChannel.awaitAddPinnedMessage(messageId: Snowflake) = addPinnedMessage(messageId).awaitNone()
public suspend inline fun RestChannel.awaitDeletePinnedMessage(messageId: Snowflake) = deletePinnedMessage(messageId).awaitNone()

public suspend inline fun RestChannel.awaitAddGroupDMRecipient(userId: Snowflake, request: GroupAddRecipientRequest) = addGroupDMRecipient(userId, request).awaitNone()
public suspend inline fun RestChannel.awaitAddGroupDMRecipient(userId: Snowflake, builder: ImmutableGroupAddRecipientRequest.Builder.() -> Unit) = awaitAddGroupDMRecipient(userId, buildGroupAddRecipientRequest(builder))
public suspend inline fun RestChannel.awaitDeleteGroupDMRecipient(userId: Snowflake) = deleteGroupDMRecipient(userId).awaitNone()

public inline fun RestChannel.webhooksFlow() = webhooks.asFlow()