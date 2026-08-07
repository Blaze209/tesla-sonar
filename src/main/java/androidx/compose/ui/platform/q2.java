package androidx.compose.ui.platform;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import k3.x3;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a?\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a:\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a;\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lk3/p3;", "outline", "", "x", "y", "Lk3/t3;", "tmpTouchPointPath", "tmpOpPath", "", "b", "(Lk3/p3;FFLk3/t3;Lk3/t3;)Z", "Lj3/i;", "rect", "e", "(Lj3/i;FF)Z", "Lk3/p3$c;", "touchPointPath", "opPath", "f", "(Lk3/p3$c;FFLk3/t3;Lk3/t3;)Z", "Lj3/k;", "a", "(Lj3/k;)Z", "Lj3/a;", "cornerRadius", "centerX", "centerY", "g", "(FFJFF)Z", "path", DateTokenConverter.CONVERTER_KEY, "(Lk3/t3;FFLk3/t3;Lk3/t3;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q2 {
    private static final boolean a(j3.k kVar) {
        return j3.a.d(kVar.getTopLeftCornerRadius()) + j3.a.d(kVar.getTopRightCornerRadius()) <= kVar.j() && j3.a.d(kVar.getBottomLeftCornerRadius()) + j3.a.d(kVar.getBottomRightCornerRadius()) <= kVar.j() && j3.a.e(kVar.getTopLeftCornerRadius()) + j3.a.e(kVar.getBottomLeftCornerRadius()) <= kVar.d() && j3.a.e(kVar.getTopRightCornerRadius()) + j3.a.e(kVar.getBottomRightCornerRadius()) <= kVar.d();
    }

    public static final boolean b(k3.p3 p3Var, float f11, float f12, k3.t3 t3Var, k3.t3 t3Var2) {
        if (p3Var instanceof k3.p3.b) {
            return e(((k3.p3.b) p3Var).b(), f11, f12);
        }
        if (p3Var instanceof k3.p3.c) {
            return f((k3.p3.c) p3Var, f11, f12, t3Var, t3Var2);
        }
        if (p3Var instanceof k3.p3.a) {
            return d(((k3.p3.a) p3Var).getPath(), f11, f12, t3Var, t3Var2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean c(k3.p3 p3Var, float f11, float f12, k3.t3 t3Var, k3.t3 t3Var2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            t3Var = null;
        }
        if ((i11 & 16) != 0) {
            t3Var2 = null;
        }
        return b(p3Var, f11, f12, t3Var, t3Var2);
    }

    private static final boolean d(k3.t3 t3Var, float f11, float f12, k3.t3 t3Var2, k3.t3 t3Var3) {
        j3.i iVar = new j3.i(f11 - 0.005f, f12 - 0.005f, f11 + 0.005f, f12 + 0.005f);
        if (t3Var2 == null) {
            t3Var2 = k3.w0.a();
        }
        k3.t3.l(t3Var2, iVar, null, 2, null);
        if (t3Var3 == null) {
            t3Var3 = k3.w0.a();
        }
        t3Var3.s(t3Var, t3Var2, x3.INSTANCE.b());
        boolean zIsEmpty = t3Var3.isEmpty();
        t3Var3.reset();
        t3Var2.reset();
        return !zIsEmpty;
    }

    private static final boolean e(j3.i iVar, float f11, float f12) {
        return iVar.getLeft() <= f11 && f11 < iVar.getRight() && iVar.getTop() <= f12 && f12 < iVar.getBottom();
    }

    private static final boolean f(k3.p3.c cVar, float f11, float f12, k3.t3 t3Var, k3.t3 t3Var2) {
        j3.k roundRect = cVar.getRoundRect();
        if (f11 < roundRect.getLeft() || f11 >= roundRect.getRight() || f12 < roundRect.getTop() || f12 >= roundRect.getBottom()) {
            return false;
        }
        if (!a(roundRect)) {
            k3.t3 t3VarA = t3Var2 == null ? k3.w0.a() : t3Var2;
            k3.t3.d(t3VarA, roundRect, null, 2, null);
            return d(t3VarA, f11, f12, t3Var, t3Var2);
        }
        float fD = j3.a.d(roundRect.getTopLeftCornerRadius()) + roundRect.getLeft();
        float fE = j3.a.e(roundRect.getTopLeftCornerRadius()) + roundRect.getTop();
        float right = roundRect.getRight() - j3.a.d(roundRect.getTopRightCornerRadius());
        float top = roundRect.getTop() + j3.a.e(roundRect.getTopRightCornerRadius());
        float right2 = roundRect.getRight() - j3.a.d(roundRect.getBottomRightCornerRadius());
        float bottom = roundRect.getBottom() - j3.a.e(roundRect.getBottomRightCornerRadius());
        float bottom2 = roundRect.getBottom() - j3.a.e(roundRect.getBottomLeftCornerRadius());
        float left = roundRect.getLeft() + j3.a.d(roundRect.getBottomLeftCornerRadius());
        if (f11 < fD && f12 < fE) {
            return g(f11, f12, roundRect.getTopLeftCornerRadius(), fD, fE);
        }
        if (f11 < left && f12 > bottom2) {
            return g(f11, f12, roundRect.getBottomLeftCornerRadius(), left, bottom2);
        }
        if (f11 > right && f12 < top) {
            return g(f11, f12, roundRect.getTopRightCornerRadius(), right, top);
        }
        if (f11 <= right2 || f12 <= bottom) {
            return true;
        }
        return g(f11, f12, roundRect.getBottomRightCornerRadius(), right2, bottom);
    }

    private static final boolean g(float f11, float f12, long j11, float f13, float f14) {
        float f15 = f11 - f13;
        float f16 = f12 - f14;
        float fD = j3.a.d(j11);
        float fE = j3.a.e(j11);
        return ((f15 * f15) / (fD * fD)) + ((f16 * f16) / (fE * fE)) <= 1.0f;
    }
}
