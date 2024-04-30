package fourth

class SubscriberImpl(
    val name: String,
    newsPoster: NewsPoster
): Subscriber {

    init {
        newsPoster.addSubscriber(this)
    }

    override fun update(news: String){
        println("$name: $news")
    }
}