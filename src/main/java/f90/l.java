package f90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010&\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\"\u001a\u0004\b\t\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lf90/l;", "", "<init>", "()V", "", "isDark", "Lf90/i;", "a", "(Z)Lf90/i;", "b", "Lf90/i;", "getColorsDarkMutable", "()Lf90/i;", "e", "(Lf90/i;)V", "colorsDarkMutable", "c", "getColorsLightMutable", "f", "colorsLightMutable", "Lf90/k;", DateTokenConverter.CONVERTER_KEY, "Lf90/k;", "()Lf90/k;", "h", "(Lf90/k;)V", "shapesMutable", "Lf90/o;", "Lf90/o;", "()Lf90/o;", IntegerTokenConverter.CONVERTER_KEY, "(Lf90/o;)V", "typographyMutable", "Lf90/d;", "Lf90/d;", "()Lf90/d;", "g", "(Lf90/d;)V", "primaryButtonStyle", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f64654a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static StripeColors colorsDarkMutable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static StripeColors colorsLightMutable;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static StripeShapes shapesMutable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static StripeTypography typographyMutable;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static PrimaryButtonStyle primaryButtonStyle;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f64660g;

    static {
        m mVar = m.f64661a;
        colorsDarkMutable = mVar.b();
        colorsLightMutable = mVar.c();
        shapesMutable = mVar.e();
        typographyMutable = mVar.f();
        primaryButtonStyle = mVar.d();
        f64660g = 8;
    }

    private l() {
    }

    public final StripeColors a(boolean isDark) {
        return isDark ? colorsDarkMutable : colorsLightMutable;
    }

    public final PrimaryButtonStyle b() {
        return primaryButtonStyle;
    }

    public final StripeShapes c() {
        return shapesMutable;
    }

    public final StripeTypography d() {
        return typographyMutable;
    }

    public final void e(StripeColors stripeColors) {
        s.k(stripeColors, "<set-?>");
        colorsDarkMutable = stripeColors;
    }

    public final void f(StripeColors stripeColors) {
        s.k(stripeColors, "<set-?>");
        colorsLightMutable = stripeColors;
    }

    public final void g(PrimaryButtonStyle primaryButtonStyle2) {
        s.k(primaryButtonStyle2, "<set-?>");
        primaryButtonStyle = primaryButtonStyle2;
    }

    public final void h(StripeShapes stripeShapes) {
        s.k(stripeShapes, "<set-?>");
        shapesMutable = stripeShapes;
    }

    public final void i(StripeTypography stripeTypography) {
        s.k(stripeTypography, "<set-?>");
        typographyMutable = stripeTypography;
    }
}
