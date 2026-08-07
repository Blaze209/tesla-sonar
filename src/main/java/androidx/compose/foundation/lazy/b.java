package androidx.compose.foundation.lazy;

import androidx.compose.ui.d;
import b4.b0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import jn0.h0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.y3;
import w4.c;
import wn0.l;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/lazy/b;", "Lb4/b0;", "Landroidx/compose/ui/d$c;", "", "fraction", "Lr2/y3;", "", "widthState", "heightState", "<init>", "(FLr2/y3;Lr2/y3;)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "n", Gender.FEMALE, "getFraction", "()F", "x2", "(F)V", "o", "Lr2/y3;", "getWidthState", "()Lr2/y3;", "z2", "(Lr2/y3;)V", "p", "getHeightState", "y2", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b extends d.c implements b0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float fraction;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private y3<Integer> widthState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private y3<Integer> heightState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w0 f4690c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w0 w0Var) {
            super(1);
            this.f4690c = w0Var;
        }

        public final void a(w0.a aVar) {
            w0.a.h(aVar, this.f4690c, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public b(float f11, y3<Integer> y3Var, y3<Integer> y3Var2) {
        this.fraction = f11;
        this.widthState = y3Var;
        this.heightState = y3Var2;
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        y3<Integer> y3Var = this.widthState;
        int iRound = (y3Var == null || y3Var.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(y3Var.getValue().floatValue() * this.fraction);
        y3<Integer> y3Var2 = this.heightState;
        int iRound2 = (y3Var2 == null || y3Var2.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(y3Var2.getValue().floatValue() * this.fraction);
        int iN = iRound != Integer.MAX_VALUE ? iRound : w4.b.n(j11);
        int iM = iRound2 != Integer.MAX_VALUE ? iRound2 : w4.b.m(j11);
        if (iRound == Integer.MAX_VALUE) {
            iRound = w4.b.l(j11);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = w4.b.k(j11);
        }
        w0 w0VarX0 = h0Var.x0(c.a(iN, iRound, iM, iRound2));
        return k0.N1(k0Var, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), null, new a(w0VarX0), 4, null);
    }

    public final void x2(float f11) {
        this.fraction = f11;
    }

    public final void y2(y3<Integer> y3Var) {
        this.heightState = y3Var;
    }

    public final void z2(y3<Integer> y3Var) {
        this.widthState = y3Var;
    }
}
