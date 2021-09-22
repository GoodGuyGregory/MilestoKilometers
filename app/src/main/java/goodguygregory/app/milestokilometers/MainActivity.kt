package goodguygregory.app.milestokilometers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // assuming the user input is Kilometers
        fun calculateKilometers(distanceProvided :String): Double {
            // convert to double
            distanceProvided = distanceProvided.toDouble(distanceProvided)
            val MilesPerKM: Double = 0.62137
            var ConvertedKM = MilesPerKM * distanceProvided
            return ConvertedKM

        }

        // assumes the user input is Miles
        fun calculateMiles(distanceProvided :String): Double {
            // convert to double
            distanceProvided = distanceProvided.toDouble(distanceProvided)
            val MilesPerKM: Double = 0.62137
            var ConvertedMiles = distanceProvided / MilesPerKM
            return ConvertedMiles

        }



        conversionButton.setOnClickListener {
            val distanceProvided :String = distanceField.text.toString()


        }

    }
}
