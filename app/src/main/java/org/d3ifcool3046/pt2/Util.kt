package org.d3ifcool3046.pt2

import org.d3ifcool3046.pt2.model.Question
import kotlin.collections.ArrayList

object Util {
    const val NAME: String = "name"
    const val TOTAL_PERTANYAAN: String = "total_pertanyaan"
    const val JAWABAN_BENAR: String = "jawaban_benar"

    private val quizList = ArrayList<Question>()
    private val quizList2 = ArrayList<Question>()
    private val quizList3 = ArrayList<Question>()

    fun setEasyQuestion(): ArrayList<Question> {
        val question1 = Question(
            "Sebuah segitiga memiliki ukuran sisi alas 10 cm dan tinggi 7 cm. Jika ukuran sisi-sisi miringnya adalah 8 cm dan 9 cm, hitunglah berapa luas dan keliling segitiga tersebut!",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            1)
        quizList.add(question1)

        val question2 = Question(
            "Berikut merupakan rumus luas persegi panjang yang benar, yaitu .....",
            "L = s x s",
            "L = 2 (p + l)",
            "L = p x l",
            3)
        quizList.add(question2)

        val question3 = Question(
            "Rumus menghitung keliling persegi panjang adalah .....",
            "K = p x l",
            "K = 2 (p + l)",
            "K = 1/2 x a x t",
            2)
        quizList.add(question3)

        val question4 = Question(
            "Diketahui sebuah segitiga memiliki ukuran sisi 10 cm, 8 cm, dan 6 cm. Keliling segitiga tersebut adalah ...",
            "14cm",
            "24cm",
            "44cm",
            2)
        quizList.add(question4)

        val question5 = Question(
            "Sebuah benda berbentuk persegi mempunyai keliling 40 cm, maka luas benda tersebut adalah ....",
            "100cm²",
            "80cm²",
            "60cm²",
            1)
        quizList.add(question5)

        val question6 = Question(
            "Diketahui sisi persegi adalah 10 cm, maka keliling persegi tersebut adalah ....",
            "40cm",
            "50cm",
            "20cm",
            2)
        quizList.add(question6)

        val question7 = Question(
            "Diketahui sebuah lingkaran memiliki keliling 314 cm, maka diameter lingkaran tersebut adalah....",
            "100",
            "300",
            "200",
            1)

        quizList.add(question7)
        val question8 = Question(
            "Diketahui sebuah lingkaran memiliki jari-jari 10 cm, maka luas dan keliling lingkaran tersebut adalah :",
            "314 cm² dan 62,8 cm",
            "31,4 cm² dan 3,14 cm",
            "314 cm² dan 6,28 cm",
            1)
        quizList.add(question8)

        val question9 = Question(
            "Luas persegi panjang dengan panjang 8 cm dan lebar 6 cm adalah ....",
            "32 cm²",
            "48 cm²",
            "42 cm²",
            2)
        quizList.add(question9)

        val question10 = Question(
            "Diketahui persegi panjang memiliki ukuran panjang 8 cm dan lebar 6 cm, maka keliling persegi panjang tersebut adalah ....",
            "14 cm",
            "24 cm",
            "28 cm",
            3)
        quizList.add(question10)

        quizList.shuffle()
        return quizList
    }

    fun setMediumQuestion(): ArrayList<Question> {
        val question1 = Question(
            "Sepetak sawah berbentuk persegi dengan panjang sisi 50 m. Luas sawah tersebut adalah .... cm²",
            "2.000cm²",
            "2.250cm²",
            "2.500cm²",
            3)
        quizList2.add(question1)

        val question2 = Question(
            "Keliling suatu bangun persegi 60 cm. Luas bangun tersebut adalah .... cm²",
            "220cm²",
            "225cm²",
            "235cm²",
            2)
        quizList2.add(question2)

        val question3 = Question(
            "Jika panjang sisi persegi 48 cm, maka kelilingnya adalah .... cm",
            "182cm",
            "172cm",
            "192cm",
            3)
        quizList2.add(question3)

        val question4 = Question(
            "Diketahui 1/2 x p x l = 120 cm². Jika l = 20 cm, maka nilai p adalah .... cm",
            "12cm",
            "14cm",
            "16cm",
            1)
        quizList2.add(question4)

        val question5 = Question(
            "Sebuah papan reklame berbentuk segitiga, memiliki panjang alas 65 cm dan luasnya 1.625 cm², maka tingginya adalah .... cm",
            "52cm",
            "50cm",
            "55cm",
            2)
        quizList2.add(question5)

        val question6 = Question(
            "Selembar kertas berbentuk segitiga sama sisi memiliki keliling yang panjangnya 114 cm, maka panjang sisi-sisinya adalah",
            "34cm",
            "36cm",
            "38cm",
            3)
        quizList2.add(question6)

        val question7 = Question(
            "Di bawah ini yang bukan termasuk ciri-ciri persegi panjang adalah ....",
            "Keempat sisinya sama panjang",
            "Mempunyai 2 simetri lipat",
            "Keempat sudutnya siku-siku",
            1)

        quizList2.add(question7)
        val question8 = Question(
            "Sebuah kolam renang berbentuk persegi panjang memiliki panjang 40 meter dan lebar 20 meter. Kolam renang tersebut dikelilingi jalan setapak selebar 1 meter. Luas jalan setapak itu adalah .... m²",
            "122m²",
            "124m²",
            "126m²",
            2)
        quizList2.add(question8)

        val question9 = Question(
            "Sebuah taman berbentuk lingkaran, kelilingnya adalah 3.850 m. Diameter taman tersebut adalah .... m",
            "1.225cm",
            "1.220cm",
            "1.230cm",
            1)
        quizList2.add(question9)

        val question10 = Question(
            "Ibu membuat taplak meja berbentuk lingkaran berdiameter 1,4 m. Setelah jadi, ibu mengukur keliling taplak meja tersebut dan ternyata panjangnya adalah .... meter.",
            "1,14m",
            "3,4m",
            "4,4m",
            3)
        quizList2.add(question10)

        quizList2.shuffle()
        return quizList2
    }

