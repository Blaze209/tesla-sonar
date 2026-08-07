package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.x0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class g0 extends c<Void> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Void f40453l = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final o f40454k;

    protected g0(o oVar) {
        this.f40454k = oVar;
    }

    protected o.b G(o.b bVar) {
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final o.b B(Void r11, o.b bVar) {
        return G(bVar);
    }

    protected long I(long j11) {
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final long C(Void r11, long j11) {
        return I(j11);
    }

    protected int K(int i11) {
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final int D(Void r11, int i11) {
        return K(i11);
    }

    protected abstract void M(f2 f2Var);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void E(Void r11, o oVar, f2 f2Var) {
        M(f2Var);
    }

    protected final void O() {
        F(f40453l, this.f40454k);
    }

    protected void P() {
        O();
    }

    @Override // com.google.android.exoplayer2.source.o
    public x0 a() {
        return this.f40454k.a();
    }

    @Override // com.google.android.exoplayer2.source.o
    public f2 c() {
        return this.f40454k.c();
    }

    @Override // com.google.android.exoplayer2.source.o
    public boolean d() {
        return this.f40454k.d();
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    protected final void x(ss.z zVar) {
        super.x(zVar);
        P();
    }
}
