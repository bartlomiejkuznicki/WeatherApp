package api;

import com.google.gson.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class HttpClientService<T> {

    private static HttpClient client = HttpClient.newHttpClient();

    public T getWeather(String url, Class<T> responseClass) {
        var request = HttpRequest
                .newBuilder()
                .uri(URI.create(url))
                .GET()
                .header("Accept", "application/json")
                .build();

        try {
            var bodyAsString = client.send(request, HttpResponse.BodyHandlers.ofString()).body();

            final Gson gson = new GsonBuilder().registerTypeAdapter(
                    LocalDateTime.class,
                    new JsonDeserializer<LocalDateTime>() {
                        @Override
                        public LocalDateTime deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                            var dateTimeJson = json.getAsJsonPrimitive().getAsLong();
                            return LocalDateTime.ofInstant(Instant.ofEpochMilli(dateTimeJson), ZoneId.systemDefault());
                        }
                    }
            ).create();

            return gson.fromJson(bodyAsString, responseClass);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
