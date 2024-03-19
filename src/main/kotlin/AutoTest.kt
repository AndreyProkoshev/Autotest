var masterCardCom: Double = 0.006
var maestroCardCom: Double = 0.006
var overMastercardCom: Int = 20
var overMaestrocardCom: Int = 20
var visaCom: Double = 0.0075
var mirCom: Double = 0.0075

fun main() {
    println(commision("Mastercard",300_000, 180_000))
}

fun commision(typeCard: String, transferMounth: Int, transfer: Int): Any {
    return when (typeCard) {
        "Mastercard",
        -> if (transferMounth + transfer <= 600_000 && transfer <= 150_000) {
            if (transferMounth + transfer >= 300 && transferMounth + transfer <= 75000) {
                0
            }
            else if(transferMounth + transfer > 75000 && transferMounth <= 75000){
                (transferMounth + transfer - 75000) * masterCardCom + overMastercardCom
            }
            else {
                transfer * masterCardCom + overMastercardCom
            }
        } else "Превышен лимит"

        "Maestro",
        -> if (transferMounth + transfer <= 600_000 && transfer <= 150_000) {
            if (transferMounth + transfer >= 300 && transferMounth + transfer <= 75000) {
                0
            }
            else if(transferMounth + transfer > 75000 && transferMounth <= 75000){
                (transferMounth + transfer - 75000) * maestroCardCom + overMaestrocardCom
            }
            else {
                transfer * maestroCardCom + overMaestrocardCom
            }
        } else "Превышен лимит"

        "Мир" ->
            if (transferMounth + transfer <= 600_000 && transfer <= 150_000) {
                if ((transfer * mirCom) < 35) {
                    35
                } else {
                    transfer * mirCom
                }
            } else "Превышен лимит"

        "Visa" -> if (transferMounth + transfer <= 600_000 && transfer <= 150_000) {
            if ((transfer * visaCom) < 35) {
                35
            } else {
                transfer * visaCom
            }
        } else "Превышен лимит"

        "VK" -> if (transferMounth + transfer <= 400_000 && transfer <= 150_000) {
            0
        } else "Превышен лимит"
        else -> "Тип карты не подерживается"
    }
}