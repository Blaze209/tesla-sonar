package x7;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.g;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.common.util.concurrent.a0;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import ou.q;
import p7.d0;
import s7.q0;
import v7.j;
import v7.k;
import v7.l;

/* JADX INFO: loaded from: classes.dex */
public class a extends v7.a implements androidx.media3.datasource.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Call.Factory f122908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f122909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f122910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CacheControl f122911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k f122912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final q<String> f122913j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private j f122914k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Response f122915l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private InputStream f122916m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f122917n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f122918o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f122919p;

    /* JADX INFO: renamed from: x7.a$a, reason: collision with other inner class name */
    class C2654a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0 f122920a;

        C2654a(a0 a0Var) {
            this.f122920a = a0Var;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            this.f122920a.N(iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            this.f122920a.M(response);
        }
    }

    public static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k f122922a = new k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Call.Factory f122923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f122924c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private v7.q f122925d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CacheControl f122926e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private q<String> f122927f;

        public b(Call.Factory factory) {
            this.f122923b = factory;
        }

        @Override // androidx.media3.datasource.a.InterfaceC0192a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a() {
            a aVar = new a(this.f122923b, this.f122924c, this.f122926e, this.f122922a, this.f122927f, null);
            v7.q qVar = this.f122925d;
            if (qVar != null) {
                aVar.n(qVar);
            }
            return aVar;
        }

        public final b c(Map<String, String> map) {
            this.f122922a.a(map);
            return this;
        }

        public b d(v7.q qVar) {
            this.f122925d = qVar;
            return this;
        }

        public b e(String str) {
            this.f122924c = str;
            return this;
        }
    }

    static {
        d0.a("media3.datasource.okhttp");
    }

    /* synthetic */ a(Call.Factory factory, String str, CacheControl cacheControl, k kVar, q qVar, C2654a c2654a) {
        this(factory, str, cacheControl, kVar, qVar);
    }

    private void s() {
        Response response = this.f122915l;
        if (response != null) {
            ((ResponseBody) s7.a.f(response.body())).close();
        }
        this.f122916m = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Response t(Call call) throws IOException {
        a0 a0VarQ = a0.Q();
        FirebasePerfOkHttpClient.enqueue(call, new C2654a(a0VarQ));
        try {
            return (Response) a0VarQ.get();
        } catch (InterruptedException unused) {
            call.cancel();
            throw new InterruptedIOException();
        } catch (ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    private Request u(j jVar) throws HttpDataSource$HttpDataSourceException {
        long j11 = jVar.f118107g;
        long j12 = jVar.f118108h;
        HttpUrl httpUrl = HttpUrl.parse(jVar.f118101a.toString());
        if (httpUrl == null) {
            throw new HttpDataSource$HttpDataSourceException("Malformed URL", jVar, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, 1);
        }
        Request.Builder builderUrl = new Request.Builder().url(httpUrl);
        CacheControl cacheControl = this.f122911h;
        if (cacheControl != null) {
            builderUrl.cacheControl(cacheControl);
        }
        HashMap map = new HashMap();
        k kVar = this.f122912i;
        if (kVar != null) {
            map.putAll(kVar.b());
        }
        map.putAll(this.f122909f.b());
        map.putAll(jVar.f118105e);
        for (Map.Entry entry : map.entrySet()) {
            builderUrl.header((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = l.a(j11, j12);
        if (strA != null) {
            builderUrl.addHeader("Range", strA);
        }
        String str = this.f122910g;
        if (str != null) {
            builderUrl.addHeader("User-Agent", str);
        }
        if (!jVar.d(1)) {
            builderUrl.addHeader("Accept-Encoding", "identity");
        }
        byte[] bArr = jVar.f118104d;
        builderUrl.method(jVar.b(), bArr != null ? RequestBody.create(bArr) : jVar.f118103c == 2 ? RequestBody.create(q0.f110459f) : null);
        return builderUrl.build();
    }

    private int v(byte[] bArr, int i11, int i12) throws IOException {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f122918o;
        if (j11 != -1) {
            long j12 = j11 - this.f122919p;
            if (j12 == 0) {
                return -1;
            }
            i12 = (int) Math.min(i12, j12);
        }
        int i13 = ((InputStream) q0.l(this.f122916m)).read(bArr, i11, i12);
        if (i13 == -1) {
            return -1;
        }
        this.f122919p += (long) i13;
        o(i13);
        return i13;
    }

    private void w(long j11, j jVar) throws HttpDataSource$HttpDataSourceException {
        if (j11 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j11 > 0) {
            try {
                int i11 = ((InputStream) q0.l(this.f122916m)).read(bArr, 0, (int) Math.min(j11, 4096));
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i11 == -1) {
                    throw new HttpDataSource$HttpDataSourceException(jVar, 2008, 1);
                }
                j11 -= (long) i11;
                o(i11);
            } catch (IOException e11) {
                if (!(e11 instanceof HttpDataSource$HttpDataSourceException)) {
                    throw new HttpDataSource$HttpDataSourceException(jVar, 2000, 1);
                }
                throw ((HttpDataSource$HttpDataSourceException) e11);
            }
        }
    }

    @Override // androidx.media3.datasource.a
    public Map<String, List<String>> b() {
        Response response = this.f122915l;
        return response == null ? Collections.EMPTY_MAP : response.headers().toMultimap();
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        if (this.f122917n) {
            this.f122917n = false;
            p();
            s();
        }
        this.f122915l = null;
        this.f122914k = null;
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        Response response = this.f122915l;
        if (response != null) {
            return Uri.parse(response.request().url().getUrl());
        }
        j jVar = this.f122914k;
        if (jVar != null) {
            return jVar.f118101a;
        }
        return null;
    }

    @Override // androidx.media3.datasource.a
    public long j(j jVar) throws HttpDataSource$HttpDataSourceException {
        byte[] bArrB;
        this.f122914k = jVar;
        long j11 = 0;
        this.f122919p = 0L;
        this.f122918o = 0L;
        q(jVar);
        try {
            Response responseT = t(this.f122908e.newCall(u(jVar)));
            this.f122915l = responseT;
            ResponseBody responseBody = (ResponseBody) s7.a.f(responseT.body());
            this.f122916m = responseBody.byteStream();
            int iCode = responseT.code();
            if (!responseT.isSuccessful()) {
                if (iCode == 416) {
                    if (jVar.f118107g == l.c(responseT.headers().get("Content-Range"))) {
                        this.f122917n = true;
                        r(jVar);
                        long j12 = jVar.f118108h;
                        if (j12 != -1) {
                            return j12;
                        }
                        return 0L;
                    }
                }
                try {
                    bArrB = pu.a.b((InputStream) s7.a.f(this.f122916m));
                } catch (IOException unused) {
                    bArrB = q0.f110459f;
                }
                byte[] bArr = bArrB;
                Map<String, List<String>> multimap = responseT.headers().toMultimap();
                s();
                throw new HttpDataSource$InvalidResponseCodeException(iCode, responseT.message(), iCode == 416 ? new DataSourceException(2008) : null, multimap, jVar, bArr);
            }
            MediaType mediaType = responseBody.get$contentType();
            String mediaType2 = mediaType != null ? mediaType.getMediaType() : "";
            q<String> qVar = this.f122913j;
            if (qVar != null && !qVar.apply(mediaType2)) {
                s();
                throw new HttpDataSource$InvalidContentTypeException(mediaType2, jVar);
            }
            if (iCode == 200) {
                long j13 = jVar.f118107g;
                if (j13 != 0) {
                    j11 = j13;
                }
            }
            long j14 = jVar.f118108h;
            if (j14 != -1) {
                this.f122918o = j14;
            } else {
                long contentLength = responseBody.getContentLength();
                this.f122918o = contentLength != -1 ? contentLength - j11 : -1L;
            }
            this.f122917n = true;
            r(jVar);
            try {
                w(j11, jVar);
                return this.f122918o;
            } catch (HttpDataSource$HttpDataSourceException e11) {
                s();
                throw e11;
            }
        } catch (IOException e12) {
            throw HttpDataSource$HttpDataSourceException.c(e12, jVar, 1);
        }
    }

    @Override // p7.j
    public int read(byte[] bArr, int i11, int i12) throws HttpDataSource$HttpDataSourceException {
        try {
            return v(bArr, i11, i12);
        } catch (IOException e11) {
            throw HttpDataSource$HttpDataSourceException.c(e11, (j) q0.l(this.f122914k), 2);
        }
    }

    private a(Call.Factory factory, String str, CacheControl cacheControl, k kVar, q<String> qVar) {
        super(true);
        this.f122908e = (Call.Factory) s7.a.f(factory);
        this.f122910g = str;
        this.f122911h = cacheControl;
        this.f122912i = kVar;
        this.f122913j = qVar;
        this.f122909f = new k();
    }
}
