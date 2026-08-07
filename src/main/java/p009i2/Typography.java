package p009i2;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import i4.TextStyle;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p014n4.FontWeight;
import p014n4.q;
import w4.w;

/* JADX INFO: renamed from: i2.w2, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u0095\u0001\b\u0016\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0014J\u008f\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b,\u0010#R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b-\u0010#R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b.\u0010#R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b&\u0010#R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b(\u0010#R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b*\u0010#R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b/\u0010#¨\u00060"}, d2 = {"Li2/w2;", "", "Li4/r0;", "h1", "h2", "h3", "h4", "h5", "h6", "subtitle1", "subtitle2", "body1", "body2", "button", "caption", "overline", "<init>", "(Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;)V", "Ln4/q;", "defaultFontFamily", "(Ln4/q;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;)V", "a", "(Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;)Li2/w2;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Li4/r0;", "f", "()Li4/r0;", "b", "g", "c", "h", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "e", "j", "k", "m", "n", "l", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Typography {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h2;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h3;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h4;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h5;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h6;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle subtitle1;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle subtitle2;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle body1;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle body2;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle button;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle caption;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle overline;

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        this.h1 = textStyle;
        this.h2 = textStyle2;
        this.h3 = textStyle3;
        this.h4 = textStyle4;
        this.h5 = textStyle5;
        this.h6 = textStyle6;
        this.subtitle1 = textStyle7;
        this.subtitle2 = textStyle8;
        this.body1 = textStyle9;
        this.body2 = textStyle10;
        this.button = textStyle11;
        this.caption = textStyle12;
        this.overline = textStyle13;
    }

    public final Typography a(TextStyle h11, TextStyle h12, TextStyle h13, TextStyle h14, TextStyle h15, TextStyle h16, TextStyle subtitle1, TextStyle subtitle2, TextStyle body1, TextStyle body2, TextStyle button, TextStyle caption, TextStyle overline) {
        return new Typography(h11, h12, h13, h14, h15, h16, subtitle1, subtitle2, body1, body2, button, caption, overline);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextStyle getBody1() {
        return this.body1;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextStyle getBody2() {
        return this.body2;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextStyle getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextStyle getCaption() {
        return this.caption;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) other;
        return s.f(this.h1, typography.h1) && s.f(this.h2, typography.h2) && s.f(this.h3, typography.h3) && s.f(this.h4, typography.h4) && s.f(this.h5, typography.h5) && s.f(this.h6, typography.h6) && s.f(this.subtitle1, typography.subtitle1) && s.f(this.subtitle2, typography.subtitle2) && s.f(this.body1, typography.body1) && s.f(this.body2, typography.body2) && s.f(this.button, typography.button) && s.f(this.caption, typography.caption) && s.f(this.overline, typography.overline);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextStyle getH1() {
        return this.h1;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextStyle getH2() {
        return this.h2;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextStyle getH3() {
        return this.h3;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.h1.hashCode() * 31) + this.h2.hashCode()) * 31) + this.h3.hashCode()) * 31) + this.h4.hashCode()) * 31) + this.h5.hashCode()) * 31) + this.h6.hashCode()) * 31) + this.subtitle1.hashCode()) * 31) + this.subtitle2.hashCode()) * 31) + this.body1.hashCode()) * 31) + this.body2.hashCode()) * 31) + this.button.hashCode()) * 31) + this.caption.hashCode()) * 31) + this.overline.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextStyle getH4() {
        return this.h4;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextStyle getH5() {
        return this.h5;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextStyle getH6() {
        return this.h6;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextStyle getOverline() {
        return this.overline;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextStyle getSubtitle1() {
        return this.subtitle1;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextStyle getSubtitle2() {
        return this.subtitle2;
    }

    public String toString() {
        return "Typography(h1=" + this.h1 + ", h2=" + this.h2 + ", h3=" + this.h3 + ", h4=" + this.h4 + ", h5=" + this.h5 + ", h6=" + this.h6 + ", subtitle1=" + this.subtitle1 + ", subtitle2=" + this.subtitle2 + ", body1=" + this.body1 + ", body2=" + this.body2 + ", button=" + this.button + ", caption=" + this.caption + ", overline=" + this.overline + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Typography(q qVar, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        TextStyle textStyleC;
        TextStyle textStyleC2;
        TextStyle textStyleC3;
        TextStyle textStyleC4;
        TextStyle textStyleC5;
        TextStyle textStyleC6;
        TextStyle textStyleC7;
        TextStyle textStyleC8;
        TextStyle textStyleC9;
        TextStyle textStyleC10;
        TextStyle textStyleC11;
        TextStyle textStyleC12;
        TextStyle textStyleC13;
        q qVarA = (i11 & 1) != 0 ? q.INSTANCE.a() : qVar;
        if ((i11 & 2) != 0) {
            textStyleC = TextStyle.c(x2.b(), 0L, w.h(96), FontWeight.INSTANCE.b(), null, null, null, null, w.f(-1.5d), null, null, null, 0L, null, null, null, 0, 0, w.h(112), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC = textStyle;
        }
        if ((i11 & 4) != 0) {
            textStyleC2 = TextStyle.c(x2.b(), 0L, w.h(60), FontWeight.INSTANCE.b(), null, null, null, null, w.f(-0.5d), null, null, null, 0L, null, null, null, 0, 0, w.h(72), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC2 = textStyle2;
        }
        if ((i11 & 8) != 0) {
            textStyleC3 = TextStyle.c(x2.b(), 0L, w.h(48), FontWeight.INSTANCE.d(), null, null, null, null, w.h(0), null, null, null, 0L, null, null, null, 0, 0, w.h(56), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC3 = textStyle3;
        }
        if ((i11 & 16) != 0) {
            textStyleC4 = TextStyle.c(x2.b(), 0L, w.h(34), FontWeight.INSTANCE.d(), null, null, null, null, w.f(0.25d), null, null, null, 0L, null, null, null, 0, 0, w.h(36), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC4 = textStyle4;
        }
        if ((i11 & 32) != 0) {
            textStyleC5 = TextStyle.c(x2.b(), 0L, w.h(24), FontWeight.INSTANCE.d(), null, null, null, null, w.h(0), null, null, null, 0L, null, null, null, 0, 0, w.h(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC5 = textStyle5;
        }
        if ((i11 & 64) != 0) {
            textStyleC6 = TextStyle.c(x2.b(), 0L, w.h(20), FontWeight.INSTANCE.c(), null, null, null, null, w.f(0.15d), null, null, null, 0L, null, null, null, 0, 0, w.h(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC6 = textStyle6;
        }
        if ((i11 & 128) != 0) {
            textStyleC7 = TextStyle.c(x2.b(), 0L, w.h(16), FontWeight.INSTANCE.d(), null, null, null, null, w.f(0.15d), null, null, null, 0L, null, null, null, 0, 0, w.h(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC7 = textStyle7;
        }
        if ((i11 & 256) != 0) {
            textStyleC8 = TextStyle.c(x2.b(), 0L, w.h(14), FontWeight.INSTANCE.c(), null, null, null, null, w.f(0.1d), null, null, null, 0L, null, null, null, 0, 0, w.h(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC8 = textStyle8;
        }
        if ((i11 & 512) != 0) {
            textStyleC9 = TextStyle.c(x2.b(), 0L, w.h(16), FontWeight.INSTANCE.d(), null, null, null, null, w.f(0.5d), null, null, null, 0L, null, null, null, 0, 0, w.h(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC9 = textStyle9;
        }
        if ((i11 & 1024) != 0) {
            textStyleC10 = TextStyle.c(x2.b(), 0L, w.h(14), FontWeight.INSTANCE.d(), null, null, null, null, w.f(0.25d), null, null, null, 0L, null, null, null, 0, 0, w.h(20), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC10 = textStyle10;
        }
        if ((i11 & 2048) != 0) {
            textStyleC11 = TextStyle.c(x2.b(), 0L, w.h(14), FontWeight.INSTANCE.c(), null, null, null, null, w.f(1.25d), null, null, null, 0L, null, null, null, 0, 0, w.h(16), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC11 = textStyle11;
        }
        if ((i11 & 4096) != 0) {
            textStyleC12 = TextStyle.c(x2.b(), 0L, w.h(12), FontWeight.INSTANCE.d(), null, null, null, null, w.f(0.4d), null, null, null, 0L, null, null, null, 0, 0, w.h(16), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC12 = textStyle12;
        }
        if ((i11 & PKIFailureInfo.certRevoked) != 0) {
            textStyleC13 = TextStyle.c(x2.b(), 0L, w.h(10), FontWeight.INSTANCE.d(), null, null, null, null, w.f(1.5d), null, null, null, 0L, null, null, null, 0, 0, w.h(16), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleC13 = textStyle13;
        }
        this(qVarA, textStyleC, textStyleC2, textStyleC3, textStyleC4, textStyleC5, textStyleC6, textStyleC7, textStyleC8, textStyleC9, textStyleC10, textStyleC11, textStyleC12, textStyleC13);
    }

    public Typography(q qVar, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        this(x2.d(textStyle, qVar), x2.d(textStyle2, qVar), x2.d(textStyle3, qVar), x2.d(textStyle4, qVar), x2.d(textStyle5, qVar), x2.d(textStyle6, qVar), x2.d(textStyle7, qVar), x2.d(textStyle8, qVar), x2.d(textStyle9, qVar), x2.d(textStyle10, qVar), x2.d(textStyle11, qVar), x2.d(textStyle12, qVar), x2.d(textStyle13, qVar));
    }
}
