package kr.co.thevaluecreator.opallios.openweatherstudy;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by opallios on 2017. 7. 1..
 */

public class WeatherInfo {
    public class Coord {
        float lon;
        float lat;
    }
    Coord coord;

    public class Weather {
        String main;
        String description;
        String icon;
    }
    List<Weather> weather;// = new ArrayList<>();

    String base;

    public class Main {
        float temp;
        float pressure;
        float humidity;
        float temp_min;
        float temp_max;
    }
    Main main;

    int visibility;

    public class Wind {
        float speed;
        float deg;
    }
    Wind wind;

    public class Clouds {
        int all;
    }
    Clouds clouds;

    long dt;

    public class Sys {
        int type;
        int id;
        double message;
        long sunrise;
        long sunset;
    }
    Sys sys;

    long id;
    String name;
    int cod;
}
