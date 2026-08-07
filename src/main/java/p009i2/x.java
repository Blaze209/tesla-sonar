package p009i2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import k3.p1;
import k3.r1;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\u000f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Li2/x;", "", "<init>", "()V", "", "highContrastAlpha", "lowContrastAlpha", "a", "(FFLr2/l;I)F", "c", "(Lr2/l;I)F", "high", DateTokenConverter.CONVERTER_KEY, "medium", "b", "disabled", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f75438a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f75439b = 0;

    private x() {
    }

    private final float a(float f11, float f12, l lVar, int i11) {
        if (o.J()) {
            o.S(-1528360391, i11, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:76)");
        }
        long value = ((p1) lVar.U(z.a())).getValue();
        if (!j1.f74525a.a(lVar, 6).o() ? r1.j(value) >= 0.5d : r1.j(value) <= 0.5d) {
            f11 = f12;
        }
        if (o.J()) {
            o.R();
        }
        return f11;
    }

    public final float b(l lVar, int i11) {
        if (o.J()) {
            o.S(621183615, i11, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:57)");
        }
        float fA = a(0.38f, 0.38f, lVar, ((i11 << 6) & 896) | 54);
        if (o.J()) {
            o.R();
        }
        return fA;
    }

    public final float c(l lVar, int i11) {
        if (o.J()) {
            o.S(629162431, i11, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:35)");
        }
        float fA = a(1.0f, 0.87f, lVar, ((i11 << 6) & 896) | 54);
        if (o.J()) {
            o.R();
        }
        return fA;
    }

    public final float d(l lVar, int i11) {
        if (o.J()) {
            o.S(1999054879, i11, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:46)");
        }
        float fA = a(0.74f, 0.6f, lVar, ((i11 << 6) & 896) | 54);
        if (o.J()) {
            o.R();
        }
        return fA;
    }
}
