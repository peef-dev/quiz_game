package main.kotlin.anime

class Anime(val name: String) {}


class Mangas(private val animes: List<Anime>) {

    operator fun iterator(): Iterator<Anime> {
        return animes.iterator()
    }
}