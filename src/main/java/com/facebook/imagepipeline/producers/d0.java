package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public class d0 extends d<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f21761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, String> f21762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f21763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wk.b f21764e;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f21765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t0.a f21766b;

        a(c cVar, t0.a aVar) {
            this.f21765a = cVar;
            this.f21766b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            d0.this.j(this.f21765a, this.f21766b);
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Future f21768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t0.a f21769b;

        b(Future future, t0.a aVar) {
            this.f21768a = future;
            this.f21769b = aVar;
        }

        @Override // com.facebook.imagepipeline.producers.b1
        public void b() {
            if (this.f21768a.cancel(false)) {
                this.f21769b.a();
            }
        }
    }

    public static class c extends c0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f21771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f21772g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f21773h;

        public c(n<um.k> nVar, a1 a1Var) {
            super(nVar, a1Var);
        }
    }

    public d0(int i11) {
        this(null, null, RealtimeSinceBootClock.get());
        this.f21760a = i11;
    }

    private HttpURLConnection g(Uri uri, int i11) throws IOException {
        HttpURLConnection httpURLConnectionO = o(uri);
        String str = this.f21761b;
        if (str != null) {
            httpURLConnectionO.setRequestProperty("User-Agent", str);
        }
        Map<String, String> map = this.f21762c;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionO.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        httpURLConnectionO.setConnectTimeout(this.f21760a);
        int responseCode = httpURLConnectionO.getResponseCode();
        if (m(responseCode)) {
            return httpURLConnectionO;
        }
        if (!l(responseCode)) {
            httpURLConnectionO.disconnect();
            throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
        }
        String headerField = httpURLConnectionO.getHeaderField("Location");
        httpURLConnectionO.disconnect();
        Uri uri2 = headerField == null ? null : Uri.parse(headerField);
        String scheme = uri.getScheme();
        if (i11 <= 0 || uri2 == null || pk.i.a(uri2.getScheme(), scheme)) {
            throw new IOException(i11 == 0 ? h("URL %s follows too many redirects", uri.toString()) : h("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode)));
        }
        return g(uri2, i11 - 1);
    }

    private static String h(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    private static boolean l(int i11) {
        if (i11 == 307 || i11 == 308) {
            return true;
        }
        switch (i11) {
            case 300:
            case SDK_ASSET_CASH_ICON_CIRCLE_VALUE:
            case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE:
            case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE:
                return true;
            default:
                return false;
        }
    }

    private static boolean m(int i11) {
        return i11 >= 200 && i11 < 300;
    }

    static HttpURLConnection o(Uri uri) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(xk.e.q(uri).openConnection()));
    }

    @Override // com.facebook.imagepipeline.producers.t0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c b(n<um.k> nVar, a1 a1Var) {
        return new c(nVar, a1Var);
    }

    @Override // com.facebook.imagepipeline.producers.t0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void c(c cVar, t0.a aVar) {
        cVar.f21771f = this.f21764e.now();
        cVar.b().H(new b(this.f21763d.submit(new a(cVar, aVar)), aVar));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0045  */
    /* JADX WARN: Code duplicated, block: B:38:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
    void j(c cVar, t0.a aVar) throws Throwable {
        HttpURLConnection httpURLConnectionG;
        InputStream inputStream = null;
        try {
            httpURLConnectionG = g(cVar.g(), 5);
            try {
                try {
                    cVar.f21772g = this.f21764e.now();
                    if (httpURLConnectionG != null) {
                        inputStream = httpURLConnectionG.getInputStream();
                        aVar.b(inputStream, -1);
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (httpURLConnectionG == null) {
                        return;
                    }
                } catch (IOException e11) {
                    e = e11;
                    aVar.onFailure(e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (httpURLConnectionG == null) {
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (httpURLConnectionG != null) {
                    throw th;
                }
                httpURLConnectionG.disconnect();
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            httpURLConnectionG = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnectionG = null;
            if (inputStream != null) {
                inputStream.close();
            }
            if (httpURLConnectionG != null) {
                throw th;
            }
            httpURLConnectionG.disconnect();
            throw th;
        }
        httpURLConnectionG.disconnect();
    }

    @Override // com.facebook.imagepipeline.producers.t0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map<String, String> e(c cVar, int i11) {
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(cVar.f21772g - cVar.f21771f));
        map.put("fetch_time", Long.toString(cVar.f21773h - cVar.f21772g));
        map.put("total_time", Long.toString(cVar.f21773h - cVar.f21771f));
        map.put("image_size", Integer.toString(i11));
        return map;
    }

    @Override // com.facebook.imagepipeline.producers.t0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void a(c cVar, int i11) {
        cVar.f21773h = this.f21764e.now();
    }

    d0(String str, Map<String, String> map, wk.b bVar) {
        this.f21763d = Executors.newFixedThreadPool(3);
        this.f21764e = bVar;
        this.f21762c = map;
        this.f21761b = str;
    }
}
