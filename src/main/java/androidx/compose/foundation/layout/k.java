package androidx.compose.foundation.layout;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/k;", "Lb4/b0;", "Landroidx/compose/ui/d$c;", "Lv1/m;", "direction", "", "fraction", "<init>", "(Lv1/m;F)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "n", "Lv1/m;", "getDirection", "()Lv1/m;", "x2", "(Lv1/m;)V", "o", Gender.FEMALE, "getFraction", "()F", "y2", "(F)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class k extends androidx.compose.ui.d.c implements b4.b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private v1.m direction;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float fraction;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f4599c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w0 w0Var) {
            super(1);
            this.f4599c = w0Var;
        }

        public final void a(w0.a aVar) {
            w0.a.l(aVar, this.f4599c, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public k(v1.m mVar, float f11) {
        this.direction = mVar;
        this.fraction = f11;
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        int iN;
        int iL;
        int iK;
        int iN2;
        if (!w4.b.h(j11) || this.direction == v1.m.Vertical) {
            iN = w4.b.n(j11);
            iL = w4.b.l(j11);
        } else {
            iN = bo0.n.n(Math.round(w4.b.l(j11) * this.fraction), w4.b.n(j11), w4.b.l(j11));
            iL = iN;
        }
        if (!w4.b.g(j11) || this.direction == v1.m.Horizontal) {
            int iM = w4.b.m(j11);
            iK = w4.b.k(j11);
            iN2 = iM;
        } else {
            iN2 = bo0.n.n(Math.round(w4.b.k(j11) * this.fraction), w4.b.m(j11), w4.b.k(j11));
            iK = iN2;
        }
        w0 w0VarX0 = h0Var.x0(w4.c.a(iN, iL, iN2, iK));
        return k0.N1(k0Var, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), null, new a(w0VarX0), 4, null);
    }

    public final void x2(v1.m mVar) {
        this.direction = mVar;
    }

    public final void y2(float f11) {
        this.fraction = f11;
    }
}
