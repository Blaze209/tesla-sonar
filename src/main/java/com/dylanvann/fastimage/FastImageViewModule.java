package com.dylanvann.fastimage;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes3.dex */
class FastImageViewModule extends ReactContextBaseJavaModule {
    private static final String REACT_CLASS = "FastImageView";

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ReadableArray f21512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f21513b;

        a(ReadableArray readableArray, Activity activity) {
            this.f21512a = readableArray;
            this.f21513b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i11 = 0; i11 < this.f21512a.size(); i11++) {
                ReadableMap map = this.f21512a.getMap(i11);
                FastImageSource fastImageSourceC = com.dylanvann.fastimage.b.c(this.f21513b, map);
                com.bumptech.glide.c.C(this.f21513b.getApplicationContext()).mo78load(fastImageSourceC.isBase64Resource() ? fastImageSourceC.getSource() : fastImageSourceC.get_isResource() ? fastImageSourceC.getUri() : fastImageSourceC.getGlideUrl()).apply((com.bumptech.glide.request.a<?>) com.dylanvann.fastimage.b.d(this.f21513b, fastImageSourceC, map)).preload();
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f21515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Promise f21516b;

        b(Activity activity, Promise promise) {
            this.f21515a = activity;
            this.f21516b = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bumptech.glide.c.e(this.f21515a.getApplicationContext()).c();
            this.f21516b.resolve(null);
        }
    }

    FastImageViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void clearDiskCache(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve(null);
        } else {
            com.bumptech.glide.c.e(currentActivity.getApplicationContext()).b();
            promise.resolve(null);
        }
    }

    @ReactMethod
    public void clearMemoryCache(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve(null);
        } else {
            currentActivity.runOnUiThread(new b(currentActivity, promise));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public void preload(ReadableArray readableArray) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.runOnUiThread(new a(readableArray, currentActivity));
    }
}
