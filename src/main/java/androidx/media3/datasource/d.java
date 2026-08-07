package androidx.media3.datasource;

import android.net.Uri;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.common.collect.s;
import com.google.common.collect.z;
import com.google.common.collect.z0;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
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
import ou.q;
import s7.q0;
import s7.t;
import v7.j;
import v7.k;
import v7.l;

/* JADX INFO: loaded from: classes.dex */
public class d extends v7.a implements androidx.media3.datasource.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f9256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f9257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f9258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f9259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f9260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k f9261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k f9262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final q<String> f9263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f9264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j f9265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private HttpURLConnection f9266o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private InputStream f9267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f9268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f9269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f9270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f9271t;

    public static final class b implements g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private v7.q f9273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private q<String> f9274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f9275d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f9278g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f9279h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f9280i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k f9272a = new k();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f9276e = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f9277f = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;

        @Override // androidx.media3.datasource.a.InterfaceC0192a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a() {
            d dVar = new d(this.f9275d, this.f9276e, this.f9277f, this.f9278g, this.f9279h, this.f9272a, this.f9274c, this.f9280i);
            v7.q qVar = this.f9273b;
            if (qVar != null) {
                dVar.n(qVar);
            }
            return dVar;
        }

        public b c(String str) {
            this.f9275d = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c extends s<String, List<String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, List<String>> f9281a;

        public c(Map<String, List<String>> map) {
            this.f9281a = map;
        }

        public static /* synthetic */ boolean j(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static /* synthetic */ boolean k(String str) {
            return str != null;
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
            return this.f9281a;
        }

        @Override // com.google.common.collect.s, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return z0.b(super.entrySet(), new q() { // from class: androidx.media3.datasource.e
                @Override // ou.q
                public final boolean apply(Object obj) {
                    return d.c.j((Map.Entry) obj);
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
            return z0.b(super.keySet(), new q() { // from class: androidx.media3.datasource.f
                @Override // ou.q
                public final boolean apply(Object obj) {
                    return d.c.k((String) obj);
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

    private void s() {
        HttpURLConnection httpURLConnection = this.f9266o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e11) {
                t.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e11);
            }
        }
    }

    private URL t(URL url, String str, j jVar) throws HttpDataSource$HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", jVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException("Unsupported protocol redirect: " + protocol, jVar, 2001, 1);
            }
            if (this.f9256e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f9257f) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e11) {
                    throw new HttpDataSource$HttpDataSourceException(e11, jVar, 2001, 1);
                }
            }
            throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", jVar, 2001, 1);
        } catch (MalformedURLException e12) {
            throw new HttpDataSource$HttpDataSourceException(e12, jVar, 2001, 1);
        }
    }

    private static boolean u(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection v(URL url, int i11, byte[] bArr, long j11, long j12, boolean z11, boolean z12, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionX = x(url);
        httpURLConnectionX.setConnectTimeout(this.f9258g);
        httpURLConnectionX.setReadTimeout(this.f9259h);
        HashMap map2 = new HashMap();
        k kVar = this.f9261j;
        if (kVar != null) {
            map2.putAll(kVar.b());
        }
        map2.putAll(this.f9262k.b());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionX.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = l.a(j11, j12);
        if (strA != null) {
            httpURLConnectionX.setRequestProperty("Range", strA);
        }
        String str = this.f9260i;
        if (str != null) {
            httpURLConnectionX.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionX.setRequestProperty("Accept-Encoding", z11 ? "gzip" : "identity");
        httpURLConnectionX.setInstanceFollowRedirects(z12);
        httpURLConnectionX.setDoOutput(bArr != null);
        httpURLConnectionX.setRequestMethod(j.c(i11));
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

    private HttpURLConnection w(j jVar) throws IOException {
        URL url = new URL(jVar.f118101a.toString());
        int i11 = jVar.f118103c;
        byte[] bArr = jVar.f118104d;
        long j11 = jVar.f118107g;
        long j12 = jVar.f118108h;
        int i12 = 1;
        boolean zD = jVar.d(1);
        if (!this.f9256e && !this.f9257f && !this.f9264m) {
            return v(url, i11, bArr, j11, j12, zD, true, jVar.f118105e);
        }
        int i13 = 0;
        while (true) {
            int i14 = i13 + 1;
            if (i13 > 20) {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException("Too many redirects: " + i14), jVar, 2001, 1);
            }
            HttpURLConnection httpURLConnectionV = v(url, i11, bArr, j11, j12, zD, false, jVar.f118105e);
            int responseCode = httpURLConnectionV.getResponseCode();
            String headerField = httpURLConnectionV.getHeaderField("Location");
            if ((i11 == i12 || i11 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionV.disconnect();
                url = t(url, headerField, jVar);
            } else {
                if (i11 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionV;
                }
                httpURLConnectionV.disconnect();
                if (!this.f9264m || responseCode != 302) {
                    bArr = null;
                    i11 = 1;
                }
                url = t(url, headerField, jVar);
            }
            i13 = i14;
            i12 = 1;
        }
    }

    private int y(byte[] bArr, int i11, int i12) throws IOException {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f9270s;
        if (j11 != -1) {
            long j12 = j11 - this.f9271t;
            if (j12 == 0) {
                return -1;
            }
            i12 = (int) Math.min(i12, j12);
        }
        int i13 = ((InputStream) q0.l(this.f9267p)).read(bArr, i11, i12);
        if (i13 == -1) {
            return -1;
        }
        this.f9271t += (long) i13;
        o(i13);
        return i13;
    }

    private void z(long j11, j jVar) throws IOException {
        if (j11 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j11 > 0) {
            int i11 = ((InputStream) q0.l(this.f9267p)).read(bArr, 0, (int) Math.min(j11, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), jVar, 2000, 1);
            }
            if (i11 == -1) {
                throw new HttpDataSource$HttpDataSourceException(jVar, 2008, 1);
            }
            j11 -= (long) i11;
            o(i11);
        }
    }

    @Override // androidx.media3.datasource.a
    public Map<String, List<String>> b() {
        HttpURLConnection httpURLConnection = this.f9266o;
        return httpURLConnection == null ? z.m() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        try {
            InputStream inputStream = this.f9267p;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    throw new HttpDataSource$HttpDataSourceException(e11, (j) q0.l(this.f9265n), 2000, 3);
                }
            }
            this.f9267p = null;
            s();
            if (this.f9268q) {
                this.f9268q = false;
                p();
            }
            this.f9266o = null;
            this.f9265n = null;
        } catch (Throwable th2) {
            this.f9267p = null;
            s();
            if (this.f9268q) {
                this.f9268q = false;
                p();
            }
            this.f9266o = null;
            this.f9265n = null;
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f9266o;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        j jVar = this.f9265n;
        if (jVar != null) {
            return jVar.f118101a;
        }
        return null;
    }

    @Override // androidx.media3.datasource.a
    public long j(j jVar) throws HttpDataSource$HttpDataSourceException {
        byte[] bArrB;
        this.f9265n = jVar;
        long j11 = 0;
        this.f9271t = 0L;
        this.f9270s = 0L;
        q(jVar);
        try {
            HttpURLConnection httpURLConnectionW = w(jVar);
            this.f9266o = httpURLConnectionW;
            this.f9269r = httpURLConnectionW.getResponseCode();
            String responseMessage = httpURLConnectionW.getResponseMessage();
            int i11 = this.f9269r;
            if (i11 < 200 || i11 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionW.getHeaderFields();
                if (this.f9269r == 416) {
                    if (jVar.f118107g == l.c(httpURLConnectionW.getHeaderField("Content-Range"))) {
                        this.f9268q = true;
                        r(jVar);
                        long j12 = jVar.f118108h;
                        if (j12 != -1) {
                            return j12;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionW.getErrorStream();
                try {
                    bArrB = errorStream != null ? pu.a.b(errorStream) : q0.f110459f;
                } catch (IOException unused) {
                    bArrB = q0.f110459f;
                }
                byte[] bArr = bArrB;
                s();
                throw new HttpDataSource$InvalidResponseCodeException(this.f9269r, responseMessage, this.f9269r == 416 ? new DataSourceException(2008) : null, headerFields, jVar, bArr);
            }
            String contentType = httpURLConnectionW.getContentType();
            q<String> qVar = this.f9263l;
            if (qVar != null && !qVar.apply(contentType)) {
                s();
                throw new HttpDataSource$InvalidContentTypeException(contentType, jVar);
            }
            if (this.f9269r == 200) {
                long j13 = jVar.f118107g;
                if (j13 != 0) {
                    j11 = j13;
                }
            }
            boolean zU = u(httpURLConnectionW);
            if (zU) {
                this.f9270s = jVar.f118108h;
            } else {
                long j14 = jVar.f118108h;
                if (j14 != -1) {
                    this.f9270s = j14;
                } else {
                    long jB = l.b(httpURLConnectionW.getHeaderField("Content-Length"), httpURLConnectionW.getHeaderField("Content-Range"));
                    this.f9270s = jB != -1 ? jB - j11 : -1L;
                }
            }
            try {
                this.f9267p = httpURLConnectionW.getInputStream();
                if (zU) {
                    this.f9267p = new GZIPInputStream(this.f9267p);
                }
                this.f9268q = true;
                r(jVar);
                try {
                    z(j11, jVar);
                    return this.f9270s;
                } catch (IOException e11) {
                    s();
                    if (e11 instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e11);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e11, jVar, 2000, 1);
                }
            } catch (IOException e12) {
                s();
                throw new HttpDataSource$HttpDataSourceException(e12, jVar, 2000, 1);
            }
        } catch (IOException e13) {
            s();
            throw HttpDataSource$HttpDataSourceException.c(e13, jVar, 1);
        }
    }

    @Override // p7.j
    public int read(byte[] bArr, int i11, int i12) throws HttpDataSource$HttpDataSourceException {
        try {
            return y(bArr, i11, i12);
        } catch (IOException e11) {
            throw HttpDataSource$HttpDataSourceException.c(e11, (j) q0.l(this.f9265n), 2);
        }
    }

    HttpURLConnection x(URL url) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    private d(String str, int i11, int i12, boolean z11, boolean z12, k kVar, q<String> qVar, boolean z13) {
        super(true);
        this.f9260i = str;
        this.f9258g = i11;
        this.f9259h = i12;
        this.f9256e = z11;
        this.f9257f = z12;
        if (z11 && z12) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f9261j = kVar;
        this.f9263l = qVar;
        this.f9262k = new k();
        this.f9264m = z13;
    }
}
