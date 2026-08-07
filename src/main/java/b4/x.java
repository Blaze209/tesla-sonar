package b4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Arrays;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0014J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0016J-\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010\u000bJ\r\u0010!\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0013¢\u0006\u0004\b#\u0010$J\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010%R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010)R\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010\"¨\u0006,"}, d2 = {"Lb4/x;", "", "", "initialCapacity", "<init>", "(I)V", "start", "end", "elSize", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(III)V", "e", "(III)I", "j", "k", "(II)V", "a", "b", "", "(II)Z", "index", "(I)I", "oldStart", "oldEnd", "newStart", "newEnd", "h", "(IIII)V", "x", "y", "size", "g", "f", "()I", DateTokenConverter.CONVERTER_KEY, "()Z", "()V", "", "[I", "stack", "I", "lastIndex", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] stack;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int lastIndex;

    public x(int i11) {
        this.stack = new int[i11];
    }

    private final boolean a(int a11, int b11) {
        int[] iArr = this.stack;
        int i11 = iArr[a11];
        int i12 = iArr[b11];
        return i11 < i12 || (i11 == i12 && iArr[a11 + 1] <= iArr[b11 + 1]);
    }

    private final int e(int start, int end, int elSize) {
        int i11 = start - elSize;
        while (start < end) {
            if (a(start, end)) {
                i11 += elSize;
                k(i11, start);
            }
            start += elSize;
        }
        int i12 = i11 + elSize;
        k(i12, end);
        return i12;
    }

    private final void i(int start, int end, int elSize) {
        if (start < end) {
            int iE = e(start, end, elSize);
            i(start, iE - elSize, elSize);
            i(iE + elSize, end, elSize);
        }
    }

    private final void k(int i11, int j11) {
        int[] iArr = this.stack;
        v0.i(iArr, i11, j11);
        v0.i(iArr, i11 + 1, j11 + 1);
        v0.i(iArr, i11 + 2, j11 + 2);
    }

    public final int b(int index) {
        return this.stack[index];
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getLastIndex() {
        return this.lastIndex;
    }

    public final boolean d() {
        return this.lastIndex != 0;
    }

    public final int f() {
        int[] iArr = this.stack;
        int i11 = this.lastIndex - 1;
        this.lastIndex = i11;
        return iArr[i11];
    }

    public final void g(int x11, int y11, int size) {
        int i11 = this.lastIndex;
        int i12 = i11 + 3;
        int[] iArr = this.stack;
        if (i12 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            p013kotlin.jvm.internal.s.j(iArrCopyOf, "copyOf(this, newSize)");
            this.stack = iArrCopyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i11] = x11 + size;
        iArr2[i11 + 1] = y11 + size;
        iArr2[i11 + 2] = size;
        this.lastIndex = i12;
    }

    public final void h(int oldStart, int oldEnd, int newStart, int newEnd) {
        int i11 = this.lastIndex;
        int i12 = i11 + 4;
        int[] iArr = this.stack;
        if (i12 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            p013kotlin.jvm.internal.s.j(iArrCopyOf, "copyOf(this, newSize)");
            this.stack = iArrCopyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i11] = oldStart;
        iArr2[i11 + 1] = oldEnd;
        iArr2[i11 + 2] = newStart;
        iArr2[i11 + 3] = newEnd;
        this.lastIndex = i12;
    }

    public final void j() {
        int i11 = this.lastIndex;
        if (!(i11 % 3 == 0)) {
            y3.a.b("Array size not a multiple of 3");
        }
        if (i11 > 3) {
            i(0, i11 - 3, 3);
        }
    }
}
