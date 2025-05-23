package com.bilalberekgm.androidbootcampdevler


// 1.Resimdeki fonksiyonlar
fun  derecedenFahrenayta(derece:Double):Double = derece * 1.8 + 32
fun dikdortgenCevreHesaplayici(uzunKenar:Double,kisaKenar:Double):Double = 2 * (uzunKenar + kisaKenar)
fun faktoriyelHesaplayici(sayi:Int):Int{
    var sonuc = 1

    if(sayi == 0 || sayi == 1 ){
        return 1
    }

    for(elemen in 2..sayi){
        sonuc *= elemen
    }
    return sonuc
}
fun aHarfiSayisiBulucu(kelime:String):Int{
     var aHarfiSayisi = 0

    for (harf in kelime){
        if(harf == 'a'  || harf == 'A'){
            aHarfiSayisi++
        }
    }
    return aHarfiSayisi
}


// 2.Resimdeki Fonksiyonlar

fun icAcilarToplamiBulucu(kenarSayisi:Int):Int = (kenarSayisi - 2) * 180
fun calismaSuresindenMaasHesaplayici(calismaGunu:Int):Int{
    val toplamGecenSaat = calismaGunu * 8
    if(toplamGecenSaat <= 160){
        return toplamGecenSaat * 10
    }
    return (toplamGecenSaat - 160) * 20 + 1600
}
fun internetKulanimiFiyatlandirmaFonksiyonu(kota:Int):Int{
 if(kota <= 50){
     return kota * 2;
 }
    return (kota - 50) * 4 + 100
}