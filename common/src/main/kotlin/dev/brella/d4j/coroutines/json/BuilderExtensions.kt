package dev.brella.d4j.coroutines.json

import discord4j.discordjson.json.ImmutableEmbedAuthorData
import discord4j.discordjson.json.ImmutableEmbedData
import discord4j.discordjson.json.ImmutableEmbedFieldData
import discord4j.discordjson.json.ImmutableEmbedFooterData
import discord4j.discordjson.json.ImmutableEmbedImageData
import discord4j.discordjson.json.ImmutableEmbedProviderData
import discord4j.discordjson.json.ImmutableEmbedThumbnailData
import discord4j.discordjson.json.ImmutableEmbedVideoData
import discord4j.discordjson.json.ImmutableWebhookExecuteRequest

public inline fun ImmutableWebhookExecuteRequest.Builder.addEmbed(builder: ImmutableEmbedData.Builder.() -> Unit) =
    addEmbed(buildEmbedData(builder))

public inline fun ImmutableEmbedData.Builder.footer(builder: ImmutableEmbedFooterData.Builder.() -> Unit) =
    footer(buildEmbedFooterData(builder))

public inline fun ImmutableEmbedData.Builder.image(builder: ImmutableEmbedImageData.Builder.() -> Unit) =
    image(buildEmbedImageData(builder))

public inline fun ImmutableEmbedData.Builder.thumbnail(builder: ImmutableEmbedThumbnailData.Builder.() -> Unit) =
    thumbnail(buildEmbedThumbnailData(builder))

public inline fun ImmutableEmbedData.Builder.video(builder: ImmutableEmbedVideoData.Builder.() -> Unit) =
    video(buildEmbedVideoData(builder))

public inline fun ImmutableEmbedData.Builder.provider(builder: ImmutableEmbedProviderData.Builder.() -> Unit) =
    provider(buildEmbedProviderData(builder))

public inline fun ImmutableEmbedData.Builder.author(builder: ImmutableEmbedAuthorData.Builder.() -> Unit) =
    author(buildEmbedAuthorData(builder))

public inline fun ImmutableEmbedData.Builder.addField(builder: ImmutableEmbedFieldData.Builder.() -> Unit) =
    addField(buildEmbedFieldData(builder))

public inline fun ImmutableEmbedData.Builder.addAllFields(vararg builders: ImmutableEmbedFieldData.Builder.() -> Unit) =
    addAllFields(builders.map(::buildEmbedFieldData))

public inline fun ImmutableEmbedData.Builder.fields(vararg builders: ImmutableEmbedFieldData.Builder.() -> Unit) =
    fields(builders.map(::buildEmbedFieldData))