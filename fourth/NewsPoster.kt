package fourth

interface NewsPoster {

    fun addSubscriber(subscriber: Subscriber)

    fun removeSubscriber(subscriber: Subscriber)

    fun post(news: String)
}