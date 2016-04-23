package ru.omgtu.tobackendviaapi;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import ru.omgtu.tobackendviaapi.model.LoginInputModel;
import ru.omgtu.tobackendviaapi.model.LoginOutputModel;
import ru.omgtu.tobackendviaapi.ru.omgtu.tobackendviaapi.RestClient;

public class MainActivity extends Activity {
    private final String LOG_TAG = "MainActivity";
    private LoginInputModel inputModel;
    private LoginOutputModel outputModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "onCreate()");

        outputModel = new LoginOutputModel();
        outputModel.setLogin("login");
        outputModel.setPassword("pass");

        RestClient.get().login(new Callback<LoginInputModel>() {
            @Override
            public void success(LoginInputModel loginInputModel, Response response) {
                Log.d(LOG_TAG, "login success");
                Log.d(LOG_TAG, "token = "+loginInputModel.getToken());
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d(LOG_TAG, "request error");
                Log.d(LOG_TAG, "error = "+ error );
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
