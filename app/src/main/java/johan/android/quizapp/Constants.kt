package johan.android.quizapp


object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    const val TEXTO_PREGUNTA_POR_DEFECTO: String = "¿A qué país pertenece esta bandera?"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, TEXTO_PREGUNTA_POR_DEFECTO,
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, TEXTO_PREGUNTA_POR_DEFECTO,
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, TEXTO_PREGUNTA_POR_DEFECTO,
            R.drawable.ic_flag_of_brazil,
            "Belarús", "Belice",
            "Brunéi", "Brasil", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, TEXTO_PREGUNTA_POR_DEFECTO,
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Bélgica",
            "Barbados", "Belice", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, TEXTO_PREGUNTA_POR_DEFECTO,
            R.drawable.ic_flag_of_fiji,
            "Gabón", "Francia",
            "Fiyi", "Finlandia", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, TEXTO_PREGUNTA_POR_DEFECTO,
            R.drawable.ic_flag_of_germany,
            "Alemania", "Georgia",
            "Grecia", "ninguna de estas", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, TEXTO_PREGUNTA_POR_DEFECTO,
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egipto",
            "Dinamarca", "Etiopía", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, TEXTO_PREGUNTA_POR_DEFECTO,
            R.drawable.ic_flag_of_india,
            "Irlanda", "Irán",
            "Hungría", "India", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, TEXTO_PREGUNTA_POR_DEFECTO,
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "Nueva Zelanda",
            "Tuvalu", "Estados Unidos de América", 2
        )

        questionsList.add(que9)




        // 10
        val que10 = Question(
            10, TEXTO_PREGUNTA_POR_DEFECTO,
            R.drawable.ic_flag_of_catalunia,
            "Catalunya", "Messi",
            "España ens roba", "Xavinetalandia", 3
        )

        questionsList.add(que10)

        return questionsList
    }
}
