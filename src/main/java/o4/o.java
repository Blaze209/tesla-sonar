package o4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001e\u001a\u00020\f2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010\nJ\u000f\u0010!\u001a\u00020\u0017H\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010#¨\u0006)"}, d2 = {"Lo4/o;", "", "", "initBuffer", "", "initGapStart", "initGapEnd", "<init>", "([CII)V", "c", "()I", "requestSize", "Ljn0/h0;", "f", "(I)V", "start", "end", "b", "(II)V", "index", "", DateTokenConverter.CONVERTER_KEY, "(I)C", "", "text", "g", "(IILjava/lang/String;)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "a", "(Ljava/lang/StringBuilder;)V", "e", "toString", "()Ljava/lang/String;", "I", "capacity", "[C", "buffer", "gapStart", "gapEnd", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int capacity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private char[] buffer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int gapStart;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int gapEnd;

    public o(char[] cArr, int i11, int i12) {
        this.capacity = cArr.length;
        this.buffer = cArr;
        this.gapStart = i11;
        this.gapEnd = i12;
    }

    private final void b(int start, int end) {
        int i11 = this.gapStart;
        if (start < i11 && end <= i11) {
            int i12 = i11 - end;
            char[] cArr = this.buffer;
            p013kotlin.collections.n.l(cArr, cArr, this.gapEnd - i12, end, i11);
            this.gapStart = start;
            this.gapEnd -= i12;
            return;
        }
        if (start < i11 && end >= i11) {
            this.gapEnd = end + c();
            this.gapStart = start;
            return;
        }
        int iC = start + c();
        int iC2 = end + c();
        int i13 = this.gapEnd;
        char[] cArr2 = this.buffer;
        p013kotlin.collections.n.l(cArr2, cArr2, this.gapStart, i13, iC);
        this.gapStart += iC - i13;
        this.gapEnd = iC2;
    }

    private final int c() {
        return this.gapEnd - this.gapStart;
    }

    private final void f(int requestSize) {
        if (requestSize <= c()) {
            return;
        }
        int iC = requestSize - c();
        int i11 = this.capacity;
        do {
            i11 *= 2;
        } while (i11 - this.capacity < iC);
        char[] cArr = new char[i11];
        p013kotlin.collections.n.l(this.buffer, cArr, 0, 0, this.gapStart);
        int i12 = this.capacity;
        int i13 = this.gapEnd;
        int i14 = i12 - i13;
        int i15 = i11 - i14;
        p013kotlin.collections.n.l(this.buffer, cArr, i15, i13, i14 + i13);
        this.buffer = cArr;
        this.capacity = i11;
        this.gapEnd = i15;
    }

    public final void a(StringBuilder builder) {
        builder.append(this.buffer, 0, this.gapStart);
        p013kotlin.jvm.internal.s.j(builder, "this.append(value, start…x, endIndex - startIndex)");
        char[] cArr = this.buffer;
        int i11 = this.gapEnd;
        builder.append(cArr, i11, this.capacity - i11);
        p013kotlin.jvm.internal.s.j(builder, "this.append(value, start…x, endIndex - startIndex)");
    }

    public final char d(int index) {
        int i11 = this.gapStart;
        return index < i11 ? this.buffer[index] : this.buffer[(index - i11) + this.gapEnd];
    }

    public final int e() {
        return this.capacity - c();
    }

    public final void g(int start, int end, String text) {
        f(text.length() - (end - start));
        b(start, end);
        p.b(text, this.buffer, this.gapStart);
        this.gapStart += text.length();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) sb2);
        return sb2.toString();
    }
}
