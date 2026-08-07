package p016o2;

import androidx.compose.foundation.layout.t;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import k3.g4;
import k3.p1;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;
import q2.d;
import v1.y;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006JD\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0017\u0010\u001e\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010 \u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u0017\u0010#\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0018R\u001a\u0010$\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010\u0011R\u0017\u0010'\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0018R\u001d\u0010)\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u001f\u0010(R\u001d\u0010+\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010\u0011\u001a\u0004\b\u001c\u0010(R\u001d\u0010.\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010\u0011\u001a\u0004\b-\u0010(R\u001d\u00101\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u0010\u0011\u001a\u0004\b0\u0010(R\u0011\u00104\u001a\u0002028G¢\u0006\u0006\u001a\u0004\b!\u00103R\u0011\u00105\u001a\u0002028G¢\u0006\u0006\u001a\u0004\b%\u00103R\u0018\u00108\u001a\u00020\u0004*\u0002068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u00107R\u0018\u00109\u001a\u00020\u0004*\u0002068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, d2 = {"Lo2/b;", "", "<init>", "()V", "Lo2/a;", "a", "(Lr2/l;I)Lo2/a;", "k", "Lw4/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "Lo2/c;", "b", "(FFFFFLr2/l;II)Lo2/c;", Gender.FEMALE, "ButtonHorizontalPadding", "c", "ButtonVerticalPadding", "Lv1/y;", DateTokenConverter.CONVERTER_KEY, "Lv1/y;", "()Lv1/y;", "ContentPadding", "e", "ButtonWithIconHorizontalStartPadding", "f", "getButtonWithIconContentPadding", "ButtonWithIconContentPadding", "g", "TextButtonHorizontalPadding", "h", IntegerTokenConverter.CONVERTER_KEY, "TextButtonContentPadding", "TextButtonWithIconHorizontalEndPadding", "j", "getTextButtonWithIconContentPadding", "TextButtonWithIconContentPadding", "()F", "MinWidth", "l", "MinHeight", "m", "getIconSize-D9Ej5fM", "IconSize", "n", "getIconSpacing-D9Ej5fM", "IconSpacing", "Lk3/g4;", "(Lr2/l;I)Lk3/g4;", "shape", "textShape", "Lo2/i;", "(Lo2/i;)Lo2/a;", "defaultButtonColors", "defaultTextButtonColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f95717a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonHorizontalPadding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonVerticalPadding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final y ContentPadding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonWithIconHorizontalStartPadding;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final y ButtonWithIconContentPadding;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float TextButtonHorizontalPadding;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final y TextButtonContentPadding;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float TextButtonWithIconHorizontalEndPadding;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final y TextButtonWithIconContentPadding;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float MinWidth;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final float MinHeight;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final float IconSpacing;

    static {
        float fG = h.g(24);
        ButtonHorizontalPadding = fG;
        float f11 = 8;
        float fG2 = h.g(f11);
        ButtonVerticalPadding = fG2;
        y yVarD = t.d(fG, fG2, fG, fG2);
        ContentPadding = yVarD;
        float f12 = 16;
        float fG3 = h.g(f12);
        ButtonWithIconHorizontalStartPadding = fG3;
        ButtonWithIconContentPadding = t.d(fG3, fG2, fG, fG2);
        float fG4 = h.g(12);
        TextButtonHorizontalPadding = fG4;
        TextButtonContentPadding = t.d(fG4, yVarD.getTop(), fG4, yVarD.getBottom());
        float fG5 = h.g(f12);
        TextButtonWithIconHorizontalEndPadding = fG5;
        TextButtonWithIconContentPadding = t.d(fG4, yVarD.getTop(), fG5, yVarD.getBottom());
        MinWidth = h.g(58);
        MinHeight = h.g(40);
        IconSize = d.f104412a.i();
        IconSpacing = h.g(f11);
    }

    private b() {
    }

    public final a a(l lVar, int i11) {
        if (o.J()) {
            o.S(1449248637, i11, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:564)");
        }
        a aVarD = d(t.f96158a.a(lVar, 6));
        if (o.J()) {
            o.R();
        }
        return aVarD;
    }

    public final c b(float f11, float f12, float f13, float f14, float f15, l lVar, int i11, int i12) {
        if ((i12 & 1) != 0) {
            f11 = d.f104412a.b();
        }
        if ((i12 & 2) != 0) {
            f12 = d.f104412a.k();
        }
        if ((i12 & 4) != 0) {
            f13 = d.f104412a.g();
        }
        if ((i12 & 8) != 0) {
            f14 = d.f104412a.h();
        }
        float f16 = f14;
        if ((i12 & 16) != 0) {
            f15 = d.f104412a.e();
        }
        if (o.J()) {
            o.S(1827791191, i11, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:802)");
        }
        float f17 = f15;
        float f18 = f13;
        c cVar = new c(f11, f12, f18, f16, f17, null);
        if (o.J()) {
            o.R();
        }
        return cVar;
    }

    public final y c() {
        return ContentPadding;
    }

    public final a d(ColorScheme colorScheme) {
        a defaultButtonColorsCached = colorScheme.getDefaultButtonColorsCached();
        if (defaultButtonColorsCached != null) {
            return defaultButtonColorsCached;
        }
        d dVar = d.f104412a;
        a aVar = new a(j.d(colorScheme, dVar.a()), j.d(colorScheme, dVar.j()), p1.p(j.d(colorScheme, dVar.d()), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), p1.p(j.d(colorScheme, dVar.f()), 0.38f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null);
        colorScheme.O(aVar);
        return aVar;
    }

    public final a e(ColorScheme colorScheme) {
        a defaultTextButtonColorsCached = colorScheme.getDefaultTextButtonColorsCached();
        if (defaultTextButtonColorsCached != null) {
            return defaultTextButtonColorsCached;
        }
        p1.Companion companion = p1.INSTANCE;
        long jI = companion.i();
        q2.l lVar = q2.l.f104576a;
        a aVar = new a(jI, j.d(colorScheme, lVar.c()), companion.i(), p1.p(j.d(colorScheme, lVar.b()), 0.38f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null);
        colorScheme.R(aVar);
        return aVar;
    }

    public final float f() {
        return MinHeight;
    }

    public final float g() {
        return MinWidth;
    }

    public final g4 h(l lVar, int i11) {
        if (o.J()) {
            o.S(-1234923021, i11, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:542)");
        }
        g4 g4VarD = f0.d(d.f104412a.c(), lVar, 6);
        if (o.J()) {
            o.R();
        }
        return g4VarD;
    }

    public final y i() {
        return TextButtonContentPadding;
    }

    public final g4 j(l lVar, int i11) {
        if (o.J()) {
            o.S(-349121587, i11, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:558)");
        }
        g4 g4VarD = f0.d(q2.l.f104576a.a(), lVar, 6);
        if (o.J()) {
            o.R();
        }
        return g4VarD;
    }

    public final a k(l lVar, int i11) {
        if (o.J()) {
            o.S(1880341584, i11, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:744)");
        }
        a aVarE = e(t.f96158a.a(lVar, 6));
        if (o.J()) {
            o.R();
        }
        return aVarE;
    }
}
