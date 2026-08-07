package f90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k3.p1;
import k3.r1;
import p009i2.s;
import p013kotlin.Metadata;
import p014n4.FontWeight;
import w4.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0010\u0010\u001c¨\u0006\u001e"}, d2 = {"Lf90/m;", "", "<init>", "()V", "", "isDark", "Lf90/i;", "a", "(Z)Lf90/i;", "b", "Lf90/i;", "c", "()Lf90/i;", "colorsLight", "colorsDark", "Lf90/k;", DateTokenConverter.CONVERTER_KEY, "Lf90/k;", "e", "()Lf90/k;", "shapes", "Lf90/o;", "Lf90/o;", "f", "()Lf90/o;", "typography", "Lf90/d;", "Lf90/d;", "()Lf90/d;", "primaryButtonStyle", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f64661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final StripeColors colorsLight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final StripeColors colorsDark;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final StripeShapes shapes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final StripeTypography typography;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final PrimaryButtonStyle primaryButtonStyle;

    static {
        m mVar = new m();
        f64661a = mVar;
        p1.Companion companion = p1.INSTANCE;
        colorsLight = new StripeColors(companion.k(), r1.b(863533184), r1.b(863533184), companion.a(), r1.d(2566914048L), companion.a(), r1.d(2570861635L), r1.d(2566914048L), s.h(r1.d(4278221567L), 0L, 0L, 0L, 0L, companion.k(), companion.h(), 0L, 0L, 0L, companion.a(), 0L, 2974, null), null);
        colorsDark = new StripeColors(companion.c(), r1.d(4286085248L), r1.d(4286085248L), companion.k(), r1.d(2583691263L), companion.k(), r1.b(1644167167), companion.k(), s.d(r1.d(4278219988L), 0L, 0L, 0L, 0L, r1.d(4281216558L), companion.h(), 0L, 0L, 0L, companion.k(), 0L, 2974, null), null);
        StripeShapes stripeShapes = new StripeShapes(6.0f, 1.0f);
        shapes = stripeShapes;
        FontWeight.Companion companion2 = FontWeight.INSTANCE;
        StripeTypography stripeTypography = new StripeTypography(companion2.d().k(), companion2.c().k(), companion2.a().k(), 1.0f, w.h(9), w.h(12), w.h(13), w.h(14), w.h(16), w.h(20), null, null, null, null, null, null, null, null, 260096, null);
        typography = stripeTypography;
        primaryButtonStyle = new PrimaryButtonStyle(new PrimaryButtonColors(mVar.a(false).getMaterialColors().j(), companion.k(), companion.i(), n.m(), companion.k(), null), new PrimaryButtonColors(mVar.a(true).getMaterialColors().j(), companion.k(), companion.i(), n.m(), companion.k(), null), new PrimaryButtonShape(stripeShapes.getCornerRadius(), BitmapDescriptorFactory.HUE_RED), new PrimaryButtonTypography(stripeTypography.getFontFamily(), stripeTypography.getLargeFontSize(), null));
    }

    private m() {
    }

    public final StripeColors a(boolean isDark) {
        return isDark ? colorsDark : colorsLight;
    }

    public final StripeColors b() {
        return colorsDark;
    }

    public final StripeColors c() {
        return colorsLight;
    }

    public final PrimaryButtonStyle d() {
        return primaryButtonStyle;
    }

    public final StripeShapes e() {
        return shapes;
    }

    public final StripeTypography f() {
        return typography;
    }
}
