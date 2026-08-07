package f90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p014n4.q;
import w4.v;

/* JADX INFO: renamed from: f90.o, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0018\u0010\u0019J×\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u0010\n\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u001d\u0010\u000b\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u00100\u001a\u0004\b5\u00102R\u001d\u0010\f\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b6\u00102R\u001d\u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b7\u00102R\u001d\u0010\u000e\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u00100\u001a\u0004\b8\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b3\u0010;R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b)\u0010>R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b+\u0010>R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b7\u0010=\u001a\u0004\b9\u0010>R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b6\u0010=\u001a\u0004\b<\u0010>R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b5\u0010=\u001a\u0004\b?\u0010>R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\b@\u0010>R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b8\u0010=\u001a\u0004\b/\u0010>\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Lf90/o;", "", "", "fontWeightNormal", "fontWeightMedium", "fontWeightBold", "", "fontSizeMultiplier", "Lw4/v;", "xxSmallFontSize", "xSmallFontSize", "smallFontSize", "mediumFontSize", "largeFontSize", "xLargeFontSize", "fontFamily", "Ln4/q;", "body1FontFamily", "body2FontFamily", "h4FontFamily", "h5FontFamily", "h6FontFamily", "subtitle1FontFamily", "captionFontFamily", "<init>", "(IIIFJJJJJJLjava/lang/Integer;Ln4/q;Ln4/q;Ln4/q;Ln4/q;Ln4/q;Ln4/q;Ln4/q;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(IIIFJJJJJJLjava/lang/Integer;Ln4/q;Ln4/q;Ln4/q;Ln4/q;Ln4/q;Ln4/q;Ln4/q;)Lf90/o;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "j", "b", IntegerTokenConverter.CONVERTER_KEY, "c", "h", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "g", "()F", "e", "J", "t", "()J", "f", "s", "p", "o", "n", "r", "k", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "l", "Ln4/q;", "()Ln4/q;", "m", "q", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class StripeTypography {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f64688s = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int fontWeightNormal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int fontWeightMedium;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int fontWeightBold;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float fontSizeMultiplier;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long xxSmallFontSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long xSmallFontSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long smallFontSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long mediumFontSize;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final long largeFontSize;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long xLargeFontSize;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer fontFamily;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final q body1FontFamily;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final q body2FontFamily;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final q h4FontFamily;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final q h5FontFamily;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final q h6FontFamily;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final q subtitle1FontFamily;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final q captionFontFamily;

    public /* synthetic */ StripeTypography(int i11, int i12, int i13, float f11, long j11, long j12, long j13, long j14, long j15, long j16, Integer num, q qVar, q qVar2, q qVar3, q qVar4, q qVar5, q qVar6, q qVar7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13, f11, j11, j12, j13, j14, j15, j16, num, qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7);
    }

    public static /* synthetic */ StripeTypography b(StripeTypography stripeTypography, int i11, int i12, int i13, float f11, long j11, long j12, long j13, long j14, long j15, long j16, Integer num, q qVar, q qVar2, q qVar3, q qVar4, q qVar5, q qVar6, q qVar7, int i14, Object obj) {
        q qVar8;
        q qVar9;
        int i15 = (i14 & 1) != 0 ? stripeTypography.fontWeightNormal : i11;
        int i16 = (i14 & 2) != 0 ? stripeTypography.fontWeightMedium : i12;
        int i17 = (i14 & 4) != 0 ? stripeTypography.fontWeightBold : i13;
        float f12 = (i14 & 8) != 0 ? stripeTypography.fontSizeMultiplier : f11;
        long j17 = (i14 & 16) != 0 ? stripeTypography.xxSmallFontSize : j11;
        long j18 = (i14 & 32) != 0 ? stripeTypography.xSmallFontSize : j12;
        long j19 = (i14 & 64) != 0 ? stripeTypography.smallFontSize : j13;
        long j21 = (i14 & 128) != 0 ? stripeTypography.mediumFontSize : j14;
        long j22 = (i14 & 256) != 0 ? stripeTypography.largeFontSize : j15;
        int i18 = i15;
        int i19 = i16;
        long j23 = (i14 & 512) != 0 ? stripeTypography.xLargeFontSize : j16;
        Integer num2 = (i14 & 1024) != 0 ? stripeTypography.fontFamily : num;
        q qVar10 = (i14 & 2048) != 0 ? stripeTypography.body1FontFamily : qVar;
        Integer num3 = num2;
        q qVar11 = (i14 & 4096) != 0 ? stripeTypography.body2FontFamily : qVar2;
        q qVar12 = (i14 & PKIFailureInfo.certRevoked) != 0 ? stripeTypography.h4FontFamily : qVar3;
        q qVar13 = (i14 & 16384) != 0 ? stripeTypography.h5FontFamily : qVar4;
        q qVar14 = (i14 & 32768) != 0 ? stripeTypography.h6FontFamily : qVar5;
        q qVar15 = (i14 & 65536) != 0 ? stripeTypography.subtitle1FontFamily : qVar6;
        if ((i14 & 131072) != 0) {
            qVar9 = qVar15;
            qVar8 = stripeTypography.captionFontFamily;
        } else {
            qVar8 = qVar7;
            qVar9 = qVar15;
        }
        return stripeTypography.a(i18, i19, i17, f12, j17, j18, j19, j21, j22, j23, num3, qVar10, qVar11, qVar12, qVar13, qVar14, qVar9, qVar8);
    }

    public final StripeTypography a(int fontWeightNormal, int fontWeightMedium, int fontWeightBold, float fontSizeMultiplier, long xxSmallFontSize, long xSmallFontSize, long smallFontSize, long mediumFontSize, long largeFontSize, long xLargeFontSize, Integer fontFamily, q body1FontFamily, q body2FontFamily, q h4FontFamily, q h5FontFamily, q h6FontFamily, q subtitle1FontFamily, q captionFontFamily) {
        return new StripeTypography(fontWeightNormal, fontWeightMedium, fontWeightBold, fontSizeMultiplier, xxSmallFontSize, xSmallFontSize, smallFontSize, mediumFontSize, largeFontSize, xLargeFontSize, fontFamily, body1FontFamily, body2FontFamily, h4FontFamily, h5FontFamily, h6FontFamily, subtitle1FontFamily, captionFontFamily, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final q getBody1FontFamily() {
        return this.body1FontFamily;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final q getBody2FontFamily() {
        return this.body2FontFamily;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final q getCaptionFontFamily() {
        return this.captionFontFamily;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StripeTypography)) {
            return false;
        }
        StripeTypography stripeTypography = (StripeTypography) other;
        return this.fontWeightNormal == stripeTypography.fontWeightNormal && this.fontWeightMedium == stripeTypography.fontWeightMedium && this.fontWeightBold == stripeTypography.fontWeightBold && Float.compare(this.fontSizeMultiplier, stripeTypography.fontSizeMultiplier) == 0 && v.e(this.xxSmallFontSize, stripeTypography.xxSmallFontSize) && v.e(this.xSmallFontSize, stripeTypography.xSmallFontSize) && v.e(this.smallFontSize, stripeTypography.smallFontSize) && v.e(this.mediumFontSize, stripeTypography.mediumFontSize) && v.e(this.largeFontSize, stripeTypography.largeFontSize) && v.e(this.xLargeFontSize, stripeTypography.xLargeFontSize) && s.f(this.fontFamily, stripeTypography.fontFamily) && s.f(this.body1FontFamily, stripeTypography.body1FontFamily) && s.f(this.body2FontFamily, stripeTypography.body2FontFamily) && s.f(this.h4FontFamily, stripeTypography.h4FontFamily) && s.f(this.h5FontFamily, stripeTypography.h5FontFamily) && s.f(this.h6FontFamily, stripeTypography.h6FontFamily) && s.f(this.subtitle1FontFamily, stripeTypography.subtitle1FontFamily) && s.f(this.captionFontFamily, stripeTypography.captionFontFamily);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getFontFamily() {
        return this.fontFamily;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getFontSizeMultiplier() {
        return this.fontSizeMultiplier;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getFontWeightBold() {
        return this.fontWeightBold;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((Integer.hashCode(this.fontWeightNormal) * 31) + Integer.hashCode(this.fontWeightMedium)) * 31) + Integer.hashCode(this.fontWeightBold)) * 31) + Float.hashCode(this.fontSizeMultiplier)) * 31) + v.i(this.xxSmallFontSize)) * 31) + v.i(this.xSmallFontSize)) * 31) + v.i(this.smallFontSize)) * 31) + v.i(this.mediumFontSize)) * 31) + v.i(this.largeFontSize)) * 31) + v.i(this.xLargeFontSize)) * 31;
        Integer num = this.fontFamily;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        q qVar = this.body1FontFamily;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        q qVar2 = this.body2FontFamily;
        int iHashCode4 = (iHashCode3 + (qVar2 == null ? 0 : qVar2.hashCode())) * 31;
        q qVar3 = this.h4FontFamily;
        int iHashCode5 = (iHashCode4 + (qVar3 == null ? 0 : qVar3.hashCode())) * 31;
        q qVar4 = this.h5FontFamily;
        int iHashCode6 = (iHashCode5 + (qVar4 == null ? 0 : qVar4.hashCode())) * 31;
        q qVar5 = this.h6FontFamily;
        int iHashCode7 = (iHashCode6 + (qVar5 == null ? 0 : qVar5.hashCode())) * 31;
        q qVar6 = this.subtitle1FontFamily;
        int iHashCode8 = (iHashCode7 + (qVar6 == null ? 0 : qVar6.hashCode())) * 31;
        q qVar7 = this.captionFontFamily;
        return iHashCode8 + (qVar7 != null ? qVar7.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getFontWeightMedium() {
        return this.fontWeightMedium;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getFontWeightNormal() {
        return this.fontWeightNormal;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final q getH4FontFamily() {
        return this.h4FontFamily;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final q getH5FontFamily() {
        return this.h5FontFamily;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final q getH6FontFamily() {
        return this.h6FontFamily;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getLargeFontSize() {
        return this.largeFontSize;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getMediumFontSize() {
        return this.mediumFontSize;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getSmallFontSize() {
        return this.smallFontSize;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final q getSubtitle1FontFamily() {
        return this.subtitle1FontFamily;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final long getXLargeFontSize() {
        return this.xLargeFontSize;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getXSmallFontSize() {
        return this.xSmallFontSize;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getXxSmallFontSize() {
        return this.xxSmallFontSize;
    }

    public String toString() {
        return "StripeTypography(fontWeightNormal=" + this.fontWeightNormal + ", fontWeightMedium=" + this.fontWeightMedium + ", fontWeightBold=" + this.fontWeightBold + ", fontSizeMultiplier=" + this.fontSizeMultiplier + ", xxSmallFontSize=" + v.k(this.xxSmallFontSize) + ", xSmallFontSize=" + v.k(this.xSmallFontSize) + ", smallFontSize=" + v.k(this.smallFontSize) + ", mediumFontSize=" + v.k(this.mediumFontSize) + ", largeFontSize=" + v.k(this.largeFontSize) + ", xLargeFontSize=" + v.k(this.xLargeFontSize) + ", fontFamily=" + this.fontFamily + ", body1FontFamily=" + this.body1FontFamily + ", body2FontFamily=" + this.body2FontFamily + ", h4FontFamily=" + this.h4FontFamily + ", h5FontFamily=" + this.h5FontFamily + ", h6FontFamily=" + this.h6FontFamily + ", subtitle1FontFamily=" + this.subtitle1FontFamily + ", captionFontFamily=" + this.captionFontFamily + ")";
    }

    private StripeTypography(int i11, int i12, int i13, float f11, long j11, long j12, long j13, long j14, long j15, long j16, Integer num, q qVar, q qVar2, q qVar3, q qVar4, q qVar5, q qVar6, q qVar7) {
        this.fontWeightNormal = i11;
        this.fontWeightMedium = i12;
        this.fontWeightBold = i13;
        this.fontSizeMultiplier = f11;
        this.xxSmallFontSize = j11;
        this.xSmallFontSize = j12;
        this.smallFontSize = j13;
        this.mediumFontSize = j14;
        this.largeFontSize = j15;
        this.xLargeFontSize = j16;
        this.fontFamily = num;
        this.body1FontFamily = qVar;
        this.body2FontFamily = qVar2;
        this.h4FontFamily = qVar3;
        this.h5FontFamily = qVar4;
        this.h6FontFamily = qVar5;
        this.subtitle1FontFamily = qVar6;
        this.captionFontFamily = qVar7;
    }

    public /* synthetic */ StripeTypography(int i11, int i12, int i13, float f11, long j11, long j12, long j13, long j14, long j15, long j16, Integer num, q qVar, q qVar2, q qVar3, q qVar4, q qVar5, q qVar6, q qVar7, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13, f11, j11, j12, j13, j14, j15, j16, num, (i14 & 2048) != 0 ? null : qVar, (i14 & 4096) != 0 ? null : qVar2, (i14 & PKIFailureInfo.certRevoked) != 0 ? null : qVar3, (i14 & 16384) != 0 ? null : qVar4, (32768 & i14) != 0 ? null : qVar5, (65536 & i14) != 0 ? null : qVar6, (i14 & 131072) != 0 ? null : qVar7, null);
    }
}
