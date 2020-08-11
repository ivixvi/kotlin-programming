// コンパイル時定数
const val MAX_EXPERIENCE:Int = 5000

fun main(args:Array<String>) {
    // TSっぽい変数定義
    // 型推論で明らかに型が分かる場合はIDE側で消したら？と提案される
    // varがlet,valがconstに似ている
    val playerName = "Estragon"
    // valへの再代入はできない
    // playerName = "Madrigal"
    var experiencePoints = 5;

    // 下記のように型が違うとコンパイル時に落ちる（TSみたいでｲｲﾈ！）
    // var experiencePoints: Int = "thirty-two";

    experiencePoints += 5

    println(experiencePoints)
    println(MAX_EXPERIENCE)
    println(playerName)

    // プリミティブ型と参照型
    // 参照型は名前の通り参照の値を保持するので，javascriptみたく中身の書き換えが他の変数にも反映される

    // 2.9 hasSteed
    // 入手後書き換えの可能性があるのでvarで宣言すべき．
    // 初期は持っていないのでfalseで初期化．
    var hasSteed = false

    // 2.10 ユニコーンの角
    val pubName = "Pub Unico"
    val publican = "Tyler"
    val pubUnicoDrinks: List<String> = listOf(
        "mead",
        "wine",
        "LaCroix"
    )
    val pubUnicoDrinkNames = pubUnicoDrinks.joinToString("と,")
    var gold = 50
    // 適当に遊んでみる
    println("ーーーー $pubName ーーーー")
    println("$publican「あんたが乗りなさるウマの小屋はいりますかね？」…▼")
    if (hasSteed) {
        println("$playerName「ああ，こいつの小屋を用意してくれ，それと金が$gold ある．飲ませてほしいね．」…▼")
    } else {
        println("$playerName「ウマはないが，金が$gold ある．飲ませてほしいね．」…▼")
    }
    println("$publican「はいよ！」…▼")
    println("$publican「$pubUnicoDrinkNames がありまっせ．どれになさる？ 」…▼")

    // 2.11 魔法の鏡
    val magicMirrorPlayerName = playerName.reversed()
    // 適当に遊んでみる
    println("ーーーー 魔法の部屋 ーーーー")
    println(playerName+"は魔法の鏡を覗き込んだ…▼")
    println("$magicMirrorPlayerName…▼")

}