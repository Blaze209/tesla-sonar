package ss;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.AssetDataSource;
import com.google.android.exoplayer2.upstream.ContentDataSource;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class p implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f111717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<z> f111718b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f111719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f111720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f111721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f111722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i f111723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i f111724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i f111725i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i f111726j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private i f111727k;

    public static final class a implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f111728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i.a f111729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private z f111730c;

        public a(Context context) {
            this(context, new q.b());
        }

        @Override // ss.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p a() {
            p pVar = new p(this.f111728a, this.f111729b.a());
            z zVar = this.f111730c;
            if (zVar != null) {
                pVar.m(zVar);
            }
            return pVar;
        }

        public a(Context context, i.a aVar) {
            this.f111728a = context.getApplicationContext();
            this.f111729b = aVar;
        }
    }

    public p(Context context, i iVar) {
        this.f111717a = context.getApplicationContext();
        this.f111719c = (i) ts.a.e(iVar);
    }

    private void n(i iVar) {
        for (int i11 = 0; i11 < this.f111718b.size(); i11++) {
            iVar.m(this.f111718b.get(i11));
        }
    }

    private i o() {
        if (this.f111721e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f111717a);
            this.f111721e = assetDataSource;
            n(assetDataSource);
        }
        return this.f111721e;
    }

    private i p() {
        if (this.f111722f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f111717a);
            this.f111722f = contentDataSource;
            n(contentDataSource);
        }
        return this.f111722f;
    }

    private i q() {
        if (this.f111725i == null) {
            h hVar = new h();
            this.f111725i = hVar;
            n(hVar);
        }
        return this.f111725i;
    }

    private i r() {
        if (this.f111720d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f111720d = fileDataSource;
            n(fileDataSource);
        }
        return this.f111720d;
    }

    private i s() {
        if (this.f111726j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f111717a);
            this.f111726j = rawResourceDataSource;
            n(rawResourceDataSource);
        }
        return this.f111726j;
    }

    private i t() {
        if (this.f111723g == null) {
            try {
                i iVar = (i) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f111723g = iVar;
                n(iVar);
            } catch (ClassNotFoundException unused) {
                ts.u.i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating RTMP extension", e11);
            }
            if (this.f111723g == null) {
                this.f111723g = this.f111719c;
            }
        }
        return this.f111723g;
    }

    private i u() {
        if (this.f111724h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f111724h = udpDataSource;
            n(udpDataSource);
        }
        return this.f111724h;
    }

    private void v(i iVar, z zVar) {
        if (iVar != null) {
            iVar.m(zVar);
        }
    }

    @Override // ss.i
    public Map<String, List<String>> b() {
        i iVar = this.f111727k;
        return iVar == null ? Collections.EMPTY_MAP : iVar.b();
    }

    @Override // ss.i
    public void close() {
        i iVar = this.f111727k;
        if (iVar != null) {
            try {
                iVar.close();
            } finally {
                this.f111727k = null;
            }
        }
    }

    @Override // ss.i
    public Uri getUri() {
        i iVar = this.f111727k;
        if (iVar == null) {
            return null;
        }
        return iVar.getUri();
    }

    @Override // ss.i
    public long j(l lVar) {
        ts.a.g(this.f111727k == null);
        String scheme = lVar.f111661a.getScheme();
        if (p0.y0(lVar.f111661a)) {
            String path = lVar.f111661a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f111727k = r();
            } else {
                this.f111727k = o();
            }
        } else if ("asset".equals(scheme)) {
            this.f111727k = o();
        } else if ("content".equals(scheme)) {
            this.f111727k = p();
        } else if ("rtmp".equals(scheme)) {
            this.f111727k = t();
        } else if ("udp".equals(scheme)) {
            this.f111727k = u();
        } else if ("data".equals(scheme)) {
            this.f111727k = q();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f111727k = s();
        } else {
            this.f111727k = this.f111719c;
        }
        return this.f111727k.j(lVar);
    }

    @Override // ss.i
    public void m(z zVar) {
        ts.a.e(zVar);
        this.f111719c.m(zVar);
        this.f111718b.add(zVar);
        v(this.f111720d, zVar);
        v(this.f111721e, zVar);
        v(this.f111722f, zVar);
        v(this.f111723g, zVar);
        v(this.f111724h, zVar);
        v(this.f111725i, zVar);
        v(this.f111726j, zVar);
    }

    @Override // ss.g
    public int read(byte[] bArr, int i11, int i12) {
        return ((i) ts.a.e(this.f111727k)).read(bArr, i11, i12);
    }
}
