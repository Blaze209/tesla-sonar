package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.FileDataSource;
import java.io.File;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import s7.q0;
import v7.j;
import v7.n;
import v7.p;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
public final class a implements androidx.media3.datasource.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Cache f9179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.datasource.a f9180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.media3.datasource.a f9181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.datasource.a f9182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w7.b f9183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f9184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f9185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f9186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Uri f9187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private j f9188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private j f9189k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.media3.datasource.a f9190l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f9191m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f9192n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f9193o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private w7.c f9194p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f9195q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f9196r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f9197s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f9198t;

    public interface b {
    }

    public static final class c implements androidx.media3.datasource.a.InterfaceC0192a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Cache f9199a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private v7.d.a f9201c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f9203e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.media3.datasource.a.InterfaceC0192a f9204f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private PriorityTaskManager f9205g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f9206h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f9207i;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.media3.datasource.a.InterfaceC0192a f9200b = new FileDataSource.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private w7.b f9202d = w7.b.f121091a;

        private a c(androidx.media3.datasource.a aVar, int i11, int i12) {
            v7.d dVarA;
            Cache cache = (Cache) s7.a.f(this.f9199a);
            if (this.f9203e || aVar == null) {
                dVarA = null;
            } else {
                v7.d.a aVar2 = this.f9201c;
                dVarA = aVar2 != null ? aVar2.a() : new CacheDataSink.a().b(cache).a();
            }
            return new a(cache, aVar, this.f9200b.a(), dVarA, this.f9202d, i11, this.f9205g, i12, null);
        }

        @Override // androidx.media3.datasource.a.InterfaceC0192a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a() {
            androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a = this.f9204f;
            return c(interfaceC0192a != null ? interfaceC0192a.a() : null, this.f9207i, this.f9206h);
        }

        public c d(Cache cache) {
            this.f9199a = cache;
            return this;
        }

        public c e(androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a) {
            this.f9204f = interfaceC0192a;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void o() {
        androidx.media3.datasource.a aVar = this.f9190l;
        if (aVar == null) {
            return;
        }
        try {
            aVar.close();
        } finally {
            this.f9189k = null;
            this.f9190l = null;
            w7.c cVar = this.f9194p;
            if (cVar != null) {
                this.f9179a.a(cVar);
                this.f9194p = null;
            }
        }
    }

    private static Uri p(Cache cache, String str, Uri uri) {
        Uri uriC = w7.d.c(cache.b(str));
        return uriC != null ? uriC : uri;
    }

    private void q(Throwable th2) {
        if (s() || (th2 instanceof Cache.CacheException)) {
            this.f9195q = true;
        }
    }

    private boolean r() {
        return this.f9190l == this.f9182d;
    }

    private boolean s() {
        return this.f9190l == this.f9180b;
    }

    private boolean t() {
        return !s();
    }

    private boolean u() {
        return this.f9190l == this.f9181c;
    }

    private void v() {
    }

    private void w(int i11) {
    }

    private void x(j jVar, boolean z11) throws InterruptedIOException {
        w7.c cVarC;
        long jMin;
        j jVarA;
        androidx.media3.datasource.a aVar;
        String str = (String) q0.l(jVar.f118109i);
        if (this.f9196r) {
            cVarC = null;
        } else if (this.f9184f) {
            try {
                cVarC = this.f9179a.c(str, this.f9192n, this.f9193o);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            cVarC = this.f9179a.e(str, this.f9192n, this.f9193o);
        }
        if (cVarC == null) {
            aVar = this.f9182d;
            jVarA = jVar.a().h(this.f9192n).g(this.f9193o).a();
        } else if (cVarC.f121095d) {
            Uri uriFromFile = Uri.fromFile((File) q0.l(cVarC.f121096e));
            long j11 = cVarC.f121093b;
            long j12 = this.f9192n - j11;
            long jMin2 = cVarC.f121094c - j12;
            long j13 = this.f9193o;
            if (j13 != -1) {
                jMin2 = Math.min(jMin2, j13);
            }
            jVarA = jVar.a().i(uriFromFile).k(j11).h(j12).g(jMin2).a();
            aVar = this.f9180b;
        } else {
            if (cVarC.c()) {
                jMin = this.f9193o;
            } else {
                jMin = cVarC.f121094c;
                long j14 = this.f9193o;
                if (j14 != -1) {
                    jMin = Math.min(jMin, j14);
                }
            }
            jVarA = jVar.a().h(this.f9192n).g(jMin).a();
            aVar = this.f9181c;
            if (aVar == null) {
                aVar = this.f9182d;
                this.f9179a.a(cVarC);
                cVarC = null;
            }
        }
        this.f9198t = (this.f9196r || aVar != this.f9182d) ? Long.MAX_VALUE : this.f9192n + 102400;
        if (z11) {
            s7.a.h(r());
            if (aVar == this.f9182d) {
                return;
            }
            try {
                o();
            } catch (Throwable th2) {
                if (((w7.c) q0.l(cVarC)).b()) {
                    this.f9179a.a(cVarC);
                }
                throw th2;
            }
        }
        if (cVarC != null && cVarC.b()) {
            this.f9194p = cVarC;
        }
        this.f9190l = aVar;
        this.f9189k = jVarA;
        this.f9191m = 0L;
        long j15 = aVar.j(jVarA);
        w7.e eVar = new w7.e();
        if (jVarA.f118108h == -1 && j15 != -1) {
            this.f9193o = j15;
            w7.e.g(eVar, this.f9192n + j15);
        }
        if (t()) {
            Uri uri = aVar.getUri();
            this.f9187i = uri;
            w7.e.h(eVar, jVar.f118101a.equals(uri) ? null : this.f9187i);
        }
        if (u()) {
            this.f9179a.g(str, eVar);
        }
    }

    private void y(String str) {
        this.f9193o = 0L;
        if (u()) {
            w7.e eVar = new w7.e();
            w7.e.g(eVar, this.f9192n);
            this.f9179a.g(str, eVar);
        }
    }

    private int z(j jVar) {
        if (this.f9185g && this.f9195q) {
            return 0;
        }
        return (this.f9186h && jVar.f118108h == -1) ? 1 : -1;
    }

    @Override // androidx.media3.datasource.a
    public Map<String, List<String>> b() {
        return t() ? this.f9182d.b() : Collections.EMPTY_MAP;
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        this.f9188j = null;
        this.f9187i = null;
        this.f9192n = 0L;
        v();
        try {
            o();
        } catch (Throwable th2) {
            q(th2);
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        return this.f9187i;
    }

    @Override // androidx.media3.datasource.a
    public long j(j jVar) {
        try {
            String strA = this.f9183e.a(jVar);
            j jVarA = jVar.a().f(strA).a();
            this.f9188j = jVarA;
            this.f9187i = p(this.f9179a, strA, jVarA.f118101a);
            this.f9192n = jVar.f118107g;
            int iZ = z(jVar);
            boolean z11 = iZ != -1;
            this.f9196r = z11;
            if (z11) {
                w(iZ);
            }
            if (this.f9196r) {
                this.f9193o = -1L;
            } else {
                long jA = w7.d.a(this.f9179a.b(strA));
                this.f9193o = jA;
                if (jA != -1) {
                    long j11 = jA - jVar.f118107g;
                    this.f9193o = j11;
                    if (j11 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            long jMin = jVar.f118108h;
            if (jMin != -1) {
                long j12 = this.f9193o;
                if (j12 != -1) {
                    jMin = Math.min(j12, jMin);
                }
                this.f9193o = jMin;
            }
            long j13 = this.f9193o;
            if (j13 > 0 || j13 == -1) {
                x(jVarA, false);
            }
            long j14 = jVar.f118108h;
            return j14 != -1 ? j14 : this.f9193o;
        } catch (Throwable th2) {
            q(th2);
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.a
    public void n(q qVar) {
        s7.a.f(qVar);
        this.f9180b.n(qVar);
        this.f9182d.n(qVar);
    }

    @Override // p7.j
    public int read(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        if (this.f9193o == 0) {
            return -1;
        }
        j jVar = (j) s7.a.f(this.f9188j);
        j jVar2 = (j) s7.a.f(this.f9189k);
        try {
            if (this.f9192n >= this.f9198t) {
                x(jVar, true);
            }
            int i13 = ((androidx.media3.datasource.a) s7.a.f(this.f9190l)).read(bArr, i11, i12);
            if (i13 == -1) {
                if (t()) {
                    long j11 = jVar2.f118108h;
                    if (j11 == -1 || this.f9191m < j11) {
                        y((String) q0.l(jVar.f118109i));
                        return i13;
                    }
                }
                long j12 = this.f9193o;
                if (j12 <= 0) {
                    if (j12 == -1) {
                    }
                }
                o();
                x(jVar, false);
                return read(bArr, i11, i12);
            }
            if (s()) {
                this.f9197s += (long) i13;
            }
            long j13 = i13;
            this.f9192n += j13;
            this.f9191m += j13;
            long j14 = this.f9193o;
            if (j14 != -1) {
                this.f9193o = j14 - j13;
                return i13;
            }
            return i13;
        } catch (Throwable th2) {
            q(th2);
            throw th2;
        }
    }

    private a(Cache cache, androidx.media3.datasource.a aVar, androidx.media3.datasource.a aVar2, v7.d dVar, w7.b bVar, int i11, PriorityTaskManager priorityTaskManager, int i12, b bVar2) {
        this.f9179a = cache;
        this.f9180b = aVar2;
        this.f9183e = bVar == null ? w7.b.f121091a : bVar;
        this.f9184f = (i11 & 1) != 0;
        this.f9185g = (i11 & 2) != 0;
        this.f9186h = (i11 & 4) != 0;
        if (aVar == null) {
            this.f9182d = androidx.media3.datasource.h.f9282a;
            this.f9181c = null;
        } else {
            aVar = priorityTaskManager != null ? new n(aVar, priorityTaskManager, i12) : aVar;
            this.f9182d = aVar;
            this.f9181c = dVar != null ? new p(aVar, dVar) : null;
        }
    }
}
