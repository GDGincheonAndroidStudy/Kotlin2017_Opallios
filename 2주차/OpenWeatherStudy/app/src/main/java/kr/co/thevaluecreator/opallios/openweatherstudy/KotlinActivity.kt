package kr.co.thevaluecreator.opallios.openweatherstudy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java)

        val tvMessage = findViewById(R.id.tv_weather_message) as TextView
        val btLoad = findViewById(R.id.bt_weather_load) as Button
        btLoad.setOnClickListener {
            val weatherService = OpenWeatherService.retrofit.create(OpenWeatherService::class.java)
            val call = weatherService.weatherInfos("Incheon", "89403c88a01fbc212db65e8fe3674374")

            call.enqueue(object : Callback<WeatherInfo> {
                override fun onResponse(call: Call<WeatherInfo>, response: Response<WeatherInfo>) {
                    if (response.isSuccessful) {
                        val info = response.body()
                        tvMessage.text = info!!.name.toString()
                   } else {

                   }
                }

                override fun onFailure(call: Call<WeatherInfo>, t: Throwable) {

                }
            })
        }
    }
}
