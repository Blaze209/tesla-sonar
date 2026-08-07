package p009i2;

import jn0.e;
import k3.p1;
import n2.RippleAlpha;
import n2.m;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u0004H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Li2/t;", "Ln2/m;", "<init>", "()V", "Lk3/p1;", "b", "(Lr2/l;I)J", "Ln2/d;", "a", "(Lr2/l;I)Ln2/d;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f75185b = new t();

    private t() {
    }

    @Override // n2.m
    @e
    public RippleAlpha a(l lVar, int i11) {
        lVar.o(112776173);
        if (o.J()) {
            o.S(112776173, i11, -1, "androidx.compose.material.CompatRippleTheme.rippleAlpha (Ripple.kt:286)");
        }
        RippleAlpha rippleAlphaA = y1.f75453a.a(((p1) lVar.U(z.a())).getValue(), j1.f74525a.a(lVar, 6).o());
        if (o.J()) {
            o.R();
        }
        lVar.l();
        return rippleAlphaA;
    }

    @Override // n2.m
    @e
    public long b(l lVar, int i11) {
        lVar.o(-1599906584);
        if (o.J()) {
            o.S(-1599906584, i11, -1, "androidx.compose.material.CompatRippleTheme.defaultColor (Ripple.kt:279)");
        }
        long jB = y1.f75453a.b(((p1) lVar.U(z.a())).getValue(), j1.f74525a.a(lVar, 6).o());
        if (o.J()) {
            o.R();
        }
        lVar.l();
        return jB;
    }
}
