import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Apakah Mau Menggoreng Telur ?")
    val telur = scanner.next().single()

    if (telur == 'y' || telur == 'Y') {
        println("Jalan ke dapur")
        println("Siapkan spatula, kompor, dan teflon di atasnya")
        println("Jalan ke Kulkas, buka kulkas, ambil telur dan garam, tutup kulkas")
        println("Jalan ke kompor, ambil minyak, tuangkan minyak secukupnya di atas kompor")
        println("Nyalakan kompor, panaskan teflon")
        println("Pecahkan telur di atas teflon panas, ambil garam dan taburi garam di atas telur secukupnya")
        println("Balik telur ke bagian sebaliknya, tunggu hingga matang")
        println("Sajikan Telur Gorengnya")
        print("Apakah Membantu ?")
        scanner.next()
    } else {
        println("Maunya Makan Ayam")
        scanner.next()
    }
}
