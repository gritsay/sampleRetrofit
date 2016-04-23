package ru.omgtu.tobackendviaapi.ru.omgtu.tobackendviaapi;

import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by gritsay on 4/23/16.
 */
public class RestClient {
    private static SampleAPI restClient;

    static {
        setupRestClient();
    }

    private RestClient() {

    }
    public static SampleAPI get() {
        return restClient;
    }

    private static void setupRestClient() {
        RestAdapter.Builder builder = new RestAdapter.Builder()
                .setEndpoint("https://api.myjson.com")
                .setClient(new OkClient(new OkHttpClient()))
                .setLogLevel(RestAdapter.LogLevel.FULL);

        RestAdapter restAdapter = builder.build();
        restClient = restAdapter.create(SampleAPI.class);
    }
}
