fun main(){
    val playerName = "Estragon"
    var experiencePoints: Int = 5
    var hasSteed: Int = 0
    val barName = "Unicorn Horn"
    val baeBoss = "Thomas"
    var numOfgold = 50
    var set = setOf("hydromel","wine","LaCroix sparkling wather")
    experiencePoints += 5
    println("英雄名字$playerName")
    println("英雄名字鏡像${playerName.reversed()}")
    println("經驗值:"+experiencePoints)
    println("玩家坐騎總數量:"+hasSteed)
    println("酒館名稱$barName")
    println("酒館老闆名字$baeBoss")
    println("玩家金額$numOfgold")
    println("酒水單$set")
}