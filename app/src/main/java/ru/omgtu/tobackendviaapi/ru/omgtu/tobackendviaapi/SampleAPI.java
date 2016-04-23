package ru.omgtu.tobackendviaapi.ru.omgtu.tobackendviaapi;


import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.POST;
import ru.omgtu.tobackendviaapi.model.LoginInputModel;
import ru.omgtu.tobackendviaapi.model.LoginOutputModel;

/**
 * Created by gritsay on 4/23/16.
 */

public interface SampleAPI {
    @Headers("Content-Type: application/json")
    @GET("/bins/4n2xe")
    void login( Callback<LoginInputModel> callback);

}
