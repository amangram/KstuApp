package com.example.kstuapp.MainMVP.Model

data class News(val title: String, val date: Double,val content:String="This is content field.")
data class Events(val dayDate: Int,val monthDate :String  , val title: String)
class NewsModel:IModel<News>{
    override fun setData(data: News) {

    }

    override fun getData(): ArrayList<News> {
        var dataNews:ArrayList<News> = ArrayList()
        dataNews.add(News("Putin is arrived", 28.03,"Putin is arrived from Moskow"))
        dataNews.add(News("Atambaev prefer cognac and Jeenbekov drinks ovdka", 15.03,"Atambaev prefer cognac and Jeenbekov drinks ovdka"))
        dataNews.add(News("Hybrid between ape and cow was born", 19.02))
        dataNews.add(News("Lakers lost their chance to play in Playoff", 15.02))
        dataNews.add(News("Adilbek gave Bentley to his girlfriend as a present", 14.02,"Its not true.Adilbek have not got a girlfriend"))
        dataNews.add(News("Mermaid do a full split", 10.02))
        dataNews.add(News("UFO was seen in 8th microdistrict", 30.01))
        dataNews.add(News("First news", 29.01))
        dataNews.add(News("Hybrid between ape and cow was born", 19.02))
        dataNews.add(News("Lakers lost their chance to play in Playoff", 15.02))
        dataNews.add(News("Adilbek gave Bentley to his girlfriend as a present", 14.02,"Its not true.Adilbek have not got a girlfriend"))
        dataNews.add(News("Mermaid do a full split", 10.02))
        dataNews.add(News("UFO was seen in 8th microdistrict", 30.01))
        dataNews.add(News("First news", 29.01))
        dataNews.add(News("Hybrid between ape and cow was born", 19.02))
        return dataNews
    }
}
class EventsModel:IModel<Events>{
    override fun getData(): ArrayList<Events> {
        var dataEvents:ArrayList<Events> = ArrayList()
        dataEvents.add(Events(31, "Sep","Education Day"))
        dataEvents.add(Events(14,"Feb","St.Valentine Day"))
        dataEvents.add(Events(31,"Dec","New  Year"))
        dataEvents.add(Events(8,"Mar","International Women Day"))
        return  dataEvents
    }

    override fun setData(data: Events) {
    }

}