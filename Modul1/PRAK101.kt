import java.util.Scanner

fun main(args: Array<String>) {
 val nama : String
 val umur : Int
 val waktu : String
 val suhu : Float

 val input = Scanner(System.`in`)
    print("waktu sekarang: ")
    waktu= input.nextLine()
    print("Nama Anda: ")
    nama= input.nextLine()
    print("Umur Anda: ")
    umur= input.nextInt()
    print("Suhu Tubuh Anda: ")
    suhu= input.nextFloat()

    println("Selamat $waktu, $nama")
    println("Umur Anda $umur tahun.")
    println("Suhu tubuh anda $suhu derajat \nCelcius.")
}