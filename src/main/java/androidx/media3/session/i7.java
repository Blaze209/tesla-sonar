package androidx.media3.session;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class i7 extends s8 {
    private com.google.common.util.concurrent.s<ga.g<com.google.common.collect.x<p7.y>>> W0(t7.g gVar, q6 q6Var) {
        com.google.common.util.concurrent.a0.Q();
        if (t0()) {
        }
        throw null;
    }

    @Override // androidx.media3.session.s8
    public void B0(t7.g gVar) {
        throw null;
    }

    @Override // androidx.media3.session.s8
    protected eb O(ha.l.j jVar) {
        h7 h7Var = new h7(this);
        h7Var.x(jVar);
        return h7Var;
    }

    protected h7 V0() {
        return (h7) super.d0();
    }

    @Override // androidx.media3.session.s8
    protected void W(s8.e eVar) {
        super.W(eVar);
        h7 h7VarV0 = V0();
        if (h7VarV0 != null) {
            try {
                eVar.a(h7VarV0.R(), 0);
            } catch (RemoteException e11) {
                s7.t.e("MediaSessionImpl", "Exception in using media1 API", e11);
            }
        }
    }

    public com.google.common.util.concurrent.s<ga.g<com.google.common.collect.x<p7.y>>> X0(t7.g gVar, String str, int i11, int i12, q6 q6Var) {
        if (!Objects.equals(str, "androidx.media3.session.recent.root")) {
            N0(gVar);
            throw null;
        }
        if (L()) {
            return k0().g() == 1 ? W0(gVar, q6Var) : com.google.common.util.concurrent.m.d(ga.g.f(com.google.common.collect.x.s(new p7.y.c().c("androidx.media3.session.recent.item").d(new p7.e0.b().d0(Boolean.FALSE).e0(Boolean.TRUE).J()).a()), q6Var));
        }
        return com.google.common.util.concurrent.m.d(ga.g.c(-6));
    }

    public com.google.common.util.concurrent.s<ga.g<p7.y>> Y0(t7.g gVar, String str) {
        N0(gVar);
        throw null;
    }

    public com.google.common.util.concurrent.s<ga.g<p7.y>> Z0(t7.g gVar, q6 q6Var) {
        if (q6Var != null && q6Var.f12153b && v0(gVar)) {
            return !L() ? com.google.common.util.concurrent.m.d(ga.g.c(-6)) : com.google.common.util.concurrent.m.d(ga.g.e(new p7.y.c().c("androidx.media3.session.recent.root").d(new p7.e0.b().d0(Boolean.TRUE).e0(Boolean.FALSE).J()).a(), q6Var));
        }
        N0(gVar);
        throw null;
    }

    public com.google.common.util.concurrent.s<ga.g<com.google.common.collect.x<p7.y>>> a1(t7.g gVar, String str, int i11, int i12, q6 q6Var) {
        N0(gVar);
        throw null;
    }

    public com.google.common.util.concurrent.s<ga.g<Void>> b1(t7.g gVar, String str, q6 q6Var) {
        N0(gVar);
        throw null;
    }

    public com.google.common.util.concurrent.s<ga.g<Void>> c1(t7.g gVar, String str, q6 q6Var) {
        throw null;
    }

    public com.google.common.util.concurrent.s<ga.g<Void>> d1(t7.g gVar, String str) {
        N0(gVar);
        throw null;
    }

    @Override // androidx.media3.session.s8
    public boolean r0(t7.g gVar) {
        if (super.r0(gVar)) {
            return true;
        }
        h7 h7VarV0 = V0();
        return h7VarV0 != null && h7VarV0.v().p(gVar);
    }
}
