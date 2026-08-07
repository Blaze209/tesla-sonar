package ss;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.common.collect.z0;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class q extends e implements i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f111731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f111732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f111733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f111734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t f111735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t f111736j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f111737k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ou.q<String> f111738l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private l f111739m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private HttpURLConnection f111740n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InputStream f111741o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f111742p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f111743q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f111744r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f111745s;

    public static final class b implements i.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private z f111747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ou.q<String> f111748c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f111749d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f111752g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f111753h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f111746a = new t();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f111750e = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f111751f = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;

        @Override // ss.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q a() {
            q qVar = new q(this.f111749d, this.f111750e, this.f111751f, this.f111752g, this.f111746a, this.f111748c, this.f111753h);
            z zVar = this.f111747b;
            if (zVar != null) {
                qVar.m(zVar);
            }
            return qVar;
        }

        public b c(String str) {
            this.f111749d = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c extends com.google.common.collect.s<String, List<String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, List<String>> f111754a;

        public c(Map<String, List<String>> map) {
            this.f111754a = map;
        }

        public static /* synthetic */ boolean j(String str) {
            return str != null;
        }

        public static /* synthetic */ boolean k(Map.Entry entry) {
            return entry.getKey() != null;
        }

        @Override // com.google.common.collect.s, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.e(obj);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.t
        public Map<String, List<String>> d() {
            return this.f111754a;
        }

        @Override // com.google.common.collect.s, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return z0.b(super.entrySet(), new ou.q() { // from class: ss.s
                @Override // ou.q
                public final boolean apply(Object obj) {
                    return q.c.k((Map.Entry) obj);
                }
            });
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.h(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.i();
        }

        @Override // com.google.common.collect.s, java.util.Map
        public boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // com.google.common.collect.s, java.util.Map
        public Set<String> keySet() {
            return z0.b(super.keySet(), new ou.q() { // from class: ss.r
                @Override // ou.q
                public final boolean apply(Object obj) {
                    return q.c.j((String) obj);
                }
            });
        }

        @Override // com.google.common.collect.s, java.util.Map
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // com.google.common.collect.s, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    private void r() {
        HttpURLConnection httpURLConnection = this.f111740n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e11) {
                ts.u.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e11);
            }
            this.f111740n = null;
        }
    }

    private URL s(URL url, String str, l lVar) throws HttpDataSource$HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", lVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException("Unsupported protocol redirect: " + protocol, lVar, 2001, 1);
            }
            if (this.f111731e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", lVar, 2001, 1);
        } catch (MalformedURLException e11) {
            throw new HttpDataSource$HttpDataSourceException(e11, lVar, 2001, 1);
        }
    }

    private static boolean t(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection u(URL url, int i11, byte[] bArr, long j11, long j12, boolean z11, boolean z12, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionX = x(url);
        httpURLConnectionX.setConnectTimeout(this.f111732f);
        httpURLConnectionX.setReadTimeout(this.f111733g);
        HashMap map2 = new HashMap();
        t tVar = this.f111735i;
        if (tVar != null) {
            map2.putAll(tVar.a());
        }
        map2.putAll(this.f111736j.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionX.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = u.a(j11, j12);
        if (strA != null) {
            httpURLConnectionX.setRequestProperty("Range", strA);
        }
        String str = this.f111734h;
        if (str != null) {
            httpURLConnectionX.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionX.setRequestProperty("Accept-Encoding", z11 ? "gzip" : "identity");
        httpURLConnectionX.setInstanceFollowRedirects(z12);
        httpURLConnectionX.setDoOutput(bArr != null);
        httpURLConnectionX.setRequestMethod(l.c(i11));
        if (bArr == null) {
            httpURLConnectionX.connect();
            return httpURLConnectionX;
        }
        httpURLConnectionX.setFixedLengthStreamingMode(bArr.length);
        httpURLConnectionX.connect();
        OutputStream outputStream = httpURLConnectionX.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnectionX;
    }

    private HttpURLConnection v(l lVar) throws IOException {
        URL url = new URL(lVar.f111661a.toString());
        int i11 = lVar.f111663c;
        byte[] bArr = lVar.f111664d;
        long j11 = lVar.f111667g;
        long j12 = lVar.f111668h;
        int i12 = 1;
        boolean zD = lVar.d(1);
        if (!this.f111731e && !this.f111737k) {
            return u(url, i11, bArr, j11, j12, zD, true, lVar.f111665e);
        }
        int i13 = 0;
        while (true) {
            int i14 = i13 + 1;
            if (i13 > 20) {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException("Too many redirects: " + i14), lVar, 2001, 1);
            }
            HttpURLConnection httpURLConnectionU = u(url, i11, bArr, j11, j12, zD, false, lVar.f111665e);
            int responseCode = httpURLConnectionU.getResponseCode();
            String headerField = httpURLConnectionU.getHeaderField("Location");
            if ((i11 == i12 || i11 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionU.disconnect();
                url = s(url, headerField, lVar);
            } else {
                if (i11 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionU;
                }
                httpURLConnectionU.disconnect();
                if (!this.f111737k || responseCode != 302) {
                    bArr = null;
                    i11 = 1;
                }
                url = s(url, headerField, lVar);
            }
            i13 = i14;
            i12 = 1;
        }
    }

    private static void w(HttpURLConnection httpURLConnection, long j11) {
        int i11;
        if (httpURLConnection == null || (i11 = p0.f115040a) < 19 || i11 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j11 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j11 <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) ts.a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    private int y(byte[] bArr, int i11, int i12) throws IOException {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f111744r;
        if (j11 != -1) {
            long j12 = j11 - this.f111745s;
            if (j12 == 0) {
                return -1;
            }
            i12 = (int) Math.min(i12, j12);
        }
        int i13 = ((InputStream) p0.j(this.f111741o)).read(bArr, i11, i12);
        if (i13 == -1) {
            return -1;
        }
        this.f111745s += (long) i13;
        n(i13);
        return i13;
    }

    private void z(long j11, l lVar) throws IOException {
        if (j11 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j11 > 0) {
            int i11 = ((InputStream) p0.j(this.f111741o)).read(bArr, 0, (int) Math.min(j11, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), lVar, 2000, 1);
            }
            if (i11 == -1) {
                throw new HttpDataSource$HttpDataSourceException(lVar, 2008, 1);
            }
            j11 -= (long) i11;
            n(i11);
        }
    }

    @Override // ss.i
    public Map<String, List<String>> b() {
        HttpURLConnection httpURLConnection = this.f111740n;
        return httpURLConnection == null ? com.google.common.collect.z.m() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // ss.i
    public void close() {
        try {
            InputStream inputStream = this.f111741o;
            if (inputStream != null) {
                long j11 = this.f111744r;
                long j12 = -1;
                if (j11 != -1) {
                    j12 = j11 - this.f111745s;
                }
                w(this.f111740n, j12);
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    throw new HttpDataSource$HttpDataSourceException(e11, (l) p0.j(this.f111739m), 2000, 3);
                }
            }
            this.f111741o = null;
            r();
            if (this.f111742p) {
                this.f111742p = false;
                o();
            }
        } catch (Throwable th2) {
            this.f111741o = null;
            r();
            if (this.f111742p) {
                this.f111742p = false;
                o();
            }
            throw th2;
        }
    }

    @Override // ss.i
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f111740n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // ss.i
    public long j(final l lVar) throws HttpDataSource$HttpDataSourceException {
        byte[] bArrT0;
        this.f111739m = lVar;
        long j11 = 0;
        this.f111745s = 0L;
        this.f111744r = 0L;
        p(lVar);
        try {
            HttpURLConnection httpURLConnectionV = v(lVar);
            this.f111740n = httpURLConnectionV;
            this.f111743q = httpURLConnectionV.getResponseCode();
            String responseMessage = httpURLConnectionV.getResponseMessage();
            int i11 = this.f111743q;
            if (i11 < 200 || i11 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionV.getHeaderFields();
                if (this.f111743q == 416) {
                    if (lVar.f111667g == u.c(httpURLConnectionV.getHeaderField("Content-Range"))) {
                        this.f111742p = true;
                        q(lVar);
                        long j12 = lVar.f111668h;
                        if (j12 != -1) {
                            return j12;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionV.getErrorStream();
                try {
                    bArrT0 = errorStream != null ? p0.T0(errorStream) : p0.f115045f;
                } catch (IOException unused) {
                    bArrT0 = p0.f115045f;
                }
                byte[] bArr = bArrT0;
                r();
                throw new HttpDataSource$InvalidResponseCodeException(this.f111743q, responseMessage, this.f111743q == 416 ? new DataSourceException(2008) : null, headerFields, lVar, bArr);
            }
            final String contentType = httpURLConnectionV.getContentType();
            ou.q<String> qVar = this.f111738l;
            if (qVar != null && !qVar.apply(contentType)) {
                r();
                throw new HttpDataSource$HttpDataSourceException(contentType, lVar) { // from class: com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final String f41035d;

                    {
                        super("Invalid content type: " + contentType, lVar, 2003, 1);
                        this.f41035d = contentType;
                    }
                };
            }
            if (this.f111743q == 200) {
                long j13 = lVar.f111667g;
                if (j13 != 0) {
                    j11 = j13;
                }
            }
            boolean zT = t(httpURLConnectionV);
            if (zT) {
                this.f111744r = lVar.f111668h;
            } else {
                long j14 = lVar.f111668h;
                if (j14 != -1) {
                    this.f111744r = j14;
                } else {
                    long jB = u.b(httpURLConnectionV.getHeaderField("Content-Length"), httpURLConnectionV.getHeaderField("Content-Range"));
                    this.f111744r = jB != -1 ? jB - j11 : -1L;
                }
            }
            try {
                this.f111741o = httpURLConnectionV.getInputStream();
                if (zT) {
                    this.f111741o = new GZIPInputStream(this.f111741o);
                }
                this.f111742p = true;
                q(lVar);
                try {
                    z(j11, lVar);
                    return this.f111744r;
                } catch (IOException e11) {
                    r();
                    if (e11 instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e11);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e11, lVar, 2000, 1);
                }
            } catch (IOException e12) {
                r();
                throw new HttpDataSource$HttpDataSourceException(e12, lVar, 2000, 1);
            }
        } catch (IOException e13) {
            r();
            throw HttpDataSource$HttpDataSourceException.c(e13, lVar, 1);
        }
    }

    @Override // ss.g
    public int read(byte[] bArr, int i11, int i12) throws HttpDataSource$HttpDataSourceException {
        try {
            return y(bArr, i11, i12);
        } catch (IOException e11) {
            throw HttpDataSource$HttpDataSourceException.c(e11, (l) p0.j(this.f111739m), 2);
        }
    }

    HttpURLConnection x(URL url) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    private q(String str, int i11, int i12, boolean z11, t tVar, ou.q<String> qVar, boolean z12) {
        super(true);
        this.f111734h = str;
        this.f111732f = i11;
        this.f111733g = i12;
        this.f111731e = z11;
        this.f111735i = tVar;
        this.f111738l = qVar;
        this.f111736j = new t();
        this.f111737k = z12;
    }
}
