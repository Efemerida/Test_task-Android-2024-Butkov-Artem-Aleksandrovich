class SubscriberImpl(private val name: String) : Subscriber {

    override fun update(news: String) {
        println("$name получил новость: $news")
    }

}