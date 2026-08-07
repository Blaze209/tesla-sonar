package androidx.compose.ui.platform;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import i4.SpanStyle;
import k3.Shadow;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p014n4.FontWeight;
import p4.LocaleList;
import t4.TextGeometricTransform;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bA\b\u0002\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010?\u001a\u0004\b@\u0010A\"\u0004\b/\u0010BR(\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b-\u0010\"\u001a\u0004\bC\u0010$\"\u0004\bD\u0010&R*\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\b'\u0010HR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR(\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bM\u0010\"\u001a\u0004\bU\u0010$\"\u0004\b!\u0010&R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010V\u001a\u0004\bW\u0010X\"\u0004\bO\u0010YR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\bI\u0010^\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006_"}, d2 = {"Landroidx/compose/ui/platform/x1;", "", "Lk3/p1;", "color", "Lw4/v;", OrcaFlavourKeys.FONT_SIZE, "Ln4/f0;", "fontWeight", "Ln4/b0;", "fontStyle", "Ln4/c0;", "fontSynthesis", "Ln4/q;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Lt4/a;", "baselineShift", "Lt4/o;", "textGeometricTransform", "Lp4/e;", "localeList", AppStateModule.APP_STATE_BACKGROUND, "Lt4/k;", "textDecoration", "Lk3/e4;", "shadow", "<init>", "(JJLn4/f0;Ln4/b0;Ln4/c0;Ln4/q;Ljava/lang/String;JLt4/a;Lt4/o;Lp4/e;JLt4/k;Lk3/e4;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Li4/d0;", "m", "()Li4/d0;", "a", "J", "getColor-0d7_KjU", "()J", "c", "(J)V", "b", "getFontSize-XSAIIZE", "e", "Ln4/f0;", "getFontWeight", "()Ln4/f0;", "h", "(Ln4/f0;)V", DateTokenConverter.CONVERTER_KEY, "Ln4/b0;", "getFontStyle-4Lr2A7w", "()Ln4/b0;", "f", "(Ln4/b0;)V", "Ln4/c0;", "getFontSynthesis-ZQGJjVo", "()Ln4/c0;", "g", "(Ln4/c0;)V", "Ln4/q;", "getFontFamily", "()Ln4/q;", "setFontFamily", "(Ln4/q;)V", "Ljava/lang/String;", "getFontFeatureSettings", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "getLetterSpacing-XSAIIZE", IntegerTokenConverter.CONVERTER_KEY, "Lt4/a;", "getBaselineShift-5SSeXJ0", "()Lt4/a;", "(Lt4/a;)V", "j", "Lt4/o;", "getTextGeometricTransform", "()Lt4/o;", "l", "(Lt4/o;)V", "k", "Lp4/e;", "getLocaleList", "()Lp4/e;", "setLocaleList", "(Lp4/e;)V", "getBackground-0d7_KjU", "Lt4/k;", "getTextDecoration", "()Lt4/k;", "(Lt4/k;)V", "n", "Lk3/e4;", "getShadow", "()Lk3/e4;", "(Lk3/e4;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long color;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long fontSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private FontWeight fontWeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private p014n4.b0 fontStyle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private p014n4.c0 fontSynthesis;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private p014n4.q fontFamily;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String fontFeatureSettings;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long letterSpacing;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private t4.a baselineShift;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private TextGeometricTransform textGeometricTransform;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private LocaleList localeList;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long background;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private t4.k textDecoration;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Shadow shadow;

    public /* synthetic */ x1(long j11, long j12, FontWeight fontWeight, p014n4.b0 b0Var, p014n4.c0 c0Var, p014n4.q qVar, String str, long j13, t4.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, t4.k kVar, Shadow shadow, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, fontWeight, b0Var, c0Var, qVar, str, j13, aVar, textGeometricTransform, localeList, j14, kVar, shadow);
    }

    public final void a(long j11) {
        this.background = j11;
    }

    public final void b(t4.a aVar) {
        this.baselineShift = aVar;
    }

    public final void c(long j11) {
        this.color = j11;
    }

    public final void d(String str) {
        this.fontFeatureSettings = str;
    }

    public final void e(long j11) {
        this.fontSize = j11;
    }

    public final void f(p014n4.b0 b0Var) {
        this.fontStyle = b0Var;
    }

    public final void g(p014n4.c0 c0Var) {
        this.fontSynthesis = c0Var;
    }

    public final void h(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
    }

    public final void i(long j11) {
        this.letterSpacing = j11;
    }

    public final void j(Shadow shadow) {
        this.shadow = shadow;
    }

    public final void k(t4.k kVar) {
        this.textDecoration = kVar;
    }

    public final void l(TextGeometricTransform textGeometricTransform) {
        this.textGeometricTransform = textGeometricTransform;
    }

    public final SpanStyle m() {
        return new SpanStyle(this.color, this.fontSize, this.fontWeight, this.fontStyle, this.fontSynthesis, this.fontFamily, this.fontFeatureSettings, this.letterSpacing, this.baselineShift, this.textGeometricTransform, this.localeList, this.background, this.textDecoration, this.shadow, null, null, 49152, null);
    }

    private x1(long j11, long j12, FontWeight fontWeight, p014n4.b0 b0Var, p014n4.c0 c0Var, p014n4.q qVar, String str, long j13, t4.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, t4.k kVar, Shadow shadow) {
        this.color = j11;
        this.fontSize = j12;
        this.fontWeight = fontWeight;
        this.fontStyle = b0Var;
        this.fontSynthesis = c0Var;
        this.fontFamily = qVar;
        this.fontFeatureSettings = str;
        this.letterSpacing = j13;
        this.baselineShift = aVar;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j14;
        this.textDecoration = kVar;
        this.shadow = shadow;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ x1(long j11, long j12, FontWeight fontWeight, p014n4.b0 b0Var, p014n4.c0 c0Var, p014n4.q qVar, String str, long j13, t4.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, t4.k kVar, Shadow shadow, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        long j15 = (i11 & 1) != 0 ? k3.p1.INSTANCE.j() : j11;
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
        long j16 = (i11 & 2048) != 0 ? k3.p1.INSTANCE.j() : j14;
        p014n4.b0 b0Var3 = b0Var2;
        p014n4.c0 c0Var3 = c0Var2;
        p014n4.q qVar3 = qVar2;
        String str3 = str2;
        long j17 = jA2;
        t4.a aVar3 = aVar2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j18 = j16;
        this(j15, jA, fontWeight2, b0Var3, c0Var3, qVar3, str3, j17, aVar3, textGeometricTransform3, localeList3, j18, (i11 & 4096) != 0 ? null : kVar, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : shadow, null);
    }
}
