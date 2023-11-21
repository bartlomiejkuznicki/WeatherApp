package db;

import java.util.HashMap;
import java.util.Map;

public class CityWeatherDb {
    private static final Map<Long, CityDataEnity> dataBase = new HashMap<>();

    // TODO: metody do pracy nad bazą danych, dodawanie itp...
    public void add(CityDataEnity enity) {
        dataBase.put(enity.getId(), enity);
    }

    public CityDataEnity change(Long id, String name, WeatherDataEntity weatherDataEntity) {
//logika
        return dataBase.get(id);

    }


    public CityDataEnity change(CityDataEnity cityDataEnity) {
        final CityDataEnity toChange = dataBase.get(cityDataEnity.getId());
        toChange.setName(cityDataEnity.getName());
        toChange.setWeatherDataEntity(cityDataEnity.getWeatherDataEntity());
        return  dataBase.put(cityDataEnity.getId(), toChange);
        //wyszukac po id
        //zmienic wartosc w obiekcie na takie jakie dostaje metoda
    }
}