package p009i2;

import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Li2/z0;", "", "<init>", "()V", "Lw4/h;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "Li2/a1;", "a", "(FFFFLr2/l;II)Li2/a1;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f75456a = new z0();

    private z0() {
    }

    public final a1 a(float f11, float f12, float f13, float f14, l lVar, int i11, int i12) {
        if ((i12 & 1) != 0) {
            f11 = h.g(6);
        }
        float f15 = f11;
        if ((i12 & 2) != 0) {
            f12 = h.g(12);
        }
        float f16 = f12;
        if ((i12 & 4) != 0) {
            f13 = h.g(8);
        }
        float f17 = f13;
        if ((i12 & 8) != 0) {
            f14 = h.g(8);
        }
        float f18 = f14;
        if (o.J()) {
            o.S(380403812, i11, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:248)");
        }
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && lVar.q(f15)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && lVar.q(f16)) || (i11 & 48) == 32) | ((((i11 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && lVar.q(f17)) || (i11 & KyberEngine.KyberPolyBytes) == 256) | ((((i11 & 7168) ^ 3072) > 2048 && lVar.q(f18)) || (i11 & 3072) == 2048);
        Object objI = lVar.I();
        if (z11 || objI == l.INSTANCE.a()) {
            e0 e0Var = new e0(f15, f16, f17, f18, null);
            lVar.B(e0Var);
            objI = e0Var;
        }
        e0 e0Var2 = (e0) objI;
        if (o.J()) {
            o.R();
        }
        return e0Var2;
    }
}
