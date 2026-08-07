package v1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0019\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010\u001a8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u00112\b\b\u0002\u0010\r\u001a\u00020\u00112\b\b\u0002\u0010\u000e\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Lv1/m0;", "insets", "f", "(Lv1/m0;Lv1/m0;)Lv1/m0;", "e", "Lw4/d;", "density", "Lv1/y;", DateTokenConverter.CONVERTER_KEY, "(Lv1/m0;Lw4/d;)Lv1/y;", "", "left", "top", "right", "bottom", "a", "(IIII)Lv1/m0;", "Lw4/h;", "b", "(FFFF)Lv1/m0;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class o0 {
    public static final m0 a(int i11, int i12, int i13, int i14) {
        return new Insets(i11, i12, i13, i14);
    }

    public static final m0 b(float f11, float f12, float f13, float f14) {
        return new Insets(f11, f12, f13, f14, null);
    }

    public static /* synthetic */ m0 c(float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = w4.h.g(0);
        }
        if ((i11 & 2) != 0) {
            f12 = w4.h.g(0);
        }
        if ((i11 & 4) != 0) {
            f13 = w4.h.g(0);
        }
        if ((i11 & 8) != 0) {
            f14 = w4.h.g(0);
        }
        return b(f11, f12, f13, f14);
    }

    public static final y d(m0 m0Var, w4.d dVar) {
        return new InsetsPaddingValues(m0Var, dVar);
    }

    public static final m0 e(m0 m0Var, m0 m0Var2) {
        return new n(m0Var, m0Var2);
    }

    public static final m0 f(m0 m0Var, m0 m0Var2) {
        return new k0(m0Var, m0Var2);
    }
}
