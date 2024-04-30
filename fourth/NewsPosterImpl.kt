package fourth

class NewsPosterImpl: NewsPoster {
    private val subscribers = mutableListOf<Subscriber>()

    override fun addSubscriber(subscriber: Subscriber){
        subscribers.add(subscriber)
    }

    override fun removeSubscriber(subscriber: Subscriber){
        subscribers.remove(subscriber)
    }

    override fun post(news: String){
        for (sub in subscribers){
            sub.update(news)
        }
    }
}