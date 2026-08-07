package p009i2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k3.p1;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Li2/p;", "", "<init>", "()V", "Lk3/p1;", "checkedColor", "uncheckedColor", "checkmarkColor", "disabledColor", "disabledIndeterminateColor", "Li2/o;", "a", "(JJJJJLr2/l;II)Li2/o;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f74863a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f74864b = 0;

    private p() {
    }

    public final o a(long j11, long j12, long j13, long j14, long j15, l lVar, int i11, int i12) {
        long j16;
        long jP;
        long jL = (i12 & 1) != 0 ? j1.f74525a.a(lVar, 6).l() : j11;
        long jP2 = (i12 & 2) != 0 ? p1.p(j1.f74525a.a(lVar, 6).i(), 0.6f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j12;
        long jN = (i12 & 4) != 0 ? j1.f74525a.a(lVar, 6).n() : j13;
        long jP3 = (i12 & 8) != 0 ? p1.p(j1.f74525a.a(lVar, 6).i(), x.f75438a.b(lVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j14;
        if ((i12 & 16) != 0) {
            long j17 = jL;
            jP = p1.p(j17, x.f75438a.b(lVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            j16 = j17;
        } else {
            j16 = jL;
            jP = j15;
        }
        if (o.J()) {
            o.S(469524104, i11, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:231)");
        }
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && lVar.s(j16)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && lVar.s(jP2)) || (i11 & 48) == 32) | ((((i11 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && lVar.s(jN)) || (i11 & KyberEngine.KyberPolyBytes) == 256) | ((((i11 & 7168) ^ 3072) > 2048 && lVar.s(jP3)) || (i11 & 3072) == 2048) | ((((57344 & i11) ^ 24576) > 16384 && lVar.s(jP)) || (i11 & 24576) == 16384);
        Object objI = lVar.I();
        if (z11 || objI == l.INSTANCE.a()) {
            long j18 = j16;
            long j19 = jP3;
            c0 c0Var = new c0(jN, p1.p(jN, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), j18, p1.p(j18, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), j19, p1.p(jP3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), jP, j18, jP2, jP3, jP, null);
            lVar.B(c0Var);
            objI = c0Var;
        }
        c0 c0Var2 = (c0) objI;
        if (o.J()) {
            o.R();
        }
        return c0Var2;
    }
}
