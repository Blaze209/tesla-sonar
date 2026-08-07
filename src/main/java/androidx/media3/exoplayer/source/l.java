package androidx.media3.exoplayer.source;

import java.util.Objects;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends androidx.media3.exoplayer.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j f11068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f11069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p7.y f11070j;

    @Override // androidx.media3.exoplayer.source.a
    protected void E(v7.q qVar) {
        F(new n8.u(this.f11069i, true, false, false, null, a()));
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void G() {
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized p7.y a() {
        return this.f11070j;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void b() {
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(q qVar) {
        ((k) qVar).p();
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized void i(p7.y yVar) {
        this.f11070j = yVar;
    }

    @Override // androidx.media3.exoplayer.source.r
    public boolean k(p7.y yVar) {
        p7.y.h hVar = yVar.f101682b;
        p7.y.h hVar2 = (p7.y.h) s7.a.f(a().f101682b);
        if (hVar == null || !hVar.f101783a.equals(hVar2.f101783a) || !Objects.equals(hVar.f101784b, hVar2.f101784b)) {
            return false;
        }
        long j11 = hVar.f101792j;
        return j11 == -9223372036854775807L || q0.b1(j11) == this.f11069i;
    }

    @Override // androidx.media3.exoplayer.source.r
    public q r(r.b bVar, s8.b bVar2, long j11) {
        p7.y yVarA = a();
        s7.a.f(yVarA.f101682b);
        s7.a.g(yVarA.f101682b.f101784b, "Externally loaded mediaItems require a MIME type.");
        p7.y.h hVar = yVarA.f101682b;
        return new k(hVar.f101783a, hVar.f101784b, this.f11068h);
    }

    private l(p7.y yVar, long j11, j jVar) {
        this.f11070j = yVar;
        this.f11069i = j11;
        this.f11068h = jVar;
    }

    public static final class b implements r.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f11071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final j f11072d;

        public b(long j11, j jVar) {
            this.f11071c = j11;
            this.f11072d = jVar;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        public r.a f(androidx.media3.exoplayer.upstream.b bVar) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public l g(p7.y yVar) {
            return new l(yVar, this.f11071c, this.f11072d);
        }

        @Override // androidx.media3.exoplayer.source.r.a
        public r.a d(e8.k kVar) {
            return this;
        }
    }
}