    fun setHardQuestion(): ArrayList<Question> {
        val question1 = Question(
            "Sebuah lapangan berbentuk persegi panjang berukuran 250 m x 200 m. Budi berlari mengelilingi lapangan tersebut 3 kali. Maka jarak yang ditempuh Budi adalah .... meter.",
            "2.700m",
            "2.750m",
            "2.800m",
            1)
        quizList3.add(question1)

        val question2 = Question(
            "Ayah membuat papan tulis berukuran 200 cm x 150 cm. Papan tulis tersebut membutuhkan 2 kaleng cat berukuran kecil untuk tiap m². Cat yang dibutuhkan ayah untuk mengecat papan tulis tersebut adalah .... kaleng.",
            "4",
            "5",
            "6",
            3)
        quizList3.add(question2)

        val question3 = Question(
            "Pekarangan belakang rumah paman berbentuk persegi panjang berukuran panjang 68 meter dan lebar 45 meter akan dibuatkan pagar dari bambu. Tiap meter membutuhkan 3 bambu. Banyaknya bambu yang dibutuhkan untuk membuat pagar pekarangan adalah ....",
            "670",
            "678",
            "675",
            2)
        quizList3.add(question3)

        val question4 = Question(
            "Sebuah lantai berbentuk persegi dengan panjang sisinya 12 m. Lantai tersebut akan dipasang ubin berbentuk persegi berukuran 30 cm x 30 cm. Banyaknya ubin yang diperlukan untuk menutup lantai adalah .... ubin.",
            "1.600",
            "1.700",
            "1.500",
            1)
        quizList3.add(question4)

        val question5 = Question(
            "Selembar kertas karton berbentuk persegi dengan panjang 56 cm. Luas dan keliling kertas karton tersebut adalah ....",
            "3.136 cm² dan 224 cm",
            "3.146 cm² dan 234 cm",
            "3.156 cm² dan 244 cm",
            1)
        quizList3.add(question5)

        val question6 = Question(
            "Sebuah pekarangan berbentuk persegi. Panjang sisi pekarangan 86 m. Di sekeliling pekarangan itu akan ditanami pohon pepaya dengan jarak antarpohon 2 m. Banyak pohon pepaya yang dibutuhkan adalah .... pohon",
            "170",
            "172",
            "174",
            2)
        quizList3.add(question6)

        val question7 = Question(
            "Sebuah taman berbentuk lingkaran dengan diameter 56 meter akan ditanami rumput. Harga rumput adalah RP 7.500,00/m². Biaya yang harus dikeluarkan untuk membeli rumput adalah ....",
            "Rp 18.480.000,00",
            "Rp 18.350.000,00",
            "Rp 18.560.000,00",
            1)

        quizList3.add(question7)
        val question8 = Question(
            "Panjang seluruh lengkung lingkaran disebut....",
            "Jari-jari",
            "Diameter",
            "Keliling Lingkaran",
            3)
        quizList3.add(question8)

        val question9 = Question(
            "Seorang anak berlari mengelilingi sebuah lapangan berbentuk segitiga sama sisi yang memiliki ukuran sisi 20 m sebanyak 5 kali putaran. Hitunglah berapa jarak yang ditempuh anak tersebut!",
            "300",
            "250",
            "200",
            1)
        quizList3.add(question9)

        val question10 = Question(
            "Tentukanlah keliling segitiga dengan panjang sisi-sisi berikut:\n" +
                    "   A = 5 cm, B = 7 cm, dan C = 9 cm.",
            "21cm",
            "18cm",
            "14cm",
            1)
        quizList3.add(question10)

        quizList3.shuffle()
        return quizList3
    }
    fun resetQuestions() {
        setEasyQuestion().clear()
        setMediumQuestion().clear()
        setHardQuestion().clear()
    }
}