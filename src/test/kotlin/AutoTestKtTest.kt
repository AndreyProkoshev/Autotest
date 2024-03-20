import org.junit.Test

import org.junit.Assert.*

class AutoTestKtTest {
    @Test
    fun commisionMasterCard() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 200000
        var transfer = 14000
        val typeCard = "Mastercard"

        val result = commision(typeCard, transferMounth, transfer)
        assertEquals(104.0, result)
    }
    @Test
    fun commisionMasterCard2() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 60000
        var transfer = 20000
        val typeCard = "Mastercard"

        val result = commision(typeCard, transferMounth, transfer)
        assertEquals(50.0, result)
    }
    @Test
    fun commisionMasterCardOverlimit() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 800_000
        var transfer = 100000
        val typeCard = "Mastercard"

        val result = commision(typeCard, transferMounth, transfer)
        assertEquals("Превышен лимит", result)
    }
    @Test
    fun commisionMasterCardOverlimit2() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 300_000
        var transfer = 180_000
        val typeCard = "Mastercard"
        val result = commision(typeCard, transferMounth, transfer)
        assertEquals("Превышен лимит", result)
    }
    @Test
    fun commisionMasterCardFor0() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 1000
        var transfer = 14000
        val typeCard = "Mastercard"

        val result = commision(typeCard, transferMounth, transfer)
        assertEquals(0, result)
    }

    @Test
    fun overcommisionVisa() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 100_000
        var transfer = 1_400_000
        val typeCard = "Visa"

        val result = commision(typeCard, transferMounth, transfer)
        assertEquals("Превышен лимит", result)
    }

    @Test
    fun overcommisionVisa2() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 180_000
        var transfer = 300_000
        val typeCard = "Visa"

        val result = commision(typeCard, transferMounth, transfer)
        assertEquals("Превышен лимит", result)
    }

    @Test
    fun mincommisionVisa() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 100
        var transfer = 1_400
        val typeCard = "Visa"

        val result = commision(typeCard, transferMounth, transfer)
        assertEquals(35, result)
    }

    @Test
    fun commisionVisa() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 1_400
        var transfer = 100_000
        val typeCard = "Visa"

        val result = commision(typeCard, transferMounth, transfer)
        assertEquals(750.0, result)
    }

    @Test
    fun commisionVk() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 20000
        var transfer = 100_000
        val typeCard = "VK"

        val result = commision(typeCard, transferMounth, transfer)
        assertEquals(0, result)
    }

    @Test
    fun overcommisionVk() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 20000
        var transfer = 170_000
        val typeCard = "VK"

        val result = commision(typeCard, transferMounth, transfer)
        assertEquals("Превышен лимит", result)
    }

    @Test
    fun overcommisionMaestro() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 20000
        var transfer = 180_000
        val typeCard = "Maestro"
        val result = commision(typeCard, transferMounth, transfer)
        assertEquals("Превышен лимит", result)
    }

    @Test
    fun overcommisionMaestro2() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 800_000
        var transfer = 100_000
        val typeCard = "Maestro"
        val result = commision(typeCard, transferMounth, transfer)
        assertEquals("Превышен лимит", result)
    }

    @Test
    fun commisionMaestroForO() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 0
        var transfer = 50000
        val typeCard = "Maestro"

        val result = commision(typeCard, transferMounth, transfer)
        assertEquals(0, result)
    }

    @Test
    fun commisionMaestro() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 50000
        var transfer = 100000
        val typeCard = "Maestro"

        val result = commision(typeCard, transferMounth, transfer)
        assertEquals(470.0, result)
    }

    @Test
    fun commisionMaestro2() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 500000
        var transfer = 100000
        val typeCard = "Maestro"

        val result = commision(typeCard, transferMounth, transfer)
        assertEquals(620.0, result)
    }

    @Test
    fun overcommisionMir() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 100_000
        var transfer = 1_400_000
        val typeCard = "Мир"
        val result = commision(typeCard, transferMounth, transfer)
        assertEquals("Превышен лимит", result)
    }

    @Test
    fun overcommisionMir2() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 180_000
        var transfer = 300_000
        val typeCard = "Мир"
        val result = commision(typeCard, transferMounth, transfer)
        assertEquals("Превышен лимит", result)
    }

    @Test
    fun mincommisionMir() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 100
        var transfer = 1_400
        val typeCard = "Мир"

        val result = commision(typeCard, transferMounth, transfer)
        assertEquals(35, result)
    }

    @Test
    fun commisionMir() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 1_400
        var transfer = 100_000
        val typeCard = "Мир"

        val result = commision(typeCard, transferMounth, transfer)
        assertEquals(750.0, result)
    }
    @Test
    fun otherCard() {
        var masterCardCom: Double = 0.006
        var maestroCardCom: Double = 0.006
        var overMastercardCom: Int = 20
        var overMaestrocardCom: Int = 20
        var visaCom: Double = 0.0075
        var mirCom: Double = 0.0075
        var transferMounth = 1_400
        var transfer = 100_000
        val typeCard = "Union Pay"

        val result = commision(typeCard, transferMounth, transfer)
        assertEquals("Тип карты не подерживается", result)
    }
}