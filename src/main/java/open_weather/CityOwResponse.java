package open_weather;

import java.time.LocalDateTime;

public class CityOwResponse {
    Wind wind;
    Main main;
    String name;
    LocalDateTime dt;

    public CityOwResponse(Wind wind, Main main, String name, LocalDateTime dt) {
        this.wind = wind;
        this.main = main;
        this.name = name;
        this.dt = dt;
    }

    public Wind getWind() {
        return wind;
    }

    public Main getMain() {
        return main;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDt() {
        return dt;
    }
}