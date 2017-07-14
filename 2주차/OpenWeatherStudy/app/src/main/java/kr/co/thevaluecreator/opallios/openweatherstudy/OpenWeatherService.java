package kr.co.thevaluecreator.opallios.openweatherstudy;

/**
 * Created by opallios on 2017. 7. 1..
 */


import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface OpenWeatherService {

    @GET("data/2.5/weather/")
    Call<WeatherInfo> weatherInfos(
            @Query("q") String location,
            @Query("APPID") String appkey);

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://api.openweathermap.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
