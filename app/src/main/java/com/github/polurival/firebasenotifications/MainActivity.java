package com.github.polurival.firebasenotifications;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * <a href='https://www.youtube.com/watch?v=IlzcXlOatCo'>
 *     Firebase в android: Push Notifications
 *     или как реализовать рассылку уведомлений в приложении</a>
 * <p>See also <a href='https://firebase.google.com/docs/notifications/android/console-audience?utm_source=studio#receive_and_handle_notifications'>
 *     Firebase documentation</a></p>
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
