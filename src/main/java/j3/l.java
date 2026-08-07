package j3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a8\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a@\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u0018\u001a\u00020\u000e*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u001c\u001a\u00020\u0019*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"", "left", "top", "right", "bottom", "radiusX", "radiusY", "Lj3/k;", "a", "(FFFFFF)Lj3/k;", "Lj3/a;", "cornerRadius", "c", "(FFFFJ)Lj3/k;", "Lj3/i;", "rect", "topLeft", "topRight", "bottomRight", "bottomLeft", "b", "(Lj3/i;JJJJ)Lj3/k;", DateTokenConverter.CONVERTER_KEY, "(Lj3/k;)Lj3/i;", "boundingRect", "", "e", "(Lj3/k;)Z", "isSimple", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l {
    public static final k a(float f11, float f12, float f13, float f14, float f15, float f16) {
        long jA = b.a(f15, f16);
        return new k(f11, f12, f13, f14, jA, jA, jA, jA, null);
    }

    public static final k b(i iVar, long j11, long j12, long j13, long j14) {
        return new k(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom(), j11, j12, j13, j14, null);
    }

    public static final k c(float f11, float f12, float f13, float f14, long j11) {
        return a(f11, f12, f13, f14, a.d(j11), a.e(j11));
    }

    public static final i d(k kVar) {
        return new i(kVar.getLeft(), kVar.getTop(), kVar.getRight(), kVar.getBottom());
    }

    public static final boolean e(k kVar) {
        return a.d(kVar.getTopLeftCornerRadius()) == a.e(kVar.getTopLeftCornerRadius()) && a.d(kVar.getTopLeftCornerRadius()) == a.d(kVar.getTopRightCornerRadius()) && a.d(kVar.getTopLeftCornerRadius()) == a.e(kVar.getTopRightCornerRadius()) && a.d(kVar.getTopLeftCornerRadius()) == a.d(kVar.getBottomRightCornerRadius()) && a.d(kVar.getTopLeftCornerRadius()) == a.e(kVar.getBottomRightCornerRadius()) && a.d(kVar.getTopLeftCornerRadius()) == a.d(kVar.getBottomLeftCornerRadius()) && a.d(kVar.getTopLeftCornerRadius()) == a.e(kVar.getBottomLeftCornerRadius());
    }
}
