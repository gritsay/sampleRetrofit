package ru.omgtu.tobackendviaapi.model;

/**
 * Created by gritsay on 4/23/16.
 */
public class LoginInputModel {

    int sucess;
    String error;
    String token;

    public int getSucess() {
        return sucess;
    }

    public String getError() {
        return error;
    }

    public String getToken() {
        return token;
    }
}
