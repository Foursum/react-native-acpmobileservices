package com.foursum.reactnative;

import android.util.Log;
import android.net.Uri;
import java.lang.Exception;

import com.adobe.marketing.mobile.InvalidInitException;
import com.adobe.marketing.mobile.MobileServices;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;

public class RCTACPMobileServicesModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RCTACPMobileServicesModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "ACPMobileServices";
    }

    @ReactMethod
    public void extensionVersion(final Promise promise) {
        promise.resolve("1.0.1");
    }

    @ReactMethod
    public void registerExtension() {
        try {
            MobileServices.registerExtension();
        } catch (Exception e) {
            Log.d(getName(), "Registering Campaign extension failed with error: " + e.getMessage());
        }
    }

    @ReactMethod
    public void trackDeepLink(final String deepLinkURL) {
        Uri uri = Uri.parse(deepLinkURL);
        MobileServices.trackAdobeDeepLink(uri);
    }
}
