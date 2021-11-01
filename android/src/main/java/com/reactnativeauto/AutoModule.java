package com.reactnativeauto;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

import java.util.WeakHashMap;


@ReactModule(name = AutoModule.NAME)
public class AutoModule extends ReactContextBaseJavaModule {
  public static final String NAME = "Auto";

  private static ReactApplicationContext mReactContext;
  private CarContext mCarContext;
  private CarScreen mCurrentCarScreen;
  private ScreenManager mScreenManager;

  private WeakHashMap<String, CarScreen> carScreens;
  private WeakHashMap<CarScreen, ReactCarRenderContext> reactCarRenderContextMap;

  public AutoModule(ReactApplicationContext reactContext) {
    super(reactContext);

    reactCarRenderContextMap = new WeakHashMap();
    mReactContext = context;
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }


  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  public void multiply(int a, int b, Promise promise) {
    promise.resolve(a * b);
  }

  public static native int nativeMultiply(int a, int b);
}
