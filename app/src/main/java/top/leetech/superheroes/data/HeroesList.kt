package top.leetech.superheroes.data
import top.leetech.superheroes.R
import top.leetech.superheroes.model.Hero

object HeroesList {
    val heroes = listOf(
        Hero(
            name = R.string.hero1,
            about = R.string.description1,
            image = R.drawable.android_superhero1
        ),
        Hero(
            name = R.string.hero2,
            about = R.string.description2,
            image = R.drawable.android_superhero2
        ),
        Hero(
            name = R.string.hero3,
            about = R.string.description3,
            image = R.drawable.android_superhero3
        ),
        Hero(
            name = R.string.hero4,
            about = R.string.description4,
            image = R.drawable.android_superhero4
        ),
        Hero(
            name = R.string.hero5,
            about = R.string.description5,
            image = R.drawable.android_superhero5
        ),
        Hero(
            name = R.string.hero6,
            about = R.string.description6,
            image = R.drawable.android_superhero6
        )
    )
}