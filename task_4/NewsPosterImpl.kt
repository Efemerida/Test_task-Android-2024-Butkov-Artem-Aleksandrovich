class NewsPosterImpl : NewsPoster {

    private val subscribers = mutableListOf<Subscriber>()

    override fun subscribe(subscriber: Subscriber) {
        subscribers.add(subscriber)
    }

    override fun unsubscribe(subscriber: Subscriber) {
        subscribers.remove(subscriber)
    }

    override fun publish(news: String) {
        subscribers.forEach { it.update(news) }
    }

}