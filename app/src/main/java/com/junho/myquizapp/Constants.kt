package com.junho.myquizapp

object Constants {

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "what country does this flag belong to?",
            R.drawable.ic_bg,
            "A",
            "B",
            "C",
            "D",
            3,
        )

        questionsList.add(que1)

        return questionsList
    }
}