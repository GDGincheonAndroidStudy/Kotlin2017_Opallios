package kr.co.thevaluecreator.opallios.openweatherstudy;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class JavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        final TextView tvMessage = (TextView) findViewById(R.id.tv_weather_message);
        Button btLoad = (Button) findViewById(R.id.bt_weather_load);
        btLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final OpenWeatherService weatherService = OpenWeatherService.retrofit.create(OpenWeatherService.class);
                final Call<WeatherInfo> call = weatherService.weatherInfos("Incheon", "89403c88a01fbc212db65e8fe3674374");

                call.enqueue(new Callback<WeatherInfo>() {
                    @Override
                    public void onResponse(Call<WeatherInfo> call, Response<WeatherInfo> response) {
                        if (response.isSuccessful()) {
//                            try {
//                                String strRes = response.body().string();
                            WeatherInfo info = response.body();

                            tvMessage.setText(String.valueOf(info.name));
//                            } catch(IOException e)
//                            {
//                                e.printStackTrace();
//                            }

                        } else {

                        }
                    }

                    @Override
                    public void onFailure(Call<WeatherInfo> call, Throwable t) {

                    }
                });
            }
        });
    }
}
