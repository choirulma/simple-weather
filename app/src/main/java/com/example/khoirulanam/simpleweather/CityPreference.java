package com.example.khoirulanam.simpleweather;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by khoirul.anam on 09/03/2017.
 */

public class CityPreference {
    SharedPreferences prefs;

    public CityPreference(Activity activity) {
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    public String getCity() {
        return  prefs.getString("city", "Jakarta, ID");
    }

    void setCity(String city) {
        prefs.edit().putString("city", city).commit();
    }
}
