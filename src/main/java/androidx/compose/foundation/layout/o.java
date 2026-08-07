package androidx.compose.foundation.layout;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\n\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J#\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J#\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/o;", "Lb4/b0;", "Landroidx/compose/ui/d$c;", "<init>", "()V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "x2", "(Lz3/k0;Lz3/h0;J)J", "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "Lz3/r;", "Lz3/q;", "", Snapshot.HEIGHT, "B", "(Lz3/r;Lz3/q;I)I", Snapshot.WIDTH, "q", Gender.MALE, "n", "", "y2", "()Z", "enforceIncoming", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
abstract class o extends androidx.compose.ui.d.c implements b4.b0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f4605c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w0 w0Var) {
            super(1);
            this.f4605c = w0Var;
        }

        public final void a(w0.a aVar) {
            w0.a.n(aVar, this.f4605c, w4.n.INSTANCE.a(), BitmapDescriptorFactory.HUE_RED, 2, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    @Override // b4.b0
    public int B(z3.r rVar, z3.q qVar, int i11) {
        return qVar.s0(i11);
    }

    @Override // b4.b0
    public int M(z3.r rVar, z3.q qVar, int i11) {
        return qVar.t0(i11);
    }

    @Override // b4.b0
    public final j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        long jX2 = x2(k0Var, h0Var, j11);
        if (getEnforceIncoming()) {
            jX2 = w4.c.g(j11, jX2);
        }
        w0 w0VarX0 = h0Var.x0(jX2);
        return k0.N1(k0Var, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), null, new a(w0VarX0), 4, null);
    }

    public int n(z3.r rVar, z3.q qVar, int i11) {
        return qVar.V(i11);
    }

    public int q(z3.r rVar, z3.q qVar, int i11) {
        return qVar.m0(i11);
    }

    public abstract long x2(k0 k0Var, z3.h0 h0Var, long j11);

    /* JADX INFO: renamed from: y2 */
    public abstract boolean getEnforceIncoming();
}
