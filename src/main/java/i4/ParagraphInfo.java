package i4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import k3.t3;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: i4.p, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u0011\u0010\u0011\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000fJ\u0011\u0010\u0012\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u000fJ\u0011\u0010\u0013\u001a\u00020\t*\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\t*\u00020\t¢\u0006\u0004\b\u0015\u0010\u0014J\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u00020\u0019*\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001bJ\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010#\u001a\u00020 *\u00020 2\b\b\u0002\u0010\"\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020!2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010)R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b1\u0010)R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00102\u001a\u0004\b6\u0010)\"\u0004\b7\u00108R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00102\u001a\u0004\b4\u0010)\"\u0004\b9\u00108R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010:\u001a\u0004\b-\u0010<\"\u0004\b?\u0010>R\u0011\u0010@\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b5\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Li4/p;", "", "Li4/o;", "paragraph", "", "startIndex", "endIndex", "startLineIndex", "endLineIndex", "", "top", "bottom", "<init>", "(Li4/o;IIIIFF)V", "r", "(I)I", "m", "s", "n", "o", "(F)F", "t", "Lj3/g;", "q", "(J)J", "Lj3/i;", IntegerTokenConverter.CONVERTER_KEY, "(Lj3/i;)Lj3/i;", "p", "Lk3/t3;", "j", "(Lk3/t3;)Lk3/t3;", "Li4/p0;", "", "treatZeroAsNull", "k", "(JZ)J", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li4/o;", "e", "()Li4/o;", "b", "I", "f", "c", DateTokenConverter.CONVERTER_KEY, "g", "setStartLineIndex", "(I)V", "setEndLineIndex", Gender.FEMALE, "h", "()F", "setTop", "(F)V", "setBottom", "length", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ParagraphInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final o paragraph;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int startIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int endIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private int startLineIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private int endLineIndex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private float top;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private float bottom;

    public ParagraphInfo(o oVar, int i11, int i12, int i13, int i14, float f11, float f12) {
        this.paragraph = oVar;
        this.startIndex = i11;
        this.endIndex = i12;
        this.startLineIndex = i13;
        this.endLineIndex = i14;
        this.top = f11;
        this.bottom = f12;
    }

    public static /* synthetic */ long l(ParagraphInfo paragraphInfo, long j11, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return paragraphInfo.k(j11, z11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getEndIndex() {
        return this.endIndex;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    public final int d() {
        return this.endIndex - this.startIndex;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final o getParagraph() {
        return this.paragraph;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphInfo)) {
            return false;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) other;
        return p013kotlin.jvm.internal.s.f(this.paragraph, paragraphInfo.paragraph) && this.startIndex == paragraphInfo.startIndex && this.endIndex == paragraphInfo.endIndex && this.startLineIndex == paragraphInfo.startLineIndex && this.endLineIndex == paragraphInfo.endLineIndex && Float.compare(this.top, paragraphInfo.top) == 0 && Float.compare(this.bottom, paragraphInfo.bottom) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((((((((this.paragraph.hashCode() * 31) + Integer.hashCode(this.startIndex)) * 31) + Integer.hashCode(this.endIndex)) * 31) + Integer.hashCode(this.startLineIndex)) * 31) + Integer.hashCode(this.endLineIndex)) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.bottom);
    }

    public final j3.i i(j3.i iVar) {
        return iVar.u(j3.h.a(BitmapDescriptorFactory.HUE_RED, this.top));
    }

    public final t3 j(t3 t3Var) {
        t3Var.f(j3.h.a(BitmapDescriptorFactory.HUE_RED, this.top));
        return t3Var;
    }

    public final long k(long j11, boolean z11) {
        if (z11) {
            p0.Companion companion = p0.INSTANCE;
            if (p0.g(j11, companion.a())) {
                return companion.a();
            }
        }
        return q0.b(m(p0.n(j11)), m(p0.i(j11)));
    }

    public final int m(int i11) {
        return i11 + this.startIndex;
    }

    public final int n(int i11) {
        return i11 + this.startLineIndex;
    }

    public final float o(float f11) {
        return f11 + this.top;
    }

    public final j3.i p(j3.i iVar) {
        return iVar.u(j3.h.a(BitmapDescriptorFactory.HUE_RED, -this.top));
    }

    public final long q(long j11) {
        return j3.h.a(j3.g.m(j11), j3.g.n(j11) - this.top);
    }

    public final int r(int i11) {
        return bo0.n.n(i11, this.startIndex, this.endIndex) - this.startIndex;
    }

    public final int s(int i11) {
        return i11 - this.startLineIndex;
    }

    public final float t(float f11) {
        return f11 - this.top;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.paragraph + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", startLineIndex=" + this.startLineIndex + ", endLineIndex=" + this.endLineIndex + ", top=" + this.top + ", bottom=" + this.bottom + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
