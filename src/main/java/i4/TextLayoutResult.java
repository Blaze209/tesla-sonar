package i4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.List;
import k3.t3;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i4.m0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\rJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b%\u0010$J\u0018\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020&ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b+\u0010,J\u001b\u0010.\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b0\u0010,J\u001d\u00104\u001a\u0002032\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\n¢\u0006\u0004\b4\u00105J$\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u001a\u00109\u001a\u00020\u000e2\b\u00108\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010M\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b+\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010O\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b0\u0010J\u001a\u0004\bN\u0010LR\u001f\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0P8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0011\u0010W\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bQ\u0010VR\u0011\u0010Y\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bX\u0010VR\u0011\u0010[\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bZ\u0010VR\u0011\u0010]\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\\\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Li4/m0;", "", "Li4/l0;", "layoutInput", "Li4/j;", "multiParagraph", "Lw4/r;", "size", "<init>", "(Li4/l0;Li4/j;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "lineIndex", "u", "(I)I", "", "visibleEnd", "o", "(IZ)I", "D", "(I)Z", "", "v", "(I)F", "m", "s", "t", "offset", "q", "vertical", "r", "(F)I", "usePrimaryDirection", "j", "(IZ)F", "Lt4/i;", "y", "(I)Lt4/i;", "c", "Lj3/g;", "position", "x", "(J)I", "Lj3/i;", DateTokenConverter.CONVERTER_KEY, "(I)Lj3/i;", "Li4/p0;", "C", "(I)J", "e", "start", "end", "Lk3/t3;", "z", "(II)Lk3/t3;", "a", "(Li4/l0;J)Li4/m0;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Li4/l0;", "l", "()Li4/l0;", "b", "Li4/j;", "w", "()Li4/j;", "J", "B", "()J", Gender.FEMALE, "h", "()F", "firstBaseline", "k", "lastBaseline", "", "f", "Ljava/util/List;", "A", "()Ljava/util/List;", "placeholderRects", "()Z", "didOverflowHeight", "g", "didOverflowWidth", IntegerTokenConverter.CONVERTER_KEY, "hasVisualOverflow", "n", "lineCount", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextLayoutResult {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f75762g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextLayoutInput layoutInput;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final j multiParagraph;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long size;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float firstBaseline;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float lastBaseline;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<j3.i> placeholderRects;

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, j jVar, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLayoutInput, jVar, j11);
    }

    public static /* synthetic */ TextLayoutResult b(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i11 & 2) != 0) {
            j11 = textLayoutResult.size;
        }
        return textLayoutResult.a(textLayoutInput, j11);
    }

    public static /* synthetic */ int p(TextLayoutResult textLayoutResult, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return textLayoutResult.o(i11, z11);
    }

    public final List<j3.i> A() {
        return this.placeholderRects;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final long C(int offset) {
        return this.multiParagraph.B(offset);
    }

    public final boolean D(int lineIndex) {
        return this.multiParagraph.C(lineIndex);
    }

    public final TextLayoutResult a(TextLayoutInput layoutInput, long size) {
        return new TextLayoutResult(layoutInput, this.multiParagraph, size, null);
    }

    public final t4.i c(int offset) {
        return this.multiParagraph.c(offset);
    }

    public final j3.i d(int offset) {
        return this.multiParagraph.d(offset);
    }

    public final j3.i e(int offset) {
        return this.multiParagraph.e(offset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) other;
        return p013kotlin.jvm.internal.s.f(this.layoutInput, textLayoutResult.layoutInput) && p013kotlin.jvm.internal.s.f(this.multiParagraph, textLayoutResult.multiParagraph) && w4.r.e(this.size, textLayoutResult.size) && this.firstBaseline == textLayoutResult.firstBaseline && this.lastBaseline == textLayoutResult.lastBaseline && p013kotlin.jvm.internal.s.f(this.placeholderRects, textLayoutResult.placeholderRects);
    }

    public final boolean f() {
        return this.multiParagraph.getDidExceedMaxLines() || ((float) w4.r.f(this.size)) < this.multiParagraph.getHeight();
    }

    public final boolean g() {
        return ((float) w4.r.g(this.size)) < this.multiParagraph.getWidth();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public int hashCode() {
        return (((((((((this.layoutInput.hashCode() * 31) + this.multiParagraph.hashCode()) * 31) + w4.r.h(this.size)) * 31) + Float.hashCode(this.firstBaseline)) * 31) + Float.hashCode(this.lastBaseline)) * 31) + this.placeholderRects.hashCode();
    }

    public final boolean i() {
        return g() || f();
    }

    public final float j(int offset, boolean usePrimaryDirection) {
        return this.multiParagraph.i(offset, usePrimaryDirection);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final float m(int lineIndex) {
        return this.multiParagraph.l(lineIndex);
    }

    public final int n() {
        return this.multiParagraph.getLineCount();
    }

    public final int o(int lineIndex, boolean visibleEnd) {
        return this.multiParagraph.n(lineIndex, visibleEnd);
    }

    public final int q(int offset) {
        return this.multiParagraph.o(offset);
    }

    public final int r(float vertical) {
        return this.multiParagraph.p(vertical);
    }

    public final float s(int lineIndex) {
        return this.multiParagraph.q(lineIndex);
    }

    public final float t(int lineIndex) {
        return this.multiParagraph.r(lineIndex);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + ((Object) w4.r.i(this.size)) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final int u(int lineIndex) {
        return this.multiParagraph.s(lineIndex);
    }

    public final float v(int lineIndex) {
        return this.multiParagraph.t(lineIndex);
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final j getMultiParagraph() {
        return this.multiParagraph;
    }

    public final int x(long position) {
        return this.multiParagraph.u(position);
    }

    public final t4.i y(int offset) {
        return this.multiParagraph.v(offset);
    }

    public final t3 z(int start, int end) {
        return this.multiParagraph.x(start, end);
    }

    private TextLayoutResult(TextLayoutInput textLayoutInput, j jVar, long j11) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = jVar;
        this.size = j11;
        this.firstBaseline = jVar.g();
        this.lastBaseline = jVar.k();
        this.placeholderRects = jVar.y();
    }
}
