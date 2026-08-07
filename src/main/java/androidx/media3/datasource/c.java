package androidx.media3.datasource;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import s7.q0;
import s7.t;
import v7.j;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
public final class c implements androidx.media3.datasource.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<q> f9153b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.datasource.a f9154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.media3.datasource.a f9155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.media3.datasource.a f9156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.media3.datasource.a f9157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.media3.datasource.a f9158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private androidx.media3.datasource.a f9159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.media3.datasource.a f9160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.media3.datasource.a f9161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.media3.datasource.a f9162k;

    public static final class a implements androidx.media3.datasource.a.InterfaceC0192a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f9163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media3.datasource.a.InterfaceC0192a f9164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private q f9165c;

        public a(Context context) {
            this(context, new d.b());
        }

        @Override // androidx.media3.datasource.a.InterfaceC0192a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a() {
            c cVar = new c(this.f9163a, this.f9164b.a());
            q qVar = this.f9165c;
            if (qVar != null) {
                cVar.n(qVar);
            }
            return cVar;
        }

        public a(Context context, androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a) {
            this.f9163a = context.getApplicationContext();
            this.f9164b = (androidx.media3.datasource.a.InterfaceC0192a) s7.a.f(interfaceC0192a);
        }
    }

    public c(Context context, androidx.media3.datasource.a aVar) {
        this.f9152a = context.getApplicationContext();
        this.f9154c = (androidx.media3.datasource.a) s7.a.f(aVar);
    }

    private void o(androidx.media3.datasource.a aVar) {
        for (int i11 = 0; i11 < this.f9153b.size(); i11++) {
            aVar.n(this.f9153b.get(i11));
        }
    }

    private androidx.media3.datasource.a p() {
        if (this.f9156e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f9152a);
            this.f9156e = assetDataSource;
            o(assetDataSource);
        }
        return this.f9156e;
    }

    private androidx.media3.datasource.a q() {
        if (this.f9157f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f9152a);
            this.f9157f = contentDataSource;
            o(contentDataSource);
        }
        return this.f9157f;
    }

    private androidx.media3.datasource.a r() {
        if (this.f9160i == null) {
            v7.c cVar = new v7.c();
            this.f9160i = cVar;
            o(cVar);
        }
        return this.f9160i;
    }

    private androidx.media3.datasource.a s() {
        if (this.f9155d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f9155d = fileDataSource;
            o(fileDataSource);
        }
        return this.f9155d;
    }

    private androidx.media3.datasource.a t() {
        if (this.f9161j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f9152a);
            this.f9161j = rawResourceDataSource;
            o(rawResourceDataSource);
        }
        return this.f9161j;
    }

    private androidx.media3.datasource.a u() {
        if (this.f9158g == null) {
            try {
                androidx.media3.datasource.a aVar = (androidx.media3.datasource.a) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f9158g = aVar;
                o(aVar);
            } catch (ClassNotFoundException unused) {
                t.i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating RTMP extension", e11);
            }
            if (this.f9158g == null) {
                this.f9158g = this.f9154c;
            }
        }
        return this.f9158g;
    }

    private androidx.media3.datasource.a v() {
        if (this.f9159h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f9159h = udpDataSource;
            o(udpDataSource);
        }
        return this.f9159h;
    }

    private void w(androidx.media3.datasource.a aVar, q qVar) {
        if (aVar != null) {
            aVar.n(qVar);
        }
    }

    @Override // androidx.media3.datasource.a
    public Map<String, List<String>> b() {
        androidx.media3.datasource.a aVar = this.f9162k;
        return aVar == null ? Collections.EMPTY_MAP : aVar.b();
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        androidx.media3.datasource.a aVar = this.f9162k;
        if (aVar != null) {
            try {
                aVar.close();
            } finally {
                this.f9162k = null;
            }
        }
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        androidx.media3.datasource.a aVar = this.f9162k;
        if (aVar == null) {
            return null;
        }
        return aVar.getUri();
    }

    @Override // androidx.media3.datasource.a
    public long j(j jVar) {
        s7.a.h(this.f9162k == null);
        String scheme = jVar.f118101a.getScheme();
        if (q0.U0(jVar.f118101a)) {
            String path = jVar.f118101a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f9162k = s();
            } else {
                this.f9162k = p();
            }
        } else if ("asset".equals(scheme)) {
            this.f9162k = p();
        } else if ("content".equals(scheme)) {
            this.f9162k = q();
        } else if ("rtmp".equals(scheme)) {
            this.f9162k = u();
        } else if ("udp".equals(scheme)) {
            this.f9162k = v();
        } else if ("data".equals(scheme)) {
            this.f9162k = r();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f9162k = t();
        } else {
            this.f9162k = this.f9154c;
        }
        return this.f9162k.j(jVar);
    }

    @Override // androidx.media3.datasource.a
    public void n(q qVar) {
        s7.a.f(qVar);
        this.f9154c.n(qVar);
        this.f9153b.add(qVar);
        w(this.f9155d, qVar);
        w(this.f9156e, qVar);
        w(this.f9157f, qVar);
        w(this.f9158g, qVar);
        w(this.f9159h, qVar);
        w(this.f9160i, qVar);
        w(this.f9161j, qVar);
    }

    @Override // p7.j
    public int read(byte[] bArr, int i11, int i12) {
        return ((androidx.media3.datasource.a) s7.a.f(this.f9162k)).read(bArr, i11, i12);
    }
}
