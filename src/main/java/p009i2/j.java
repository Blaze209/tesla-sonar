package p009i2;

import androidx.compose.foundation.layout.t;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import k3.p1;
import k3.r1;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;
import v1.y;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u001d\u0010\"\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b \u0010!R\u001d\u0010$\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b\u001c\u0010!R\u001d\u0010&\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b%\u0010!R\u001d\u0010)\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010!R\u001d\u0010,\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010!R\u001a\u0010.\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b-\u0010\u0017R\u0017\u00100\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b/\u0010\u001d\u001a\u0004\b#\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Li2/j;", "", "<init>", "()V", "Lw4/h;", "defaultElevation", "pressedElevation", "disabledElevation", "hoveredElevation", "focusedElevation", "Li2/k;", "b", "(FFFFFLr2/l;II)Li2/k;", "Lk3/p1;", "backgroundColor", "contentColor", "disabledBackgroundColor", "disabledContentColor", "Li2/i;", "a", "(JJJJLr2/l;II)Li2/i;", "g", "(JJJLr2/l;II)Li2/i;", Gender.FEMALE, "ButtonHorizontalPadding", "c", "ButtonVerticalPadding", "Lv1/y;", DateTokenConverter.CONVERTER_KEY, "Lv1/y;", "()Lv1/y;", "ContentPadding", "e", "()F", "MinWidth", "f", "MinHeight", "getIconSize-D9Ej5fM", "IconSize", "h", "getIconSpacing-D9Ej5fM", "IconSpacing", IntegerTokenConverter.CONVERTER_KEY, "getOutlinedBorderSize-D9Ej5fM", "OutlinedBorderSize", "j", "TextButtonHorizontalPadding", "k", "TextButtonContentPadding", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f74513a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonHorizontalPadding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonVerticalPadding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final y ContentPadding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float MinWidth;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float MinHeight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float IconSpacing;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float OutlinedBorderSize;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final float TextButtonHorizontalPadding;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final y TextButtonContentPadding;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f74524l = 0;

    static {
        float fG = h.g(16);
        ButtonHorizontalPadding = fG;
        float f11 = 8;
        float fG2 = h.g(f11);
        ButtonVerticalPadding = fG2;
        y yVarD = t.d(fG, fG2, fG, fG2);
        ContentPadding = yVarD;
        MinWidth = h.g(64);
        MinHeight = h.g(36);
        IconSize = h.g(18);
        IconSpacing = h.g(f11);
        OutlinedBorderSize = h.g(1);
        float fG3 = h.g(f11);
        TextButtonHorizontalPadding = fG3;
        TextButtonContentPadding = t.d(fG3, yVarD.getTop(), fG3, yVarD.getBottom());
    }

    private j() {
    }

    public final i a(long j11, long j12, long j13, long j14, l lVar, int i11, int i12) {
        long jH;
        long j15 = (i12 & 1) != 0 ? j1.f74525a.a(lVar, 6).j() : j11;
        long jB = (i12 & 2) != 0 ? s.b(j15, lVar, i11 & 14) : j12;
        if ((i12 & 4) != 0) {
            j1 j1Var = j1.f74525a;
            jH = r1.h(p1.p(j1Var.a(lVar, 6).i(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), j1Var.a(lVar, 6).n());
        } else {
            jH = j13;
        }
        long jP = (i12 & 8) != 0 ? p1.p(j1.f74525a.a(lVar, 6).i(), x.f75438a.b(lVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j14;
        if (o.J()) {
            o.S(1870371134, i11, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:413)");
        }
        a0 a0Var = new a0(j15, jB, jH, jP, null);
        if (o.J()) {
            o.R();
        }
        return a0Var;
    }

    public final k b(float f11, float f12, float f13, float f14, float f15, l lVar, int i11, int i12) {
        if ((i12 & 1) != 0) {
            f11 = h.g(2);
        }
        float f16 = f11;
        if ((i12 & 2) != 0) {
            f12 = h.g(8);
        }
        float f17 = f12;
        if ((i12 & 4) != 0) {
            f13 = h.g(0);
        }
        float f18 = f13;
        if ((i12 & 8) != 0) {
            f14 = h.g(4);
        }
        float f19 = f14;
        if ((i12 & 16) != 0) {
            f15 = h.g(4);
        }
        float f21 = f15;
        if (o.J()) {
            o.S(-737170518, i11, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:378)");
        }
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && lVar.q(f16)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && lVar.q(f17)) || (i11 & 48) == 32) | ((((i11 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && lVar.q(f18)) || (i11 & KyberEngine.KyberPolyBytes) == 256) | ((((i11 & 7168) ^ 3072) > 2048 && lVar.q(f19)) || (i11 & 3072) == 2048) | ((((57344 & i11) ^ 24576) > 16384 && lVar.q(f21)) || (i11 & 24576) == 16384);
        Object objI = lVar.I();
        if (z11 || objI == l.INSTANCE.a()) {
            b0 b0Var = new b0(f16, f17, f18, f19, f21, null);
            lVar.B(b0Var);
            objI = b0Var;
        }
        b0 b0Var2 = (b0) objI;
        if (o.J()) {
            o.R();
        }
        return b0Var2;
    }

    public final y c() {
        return ContentPadding;
    }

    public final float d() {
        return MinHeight;
    }

    public final float e() {
        return MinWidth;
    }

    public final y f() {
        return TextButtonContentPadding;
    }

    public final i g(long j11, long j12, long j13, l lVar, int i11, int i12) {
        long jI = (i12 & 1) != 0 ? p1.INSTANCE.i() : j11;
        long j14 = (i12 & 2) != 0 ? j1.f74525a.a(lVar, 6).j() : j12;
        long jP = (i12 & 4) != 0 ? p1.p(j1.f74525a.a(lVar, 6).i(), x.f75438a.b(lVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j13;
        if (o.J()) {
            o.S(182742216, i11, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:455)");
        }
        a0 a0Var = new a0(jI, j14, jI, jP, null);
        if (o.J()) {
            o.R();
        }
        return a0Var;
    }
}
