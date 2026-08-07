package androidx.media3.exoplayer.source;

import p7.r0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l0 extends c<Void> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Void f11073l = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final r f11074k;

    protected l0(r rVar) {
        this.f11074k = rVar;
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    protected final void E(v7.q qVar) {
        super.E(qVar);
        W();
    }

    protected r.b N(r.b bVar) {
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.c
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final r.b I(Void r11, r.b bVar) {
        return N(bVar);
    }

    protected long P(long j11, r.b bVar) {
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.c
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final long J(Void r11, long j11, r.b bVar) {
        return P(j11, bVar);
    }

    protected int R(int i11) {
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.c
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final int K(Void r11, int i11) {
        return R(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.c
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void L(Void r11, r rVar, r0 r0Var) {
        U(r0Var);
    }

    protected abstract void U(r0 r0Var);

    protected final void V() {
        M(f11073l, this.f11074k);
    }

    protected void W() {
        V();
    }

    @Override // androidx.media3.exoplayer.source.r
    public p7.y a() {
        return this.f11074k.a();
    }

    @Override // androidx.media3.exoplayer.source.r
    public r0 c() {
        return this.f11074k.c();
    }

    @Override // androidx.media3.exoplayer.source.r
    public boolean d() {
        return this.f11074k.d();
    }

    @Override // androidx.media3.exoplayer.source.r
    public void i(p7.y yVar) {
        this.f11074k.i(yVar);
    }
}
