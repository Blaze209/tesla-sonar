package com.facebook.react.devsupport;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.Settings;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eo.a f22517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jo.d f22518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OkHttpClient f22519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.facebook.react.devsupport.b f22520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t0 f22521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f22522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f22523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private jo.b f22524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k0 f22525i;

    class a extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f22526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22527b;

        /* JADX INFO: renamed from: com.facebook.react.devsupport.k$a$a, reason: collision with other inner class name */
        class C0450a extends jo.c {
            C0450a() {
            }

            @Override // jo.f
            public void a(Object obj) {
                a.this.f22526a.a();
            }
        }

        class b extends jo.c {
            b() {
            }

            @Override // jo.f
            public void a(Object obj) {
                a.this.f22526a.d();
            }
        }

        class c implements jo.e.b {
            c() {
            }

            @Override // jo.e.b
            public void a() {
                a.this.f22526a.c();
            }

            @Override // jo.e.b
            public void b() {
                a.this.f22526a.e();
            }
        }

        a(g gVar, String str) {
            this.f22526a = gVar;
            this.f22527b = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            HashMap map = new HashMap();
            map.put("reload", new C0450a());
            map.put("devMenu", new b());
            Map<String, jo.f> mapB = this.f22526a.b();
            if (mapB != null) {
                map.putAll(mapB);
            }
            map.putAll(new jo.a().d());
            c cVar = new c();
            k.this.f22524h = new jo.b(this.f22527b, k.this.f22518b, map, cVar);
            k.this.f22524h.f();
            return null;
        }
    }

    class b extends AsyncTask<Void, Void, Void> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            if (k.this.f22524h != null) {
                k.this.f22524h.e();
                k.this.f22524h = null;
            }
            return null;
        }
    }

    class c extends AsyncTask<Void, Void, Void> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            Map<String, String> mapE = com.facebook.react.modules.systeminfo.a.e(k.this.f22522f);
            k.this.f22525i = new CxxInspectorPackagerConnection(k.this.s(), mapE.get("deviceName"), k.this.f22523g);
            k.this.f22525i.connect();
            return null;
        }
    }

    class d extends AsyncTask<Void, Void, Void> {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            if (k.this.f22525i != null) {
                k.this.f22525i.closeQuietly();
                k.this.f22525i = null;
            }
            return null;
        }
    }

    class e implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ReactContext f22535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22536b;

        e(ReactContext reactContext, String str) {
            this.f22535a = reactContext;
            this.f22536b = str;
        }

        @Override // okhttp3.Callback
        public void onFailure(@NonNull Call call, @NonNull IOException iOException) {
            uo.c.e(this.f22535a, this.f22536b);
        }

        @Override // okhttp3.Callback
        public void onResponse(@NonNull Call call, @NonNull Response response) {
        }
    }

    private enum f {
        BUNDLE("bundle"),
        MAP("map");

        private final String mTypeID;

        f(String str) {
            this.mTypeID = str;
        }

        public String typeID() {
            return this.mTypeID;
        }
    }

    public interface g {
        void a();

        Map<String, jo.f> b();

        void c();

        void d();

        void e();
    }

    public k(eo.a aVar, Context context, jo.d dVar) {
        this.f22517a = aVar;
        this.f22518b = dVar;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient okHttpClientBuild = builder.connectTimeout(DeviceOrientationRequest.OUTPUT_PERIOD_FAST, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).build();
        this.f22519c = okHttpClientBuild;
        this.f22520d = new com.facebook.react.devsupport.b(okHttpClientBuild);
        this.f22521e = new t0(okHttpClientBuild);
        this.f22522f = context;
        this.f22523g = context.getPackageName();
    }

    private String k(String str, f fVar) {
        return l(str, fVar, this.f22518b.b());
    }

    private String l(String str, f fVar, String str2) {
        return m(str, fVar, str2, false, true);
    }

    private String m(String str, f fVar, String str2, boolean z11, boolean z12) {
        boolean zP = p();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : this.f22518b.a().entrySet()) {
            if (entry.getValue().length() != 0) {
                sb2.append("&" + entry.getKey() + "=" + Uri.encode(entry.getValue()));
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(String.format(Locale.US, "http://%s/%s.%s?platform=android&dev=%s&lazy=%s&minify=%s&app=%s&modulesOnly=%s&runModule=%s", str2, str, fVar.typeID(), Boolean.valueOf(zP), Boolean.valueOf(zP), Boolean.valueOf(t()), this.f22523g, z11 ? "true" : "false", z12 ? "true" : "false"));
        sb3.append(InspectorFlags.getFuseboxEnabled() ? "&excludeSource=true&sourcePaths=url-server" : "");
        sb3.append(sb2.toString());
        return sb3.toString();
    }

    private boolean p() {
        return this.f22517a.k();
    }

    private String r() {
        return u(String.format(Locale.US, "android-%s-%s-%s", this.f22523g, Settings.Secure.getString(this.f22522f.getContentResolver(), "android_id"), InspectorFlags.getFuseboxEnabled() ? "fusebox" : "legacy"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String s() {
        return String.format(Locale.US, "http://%s/inspector/device?name=%s&app=%s&device=%s&profiling=%b", this.f22518b.b(), Uri.encode(com.facebook.react.modules.systeminfo.a.d()), Uri.encode(this.f22523g), Uri.encode(r()), Boolean.valueOf(InspectorFlags.getIsProfilingBuild()));
    }

    private boolean t() {
        return this.f22517a.r();
    }

    private static String u(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            try {
                byte[] bArrDigest = messageDigest.digest(str.getBytes("UTF-8"));
                return String.format("%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x", Byte.valueOf(bArrDigest[0]), Byte.valueOf(bArrDigest[1]), Byte.valueOf(bArrDigest[2]), Byte.valueOf(bArrDigest[3]), Byte.valueOf(bArrDigest[4]), Byte.valueOf(bArrDigest[5]), Byte.valueOf(bArrDigest[6]), Byte.valueOf(bArrDigest[7]), Byte.valueOf(bArrDigest[8]), Byte.valueOf(bArrDigest[9]), Byte.valueOf(bArrDigest[10]), Byte.valueOf(bArrDigest[11]), Byte.valueOf(bArrDigest[12]), Byte.valueOf(bArrDigest[13]), Byte.valueOf(bArrDigest[14]), Byte.valueOf(bArrDigest[15]), Byte.valueOf(bArrDigest[16]), Byte.valueOf(bArrDigest[17]), Byte.valueOf(bArrDigest[18]), Byte.valueOf(bArrDigest[19]));
            } catch (UnsupportedEncodingException e11) {
                throw new AssertionError("This environment doesn't support UTF-8 encoding", e11);
            }
        } catch (NoSuchAlgorithmException e12) {
            throw new AssertionError("Could not get standard SHA-256 algorithm", e12);
        }
    }

    public void i() {
        new d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void j() {
        new b().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void n() {
        k0 k0Var = this.f22525i;
        if (k0Var != null) {
            k0Var.sendEventToAllConnections("{ \"id\":1,\"method\":\"Debugger.disable\" }");
        }
    }

    public void o(pn.b bVar, File file, String str, com.facebook.react.devsupport.b.c cVar) {
        this.f22520d.e(bVar, file, str, cVar);
    }

    public String q(String str) {
        return l(str, f.BUNDLE, this.f22518b.b());
    }

    public String v(String str) {
        return k(str, f.BUNDLE);
    }

    public void w(pn.h hVar) {
        String strB = this.f22518b.b();
        if (strB != null) {
            this.f22521e.a(strB, hVar);
        } else {
            qk.a.I("ReactNative", "No packager host configured.");
            hVar.a(false);
        }
    }

    public void x(ReactContext reactContext, String str) {
        FirebasePerfOkHttpClient.enqueue(this.f22519c.newCall(new Request.Builder().url(String.format(Locale.US, "http://%s/open-debugger?device=%s", this.f22518b.b(), Uri.encode(r()))).method("POST", RequestBody.create((MediaType) null, "")).build()), new e(reactContext, str));
    }

    public void y() {
        if (this.f22525i != null) {
            qk.a.I("ReactNative", "Inspector connection already open, nooping.");
        } else {
            new c().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void z(String str, g gVar) {
        if (this.f22524h != null) {
            qk.a.I("ReactNative", "Packager connection already open, nooping.");
        } else {
            new a(gVar, str).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}
