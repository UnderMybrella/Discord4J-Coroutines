package dev.brella.d4j.coroutines.rest.service

import dev.brella.d4j.coroutines.common.await
import dev.brella.d4j.coroutines.common.awaitNone
import dev.brella.d4j.coroutines.json.buildWebhookCreateRequest
import dev.brella.d4j.coroutines.json.buildWebhookExecuteRequest
import dev.brella.d4j.coroutines.json.buildWebhookMessageEditRequest
import dev.brella.d4j.coroutines.json.buildWebhookModifyRequest
import discord4j.discordjson.json.ImmutableWebhookCreateRequest
import discord4j.discordjson.json.ImmutableWebhookExecuteRequest
import discord4j.discordjson.json.ImmutableWebhookMessageEditRequest
import discord4j.discordjson.json.ImmutableWebhookModifyRequest
import discord4j.discordjson.json.MessageData
import discord4j.discordjson.json.WebhookCreateRequest
import discord4j.discordjson.json.WebhookMessageEditRequest
import discord4j.discordjson.json.WebhookModifyRequest
import discord4j.rest.service.WebhookService
import discord4j.rest.util.WebhookMultipartRequest
import kotlinx.coroutines.reactive.asFlow

public suspend inline fun WebhookService.awaitCreateWebhook(channelId: Long, request: WebhookCreateRequest, reason: String? = null) =
    createWebhook(channelId, request, reason).await()

public suspend inline fun WebhookService.awaitCreateWebhook(channelId: Long, reason: String? = null, builder: ImmutableWebhookCreateRequest.Builder.() -> Unit) =
    createWebhook(channelId, buildWebhookCreateRequest(builder), reason).await()

public inline fun WebhookService.channelWebhooksFlow(channelId: Long) =
    getChannelWebhooks(channelId).asFlow()

public inline fun WebhookService.guildWebhooksFlow(guildId: Long) =
    getGuildWebhooks(guildId).asFlow()

public suspend inline fun WebhookService.awaitGetWebhook(webhookId: Long) = getWebhook(webhookId).await()
public suspend inline fun WebhookService.awaitModifyWebhook(webhookId: Long, request: WebhookModifyRequest, reason: String? = null) = modifyWebhook(webhookId, request, reason).await()
public suspend inline fun WebhookService.awaitModifyWebhook(webhookId: Long, reason: String? = null, builder: ImmutableWebhookModifyRequest.Builder.() -> Unit) = awaitModifyWebhook(webhookId, buildWebhookModifyRequest(builder), reason)
public suspend inline fun WebhookService.awaitDeleteWebhook(webhookId: Long, reason: String? = null) = deleteWebhook(webhookId, reason).awaitNone()
public suspend inline fun WebhookService.awaitDeleteWebhookMessage(webhookId: Long, token: String, messageId: String) = deleteWebhookMessage(webhookId, token, messageId).awaitNone()

public suspend inline fun WebhookService.awaitExecuteWebhook(webhookId: Long, token: String, wait: Boolean = true, request: WebhookMultipartRequest) = executeWebhook(webhookId, token, wait, request).await()
public suspend inline fun WebhookService.awaitExecuteWebhook(webhookId: Long, token: String, wait: Boolean = true, builder: ImmutableWebhookExecuteRequest.Builder.() -> Unit) =
    awaitExecuteWebhook(webhookId, token, wait, WebhookMultipartRequest(buildWebhookExecuteRequest(builder)))

public inline fun String.getWebhookIdFromUrl() = substringBeforeLast('/').substringAfterLast('/').toULong().toLong()
public inline fun String.getWebhookTokenFromUrl() = substringAfterLast('/')

public suspend inline fun WebhookService.awaitExecuteWebhook(webhookUrl: String, wait: Boolean = true, request: WebhookMultipartRequest) =
    awaitExecuteWebhook(webhookUrl.getWebhookIdFromUrl(), webhookUrl.getWebhookTokenFromUrl(), wait, request)

public suspend inline fun WebhookService.awaitExecuteWebhook(webhookUrl: String, wait: Boolean = true, builder: ImmutableWebhookExecuteRequest.Builder.() -> Unit) =
    awaitExecuteWebhook(webhookUrl.getWebhookIdFromUrl(), webhookUrl.getWebhookTokenFromUrl(), wait, builder)

public suspend inline fun WebhookService.awaitModifyWebhookMessage(webhookId: Long, token: String, messageId: String, request: WebhookMessageEditRequest) = modifyWebhookMessage(webhookId, token, messageId, request).await()
public suspend inline fun WebhookService.awaitModifyWebhookMessage(webhookId: Long, token: String, messageId: String, builder: ImmutableWebhookMessageEditRequest.Builder.() -> Unit) =
    awaitModifyWebhookMessage(webhookId, token, messageId, buildWebhookMessageEditRequest(builder))

public suspend inline fun WebhookService.awaitModifyWebhookMessage(webhookUrl: String, messageId: String, request: WebhookMessageEditRequest) =
    awaitModifyWebhookMessage(webhookUrl.getWebhookIdFromUrl(), webhookUrl.getWebhookTokenFromUrl(), messageId, request)

public suspend inline fun WebhookService.awaitModifyWebhookMessage(webhookUrl: String, messageId: String, builder: ImmutableWebhookMessageEditRequest.Builder.() -> Unit) =
    awaitModifyWebhookMessage(webhookUrl.getWebhookIdFromUrl(), webhookUrl.getWebhookTokenFromUrl(), messageId, builder)