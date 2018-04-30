package com.example.imransk.notification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
private NotificationCompat.Builder noBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        noBuilder=new NotificationCompat.Builder(this);

        noBuilder.setAutoCancel(true);
    }

    public void notificationStart(View view) {

        noBuilder.setSmallIcon(R.drawable.boy);
        noBuilder.setContentTitle("Normal Notification");
        noBuilder.setContentText("Hello this is normal notifacition");
        noBuilder.setTicker("Welcome");

        Intent intent=new Intent(this,ResultActivity.class);

        android.support.v4.app.TaskStackBuilder taskStackBuilder= android.support.v4.app.TaskStackBuilder.create(this);

        taskStackBuilder.addParentStack(ResultActivity.class);
        taskStackBuilder.addNextIntent(intent);

        PendingIntent pendingIntent=taskStackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
        noBuilder.setContentIntent(pendingIntent);

        NotificationManager notificationManager= (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(100,noBuilder.build());
    }

    public void BignotificationStart(View view) {

        noBuilder.setSmallIcon(R.drawable.boy);
        noBuilder.setContentTitle("Normal Notification");
        noBuilder.setContentText("Hello this is normal notifacition");
        noBuilder.setTicker("Welcome");

        noBuilder.setStyle(new NotificationCompat.BigTextStyle().bigText("hello i am from bangladesh. hello i am from bangladesh. hello i am from bangladesh."));

        Intent intent=new Intent(this,ResultActivity.class);

        android.support.v4.app.TaskStackBuilder taskStackBuilder= android.support.v4.app.TaskStackBuilder.create(this);

        taskStackBuilder.addParentStack(ResultActivity.class);
        taskStackBuilder.addNextIntent(intent);

        PendingIntent pendingIntent=taskStackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
        noBuilder.setContentIntent(pendingIntent);

        NotificationManager notificationManager= (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(100,noBuilder.build());

    }
}
