fun main(){
    val poster : NewsPoster = NewsPosterImpl()

    val subscriber1 : Subscriber = SubscriberImpl("John")
    val subscriber2 : Subscriber = SubscriberImpl("Jane")

    poster.subscribe(subscriber1)
    poster.subscribe(subscriber2)

    poster.publish("Срочные новости!")
}


