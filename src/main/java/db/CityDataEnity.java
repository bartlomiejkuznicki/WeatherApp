package db;

import java.time.LocalDate;

public class CityDataEnity {
    private Long id;
    private String name;
    private WeatherDataEntity weatherDataEntity;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public WeatherDataEntity getWeatherDataEntity() {
        return weatherDataEntity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeatherDataEntity(WeatherDataEntity weatherDataEntity) {
        this.weatherDataEntity = weatherDataEntity;
    }
}
