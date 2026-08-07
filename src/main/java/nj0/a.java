package nj0;

import android.Manifest;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.core.app.r;
import co.f;
import co.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f95064a;

    /* JADX INFO: renamed from: nj0.a$a, reason: collision with other inner class name */
    class C2026a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f95065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f95066b;

        C2026a(Promise promise, String str) {
            this.f95065a = promise;
            this.f95066b = str;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            int[] iArr = (int[]) objArr[0];
            if (iArr.length > 0 && iArr[0] == 0) {
                this.f95065a.resolve(PermissionsResponse.GRANTED_KEY);
            } else if (((f) objArr[1]).shouldShowRequestPermissionRationale(this.f95066b)) {
                this.f95065a.resolve("denied");
            } else {
                this.f95065a.resolve("blocked");
            }
        }
    }

    class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f95067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WritableMap f95068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f95069c;

        b(ArrayList arrayList, WritableMap writableMap, Promise promise) {
            this.f95067a = arrayList;
            this.f95068b = writableMap;
            this.f95069c = promise;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            int[] iArr = (int[]) objArr[0];
            f fVar = (f) objArr[1];
            for (int i11 = 0; i11 < this.f95067a.size(); i11++) {
                String str = (String) this.f95067a.get(i11);
                if (iArr.length > 0 && iArr[i11] == 0) {
                    this.f95068b.putString(str, PermissionsResponse.GRANTED_KEY);
                } else if (fVar.shouldShowRequestPermissionRationale(str)) {
                    this.f95068b.putString(str, "denied");
                } else {
                    this.f95068b.putString(str, "blocked");
                }
            }
            this.f95069c.resolve(this.f95068b);
        }
    }

    public static void a(ReactApplicationContext reactApplicationContext, String str, Promise promise) {
        if (str == null || h(str)) {
            promise.resolve("unavailable");
        } else if (reactApplicationContext.getBaseContext().checkSelfPermission(str) == 0) {
            promise.resolve(PermissionsResponse.GRANTED_KEY);
        } else {
            promise.resolve("denied");
        }
    }

    public static void b(Promise promise) {
        promise.reject("Permissions:checkLocationAccuracy", "checkLocationAccuracy is not supported on Android");
    }

    public static void c(ReactApplicationContext reactApplicationContext, ReadableArray readableArray, Promise promise) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Context baseContext = reactApplicationContext.getBaseContext();
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            String string = readableArray.getString(i11);
            if (h(string)) {
                writableNativeMap.putString(string, "unavailable");
            } else if (baseContext.checkSelfPermission(string) == 0) {
                writableNativeMap.putString(string, PermissionsResponse.GRANTED_KEY);
            } else {
                writableNativeMap.putString(string, "denied");
            }
        }
        promise.resolve(writableNativeMap);
    }

    public static void d(ReactApplicationContext reactApplicationContext, Promise promise) {
        promise.resolve(f(reactApplicationContext, "denied"));
    }

    public static Map<String, Object> e() {
        HashMap map = new HashMap();
        map.put("available", Arguments.createArray());
        return map;
    }

    private static WritableMap f(ReactApplicationContext reactApplicationContext, String str) {
        boolean zA = r.e(reactApplicationContext).a();
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        if (zA) {
            str = PermissionsResponse.GRANTED_KEY;
        }
        writableMapCreateMap.putString(PermissionsResponse.STATUS_KEY, str);
        writableMapCreateMap.putMap("settings", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    private static f g(ReactApplicationContext reactApplicationContext) {
        ComponentCallbacks2 currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof f) {
            return (f) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    private static boolean h(@NonNull String str) {
        try {
            Manifest.permission.class.getField(str.replace("android.permission.", "").replace("com.android.voicemail.permission.", ""));
            return false;
        } catch (NoSuchFieldException unused) {
            return true;
        }
    }

    public static boolean i(ReactApplicationContext reactApplicationContext, SparseArray<Callback> sparseArray, int i11, int[] iArr) {
        try {
            sparseArray.get(i11).invoke(iArr, g(reactApplicationContext));
            sparseArray.remove(i11);
            return sparseArray.size() == 0;
        } catch (Exception e11) {
            qk.a.p("PermissionsModule", e11, "Unexpected invocation of `onRequestPermissionsResult`", new Object[0]);
            return false;
        }
    }

    public static void j(Promise promise) {
        promise.reject("Permissions:openPhotoPicker", "openPhotoPicker is not supported on Android");
    }

    public static void k(ReactApplicationContext reactApplicationContext, Promise promise) {
        try {
            Intent intent = new Intent();
            String packageName = reactApplicationContext.getPackageName();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addFlags(268435456);
            intent.setData(Uri.fromParts("package", packageName, null));
            reactApplicationContext.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e11) {
            promise.reject("E_INVALID_ACTIVITY", e11);
        }
    }

    public static void l(ReactApplicationContext reactApplicationContext, g gVar, SparseArray<Callback> sparseArray, String str, Promise promise) {
        if (str == null || h(str)) {
            promise.resolve("unavailable");
            return;
        }
        if (reactApplicationContext.getBaseContext().checkSelfPermission(str) == 0) {
            promise.resolve(PermissionsResponse.GRANTED_KEY);
            return;
        }
        try {
            f fVarG = g(reactApplicationContext);
            sparseArray.put(f95064a, new C2026a(promise, str));
            fVarG.a(new String[]{str}, f95064a, gVar);
            f95064a++;
        } catch (IllegalStateException e11) {
            promise.reject("E_INVALID_ACTIVITY", e11);
        }
    }

    public static void m(Promise promise) {
        promise.reject("Permissions:requestLocationAccuracy", "requestLocationAccuracy is not supported on Android");
    }

    public static void n(ReactApplicationContext reactApplicationContext, g gVar, SparseArray<Callback> sparseArray, ReadableArray readableArray, Promise promise) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList();
        Context baseContext = reactApplicationContext.getBaseContext();
        int i11 = 0;
        for (int i12 = 0; i12 < readableArray.size(); i12++) {
            String string = readableArray.getString(i12);
            if (h(string)) {
                writableNativeMap.putString(string, "unavailable");
            } else {
                if (baseContext.checkSelfPermission(string) == 0) {
                    writableNativeMap.putString(string, PermissionsResponse.GRANTED_KEY);
                } else {
                    arrayList.add(string);
                }
            }
            i11++;
        }
        if (readableArray.size() == i11) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            f fVarG = g(reactApplicationContext);
            sparseArray.put(f95064a, new b(arrayList, writableNativeMap, promise));
            fVarG.a((String[]) arrayList.toArray(new String[0]), f95064a, gVar);
            f95064a++;
        } catch (IllegalStateException e11) {
            promise.reject("E_INVALID_ACTIVITY", e11);
        }
    }

    public static void o(ReactApplicationContext reactApplicationContext, Promise promise) {
        promise.resolve(f(reactApplicationContext, "blocked"));
    }

    public static void p(ReactApplicationContext reactApplicationContext, String str, Promise promise) {
        if (str == null) {
            promise.resolve(Boolean.FALSE);
            return;
        }
        try {
            promise.resolve(Boolean.valueOf(g(reactApplicationContext).shouldShowRequestPermissionRationale(str)));
        } catch (IllegalStateException e11) {
            promise.reject("E_INVALID_ACTIVITY", e11);
        }
    }
}
