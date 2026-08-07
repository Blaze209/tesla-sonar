package p009i2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k3.p1;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jî\u0001\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Li2/u0;", "", "<init>", "()V", "Lk3/p1;", "textColor", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "focusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "Li2/n2;", "a", "(JJJJJJJJJJJJJJJJJJJJJJLr2/l;IIII)Li2/n2;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f75268a = new u0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f75269b = 0;

    private u0() {
    }

    public final n2 a(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, long j34, l lVar, int i11, int i12, int i13, int i14) {
        long j35;
        long jP;
        long j36;
        long jP2;
        long j37;
        long jP3;
        long j38;
        long jP4;
        long jP5;
        long jP6 = (i14 & 1) != 0 ? p1.p(((p1) lVar.U(z.a())).getValue(), ((Number) lVar.U(y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j11;
        long jP7 = (i14 & 2) != 0 ? p1.p(jP6, x.f75438a.b(lVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j12;
        long jI = (i14 & 4) != 0 ? p1.INSTANCE.i() : j13;
        long j39 = (i14 & 8) != 0 ? j1.f74525a.a(lVar, 6).j() : j14;
        long jD = (i14 & 16) != 0 ? j1.f74525a.a(lVar, 6).d() : j15;
        long jP8 = (i14 & 32) != 0 ? p1.p(j1.f74525a.a(lVar, 6).j(), x.f75438a.c(lVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j16;
        long jP9 = (i14 & 64) != 0 ? p1.p(j1.f74525a.a(lVar, 6).i(), x.f75438a.b(lVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j17;
        if ((i14 & 128) != 0) {
            long j41 = jP9;
            jP = p1.p(j41, x.f75438a.b(lVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            j35 = j41;
        } else {
            j35 = jP9;
            jP = j18;
        }
        long jD2 = (i14 & 256) != 0 ? j1.f74525a.a(lVar, 6).d() : j19;
        long jP10 = (i14 & 512) != 0 ? p1.p(j1.f74525a.a(lVar, 6).i(), 0.54f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j21;
        if ((i14 & 1024) != 0) {
            long j42 = jP10;
            jP2 = p1.p(j42, x.f75438a.b(lVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            j36 = j42;
        } else {
            j36 = jP10;
            jP2 = j22;
        }
        long j43 = (i14 & 2048) != 0 ? j36 : j23;
        long jP11 = (i14 & 4096) != 0 ? p1.p(j1.f74525a.a(lVar, 6).i(), 0.54f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j24;
        long jP12 = (i14 & PKIFailureInfo.certRevoked) != 0 ? p1.p(j1.f74525a.a(lVar, 6).j(), x.f75438a.c(lVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j25;
        if ((i14 & 16384) != 0) {
            long j44 = jP11;
            jP3 = p1.p(j44, x.f75438a.b(lVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            j37 = j44;
        } else {
            j37 = jP11;
            jP3 = j26;
        }
        long jD3 = (32768 & i14) != 0 ? j1.f74525a.a(lVar, 6).d() : j27;
        long jP13 = (65536 & i14) != 0 ? p1.p(j1.f74525a.a(lVar, 6).j(), x.f75438a.c(lVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j28;
        long jP14 = (131072 & i14) != 0 ? p1.p(j1.f74525a.a(lVar, 6).i(), x.f75438a.d(lVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j29;
        if ((262144 & i14) != 0) {
            long j45 = jP14;
            jP4 = p1.p(j45, x.f75438a.b(lVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            j38 = j45;
        } else {
            j38 = jP14;
            jP4 = j31;
        }
        long jD4 = (524288 & i14) != 0 ? j1.f74525a.a(lVar, 6).d() : j32;
        long jP15 = (1048576 & i14) != 0 ? p1.p(j1.f74525a.a(lVar, 6).i(), x.f75438a.d(lVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j33;
        if ((i14 & PKIFailureInfo.badSenderNonce) != 0) {
            jP5 = p1.p(jP15, x.f75438a.b(lVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        } else {
            jP5 = j34;
        }
        if (o.J()) {
            o.S(1841636861, i11, i12, "androidx.compose.material.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:488)");
        }
        long j46 = j37;
        h0 h0Var = new h0(jP6, jP7, j39, jD, jP8, j35, jD2, jP, j36, jP2, j43, j46, jP12, jP3, jD3, jI, jP13, j38, jP4, jD4, jP15, jP5, null);
        if (o.J()) {
            o.R();
        }
        return h0Var;
    }
}
