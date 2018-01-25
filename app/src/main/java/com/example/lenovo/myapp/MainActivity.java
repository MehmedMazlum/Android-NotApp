package com.example.lenovo.myapp;

import android.os.Bundle;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.NotificationCompat;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{
    NotificationCompat.Builder notification;
    private static final int uniqueID=45612;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notification = new NotificationCompat.Builder(this);
        notification.setAutoCancel(true);
    }
     public  void mazlumButtonClicked(View view){
         //notification.setSmallIcon(R.drawable.ic_launcher);
         notification.setTicker("this is the ticker");
         notification.setWhen(System.currentTimeMillis());
         notification.setContentTitle("here is the title");
         notification.setContentText("ım text of notification");


         Intent intent = new Intent(this, MainActivity.class);
         PendingIntent pIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
         notification.setContentIntent(pIntent);

         NotificationManager nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
         nm.notify(uniqueID,notification.build());





     }
}
