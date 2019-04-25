package example.micronaut

import javax.inject.Singleton
import kotlin.random.Random

@Singleton
class ConferenceService {
    companion object {
        val CONFERENCES = listOf(
            Conference("Greach"),
            Conference("GR8Conf EU"),
            Conference("Micronaut Summit"),
            Conference("Devoxx Belgium"),
            Conference("Oracle Code One"),
            Conference("CommitConf"),
            Conference("Codemotion Madrid")
        )
    }

    fun randomConf() = CONFERENCES.get(Random.nextInt(CONFERENCES.size))
}