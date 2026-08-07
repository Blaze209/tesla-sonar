package n2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import k3.p1;
import k3.s1;
import p013kotlin.Metadata;
import p019p1.f0;
import p019p1.o1;
import p020r2.n3;
import p020r2.y3;
import q1.c0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a0\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0017\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lu1/j;", "interactionSource", "", "bounded", "Lw4/h;", "radius", "Lk3/s1;", "color", "Lkotlin/Function0;", "Ln2/d;", "rippleAlpha", "Lb4/j;", "c", "(Lu1/j;ZFLk3/s1;Lwn0/a;)Lb4/j;", "Lk3/p1;", "Lq1/c0;", "f", "(ZFJLr2/l;II)Lq1/c0;", "Lu1/i;", "interaction", "Lp1/i;", "", DateTokenConverter.CONVERTER_KEY, "(Lu1/i;)Lp1/i;", "e", "Lp1/o1;", "a", "Lp1/o1;", "DefaultTweenSpec", "material-ripple_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o1<Float> f92714a = new o1<>(15, 0, f0.d(), 2, null);

    public static final b4.j c(u1.j jVar, boolean z11, float f11, s1 s1Var, wn0.a<RippleAlpha> aVar) {
        return o.d(jVar, z11, f11, s1Var, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p019p1.i<Float> d(u1.i iVar) {
        if (iVar instanceof u1.g) {
            return f92714a;
        }
        if (iVar instanceof u1.d) {
            return new o1(45, 0, f0.d(), 2, null);
        }
        return iVar instanceof u1.b ? new o1(45, 0, f0.d(), 2, null) : f92714a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p019p1.i<Float> e(u1.i iVar) {
        if (iVar instanceof u1.g) {
            return f92714a;
        }
        if (iVar instanceof u1.d) {
            return f92714a;
        }
        return iVar instanceof u1.b ? new o1(150, 0, f0.d(), 2, null) : f92714a;
    }

    @jn0.e
    public static final c0 f(boolean z11, float f11, long j11, p020r2.l lVar, int i11, int i12) {
        boolean z12 = true;
        if ((i12 & 1) != 0) {
            z11 = true;
        }
        if ((i12 & 2) != 0) {
            f11 = w4.h.INSTANCE.c();
        }
        if ((i12 & 4) != 0) {
            j11 = p1.INSTANCE.j();
        }
        if (p020r2.o.J()) {
            p020r2.o.S(1635163520, i11, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:146)");
        }
        y3 y3VarO = n3.o(p1.l(j11), lVar, (i11 >> 6) & 14);
        boolean z13 = (((i11 & 14) ^ 6) > 4 && lVar.p(z11)) || (i11 & 6) == 4;
        if ((((i11 & 112) ^ 48) <= 32 || !lVar.q(f11)) && (i11 & 48) != 32) {
            z12 = false;
        }
        boolean z14 = z13 | z12;
        Object objI = lVar.I();
        if (z14 || objI == p020r2.l.INSTANCE.a()) {
            objI = new b(z11, f11, y3VarO, null);
            lVar.B(objI);
        }
        b bVar = (b) objI;
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return bVar;
    }
}
