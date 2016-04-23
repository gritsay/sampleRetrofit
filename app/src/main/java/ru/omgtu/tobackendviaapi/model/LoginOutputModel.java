package ru.omgtu.tobackendviaapi.model;

/**
 * Created by gritsay on 4/23/16.
 */
public class LoginOutputModel {

    private String login;
    private String password;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
