package com.reactlibrary;

import android.app.TimePickerDialog;
import android.widget.TimePicker;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

public class TimePickerModule extends ReactContextBaseJavaModule {

    public TimePickerModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "TimePickerModule";
    }

    @ReactMethod
    public void open(ReadableMap readableMap, final Promise promise) {
        int hour = readableMap.getInt("hour");
        int minute = readableMap.getInt("minute");
        boolean is24HourView = readableMap.getBoolean("is24HourView");
        int minuteInterval = readableMap.getInt("minuteInterval");
        CustomTimePickerDialog customTimePickerDialog = new CustomTimePickerDialog(getCurrentActivity(), new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
                WritableMap map = Arguments.createMap();
                map.putString("action", "dateSetAction");
                map.putInt("hour", hourOfDay);
                map.putInt("minute", minute);
                promise.resolve(map);
            }
        }, hour, minute, is24HourView, minuteInterval);
        customTimePickerDialog.show();
    }
}
