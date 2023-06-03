package org.d3ifcool3046.pt2

import org.d3ifcool3046.pt2.model.Question
import java.util.*
import kotlin.collections.ArrayList


object Util {

    fun setFixQuestion(): ArrayList<Question> {
        val quizList = ArrayList<Question>()
        val question1 = Question(
            "1",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            1)
        quizList.add(question1)

        val question2 = Question(
            "2",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList.add(question2)

        val question3 = Question(
            "3",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList.add(question3)

        val question4 = Question(
            "4",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList.add(question4)

        val question5 = Question(
            "5",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList.add(question5)

        val question6 = Question(
            "6",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList.add(question6)

        val question7 = Question(
            "7",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)

        quizList.add(question7)
        val question8 = Question(
            "8",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList.add(question8)

        val question9 = Question(
            "9",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList.add(question9)

        val question10 = Question(
            "10",
            "35 cm² dan 27 cm",
            "27 cm² dan 35 cm",
            "30 cm² dan 25 cm",
            2)
        quizList.add(question10)

        quizList.shuffle()
        return quizList
    }
}