package dev.brella.d4j.coroutines.common

import kotlinx.coroutines.reactive.awaitFirst
import kotlinx.coroutines.reactive.awaitFirstOrNull
import reactor.core.publisher.Mono

/** Functions as an alias for [awaitFirst] */
suspend inline fun <T> Mono<T>.await() = awaitFirst()

/** Functions as an alias for [awaitFirstOrNull] */
suspend inline fun <T> Mono<T>.awaitOrNull() = awaitFirstOrNull()

/** Functions as an alias for [awaitFirstOrNull], but does not return a result */
suspend inline fun Mono<*>.awaitNone() { awaitFirstOrNull() }