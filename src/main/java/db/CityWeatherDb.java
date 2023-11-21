package db;

import java.util.HashMap;
import java.util.Map;

public class CityWeatherDb {
    private static final Map<Long, CityDataEnity> dataBase = new HashMap<>();

    // TODO: metody do pracy nad bazą danych, dodawanie itp...
     public void  add(CityDataEnity enity) {
         dataBase.put(enity.getId(), enity);
     }
}