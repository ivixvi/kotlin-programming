import java.lang.Integer.max
import java.lang.Integer.min

fun main() {
    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false
    val race = "Elf"
    val faction = when (race) {
        "dwarf" -> "Keepers of the Mines"
        "gnome" -> "Keepers of the Mines"
        "orc" -> "Free People of the Rolling Hills"
        "Human" -> "Free People of the Rolling Hills"
        "Elf" -> "Keepers of the Forests"
        else -> "Oops!"
    }

    // Aura
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)
    // playerStatus
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)
    // playerStatus
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)

    printPlayerInebriationStatus(castFireball(-13))
}

private fun printPlayerStatus(auraColor: String, isBlessed: Boolean, name: String, healthStatus: String) {
    println("(Aura: $auraColor) (Blessed:${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String =
    if (isBlessed && healthPoints > 50 || isImmortal) "GREEN" else "NONE"

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String =
        when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches!"
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds!"
        }
        in 15..74 -> "looks pretty hurt!"
        else -> "is in awful condition!"
    }


private fun  castFireball(numFireball: Int = 2): Int {
    if(numFireball > 0){
        println("A glass of fireball springs into existence. (x$numFireball)")
    } else {
        println("Oops! Can't be provided!")
    }
    // 雑に0~50で縛る
    return max(0,min(numFireball,50))
}

private fun printPlayerInebriationStatus(inebriation:Int = 0) =
        println(when (inebriation) {
            0 -> "no drunk"
            in 1..10 -> "tipsy"
            in 11..20 -> "sloshed"
            in 21..30 -> "soused"
            in 31..40 -> "stewed"
            in 41..50 -> "..t0aSt3d"
            else -> "Oops! not expected value!"
        })