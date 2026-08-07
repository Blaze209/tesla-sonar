package a2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a8\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"La2/b;", "corner", "La2/f;", "b", "(La2/b;)La2/f;", "Lw4/h;", "size", "c", "(F)La2/f;", "", "percent", "a", "(I)La2/f;", "topStart", "topEnd", "bottomEnd", "bottomStart", DateTokenConverter.CONVERTER_KEY, "(FFFF)La2/f;", "La2/f;", "f", "()La2/f;", "CircleShape", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final RoundedCornerShape f42a = a(50);

    public static final RoundedCornerShape a(int i11) {
        return b(c.a(i11));
    }

    public static final RoundedCornerShape b(b bVar) {
        return new RoundedCornerShape(bVar, bVar, bVar, bVar);
    }

    public static final RoundedCornerShape c(float f11) {
        return b(c.b(f11));
    }

    public static final RoundedCornerShape d(float f11, float f12, float f13, float f14) {
        return new RoundedCornerShape(c.b(f11), c.b(f12), c.b(f13), c.b(f14));
    }

    public static /* synthetic */ RoundedCornerShape e(float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = h.g(0);
        }
        if ((i11 & 2) != 0) {
            f12 = h.g(0);
        }
        if ((i11 & 4) != 0) {
            f13 = h.g(0);
        }
        if ((i11 & 8) != 0) {
            f14 = h.g(0);
        }
        return d(f11, f12, f13, f14);
    }

    public static final RoundedCornerShape f() {
        return f42a;
    }
}
