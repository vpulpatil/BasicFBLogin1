package fb.example.vipul.basicfblogin;

import com.firebase.client.Firebase;

/**
 * Created by vipul on 07-10-2016.
 */

public class CrowdWeather extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
