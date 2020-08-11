import kotlin.math.pow

fun main() {
    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val race = "Elf"
    val faction = when (race) {
        "dwarf" -> "Keepers of the Mines"
        "gnome" -> "Keepers of the Mines"
        "orc" -> "Free People of the Rolling Hills"
        "Human" -> "Free People of the Rolling Hills"
        "Elf" -> "Keepers of the Forests"
        else -> "Oops!"
    }
    // 3.12 カルマ
    val karma = (Math.random().pow((110 - healthPoints) / 100.0 ) * 20).toInt()
    println(karma)
    // Aura
    val auraColor = if (auraVisible) {
        when (karma) {
            in 0..5 -> "RED"
            in 6..10 -> "ORANGE"
            in 11..15 -> "PURPLE"
            in 16..20 -> "GREEN"
            else -> "NONE"
        }
    } else { "NONE" }
    // playerStatus
    println("(Aura: $auraColor) (Blessed:${if (isBlessed) "YES" else "NO"})")

    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches!"
        in 75..89 -> if (isBlessed){
                "has some minor wounds but is healing quite quickly!"
            } else {
                "has some minor wounds!"
            }
        in 15..74 -> "looks pretty hurt!"
        else -> "is in awful condition!"
    }
    // playerStatus
    println("$name $healthStatus")

    // 3.13
    // なんか違う気がする
    val HP = "HP: $healthPoints"
    val A = "Aura: $auraColor"
    val B = "Blessed: $isBlessed"
    val H = "$name $healthStatus"
    val statusFormatString = "($HP)($A)->$H"
    println(statusFormatString)

}