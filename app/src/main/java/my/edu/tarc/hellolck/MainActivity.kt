package my.edu.tarc.hellolck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView //Must be imported

//Instance Name: Type
//intCount : Integer
class MainActivity : AppCompatActivity() {

    //Predefined Function
    //onCreate = main() function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Load UI to memory
        //R = resources class
        setContentView(R.layout.activity_main)

        //Declare Variable, val = value, var = variable
        //val used when value wont be change anymore
        //UI linking use val
        val textViewName: TextView = findViewById(R.id.textViewName)
        val imageViewQR : ImageView = findViewById(R.id.imageViewQR)
        val buttonShow  : Button = findViewById(R.id.buttonShow)
        val buttonHide  : Button = findViewById(R.id.buttonHide)

        buttonShow.setOnClickListener{
            textViewName.visibility = View.VISIBLE
            imageViewQR.visibility = View.VISIBLE
        }

        buttonHide.setOnClickListener{
            textViewName.visibility = View.INVISIBLE
            imageViewQR.visibility = View.INVISIBLE
        }


    }
}