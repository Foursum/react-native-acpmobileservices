package com.foursum.reactnative;

import android.util.Log;
import android.net.Uri;

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
        return "ACPMobileServicesModule";
    }

    @ReactMethod
    public void extensionVersion(final Promise promise) {
        promise.resolve(MobileServices.extensionVersion());
    }

    @ReactMethod
    public void registerExtension() {
        try {
            MobileServices.registerExtension();
        } catch (InvalidInitException e) {
            Log.d(getName(), "Registering Campaign extension failed with error: " + e.getMessage());
        }
    }

    @ReactMethod
    public void trackDeepLink(final String deepLinkURL) {
        Uri uri = Uri.parse(deepLinkURL);
        MobileServices.trackAdobeDeepLink(uri);
    }
}
