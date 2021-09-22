package goodguygregory.app.milestokilometers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // assuming the user input is Kilometers
        fun calculateMile(distanceProvided :String) {
            // convert to double

        }



        conversionButton.setOnClickListener {
            val distanceProvided :String = distanceField.text.toString()


        }

    }
}
