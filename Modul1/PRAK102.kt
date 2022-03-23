package TugasKuliah
import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)

    print("Nilai X: ")

    val x : Int = input.nextInt()
   val hasilX = 2*x*x+5*x-8
    print(hasilX)
}