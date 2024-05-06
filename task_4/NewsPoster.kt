interface NewsPoster {

    fun subscribe(subscriber: Subscriber)
    fun unsubscribe(subscriber: Subscribe)
    fun publish(news: String);


}