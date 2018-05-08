package pro.nanosystems.servicedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openService(View view) {
       // Intent i = new Intent(this, MyService.class);
       // startService(i);
       // startService(new Intent(this, MyService.class));


        startService(new Intent(this, MyService.class));
    }

    public void stopService(View view) {
        Intent i  = new Intent(this, MyService.class);
        stopService(i);
      //  stopService(new Intent(this, MyService.class));
    }
}
