package p8;

import p7.u;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f101919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f.b f101920k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private w8.g f101921l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f101922m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f101923n;

    public l(androidx.media3.datasource.a aVar, v7.j jVar, u uVar, int i11, Object obj, f fVar) {
        super(aVar, jVar, 2, uVar, i11, obj, -9223372036854775807L, -9223372036854775807L);
        this.f101919j = fVar;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public void a() {
        if (this.f101922m == 0) {
            this.f101919j.c(this.f101920k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            v7.j jVarE = this.f101871b.e(this.f101922m);
            v7.o oVar = this.f101878i;
            w8.j jVar = new w8.j(oVar, jVarE.f118107g, oVar.j(jVarE));
            while (!this.f101923n && this.f101919j.a(jVar)) {
                try {
                } catch (Throwable th2) {
                    this.f101922m = jVar.getPosition() - this.f101871b.f118107g;
                    this.f101921l = this.f101919j.d();
                    throw th2;
                }
            }
            this.f101922m = jVar.getPosition() - this.f101871b.f118107g;
            this.f101921l = this.f101919j.d();
            v7.i.a(this.f101878i);
        } catch (Throwable th3) {
            v7.i.a(this.f101878i);
            throw th3;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public void b() {
        this.f101923n = true;
    }

    public void g(f.b bVar) {
        this.f101920k = bVar;
    }
}
