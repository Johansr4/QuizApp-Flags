package johan.android.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStart:Button = findViewById(R.id.btn_start)
        val etName:AppCompatEditText = findViewById(R.id.et_name)

        buttonStart.setOnClickListener {


          if (etName.text.toString().isEmpty()){
              Toast.makeText(this,"Introduce tu nombre",Toast.LENGTH_SHORT).show()
          }else{
              val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)


              intent.putExtra(Constants.USER_NAME, etName.text.toString())
              startActivity(intent)
              finish()
          }
        }
    }
}