package cc;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes3.dex */
public class q extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f19035a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f19036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static q f19037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Promise f19038d;

    public static void a(String str) {
        Promise promise = f19038d;
        if (promise != null) {
            promise.reject(str);
        }
        f19038d = null;
    }

    public static void b(Object obj) {
        Promise promise = f19038d;
        if (promise != null) {
            promise.resolve(obj);
        }
        f19038d = null;
    }

    @TargetApi(22)
    public static IntentSender c(ReactContext reactContext) {
        synchronized (f19035a) {
            try {
                if (f19036b == null) {
                    f19036b = reactContext.getPackageName() + "/" + q.class.getName() + "_ACTION";
                }
                Context applicationContext = reactContext.getApplicationContext();
                q qVar = f19037c;
                if (qVar != null) {
                    applicationContext.unregisterReceiver(qVar);
                }
                f19037c = new q();
                if (Build.VERSION.SDK_INT < 34 || applicationContext.getApplicationInfo().targetSdkVersion < 34) {
                    applicationContext.registerReceiver(f19037c, new IntentFilter(f19036b));
                } else {
                    applicationContext.registerReceiver(f19037c, new IntentFilter(f19036b), 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Intent intent = new Intent(f19036b);
        intent.setPackage(reactContext.getPackageName());
        intent.setClass(reactContext.getApplicationContext(), q.class);
        intent.putExtra("receiver_token", f19037c.hashCode());
        return PendingIntent.getBroadcast(reactContext, 0, intent, 1409286144).getIntentSender();
    }

    public static boolean d() {
        return true;
    }

    public static void e(Promise promise) {
        f19038d = promise;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        synchronized (f19035a) {
            try {
                if (f19037c != this) {
                    return;
                }
                context.getApplicationContext().unregisterReceiver(f19037c);
                f19037c = null;
                if (intent.hasExtra("receiver_token") && intent.getIntExtra("receiver_token", 0) == hashCode()) {
                    ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("success", true);
                    if (componentName != null) {
                        writableMapCreateMap.putString("message", componentName.flattenToString());
                    } else {
                        writableMapCreateMap.putString("message", "OK");
                    }
                    b(writableMapCreateMap);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
