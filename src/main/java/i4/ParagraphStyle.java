package i4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import t4.LineHeightStyle;
import t4.TextIndent;

/* JADX INFO: renamed from: i4.u, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018Jr\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010 R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010 R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b1\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b,\u0010 R\u001d\u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b(\u0010 R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b'\u00106\u001a\u0004\b7\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Li4/u;", "", "Lt4/j;", "textAlign", "Lt4/l;", "textDirection", "Lw4/v;", "lineHeight", "Lt4/q;", "textIndent", "Li4/y;", "platformStyle", "Lt4/h;", "lineHeightStyle", "Lt4/f;", "lineBreak", "Lt4/e;", "hyphens", "Lt4/s;", "textMotion", "<init>", "(IIJLt4/q;Li4/y;Lt4/h;IILt4/s;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "l", "(Li4/u;)Li4/u;", "a", "(IIJLt4/q;Li4/y;Lt4/h;IILt4/s;)Li4/u;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "h", "b", IntegerTokenConverter.CONVERTER_KEY, "c", "J", "e", "()J", DateTokenConverter.CONVERTER_KEY, "Lt4/q;", "j", "()Lt4/q;", "Li4/y;", "g", "()Li4/y;", "f", "Lt4/h;", "()Lt4/h;", "Lt4/s;", "k", "()Lt4/s;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ParagraphStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int textAlign;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int textDirection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long lineHeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextIndent textIndent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final PlatformParagraphStyle platformStyle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LineHeightStyle lineHeightStyle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int lineBreak;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int hyphens;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final t4.s textMotion;

    public /* synthetic */ ParagraphStyle(int i11, int i12, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i13, int i14, t4.s sVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, j11, textIndent, platformParagraphStyle, lineHeightStyle, i13, i14, sVar);
    }

    public static /* synthetic */ ParagraphStyle b(ParagraphStyle paragraphStyle, int i11, int i12, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i13, int i14, t4.s sVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = paragraphStyle.textAlign;
        }
        if ((i15 & 2) != 0) {
            i12 = paragraphStyle.textDirection;
        }
        if ((i15 & 4) != 0) {
            j11 = paragraphStyle.lineHeight;
        }
        if ((i15 & 8) != 0) {
            textIndent = paragraphStyle.textIndent;
        }
        if ((i15 & 16) != 0) {
            platformParagraphStyle = paragraphStyle.platformStyle;
        }
        if ((i15 & 32) != 0) {
            lineHeightStyle = paragraphStyle.lineHeightStyle;
        }
        if ((i15 & 64) != 0) {
            i13 = paragraphStyle.lineBreak;
        }
        if ((i15 & 128) != 0) {
            i14 = paragraphStyle.hyphens;
        }
        if ((i15 & 256) != 0) {
            sVar = paragraphStyle.textMotion;
        }
        int i16 = i14;
        t4.s sVar2 = sVar;
        long j12 = j11;
        return paragraphStyle.a(i11, i12, j12, textIndent, platformParagraphStyle, lineHeightStyle, i13, i16, sVar2);
    }

    public final ParagraphStyle a(int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, t4.s textMotion) {
        return new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak, hyphens, textMotion, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getHyphens() {
        return this.hyphens;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getLineBreak() {
        return this.lineBreak;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getLineHeight() {
        return this.lineHeight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) other;
        return t4.j.k(this.textAlign, paragraphStyle.textAlign) && t4.l.j(this.textDirection, paragraphStyle.textDirection) && w4.v.e(this.lineHeight, paragraphStyle.lineHeight) && p013kotlin.jvm.internal.s.f(this.textIndent, paragraphStyle.textIndent) && p013kotlin.jvm.internal.s.f(this.platformStyle, paragraphStyle.platformStyle) && p013kotlin.jvm.internal.s.f(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && t4.f.f(this.lineBreak, paragraphStyle.lineBreak) && t4.e.g(this.hyphens, paragraphStyle.hyphens) && p013kotlin.jvm.internal.s.f(this.textMotion, paragraphStyle.textMotion);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getTextAlign() {
        return this.textAlign;
    }

    public int hashCode() {
        int iL = ((((t4.j.l(this.textAlign) * 31) + t4.l.k(this.textDirection)) * 31) + w4.v.i(this.lineHeight)) * 31;
        TextIndent textIndent = this.textIndent;
        int iHashCode = (iL + (textIndent != null ? textIndent.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int iHashCode2 = (iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        int iHashCode3 = (((((iHashCode2 + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0)) * 31) + t4.f.j(this.lineBreak)) * 31) + t4.e.h(this.hyphens)) * 31;
        t4.s sVar = this.textMotion;
        return iHashCode3 + (sVar != null ? sVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getTextDirection() {
        return this.textDirection;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final t4.s getTextMotion() {
        return this.textMotion;
    }

    public final ParagraphStyle l(ParagraphStyle other) {
        return other == null ? this : v.a(this, other.textAlign, other.textDirection, other.lineHeight, other.textIndent, other.platformStyle, other.lineHeightStyle, other.lineBreak, other.hyphens, other.textMotion);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) t4.j.m(this.textAlign)) + ", textDirection=" + ((Object) t4.l.l(this.textDirection)) + ", lineHeight=" + ((Object) w4.v.k(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + ((Object) t4.f.k(this.lineBreak)) + ", hyphens=" + ((Object) t4.e.i(this.hyphens)) + ", textMotion=" + this.textMotion + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private ParagraphStyle(int i11, int i12, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i13, int i14, t4.s sVar) {
        this.textAlign = i11;
        this.textDirection = i12;
        this.lineHeight = j11;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        this.lineBreak = i13;
        this.hyphens = i14;
        this.textMotion = sVar;
        if (w4.v.e(j11, w4.v.INSTANCE.a()) || w4.v.h(j11) >= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + w4.v.h(j11) + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ParagraphStyle(int i11, int i12, long j11, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i13, int i14, t4.s sVar, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        int iG = (i15 & 1) != 0 ? t4.j.INSTANCE.g() : i11;
        int iF = (i15 & 2) != 0 ? t4.l.INSTANCE.f() : i12;
        long jA = (i15 & 4) != 0 ? w4.v.INSTANCE.a() : j11;
        TextIndent textIndent2 = (i15 & 8) != 0 ? null : textIndent;
        PlatformParagraphStyle platformParagraphStyle2 = (i15 & 16) != 0 ? null : platformParagraphStyle;
        LineHeightStyle lineHeightStyle2 = (i15 & 32) != 0 ? null : lineHeightStyle;
        int iB = (i15 & 64) != 0 ? t4.f.INSTANCE.b() : i13;
        int iC = (i15 & 128) != 0 ? t4.e.INSTANCE.c() : i14;
        this(iG, iF, jA, textIndent2, platformParagraphStyle2, lineHeightStyle2, iB, iC, (i15 & 256) == 0 ? sVar : null, null);
    }
}
