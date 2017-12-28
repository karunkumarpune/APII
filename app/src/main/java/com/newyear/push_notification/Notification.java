package com.newyear.push_notification;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.newyear.R;

public class Notification extends AppCompatActivity {


   // AAAASuH5uV8:APA91bEFkwjSKBj8an0D2jLm_ZxZ-z7Jqmwv12wEpseEzZdrachfm6zqfwwl8PUiSzMwKYZASpMFOrrx000eBnlvXF1A-A8BRkX3EAjX6vWUe-58UHbNTKvB10-2bP6jmAaTJl_SNFMT

/*
    {
        "to": "cHVDBamXfFI:APA91bHNBQwdNpmLs54P-SUXyF1DUggMwQFWJEku3oJSwot3XykBCjQVBDNq1-oeWZMX9iiYm4B82prWXWalaWKFcpEt855AQO-3vdW5nSQcN6JpyuXIirdmsnxHaCxo2Hv69_V8x50b",
            "notification": {
        "title": "Rebate Confirmation",
                "body": "Please Confirm",
                "sound": "default",
                "click_action": "com.app.bickup_user.TrackDriverActivity"
    },
        "data": {
        "merchant_id": "20",
                "customer_id": "1",
                "points": "10",
                "totalpoints": "100",
                "message": "Please Confirm",
                "type": "customer_points_rebate_confirmation"
    }
    }
    */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

    }
}
