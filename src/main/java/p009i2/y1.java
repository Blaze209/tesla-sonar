package p009i2;

import androidx.compose.material.d;
import k3.p1;
import k3.r1;
import n2.RippleAlpha;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Li2/y1;", "", "<init>", "()V", "Lk3/p1;", "contentColor", "", "lightTheme", "b", "(JZ)J", "Ln2/d;", "a", "(JZ)Ln2/d;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1 f75453a = new y1();

    private y1() {
    }

    public final RippleAlpha a(long contentColor, boolean lightTheme) {
        if (lightTheme) {
            return ((double) r1.j(contentColor)) > 0.5d ? d.f5062e : d.f5063f;
        }
        return d.f5064g;
    }

    public final long b(long contentColor, boolean lightTheme) {
        return (lightTheme || ((double) r1.j(contentColor)) >= 0.5d) ? contentColor : p1.INSTANCE.k();
    }
}
