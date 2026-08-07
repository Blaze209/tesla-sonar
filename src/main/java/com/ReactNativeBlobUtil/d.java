package com.ReactNativeBlobUtil;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.SparseArray;
import androidx.core.content.FileProvider;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.io.File;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static ReactApplicationContext f19645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final LinkedBlockingQueue<Runnable> f19646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadPoolExecutor f19647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static LinkedBlockingQueue<Runnable> f19648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ThreadPoolExecutor f19649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f19650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final SparseArray<Promise> f19651h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OkHttpClient f19652a;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f19655c;

        a(String str, String str2, Promise promise) {
            this.f19653a = str;
            this.f19654b = str2;
            this.f19655c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.c.o(this.f19653a, this.f19654b, this.f19655c);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f19657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f19660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f19661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f19662f;

        b(ReactApplicationContext reactApplicationContext, String str, String str2, int i11, int i12, String str3) {
            this.f19657a = reactApplicationContext;
            this.f19658b = str;
            this.f19659c = str2;
            this.f19660d = i11;
            this.f19661e = i12;
            this.f19662f = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            new com.ReactNativeBlobUtil.h(this.f19657a).e(this.f19658b, this.f19659c, this.f19660d, this.f19661e, this.f19662f, d.f19645b);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f19664a;

        c(Callback callback) {
            this.f19664a = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.c.e(this.f19664a, d.f19645b);
        }
    }

    /* JADX INFO: renamed from: com.ReactNativeBlobUtil.d$d, reason: collision with other inner class name */
    class C0405d implements ActivityEventListener {
        C0405d() {
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
            Integer num = ad.a.f971a;
            if (i11 == num.intValue() && i12 == -1) {
                ((Promise) d.f19651h.get(num.intValue())).resolve(intent.getData().toString());
                d.f19651h.remove(num.intValue());
            }
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onNewIntent(Intent intent) {
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Promise f19670d;

        e(String str, String str2, String str3, Promise promise) {
            this.f19667a = str;
            this.f19668b = str2;
            this.f19669c = str3;
            this.f19670d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.c.b(this.f19667a, this.f19668b, this.f19669c, this.f19670d);
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f19673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f19674c;

        f(String str, ReadableArray readableArray, Promise promise) {
            this.f19672a = str;
            this.f19673b = readableArray;
            this.f19674c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.c.c(this.f19672a, this.f19673b, this.f19674c);
        }
    }

    class g implements LifecycleEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f19676a;

        g(Promise promise) {
            this.f19676a = promise;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            if (d.f19650g) {
                this.f19676a.resolve(null);
            }
            d.f19645b.removeLifecycleEventListener(this);
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Callback f19680c;

        h(String str, String str2, Callback callback) {
            this.f19678a = str;
            this.f19679b = str2;
            this.f19680c = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.c.a(this.f19678a, this.f19679b, this.f19680c);
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f19684c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Promise f19685d;

        i(String str, String str2, boolean z11, Promise promise) {
            this.f19682a = str;
            this.f19683b = str2;
            this.f19684c = z11;
            this.f19685d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.c.v(this.f19682a, this.f19683b, this.f19684c, this.f19685d);
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f19688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f19689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Promise f19690d;

        j(String str, ReadableArray readableArray, boolean z11, Promise promise) {
            this.f19687a = str;
            this.f19688b = readableArray;
            this.f19689c = z11;
            this.f19690d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.c.C(this.f19687a, this.f19688b, this.f19689c, this.f19690d);
        }
    }

    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f19695d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f19696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Promise f19697f;

        k(String str, String str2, String str3, boolean z11, boolean z12, Promise promise) {
            this.f19692a = str;
            this.f19693b = str2;
            this.f19694c = str3;
            this.f19695d = z11;
            this.f19696e = z12;
            this.f19697f = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.c.D(this.f19692a, this.f19693b, this.f19694c, this.f19695d, this.f19696e, this.f19697f);
        }
    }

    class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ReadableArray f19699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f19700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Callback f19701c;

        l(ReadableArray readableArray, ReactApplicationContext reactApplicationContext, Callback callback) {
            this.f19699a = readableArray;
            this.f19700b = reactApplicationContext;
            this.f19701c = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f19699a.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            for (int i11 = 0; i11 < size; i11++) {
                ReadableMap map = this.f19699a.getMap(i11);
                if (map.hasKey("path")) {
                    strArr[i11] = map.getString("path");
                    if (map.hasKey("mime")) {
                        strArr2[i11] = map.getString("mime");
                    } else {
                        strArr2[i11] = null;
                    }
                }
            }
            new com.ReactNativeBlobUtil.c(this.f19700b).x(strArr, strArr2, this.f19701c);
        }
    }

    static {
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
        f19646c = linkedBlockingQueue;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f19647d = new ThreadPoolExecutor(5, 10, DeviceOrientationRequest.OUTPUT_PERIOD_FAST, timeUnit, linkedBlockingQueue);
        f19648e = new LinkedBlockingQueue<>();
        f19649f = new ThreadPoolExecutor(2, 10, DeviceOrientationRequest.OUTPUT_PERIOD_FAST, timeUnit, linkedBlockingQueue);
        f19650g = false;
        f19651h = new SparseArray<>();
    }

    public d(ReactApplicationContext reactApplicationContext) {
        OkHttpClient okHttpClientF = com.facebook.react.modules.network.h.f();
        this.f19652a = okHttpClientF;
        ((com.facebook.react.modules.network.a) okHttpClientF.cookieJar()).b(new JavaNetCookieJar(new com.facebook.react.modules.network.d(reactApplicationContext)));
        f19645b = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(new C0405d());
    }

    public void A(String str, String str2, Callback callback) {
        com.ReactNativeBlobUtil.c.u(str, str2, callback);
    }

    public void B(String str, String str2, boolean z11, Promise promise) {
        f19647d.execute(new i(str, str2, z11, promise));
    }

    public void C(String str, String str2, int i11, int i12, String str3) {
        f19649f.execute(new b(f19645b, str, str2, i11, i12, str3));
    }

    public void D(ReadableArray readableArray, Callback callback) {
        com.ReactNativeBlobUtil.c.w(readableArray, callback);
    }

    public void E(ReadableArray readableArray, Callback callback) {
        f19647d.execute(new l(readableArray, f19645b, callback));
    }

    public void F(String str, String str2, long j11, long j12, Promise promise) {
        com.ReactNativeBlobUtil.c.y(str, str2, j11, j12, "", promise);
    }

    public void G(String str, Callback callback) {
        com.ReactNativeBlobUtil.c.z(str, callback);
    }

    public void H(String str, Callback callback) {
        com.ReactNativeBlobUtil.c.B(str, callback);
    }

    public void I(String str, ReadableArray readableArray, Callback callback) {
        com.ReactNativeBlobUtil.h.f(str, readableArray, callback);
    }

    public void J(String str, String str2, Callback callback) {
        com.ReactNativeBlobUtil.h.g(str, str2, callback);
    }

    public void K(String str, String str2, String str3, boolean z11, boolean z12, Promise promise) {
        f19647d.execute(new k(str, str2, str3, z11, z12, promise));
    }

    public void L(String str, ReadableArray readableArray, boolean z11, Promise promise) {
        f19647d.execute(new j(str, readableArray, z11, promise));
    }

    public void M(String str, String str2, boolean z11, Callback callback) {
        new com.ReactNativeBlobUtil.h(f19645b).h(str, str2, z11, callback);
    }

    public void N(String str, String str2, boolean z11, Promise promise) {
        if (com.ReactNativeBlobUtil.e.f(Uri.parse(str), str2, z11, promise, f19645b)) {
            promise.resolve("Success");
        }
    }

    public void c(String str, String str2, String str3, Promise promise) {
        Uri uriForFile;
        try {
            if (com.ReactNativeBlobUtil.i.e(str)) {
                uriForFile = Uri.parse(str);
            } else {
                uriForFile = FileProvider.getUriForFile(f19645b, f19645b.getPackageName() + ".provider", new File(str));
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriForFile, str2);
            intent.setFlags(1);
            intent.addFlags(268435456);
            if (str3 != null) {
                intent = Intent.createChooser(intent, str3);
            }
            try {
                f19645b.startActivity(intent);
                promise.resolve(Boolean.TRUE);
            } catch (ActivityNotFoundException unused) {
                promise.reject("ENOAPP", "No app installed for " + str2);
            }
            f19650g = true;
            f19645b.addLifecycleEventListener(new g(promise));
        } catch (Exception e11) {
            promise.reject("EUNSPECIFIED", e11.getLocalizedMessage());
        }
    }

    public void d(ReadableMap readableMap, Promise promise) {
        DownloadManager downloadManager = (DownloadManager) f19645b.getSystemService("download");
        if (readableMap == null || !readableMap.hasKey("path")) {
            promise.reject("EINVAL", "ReactNativeBlobUtil.addCompleteDownload config or path missing.");
            return;
        }
        String strF = com.ReactNativeBlobUtil.i.f(readableMap.getString("path"));
        if (strF == null) {
            promise.reject("EINVAL", "ReactNativeBlobUtil.addCompleteDownload can not resolve URI:" + readableMap.getString("path"));
            return;
        }
        try {
            downloadManager.addCompletedDownload(readableMap.hasKey("title") ? readableMap.getString("title") : "", readableMap.hasKey("description") ? readableMap.getString("description") : "", true, readableMap.hasKey("mime") ? readableMap.getString("mime") : null, strF, Long.valueOf(com.ReactNativeBlobUtil.c.A(strF).getString("size")).longValue(), readableMap.hasKey("showNotification") && readableMap.getBoolean("showNotification"));
            promise.resolve(null);
        } catch (Exception e11) {
            promise.reject("EUNSPECIFIED", e11.getLocalizedMessage());
        }
    }

    public void e(String str, Callback callback) {
        try {
            com.ReactNativeBlobUtil.g.f(str);
            callback.invoke(null, str);
        } catch (Exception e11) {
            callback.invoke(e11.getLocalizedMessage(), null);
        }
    }

    public void f(String str, Callback callback) {
        com.ReactNativeBlobUtil.h.a(str, callback);
    }

    public void g(String str, String str2, Promise promise) {
        com.ReactNativeBlobUtil.e.a(Uri.parse(str), str2, promise);
    }

    public void h(ReadableMap readableMap, String str, String str2, Promise promise) {
        if (!readableMap.hasKey("name") || !readableMap.hasKey("parentFolder") || !readableMap.hasKey("mimeType")) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid filedata: " + readableMap.toString());
            return;
        }
        if (str == null) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid mediatype");
            return;
        }
        if (str2 == null) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid path");
            return;
        }
        Uri uriB = com.ReactNativeBlobUtil.e.b(new cd.a(readableMap.getString("name"), readableMap.getString("mimeType"), readableMap.getString("parentFolder")), com.ReactNativeBlobUtil.e.a.valueOf(str), f19645b);
        if (uriB == null) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "File could not be created");
        } else if (com.ReactNativeBlobUtil.e.f(uriB, str2, false, promise, f19645b)) {
            promise.resolve(uriB.toString());
        }
    }

    public void i(String str, String str2, Callback callback) {
        f19647d.execute(new h(str, str2, callback));
    }

    public void j(String str, String str2, String str3, Promise promise) {
        f19647d.execute(new e(str, str2, str3, promise));
    }

    public void k(String str, ReadableArray readableArray, Promise promise) {
        f19647d.execute(new f(str, readableArray, promise));
    }

    public void l(ReadableMap readableMap, String str, Promise promise) {
        if (!readableMap.hasKey("name") || !readableMap.hasKey("parentFolder") || !readableMap.hasKey("mimeType")) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid filedata: " + readableMap.toString());
            return;
        }
        if (str == null) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid mediatype");
        }
        Uri uriB = com.ReactNativeBlobUtil.e.b(new cd.a(readableMap.getString("name"), readableMap.getString("mimeType"), readableMap.getString("parentFolder")), com.ReactNativeBlobUtil.e.a.valueOf(str), f19645b);
        if (uriB != null) {
            promise.resolve(uriB.toString());
        } else {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "File could not be created");
        }
    }

    public void m(Callback callback) {
        f19649f.execute(new c(callback));
    }

    public void n(String str, int i11, int i12) {
        com.ReactNativeBlobUtil.g.B.put(str, new com.ReactNativeBlobUtil.f(true, i11, i12, com.ReactNativeBlobUtil.f.a.Download));
    }

    public void o(String str, int i11, int i12) {
        com.ReactNativeBlobUtil.g.C.put(str, new com.ReactNativeBlobUtil.f(true, i11, i12, com.ReactNativeBlobUtil.f.a.Upload));
    }

    public void p(String str, Callback callback) {
        com.ReactNativeBlobUtil.c.f(str, callback);
    }

    public void q(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, Callback callback) {
        new com.ReactNativeBlobUtil.g(readableMap, str, str2, str3, readableMap2, str4, null, this.f19652a, callback).run();
    }

    public void r(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, ReadableArray readableArray, Callback callback) {
        new com.ReactNativeBlobUtil.g(readableMap, str, str2, str3, readableMap2, null, readableArray, this.f19652a, callback).run();
    }

    public void s(String str, String str2, Promise promise) {
        com.ReactNativeBlobUtil.e.c(Uri.parse(str), str2, promise);
    }

    public void t(String str, Promise promise) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        if (str != null) {
            intent.setType(str);
        } else {
            intent.setType("*/*");
        }
        SparseArray<Promise> sparseArray = f19651h;
        Integer num = ad.a.f971a;
        sparseArray.put(num.intValue(), promise);
        f19645b.startActivityForResult(intent, num.intValue(), null);
    }

    public void u(Promise promise) {
        com.ReactNativeBlobUtil.c.k(f19645b, promise);
    }

    public void v(Promise promise) {
        com.ReactNativeBlobUtil.c.l(f19645b, promise);
    }

    public void w(String str, String str2, Promise promise) {
        f19647d.execute(new a(str, str2, promise));
    }

    public void x(String str, Promise promise) {
        com.ReactNativeBlobUtil.c.r(str, promise);
    }

    public void y(String str, Callback callback) {
        com.ReactNativeBlobUtil.c.s(str, callback);
    }

    public void z(String str, Promise promise) {
        com.ReactNativeBlobUtil.c.t(str, promise);
    }
}
