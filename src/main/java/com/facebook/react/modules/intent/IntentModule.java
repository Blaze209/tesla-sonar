package com.facebook.react.modules.intent;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.fbreact.specs.NativeIntentAndroidSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import xn.a;

/* JADX INFO: loaded from: classes3.dex */
@a(name = "IntentAndroid")
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0017\u0018\u0000 %2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\nJ!\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\nJ+\u0010\u001d\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/facebook/react/modules/intent/IntentModule;", "Lcom/facebook/fbreact/specs/NativeIntentAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "waitForActivityAndGetInitialURL", "(Lcom/facebook/react/bridge/Promise;)V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "", "useNewTaskFlag", "sendOSIntent", "(Landroid/content/Intent;Z)V", "invalidate", "()V", "getInitialURL", "", ImagesContract.URL, "openURL", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "canOpenURL", "openSettings", "action", "Lcom/facebook/react/bridge/ReadableArray;", "extras", "sendIntent", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/LifecycleEventListener;", "initialURLListener", "Lcom/facebook/react/bridge/LifecycleEventListener;", "", "pendingOpenURLPromises", "Ljava/util/List;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class IntentModule extends NativeIntentAndroidSpec {
    private static final String EXTRA_MAP_KEY_FOR_VALUE = "value";
    public static final String NAME = "IntentAndroid";
    private LifecycleEventListener initialURLListener;
    private final List<Promise> pendingOpenURLPromises;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22809a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22809a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"com/facebook/react/modules/intent/IntentModule$c", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Ljn0/h0;", "onHostResume", "()V", "onHostPause", "onHostDestroy", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements LifecycleEventListener {
        c() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            IntentModule.this.getReactApplicationContext().removeLifecycleEventListener(this);
            IntentModule intentModule = IntentModule.this;
            synchronized (intentModule) {
                try {
                    Iterator it = intentModule.pendingOpenURLPromises.iterator();
                    while (it.hasNext()) {
                        intentModule.getInitialURL((Promise) it.next());
                    }
                    intentModule.initialURLListener = null;
                    intentModule.pendingOpenURLPromises.clear();
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntentModule(ReactApplicationContext reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.pendingOpenURLPromises = new ArrayList();
    }

    private final void sendOSIntent(Intent intent, boolean useNewTaskFlag) {
        String packageName;
        Activity currentActivity = getCurrentActivity();
        String packageName2 = getReactApplicationContext().getPackageName();
        PackageManager packageManager = getReactApplicationContext().getPackageManager();
        ComponentName component = packageManager == null ? intent.getComponent() : intent.resolveActivity(packageManager);
        if (component == null || (packageName = component.getPackageName()) == null) {
            packageName = "";
        }
        if (useNewTaskFlag || currentActivity == null || !s.f(packageName2, packageName)) {
            intent.addFlags(268435456);
        }
        if (currentActivity != null) {
            currentActivity.startActivity(intent);
        } else {
            getReactApplicationContext().startActivity(intent);
        }
    }

    private final synchronized void waitForActivityAndGetInitialURL(Promise promise) {
        this.pendingOpenURLPromises.add(promise);
        if (this.initialURLListener != null) {
            return;
        }
        this.initialURLListener = new c();
        getReactApplicationContext().addLifecycleEventListener(this.initialURLListener);
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void canOpenURL(String url, Promise promise) {
        s.k(promise, "promise");
        if (url == null || url.length() == 0) {
            promise.reject(new JSApplicationIllegalArgumentException("Invalid URL: " + url));
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            intent.addFlags(268435456);
            PackageManager packageManager = getReactApplicationContext().getPackageManager();
            promise.resolve(Boolean.valueOf((packageManager == null || intent.resolveActivity(packageManager) == null) ? false : true));
        } catch (Exception e11) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not check if URL '" + url + "' can be opened: " + e11.getMessage()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void getInitialURL(Promise promise) {
        s.k(promise, "promise");
        try {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null) {
                waitForActivityAndGetInitialURL(promise);
                return;
            }
            Intent intent = currentActivity.getIntent();
            String action = intent.getAction();
            Uri data = intent.getData();
            promise.resolve((data == null || !(s.f("android.intent.action.VIEW", action) || s.f("android.nfc.action.NDEF_DISCOVERED", action))) ? null : data.toString());
        } catch (Exception e11) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not get the initial URL : " + e11.getMessage()));
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        synchronized (this) {
            try {
                this.pendingOpenURLPromises.clear();
                LifecycleEventListener lifecycleEventListener = this.initialURLListener;
                if (lifecycleEventListener != null) {
                    getReactApplicationContext().removeLifecycleEventListener(lifecycleEventListener);
                    h0 h0Var = h0.f84049a;
                }
                this.initialURLListener = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.invalidate();
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void openSettings(Promise promise) {
        s.k(promise, "promise");
        try {
            Intent intent = new Intent();
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String packageName = getReactApplicationContext().getPackageName();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + packageName));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            currentActivity.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e11) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not open the Settings: " + e11.getMessage()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void openURL(String url, Promise promise) {
        s.k(promise, "promise");
        if (url == null || url.length() == 0) {
            promise.reject(new JSApplicationIllegalArgumentException("Invalid URL: " + url));
            return;
        }
        try {
            sendOSIntent(new Intent("android.intent.action.VIEW", Uri.parse(url).normalizeScheme()), false);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e11) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not open URL '" + url + "': " + e11.getMessage()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void sendIntent(String action, ReadableArray extras, Promise promise) {
        s.k(promise, "promise");
        if (action == null || action.length() == 0) {
            promise.reject(new JSApplicationIllegalArgumentException("Invalid Action: " + action + "."));
            return;
        }
        Intent intent = new Intent(action);
        PackageManager packageManager = getReactApplicationContext().getPackageManager();
        if (packageManager == null || intent.resolveActivity(packageManager) == null) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not launch Intent with action " + action + "."));
            return;
        }
        if (extras != null) {
            int size = extras.size();
            for (int i11 = 0; i11 < size; i11++) {
                ReadableMap map = extras.getMap(i11);
                if (map != null) {
                    String string = map.getString(Action.KEY_ATTRIBUTE);
                    int i12 = b.f22809a[map.getType("value").ordinal()];
                    if (i12 == 1) {
                        intent.putExtra(string, map.getString("value"));
                    } else if (i12 == 2) {
                        intent.putExtra(string, map.getDouble("value"));
                    } else {
                        if (i12 != 3) {
                            promise.reject(new JSApplicationIllegalArgumentException("Extra type for " + string + " not supported."));
                            return;
                        }
                        intent.putExtra(string, map.getBoolean("value"));
                    }
                }
            }
        }
        sendOSIntent(intent, true);
    }
}
