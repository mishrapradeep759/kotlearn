enum class Genre {
    SCIENCE, LITERATURE, COMMERCE
}

class BookFactory {

    companion object{
        fun createBook(genre: Genre): Book = when(genre) {
            Genre.SCIENCE -> object: Book{
                private val title = "Theory of relativity"
                override fun getInfo() = println("$title ...")

                override fun order() = println("order of $title")

                override fun rate() = println("rate of $title")
            }
            else -> object: Book{
                private val title = "The great gatsby"
                override fun getInfo() = println("$title ...")

                override fun order() = println("order of $title")

                override fun rate() = println("rate of $title")
            }
        }
    }
}