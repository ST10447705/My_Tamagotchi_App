package za.ac.iie.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    private var petHealth = 100
    private var petHunger = 50
    private var pelCleanliness = 50

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // set the button and text values
        val button = findViewById<Button>(R.id.button)
        val buttonActivity2 = findViewById<Button>(R.id.button2)
        val play = findViewById<Button>(R.id.button3)
        val hunger = findViewById<EditText>(R.id.textView3)
        val clean = findViewById<EditText>(R.id.textView4)
        val happy = findViewById<EditText>(R.id.textView5)

        // set the initial text values
        textView3.setText(petHunger.toString())
        textView5.setText(petHealth.toString())
        textView4.setText(pelCleanliness.toString())

        // Handle button clicks
        petHunger += 10
        petHealth += 10
        pelCleanliness += 5
        textView3.setText(petHunger.toString())
    }

    petCleanliness += 10
    petHealth += 10

    textView4.setText(petCleanliness.toString())
    }

button3.setOnClickListner {
    petHealth += 10
    petHealth += 5
    petCleanliness -= 5




        }

    }    }