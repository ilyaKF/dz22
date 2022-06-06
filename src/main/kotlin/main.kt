fun main() {
    val likes = 1554
    val keyWord: String
    if (likes <=0) keyWord = "человек"
    else if (likes == 1) keyWord = "человеку"
    else if (likes >= 2 && likes <10) keyWord = "людям"
    else if (likes % 10 == 0) keyWord = "людям"
    else if (likes % 10 == 1) keyWord = "человеку"
    else keyWord = "людям"
    println("Понравилось ${likes} ${keyWord}")
}