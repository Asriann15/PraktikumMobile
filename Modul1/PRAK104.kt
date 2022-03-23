package TugasKuliah

fun main(){
    val olahraga = Olahraga()
    olahraga.tampilkan()
}

class Olahraga(){
    val latihan: String = "Push Up"
    val dampak: String = "Tangan"
    var repeat: Int = 10

    fun tampilkan(){
        println("Nama Latihan: $latihan")
        println("Bagian Tubuh Yang Dilatih: $dampak")
        println("Jumlah Push Up: $repeat")
    }
}
