fun main(){
    val playerName = "Estragon"
    var experiencePoints: Int = 5
    var hasSteed: Int = 0
    val barName = "Unicorn Horn"
    val baeBoss = "Thomas"
    var numOfgold = 50
    var set = setOf("hydromel","wine","LaCroix sparkling wather")
    experiencePoints += 5
    println("英雄$playerName"+" 走進一家叫作「獨角獸之角」(「$barName"+"」)的小酒館。")
    println("酒館老闆$baeBoss"+"問道:  需要牽馬入廄嗎?")
    println("謝謝,$playerName"+" 回答說，我還沒有馬呢，不過我有$numOfgold"+" 個金幣，先來杯喝的吧。")
    println("好極了，酒館老闆$baeBoss"+"說，$set"+"，您要哪種?")
    println("經驗值:"+experiencePoints)
    println("玩家坐騎總數量:"+hasSteed)
}