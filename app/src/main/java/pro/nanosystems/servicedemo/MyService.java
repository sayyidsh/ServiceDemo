package pro.nanosystems.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {
    private static final String TAG = "MyService";
    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Service Created.", Toast.LENGTH_LONG).show();
        Log.i(TAG, "onCreate: Service Created.");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Service Started.", Toast.LENGTH_LONG).show();
        Log.i(TAG, "onStartCommand: Service Started.");
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Stoped.", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onDestroy: Service Stoped.");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
