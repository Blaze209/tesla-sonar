package androidx.compose.foundation.layout;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import z3.h0;
import z3.k0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/m;", "Landroidx/compose/foundation/layout/o;", "Lv1/w;", Snapshot.HEIGHT, "", "enforceIncoming", "<init>", "(Lv1/w;Z)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "x2", "(Lz3/k0;Lz3/h0;J)J", "Lz3/r;", "Lz3/q;", "", Snapshot.WIDTH, "q", "(Lz3/r;Lz3/q;I)I", "n", "Lv1/w;", "getHeight", "()Lv1/w;", "A2", "(Lv1/w;)V", "o", "Z", "y2", "()Z", "z2", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class m extends o {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private v1.w height;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean enforceIncoming;

    public m(v1.w wVar, boolean z11) {
        this.height = wVar;
        this.enforceIncoming = z11;
    }

    public final void A2(v1.w wVar) {
        this.height = wVar;
    }

    @Override // androidx.compose.foundation.layout.o, b4.b0
    public int n(z3.r rVar, z3.q qVar, int i11) {
        return this.height == v1.w.Min ? qVar.m0(i11) : qVar.V(i11);
    }

    @Override // androidx.compose.foundation.layout.o, b4.b0
    public int q(z3.r rVar, z3.q qVar, int i11) {
        return this.height == v1.w.Min ? qVar.m0(i11) : qVar.V(i11);
    }

    @Override // androidx.compose.foundation.layout.o
    public long x2(k0 k0Var, h0 h0Var, long j11) {
        int iM0 = this.height == v1.w.Min ? h0Var.m0(w4.b.l(j11)) : h0Var.V(w4.b.l(j11));
        if (iM0 < 0) {
            iM0 = 0;
        }
        return w4.b.INSTANCE.d(iM0);
    }

    @Override // androidx.compose.foundation.layout.o
    /* JADX INFO: renamed from: y2, reason: from getter */
    public boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    public void z2(boolean z11) {
        this.enforceIncoming = z11;
    }
}
