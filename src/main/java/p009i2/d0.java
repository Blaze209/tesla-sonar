package p009i2;

import k3.r1;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Li2/d0;", "Li2/s0;", "<init>", "()V", "Lk3/p1;", "color", "Lw4/h;", "elevation", "a", "(JFLr2/l;I)J", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class d0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f74284a = new d0();

    private d0() {
    }

    @Override // p009i2.s0
    public long a(long j11, float f11, l lVar, int i11) {
        lVar.o(-1687113661);
        if (o.J()) {
            o.S(-1687113661, i11, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:68)");
        }
        Colors colorsA = j1.f74525a.a(lVar, 6);
        if (h.f(f11, h.g(0)) <= 0 || colorsA.o()) {
            lVar.o(1169152471);
            lVar.l();
        } else {
            lVar.o(1169013963);
            j11 = r1.h(t0.b(j11, f11, lVar, i11 & 126), j11);
            lVar.l();
        }
        if (o.J()) {
            o.R();
        }
        lVar.l();
        return j11;
    }
}
