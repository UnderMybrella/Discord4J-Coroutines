package dev.brella.d4j.coroutines.rest.entity

import dev.brella.d4j.coroutines.common.await
import dev.brella.d4j.coroutines.common.awaitNone
import dev.brella.d4j.coroutines.common.awaitOrNull
import dev.brella.d4j.coroutines.json.buildGuildEmojiModifyRequest
import discord4j.discordjson.json.GuildEmojiModifyRequest
import discord4j.discordjson.json.ImmutableGuildEmojiModifyRequest
import discord4j.rest.entity.RestEmoji

public suspend inline fun RestEmoji.awaitData() = data.await()
public suspend inline fun RestEmoji.awaitModify(request: GuildEmojiModifyRequest, reason: String? = null) = modify(request, reason).await()
public suspend inline fun RestEmoji.awaitModify(reason: String? = null, builder: ImmutableGuildEmojiModifyRequest.Builder.() -> Unit) = awaitModify(buildGuildEmojiModifyRequest(builder), reason)
public suspend inline fun RestEmoji.awaitDelete(reason: String? = null) = delete(reason).awaitNone()