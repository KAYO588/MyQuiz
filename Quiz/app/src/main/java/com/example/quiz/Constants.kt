package com.example.quiz

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_qustions"
    const val CORRECT_ANSWER: String = "correct_answer"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            id = 1,
            question = "Из какого сериала данная картина",
            image = R.drawable.lastofus,
            "LastOfUs",
            "The Witcher",
            "Theboys",
            "Mamba",
            1
            )
        questionList.add(que1)

        val que2 = Question(
            id = 2,
            question = "Из какого сериала данная картина",
            image = R.drawable.theboys,
            "LastOfUs",
            "The Witcher",
            "Theboys",
            "Mamba",
            3
        )
        questionList.add(que2)
        val que3 = Question(
            id = 1,
            question = "Из какого сериала данная картина",
            image = R.drawable.thewitcher,
            "LastOfUs",
            "The Witcher",
            "Theboys",
            "Mamba",
            2
        )
        questionList.add(que3)
        val que4 = Question(
            id = 1,
            question = "Из какого сериала данная картина",
            image = R.drawable.starwars,
            "LastOfUs",
            "The Witcher",
            "Theboys",
            "StarWars",
            4
        )
        questionList.add(que4)
        val que5 = Question(
            id = 1,
            question = "Как найти площадь фигуры, не зная формулы",
            image = R.drawable.vopros,
            "Никак",
            "Интеграл",
            "Дифференциал",
            "Я тупой",
            2
        )
        questionList.add(que5)
        val que6 = Question(
            id = 1,
            question = "Из какой игры данная картина",
            image = R.drawable.horizonzero,
            "Не знаю",
            "Assasins creed",
            "Horizon Zero Dawn",
            "Нет правильного ответа",
            3
        )
        questionList.add(que6)
        val que7 = Question(
            id = 1,
            question = "Выберите правильное определение денег",
            image = R.drawable.money,
            "Бумажки",
            "Это доллар ",
            "всеобщий эквивалент, выступающий измерителем стоимости товаров или услуг, легко на них обменивающийся",
            "Нет правильного ответа",
            3
        )
        questionList.add(que7)
        val que8 = Question(
            id = 1,
            question = "Из какого сериала данная картина",
            image = R.drawable.lastofus,
            "LastOfUs",
            "The Witcher",
            "Theboys",
            "Mamba",
            1
        )
        questionList.add(que8)
        val que9 = Question(
            id = 1,
            question = "Из какого сериала данная картина",
            image = R.drawable.lastofus,
            "LastOfUs",
            "The Witcher",
            "Theboys",
            "Mamba",
            1
        )
        questionList.add(que9)
        val que10 = Question(
            id = 1,
            question = "Из какого сериала данная картина",
            image = R.drawable.lastofus,
            "LastOfUs",
            "The Witcher",
            "Theboys",
            "Mamba",
            1
        )
        questionList.add(que10)


        return questionList
    }

}