package dev.brella.d4j.coroutines.common

import discord4j.common.util.Snowflake

public inline fun Long.snowflake() = Snowflake.of(this)
public inline fun String.asSnowflake() = Snowflake.of(this)

@OptIn(ExperimentalUnsignedTypes::class)
public inline fun ULong.asSnowflake() = Snowflake.of(this.toLong())

@OptIn(ExperimentalUnsignedTypes::class)
public inline fun Snowflake.asULong() = asLong().toULong()

@OptIn(ExperimentalUnsignedTypes::class)
public inline val Snowflake.internalWorkerID get() = ((asULong() and 0x3E0000u) shr 17).toInt()
@OptIn(ExperimentalUnsignedTypes::class)
public inline val Snowflake.internalProcessID get() = ((asULong() and 0x1F000u) shr 12).toInt()
@OptIn(ExperimentalUnsignedTypes::class)
public inline val Snowflake.increment get() = (asLong() and 0xFFF).toInt()
