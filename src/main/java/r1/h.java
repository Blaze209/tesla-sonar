package r1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import i4.PlatformTextStyle;
import i4.TextStyle;
import k3.Shadow;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p014n4.FontWeight;
import p014n4.b0;
import p014n4.c0;
import p014n4.q;
import p4.LocaleList;
import t4.LineHeightStyle;
import t4.TextGeometricTransform;
import t4.TextIndent;
import t4.s;
import w4.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\r\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001d\u0010\u0010\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0013\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\fR\u001d\u0010\u0016\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\fR\u001d\u0010\u0018\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u001c\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u001d\u0010!\u001a\u00020\u001d8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010#\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b\u0011\u0010\fR\u001d\u0010$\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\"\u0010\fR\u001d\u0010&\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010\u000b\u001a\u0004\b\u0014\u0010\fR\u001d\u0010,\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u00102\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u00105\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010+R\u001d\u00108\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Lr1/h;", "", "<init>", "()V", "Lk3/p1;", "color", "Li4/r0;", "j", "(J)Li4/r0;", "Lw4/h;", "b", Gender.FEMALE, "()F", "ContainerWidthMin", "c", "a", "ContainerWidthMax", DateTokenConverter.CONVERTER_KEY, "g", "ListItemHeight", "e", "h", "MenuContainerElevation", "f", "CornerRadius", "Ld3/c$c;", "Ld3/c$c;", "()Ld3/c$c;", "LabelVerticalTextAlignment", "Lt4/j;", "I", "getLabelHorizontalTextAlignment-e0LSkKk", "()I", "LabelHorizontalTextAlignment", IntegerTokenConverter.CONVERTER_KEY, "HorizontalPadding", "VerticalPadding", "k", "IconSize", "Lw4/v;", "l", "J", "getFontSize-XSAIIZE", "()J", "FontSize", "Ln4/f0;", "m", "Ln4/f0;", "getFontWeight", "()Ln4/f0;", "FontWeight", "n", "getLineHeight-XSAIIZE", "LineHeight", "o", "getLetterSpacing-XSAIIZE", "LetterSpacing", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f106381a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerWidthMin = w4.h.g(112);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ContainerWidthMax = w4.h.g(EnumC4419g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float ListItemHeight = w4.h.g(48);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float MenuContainerElevation = w4.h.g(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float CornerRadius = w4.h.g(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final d3.c.InterfaceC1212c LabelVerticalTextAlignment = d3.c.INSTANCE.i();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final int LabelHorizontalTextAlignment = t4.j.INSTANCE.f();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float HorizontalPadding = w4.h.g(12);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final float VerticalPadding = w4.h.g(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize = w4.h.g(24);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final long FontSize = w.h(14);

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final FontWeight FontWeight = FontWeight.INSTANCE.c();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final long LineHeight = w.h(20);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final long LetterSpacing = w.g(0.1f);

    private h() {
    }

    public final float a() {
        return ContainerWidthMax;
    }

    public final float b() {
        return ContainerWidthMin;
    }

    public final float c() {
        return CornerRadius;
    }

    public final float d() {
        return HorizontalPadding;
    }

    public final float e() {
        return IconSize;
    }

    public final d3.c.InterfaceC1212c f() {
        return LabelVerticalTextAlignment;
    }

    public final float g() {
        return ListItemHeight;
    }

    public final float h() {
        return MenuContainerElevation;
    }

    public final float i() {
        return VerticalPadding;
    }

    public final TextStyle j(long color) {
        int i11 = LabelHorizontalTextAlignment;
        return new TextStyle(color, FontSize, FontWeight, (b0) null, (c0) null, (q) null, (String) null, LetterSpacing, (t4.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (t4.k) null, (Shadow) null, (m3.g) null, i11, 0, LineHeight, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (s) null, 16613240, (DefaultConstructorMarker) null);
    }
}
