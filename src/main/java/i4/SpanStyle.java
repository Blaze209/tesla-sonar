package i4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import k3.Shadow;
import k3.h1;
import k3.p1;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p014n4.FontWeight;
import p4.LocaleList;
import t4.TextGeometricTransform;

/* JADX INFO: renamed from: i4.d0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B¿\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"BÁ\u0001\b\u0016\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010$J\u001b\u0010&\u001a\u00020\u00002\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b&\u0010'JÈ\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020*2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020*2\u0006\u0010%\u001a\u00020\u0000H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020*2\u0006\u0010%\u001a\u00020\u0000H\u0000¢\u0006\u0004\b/\u0010.J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u00105\u001a\u0004\b6\u00107R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001f\u0010\t\u001a\u0004\u0018\u00010\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001f\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u00104R\u001d\u0010\u0010\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bO\u00109\u001a\u0004\bP\u0010;R\u001f\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bJ\u0010Q\u001a\u0004\bD\u0010RR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bN\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b:\u0010V\u001a\u0004\bW\u0010XR\u001d\u0010\u0018\u001a\u00020\u00178\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u00109\u001a\u0004\b@\u0010;R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bF\u0010Y\u001a\u0004\bZ\u0010[R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b>\u0010\\\u001a\u0004\b]\u0010^R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bP\u0010_\u001a\u0004\b`\u0010aR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bW\u0010b\u001a\u0004\bO\u0010cR\u0017\u0010#\u001a\u00020\u00178Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bL\u0010;R\u0013\u0010f\u001a\u0004\u0018\u00010d8F¢\u0006\u0006\u001a\u0004\bH\u0010eR\u0011\u0010i\u001a\u00020g8F¢\u0006\u0006\u001a\u0004\b<\u0010h\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006j"}, d2 = {"Li4/d0;", "", "Lt4/n;", "textForegroundStyle", "Lw4/v;", OrcaFlavourKeys.FONT_SIZE, "Ln4/f0;", "fontWeight", "Ln4/b0;", "fontStyle", "Ln4/c0;", "fontSynthesis", "Ln4/q;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Lt4/a;", "baselineShift", "Lt4/o;", "textGeometricTransform", "Lp4/e;", "localeList", "Lk3/p1;", AppStateModule.APP_STATE_BACKGROUND, "Lt4/k;", "textDecoration", "Lk3/e4;", "shadow", "Li4/z;", "platformStyle", "Lm3/g;", "drawStyle", "<init>", "(Lt4/n;JLn4/f0;Ln4/b0;Ln4/c0;Ln4/q;Ljava/lang/String;JLt4/a;Lt4/o;Lp4/e;JLt4/k;Lk3/e4;Li4/z;Lm3/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "color", "(JJLn4/f0;Ln4/b0;Ln4/c0;Ln4/q;Ljava/lang/String;JLt4/a;Lt4/o;Lp4/e;JLt4/k;Lk3/e4;Li4/z;Lm3/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "x", "(Li4/d0;)Li4/d0;", "a", "(JJLn4/f0;Ln4/b0;Ln4/c0;Ln4/q;Ljava/lang/String;JLt4/a;Lt4/o;Lp4/e;JLt4/k;Lk3/e4;Li4/z;Lm3/g;)Li4/d0;", "", "equals", "(Ljava/lang/Object;)Z", "v", "(Li4/d0;)Z", "w", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lt4/n;", "t", "()Lt4/n;", "b", "J", "k", "()J", "c", "Ln4/f0;", "n", "()Ln4/f0;", DateTokenConverter.CONVERTER_KEY, "Ln4/b0;", "l", "()Ln4/b0;", "e", "Ln4/c0;", "m", "()Ln4/c0;", "f", "Ln4/q;", IntegerTokenConverter.CONVERTER_KEY, "()Ln4/q;", "g", "Ljava/lang/String;", "j", "h", "o", "Lt4/a;", "()Lt4/a;", "Lt4/o;", "u", "()Lt4/o;", "Lp4/e;", "p", "()Lp4/e;", "Lt4/k;", "s", "()Lt4/k;", "Lk3/e4;", "r", "()Lk3/e4;", "Li4/z;", "q", "()Li4/z;", "Lm3/g;", "()Lm3/g;", "Lk3/h1;", "()Lk3/h1;", "brush", "", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SpanStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t4.n textForegroundStyle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long fontSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final FontWeight fontWeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final p014n4.b0 fontStyle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final p014n4.c0 fontSynthesis;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final p014n4.q fontFamily;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fontFeatureSettings;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long letterSpacing;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final t4.a baselineShift;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextGeometricTransform textGeometricTransform;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocaleList localeList;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final long background;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final t4.k textDecoration;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Shadow shadow;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final z platformStyle;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final m3.g drawStyle;

    public /* synthetic */ SpanStyle(long j11, long j12, FontWeight fontWeight, p014n4.b0 b0Var, p014n4.c0 c0Var, p014n4.q qVar, String str, long j13, t4.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, t4.k kVar, Shadow e4Var, z zVar, m3.g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, fontWeight, b0Var, c0Var, qVar, str, j13, aVar, textGeometricTransform, localeList, j14, kVar, e4Var, zVar, gVar);
    }

    public static /* synthetic */ SpanStyle b(SpanStyle spanStyle, long j11, long j12, FontWeight fontWeight, p014n4.b0 b0Var, p014n4.c0 c0Var, p014n4.q qVar, String str, long j13, t4.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, t4.k kVar, Shadow e4Var, z zVar, m3.g gVar, int i11, Object obj) {
        long jG = (i11 & 1) != 0 ? spanStyle.g() : j11;
        return spanStyle.a(jG, (i11 & 2) != 0 ? spanStyle.fontSize : j12, (i11 & 4) != 0 ? spanStyle.fontWeight : fontWeight, (i11 & 8) != 0 ? spanStyle.fontStyle : b0Var, (i11 & 16) != 0 ? spanStyle.fontSynthesis : c0Var, (i11 & 32) != 0 ? spanStyle.fontFamily : qVar, (i11 & 64) != 0 ? spanStyle.fontFeatureSettings : str, (i11 & 128) != 0 ? spanStyle.letterSpacing : j13, (i11 & 256) != 0 ? spanStyle.baselineShift : aVar, (i11 & 512) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform, (i11 & 1024) != 0 ? spanStyle.localeList : localeList, (i11 & 2048) != 0 ? spanStyle.background : j14, (i11 & 4096) != 0 ? spanStyle.textDecoration : kVar, (i11 & PKIFailureInfo.certRevoked) != 0 ? spanStyle.shadow : e4Var, (i11 & 16384) != 0 ? spanStyle.platformStyle : zVar, (i11 & 32768) != 0 ? spanStyle.drawStyle : gVar);
    }

    public final SpanStyle a(long color, long fontSize, FontWeight fontWeight, p014n4.b0 fontStyle, p014n4.c0 fontSynthesis, p014n4.q fontFamily, String fontFeatureSettings, long letterSpacing, t4.a baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, t4.k textDecoration, Shadow shadow, z platformStyle, m3.g drawStyle) {
        return new SpanStyle(p1.r(color, g()) ? this.textForegroundStyle : t4.n.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }

    public final float c() {
        return this.textForegroundStyle.b();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final t4.a getBaselineShift() {
        return this.baselineShift;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) other;
        return v(spanStyle) && w(spanStyle);
    }

    public final h1 f() {
        return this.textForegroundStyle.e();
    }

    public final long g() {
        return this.textForegroundStyle.c();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final m3.g getDrawStyle() {
        return this.drawStyle;
    }

    public int hashCode() {
        int iX = p1.x(g()) * 31;
        h1 h1VarF = f();
        int iHashCode = (((((iX + (h1VarF != null ? h1VarF.hashCode() : 0)) * 31) + Float.hashCode(c())) * 31) + w4.v.i(this.fontSize)) * 31;
        FontWeight fontWeight = this.fontWeight;
        int weight = (iHashCode + (fontWeight != null ? fontWeight.getWeight() : 0)) * 31;
        p014n4.b0 b0Var = this.fontStyle;
        int iG = (weight + (b0Var != null ? p014n4.b0.g(b0Var.getValue()) : 0)) * 31;
        p014n4.c0 c0Var = this.fontSynthesis;
        int i11 = (iG + (c0Var != null ? p014n4.c0.i(c0Var.getValue()) : 0)) * 31;
        p014n4.q qVar = this.fontFamily;
        int iHashCode2 = (i11 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + w4.v.i(this.letterSpacing)) * 31;
        t4.a aVar = this.baselineShift;
        int iF = (iHashCode3 + (aVar != null ? t4.a.f(aVar.getMultiplier()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode4 = (iF + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int iHashCode5 = (((iHashCode4 + (localeList != null ? localeList.hashCode() : 0)) * 31) + p1.x(this.background)) * 31;
        t4.k kVar = this.textDecoration;
        int iHashCode6 = (iHashCode5 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        Shadow e4Var = this.shadow;
        int iHashCode7 = (iHashCode6 + (e4Var != null ? e4Var.hashCode() : 0)) * 31;
        z zVar = this.platformStyle;
        int iHashCode8 = (iHashCode7 + (zVar != null ? zVar.hashCode() : 0)) * 31;
        m3.g gVar = this.drawStyle;
        return iHashCode8 + (gVar != null ? gVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final p014n4.q getFontFamily() {
        return this.fontFamily;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final p014n4.b0 getFontStyle() {
        return this.fontStyle;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final p014n4.c0 getFontSynthesis() {
        return this.fontSynthesis;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getLetterSpacing() {
        return this.letterSpacing;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final z getPlatformStyle() {
        return this.platformStyle;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Shadow getShadow() {
        return this.shadow;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final t4.k getTextDecoration() {
        return this.textDecoration;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final t4.n getTextForegroundStyle() {
        return this.textForegroundStyle;
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) p1.y(g())) + ", brush=" + f() + ", alpha=" + c() + ", fontSize=" + ((Object) w4.v.k(this.fontSize)) + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ", fontSynthesis=" + this.fontSynthesis + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", letterSpacing=" + ((Object) w4.v.k(this.letterSpacing)) + ", baselineShift=" + this.baselineShift + ", textGeometricTransform=" + this.textGeometricTransform + ", localeList=" + this.localeList + ", background=" + ((Object) p1.y(this.background)) + ", textDecoration=" + this.textDecoration + ", shadow=" + this.shadow + ", platformStyle=" + this.platformStyle + ", drawStyle=" + this.drawStyle + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final boolean v(SpanStyle other) {
        if (this == other) {
            return true;
        }
        return w4.v.e(this.fontSize, other.fontSize) && p013kotlin.jvm.internal.s.f(this.fontWeight, other.fontWeight) && p013kotlin.jvm.internal.s.f(this.fontStyle, other.fontStyle) && p013kotlin.jvm.internal.s.f(this.fontSynthesis, other.fontSynthesis) && p013kotlin.jvm.internal.s.f(this.fontFamily, other.fontFamily) && p013kotlin.jvm.internal.s.f(this.fontFeatureSettings, other.fontFeatureSettings) && w4.v.e(this.letterSpacing, other.letterSpacing) && p013kotlin.jvm.internal.s.f(this.baselineShift, other.baselineShift) && p013kotlin.jvm.internal.s.f(this.textGeometricTransform, other.textGeometricTransform) && p013kotlin.jvm.internal.s.f(this.localeList, other.localeList) && p1.r(this.background, other.background) && p013kotlin.jvm.internal.s.f(this.platformStyle, other.platformStyle);
    }

    public final boolean w(SpanStyle other) {
        return p013kotlin.jvm.internal.s.f(this.textForegroundStyle, other.textForegroundStyle) && p013kotlin.jvm.internal.s.f(this.textDecoration, other.textDecoration) && p013kotlin.jvm.internal.s.f(this.shadow, other.shadow) && p013kotlin.jvm.internal.s.f(this.drawStyle, other.drawStyle);
    }

    public final SpanStyle x(SpanStyle other) {
        return other == null ? this : e0.b(this, other.textForegroundStyle.c(), other.textForegroundStyle.e(), other.textForegroundStyle.b(), other.fontSize, other.fontWeight, other.fontStyle, other.fontSynthesis, other.fontFamily, other.fontFeatureSettings, other.letterSpacing, other.baselineShift, other.textGeometricTransform, other.localeList, other.background, other.textDecoration, other.shadow, other.platformStyle, other.drawStyle);
    }

    public /* synthetic */ SpanStyle(t4.n nVar, long j11, FontWeight fontWeight, p014n4.b0 b0Var, p014n4.c0 c0Var, p014n4.q qVar, String str, long j12, t4.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, t4.k kVar, Shadow e4Var, z zVar, m3.g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, j11, fontWeight, b0Var, c0Var, qVar, str, j12, aVar, textGeometricTransform, localeList, j13, kVar, e4Var, zVar, gVar);
    }

    private SpanStyle(t4.n nVar, long j11, FontWeight fontWeight, p014n4.b0 b0Var, p014n4.c0 c0Var, p014n4.q qVar, String str, long j12, t4.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, t4.k kVar, Shadow e4Var, z zVar, m3.g gVar) {
        this.textForegroundStyle = nVar;
        this.fontSize = j11;
        this.fontWeight = fontWeight;
        this.fontStyle = b0Var;
        this.fontSynthesis = c0Var;
        this.fontFamily = qVar;
        this.fontFeatureSettings = str;
        this.letterSpacing = j12;
        this.baselineShift = aVar;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j13;
        this.textDecoration = kVar;
        this.shadow = e4Var;
        this.platformStyle = zVar;
        this.drawStyle = gVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SpanStyle(long j11, long j12, FontWeight fontWeight, p014n4.b0 b0Var, p014n4.c0 c0Var, p014n4.q qVar, String str, long j13, t4.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, t4.k kVar, Shadow e4Var, z zVar, m3.g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        long j15 = (i11 & 1) != 0 ? p1.INSTANCE.j() : j11;
        long jA = (i11 & 2) != 0 ? w4.v.INSTANCE.a() : j12;
        FontWeight fontWeight2 = (i11 & 4) != 0 ? null : fontWeight;
        p014n4.b0 b0Var2 = (i11 & 8) != 0 ? null : b0Var;
        p014n4.c0 c0Var2 = (i11 & 16) != 0 ? null : c0Var;
        p014n4.q qVar2 = (i11 & 32) != 0 ? null : qVar;
        String str2 = (i11 & 64) != 0 ? null : str;
        long jA2 = (i11 & 128) != 0 ? w4.v.INSTANCE.a() : j13;
        t4.a aVar2 = (i11 & 256) != 0 ? null : aVar;
        TextGeometricTransform textGeometricTransform2 = (i11 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i11 & 1024) != 0 ? null : localeList;
        long j16 = (i11 & 2048) != 0 ? p1.INSTANCE.j() : j14;
        t4.k kVar2 = (i11 & 4096) != 0 ? null : kVar;
        long j17 = j15;
        Shadow e4Var2 = (i11 & PKIFailureInfo.certRevoked) != 0 ? null : e4Var;
        z zVar2 = (i11 & 16384) != 0 ? null : zVar;
        long j18 = jA;
        FontWeight fontWeight3 = fontWeight2;
        t4.k kVar3 = kVar2;
        p014n4.b0 b0Var3 = b0Var2;
        p014n4.c0 c0Var3 = c0Var2;
        p014n4.q qVar3 = qVar2;
        String str3 = str2;
        long j19 = jA2;
        t4.a aVar3 = aVar2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j21 = j16;
        this(j17, j18, fontWeight3, b0Var3, c0Var3, qVar3, str3, j19, aVar3, textGeometricTransform3, localeList3, j21, kVar3, e4Var2, zVar2, (i11 & 32768) != 0 ? null : gVar, (DefaultConstructorMarker) null);
    }

    private SpanStyle(long j11, long j12, FontWeight fontWeight, p014n4.b0 b0Var, p014n4.c0 c0Var, p014n4.q qVar, String str, long j13, t4.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, t4.k kVar, Shadow e4Var, z zVar, m3.g gVar) {
        this(t4.n.INSTANCE.b(j11), j12, fontWeight, b0Var, c0Var, qVar, str, j13, aVar, textGeometricTransform, localeList, j14, kVar, e4Var, zVar, gVar, (DefaultConstructorMarker) null);
    }
}
