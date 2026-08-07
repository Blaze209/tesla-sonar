package p008h80;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.b;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import f90.PrimaryButtonStyle;
import f90.n;
import k3.p1;
import k3.r1;
import n70.s;
import p013kotlin.Metadata;
import p014n4.q;
import p014n4.r;
import p014n4.v;
import p020r2.l;
import p020r2.o;
import q1.m;
import w4.h;
import w4.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u000e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u0011\u0010\u0010\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0012\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\f¨\u0006\u0013"}, d2 = {"Lh80/n0;", "", "<init>", "()V", "Lh80/k0;", "b", "(Lr2/l;I)Lh80/k0;", "Lh80/m0;", "c", "(Lr2/l;I)Lh80/m0;", "Lh80/p0;", DateTokenConverter.CONVERTER_KEY, "(Lr2/l;I)Lh80/p0;", "a", "colors", "e", "shape", "f", "typography", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f71272a = new n0();

    private n0() {
    }

    private final PrimaryButtonColors b(l lVar, int i11) {
        lVar.H(-1604949716);
        if (o.J()) {
            o.S(-1604949716, i11, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.getPrimaryButtonColors (PrimaryButtonTheme.kt:67)");
        }
        PrimaryButtonStyle primaryButtonStyleB = f90.l.f64654a.b();
        Context context = (Context) lVar.U(AndroidCompositionLocals_androidKt.g());
        PrimaryButtonColors primaryButtonColors = (PrimaryButtonColors) lVar.U(o0.b());
        boolean zA = m.a(lVar, 0);
        lVar.H(197435245);
        boolean zN = lVar.n(primaryButtonStyleB) | lVar.n(context) | lVar.n(primaryButtonColors) | lVar.p(zA);
        Object objI = lVar.I();
        if (zN || objI == l.INSTANCE.a()) {
            long background = primaryButtonColors.getBackground();
            p1.Companion companion = p1.INSTANCE;
            if (background == companion.j()) {
                background = r1.b(n.d(primaryButtonStyleB, context));
            }
            long j11 = background;
            long onBackground = primaryButtonColors.getOnBackground();
            if (onBackground == companion.j()) {
                onBackground = r1.b(n.k(primaryButtonStyleB, context));
            }
            long j12 = onBackground;
            long successBackground = primaryButtonColors.getSuccessBackground();
            if (successBackground == companion.j()) {
                successBackground = r1.b(b.getColor(context, s.f93458c));
            }
            long j13 = successBackground;
            long onSuccessBackground = primaryButtonColors.getOnSuccessBackground();
            if (onSuccessBackground == companion.j()) {
                onSuccessBackground = zA ? companion.a() : companion.k();
            }
            long j14 = onSuccessBackground;
            long border = primaryButtonColors.getBorder();
            if (border == companion.j()) {
                border = r1.b(n.f(primaryButtonStyleB, context));
            }
            Object primaryButtonColors2 = new PrimaryButtonColors(j11, j12, j13, j14, border, null);
            lVar.B(primaryButtonColors2);
            objI = primaryButtonColors2;
        }
        PrimaryButtonColors primaryButtonColors3 = (PrimaryButtonColors) objI;
        lVar.T();
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return primaryButtonColors3;
    }

    private final PrimaryButtonShape c(l lVar, int i11) {
        lVar.H(-1749410128);
        if (o.J()) {
            o.S(-1749410128, i11, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.getPrimaryButtonShape (PrimaryButtonTheme.kt:109)");
        }
        PrimaryButtonStyle primaryButtonStyleB = f90.l.f64654a.b();
        PrimaryButtonShape primaryButtonShape = (PrimaryButtonShape) lVar.U(o0.c());
        lVar.H(-1244205581);
        boolean zN = lVar.n(primaryButtonStyleB) | lVar.n(primaryButtonShape);
        Object objI = lVar.I();
        if (zN || objI == l.INSTANCE.a()) {
            float cornerRadius = primaryButtonShape.getCornerRadius();
            if (Float.isNaN(cornerRadius)) {
                cornerRadius = h.g(primaryButtonStyleB.getShape().getCornerRadius());
            }
            float borderStrokeWidth = primaryButtonShape.getBorderStrokeWidth();
            if (Float.isNaN(borderStrokeWidth)) {
                borderStrokeWidth = h.g(primaryButtonStyleB.getShape().getBorderStrokeWidth());
            }
            objI = new PrimaryButtonShape(cornerRadius, borderStrokeWidth, null);
            lVar.B(objI);
        }
        PrimaryButtonShape primaryButtonShape2 = (PrimaryButtonShape) objI;
        lVar.T();
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return primaryButtonShape2;
    }

    private final PrimaryButtonTypography d(l lVar, int i11) {
        lVar.H(-1210649140);
        if (o.J()) {
            o.S(-1210649140, i11, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.getPrimaryButtonTypography (PrimaryButtonTheme.kt:126)");
        }
        PrimaryButtonStyle primaryButtonStyleB = f90.l.f64654a.b();
        PrimaryButtonTypography primaryButtonTypography = (PrimaryButtonTypography) lVar.U(o0.d());
        lVar.H(1018213818);
        boolean zN = lVar.n(primaryButtonStyleB) | lVar.n(primaryButtonTypography);
        Object objI = lVar.I();
        if (zN || objI == l.INSTANCE.a()) {
            q fontFamily = primaryButtonTypography.getFontFamily();
            if (fontFamily == null) {
                Integer fontFamily2 = primaryButtonStyleB.getTypography().getFontFamily();
                fontFamily = fontFamily2 != null ? r.b(v.b(fontFamily2.intValue(), null, 0, 0, 14, null)) : null;
            }
            long fontSize = primaryButtonTypography.getFontSize();
            if (w.i(fontSize)) {
                fontSize = primaryButtonStyleB.getTypography().getFontSize();
            }
            Object primaryButtonTypography2 = new PrimaryButtonTypography(fontFamily, fontSize, null);
            lVar.B(primaryButtonTypography2);
            objI = primaryButtonTypography2;
        }
        PrimaryButtonTypography primaryButtonTypography3 = (PrimaryButtonTypography) objI;
        lVar.T();
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return primaryButtonTypography3;
    }

    public final PrimaryButtonColors a(l lVar, int i11) {
        lVar.H(-214126613);
        if (o.J()) {
            o.S(-214126613, i11, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.<get-colors> (PrimaryButtonTheme.kt:56)");
        }
        PrimaryButtonColors primaryButtonColorsB = b(lVar, i11 & 14);
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return primaryButtonColorsB;
    }

    public final PrimaryButtonShape e(l lVar, int i11) {
        lVar.H(-1656996728);
        if (o.J()) {
            o.S(-1656996728, i11, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.<get-shape> (PrimaryButtonTheme.kt:60)");
        }
        PrimaryButtonShape primaryButtonShapeC = c(lVar, i11 & 14);
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return primaryButtonShapeC;
    }

    public final PrimaryButtonTypography f(l lVar, int i11) {
        lVar.H(1153600138);
        if (o.J()) {
            o.S(1153600138, i11, -1, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.<get-typography> (PrimaryButtonTheme.kt:64)");
        }
        PrimaryButtonTypography primaryButtonTypographyD = d(lVar, i11 & 14);
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return primaryButtonTypographyD;
    }
}
