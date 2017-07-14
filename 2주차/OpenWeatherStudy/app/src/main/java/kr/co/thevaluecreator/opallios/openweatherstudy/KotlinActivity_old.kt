package kr.co.thevaluecreator.opallios.openweatherstudy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_kotlin.*

class KotlinActivity_old : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        var weatherService = OpenWeatherService.retrofit.create(OpenWeatherService::class.java);
        var call = weatherService.weatherInfos("Incheon", "89403c88a01fbc212db65e8fe3674374");
        var result = call.execute().body();
//        initView()
    }

    fun initView() {
        btn_next_act.setOnClickListener{ view->
            var weatherService = OpenWeatherService.retrofit.create(OpenWeatherService::class.java);
            var call = weatherService.weatherInfos("Incheon", "89403c88a01fbc212db65e8fe3674374");
            var result = call.execute().body();

//           var message = Util.getMessage()
//            tv_message.setText(message)
        }
    }

}