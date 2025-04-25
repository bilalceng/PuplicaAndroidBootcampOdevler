package com.bilalberekgm.androidbootcampdevler


fun main() {

    // 1. Resimdeki Fonksiyonların Testi
    val derece = 25.0
    println("1. Derece $derece°C -> Fahrenayt: ${derecedenFahrenayta(derece)}°F")
    // Çıktı: 1. Derece 25.0°C -> Fahrenayt: 77.0°F

    val uzunKenar = 5.0
    val kisaKenar = 3.0
    println("2. Dikdörtgen Çevresi (Uzun: $uzunKenar, Kısa: $kisaKenar): ${dikdortgenCevreHesaplayici(uzunKenar, kisaKenar)}")
    // Çıktı: 2. Dikdörtgen Çevresi (Uzun: 5.0, Kısa: 3.0): 16.0

    val sayi = 5
    println("3. $sayi! (Faktöriyel): ${faktoriyelHesaplayici(sayi)}")
    // Çıktı: 3. 5! (Faktöriyel): 120

    val kelime = "Ankara"
    println("4. '$kelime' kelimesindeki 'a' harfi sayısı: ${aHarfiSayisiBulucu(kelime)}")
    // Çıktı: 4. 'Ankara' kelimesindeki 'a' harfi sayısı: 3



    // 2. Resimdeki Fonksiyonların Testi
    val kenarSayisi = 6
    println("5. $kenarSayisi kenarlı çokgenin iç açıları toplamı: ${icAcilarToplamiBulucu(kenarSayisi)}°")
    // Çıktı: 5. 6 kenarlı çokgenin iç açıları toplamı: 720°

    val calismaSuresi = 10
    println("6. $calismaSuresi saat çalışma maaşı: ${calismaSuresindenMaasHesaplayici(calismaSuresi)}₺")
    // Çıktı: 6. 10 saat çalışma maaşı: 120₺

    val kota = 60
    println("7. $kota GB internet kullanım ücreti: ${internetKulanimiFiyatlandirmaFonksiyonu(kota)}₺")
    // Çıktı: 7. 60 GB internet kullanım ücreti: 140₺
}