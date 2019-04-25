package example.micronaut

import io.micronaut.core.annotation.Introspected

@Introspected
data class Conference(val name: String)