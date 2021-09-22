package goodguygregory.app.milestokilometers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // assuming the user input is Kilometers
        fun calculateKilometersFromMiles(distanceProvided: String): Double {
            // convert to double
            var distanceProvided = distanceProvided.toDouble()
            val MilesPerKM = 0.62137
            var ConvertedKM = distanceProvided / MilesPerKM
            val ConvertedKMDec = BigDecimal(ConvertedKM).setScale(2, RoundingMode.HALF_EVEN)
            return ConvertedKMDec.toDouble()

        }

        // assumes the user input is Miles
        fun calculateMilesFromKilometers(distanceProvided: String): Double {
            // convert to double
            var distanceProvided = distanceProvided.toDouble()
            val MilesPerKM = 0.62137
            var ConvertedMiles = distanceProvided * MilesPerKM
            val decConversionMiles = BigDecimal(ConvertedMiles).setScale(2, RoundingMode.HALF_EVEN)
            return decConversionMiles.toDouble()

        }

        fun conversionButtonClick() {
            val distanceProvided: String = distanceField.text.toString()
            // determine clicked behavior
            if (milesSwitch.isChecked() && !kilometerSwitch.isChecked()) {
                var milesFromKm:String =  calculateKilometersFromMiles(distanceProvided).toString()
                convertedValue.text = " $distanceProvided miles is  $milesFromKm kilometers"

            }

            if (!milesSwitch.isChecked() && kilometerSwitch.isChecked()) {
                var kmToMiles:String =  calculateMilesFromKilometers(distanceProvided).toString()
                convertedValue.text = " $distanceProvided Kilometers is $kmToMiles miles"
            }

            if (!milesSwitch.isChecked() && !kilometerSwitch.isChecked()) {
                convertedValue.text = "Select Conversion Format."
            }

            if (milesSwitch.isChecked() && kilometerSwitch.isChecked()) {
                convertedValue.text = "Select ONE Conversion Format."
            }
        }

        conversionButton.setOnClickListener {
            conversionButtonClick()
        }
    }
}
