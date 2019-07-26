package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public class RNReactNativeDatepicker extends ReactContextBaseJavaModule {

    public RNReactNativeDatepicker(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "RNReactNativeDatepicker";
    }
}
