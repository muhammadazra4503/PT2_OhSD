package org.d3ifcool3046.pt2

import org.d3ifcool3046.pt2.model.Question
import kotlin.collections.ArrayList

object Util {

    const val NAME: String = "name"
    const val TOTAL_PERTANYAAN: String = "total_pertanyaan"
    const val JAWABAN_BENAR: String = "jawaban_benar"

    fun setEasyQuestion(): ArrayList<Question> {
        val quizList = ArrayList<Question>()
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
        val quizList2 = ArrayList<Question>()
        val question1 = Question(
            "2",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            1)
        quizList2.add(question1)

        val question2 = Question(
            "5",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList2.add(question2)

        val question3 = Question(
            "3",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList2.add(question3)

        val question4 = Question(
            "4",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList2.add(question4)

        val question5 = Question(
            "5",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList2.add(question5)

        val question6 = Question(
            "6",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList2.add(question6)

        val question7 = Question(
            "7",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)

        quizList2.add(question7)
        val question8 = Question(
            "8",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList2.add(question8)

        val question9 = Question(
            "9",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList2.add(question9)

        val question10 = Question(
            "10",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList2.add(question10)

        quizList2.shuffle()
        return quizList2
    }

    fun setHardQuestion(): ArrayList<Question> {
        val quizList3 = ArrayList<Question>()
        val question1 = Question(
            "6",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            1)
        quizList3.add(question1)

        val question2 = Question(
            "5",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList3.add(question2)

        val question3 = Question(
            "3",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList3.add(question3)

        val question4 = Question(
            "4",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList3.add(question4)

        val question5 = Question(
            "5",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList3.add(question5)

        val question6 = Question(
            "6",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList3.add(question6)

        val question7 = Question(
            "7",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)

        quizList3.add(question7)
        val question8 = Question(
            "8",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList3.add(question8)

        val question9 = Question(
            "9",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList3.add(question9)

        val question10 = Question(
            "13",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList3.add(question10)

        quizList3.shuffle()
        return quizList3
    }
}