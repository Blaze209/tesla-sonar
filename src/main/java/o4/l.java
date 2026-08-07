package o4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0080\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R*\u0010)\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010,\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R$\u00100\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&R$\u00102\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b1\u0010&R\u001c\u00104\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b.\u00103R\u001a\u0010\u0005\u001a\u00020\u00048@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b5\u00106R$\u00107\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b8\u0010&\"\u0004\b9\u0010(R\u0014\u0010;\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, d2 = {"Lo4/l;", "", "Li4/d;", "text", "Li4/p0;", "selection", "<init>", "(Li4/d;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "l", "()Z", "", "index", "", "c", "(I)C", "start", "end", "", "Ljn0/h0;", "m", "(IILjava/lang/String;)V", "b", "(II)V", "p", "n", "a", "()V", "toString", "()Ljava/lang/String;", "s", "()Li4/d;", "Lo4/g0;", "Lo4/g0;", "gapBuffer", "value", "I", "k", "()I", "r", "(I)V", "selectionStart", "j", "q", "selectionEnd", "<set-?>", DateTokenConverter.CONVERTER_KEY, "f", "compositionStart", "e", "compositionEnd", "()Li4/p0;", "composition", IntegerTokenConverter.CONVERTER_KEY, "()J", "cursor", "g", "o", "h", "length", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f96434g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 gapBuffer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int selectionStart;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int selectionEnd;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int compositionStart;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int compositionEnd;

    public /* synthetic */ l(i4.d dVar, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j11);
    }

    private final void q(int i11) {
        if (i11 >= 0) {
            this.selectionEnd = i11;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i11).toString());
    }

    private final void r(int i11) {
        if (i11 >= 0) {
            this.selectionStart = i11;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i11).toString());
    }

    public final void a() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void b(int start, int end) {
        long jB = i4.q0.b(start, end);
        this.gapBuffer.c(start, end, "");
        long jA = m.a(i4.q0.b(this.selectionStart, this.selectionEnd), jB);
        r(i4.p0.l(jA));
        q(i4.p0.k(jA));
        if (l()) {
            long jA2 = m.a(i4.q0.b(this.compositionStart, this.compositionEnd), jB);
            if (i4.p0.h(jA2)) {
                a();
            } else {
                this.compositionStart = i4.p0.l(jA2);
                this.compositionEnd = i4.p0.k(jA2);
            }
        }
    }

    public final char c(int index) {
        return this.gapBuffer.a(index);
    }

    public final i4.p0 d() {
        if (l()) {
            return i4.p0.b(i4.q0.b(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getCompositionStart() {
        return this.compositionStart;
    }

    public final int g() {
        int i11 = this.selectionStart;
        int i12 = this.selectionEnd;
        if (i11 == i12) {
            return i12;
        }
        return -1;
    }

    public final int h() {
        return this.gapBuffer.b();
    }

    public final long i() {
        return i4.q0.b(this.selectionStart, this.selectionEnd);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getSelectionStart() {
        return this.selectionStart;
    }

    public final boolean l() {
        return this.compositionStart != -1;
    }

    public final void m(int start, int end, String text) {
        if (start < 0 || start > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (end < 0 || end > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (start <= end) {
            this.gapBuffer.c(start, end, text);
            r(text.length() + start);
            q(start + text.length());
            this.compositionStart = -1;
            this.compositionEnd = -1;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + start + " > " + end);
    }

    public final void n(int start, int end) {
        if (start < 0 || start > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (end < 0 || end > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (start < end) {
            this.compositionStart = start;
            this.compositionEnd = end;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed or empty range: " + start + " > " + end);
    }

    public final void o(int i11) {
        p(i11, i11);
    }

    public final void p(int start, int end) {
        if (start < 0 || start > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (end < 0 || end > this.gapBuffer.b()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.b());
        }
        if (start <= end) {
            r(start);
            q(end);
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + start + " > " + end);
    }

    public final i4.d s() {
        return new i4.d(toString(), null, null, 6, null);
    }

    public String toString() {
        return this.gapBuffer.toString();
    }

    private l(i4.d dVar, long j11) {
        this.gapBuffer = new g0(dVar.getText());
        this.selectionStart = i4.p0.l(j11);
        this.selectionEnd = i4.p0.k(j11);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int iL = i4.p0.l(j11);
        int iK = i4.p0.k(j11);
        if (iL < 0 || iL > dVar.length()) {
            throw new IndexOutOfBoundsException("start (" + iL + ") offset is outside of text region " + dVar.length());
        }
        if (iK < 0 || iK > dVar.length()) {
            throw new IndexOutOfBoundsException("end (" + iK + ") offset is outside of text region " + dVar.length());
        }
        if (iL <= iK) {
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + iL + " > " + iK);
    }
}
