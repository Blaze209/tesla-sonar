package w3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import v3.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\fJ\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\fJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u0003J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\fR$\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\"\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Lw3/b;", "", "<init>", "()V", "", "index", "Lv3/w;", "e", "(I)J", "pointerId", "", IntegerTokenConverter.CONVERTER_KEY, "(J)Z", "", "pointerIdValue", "h", "j", "(I)Z", "g", "()Z", "value", "a", "b", "Ljn0/h0;", "k", "(IJ)V", "c", DateTokenConverter.CONVERTER_KEY, "<set-?>", "I", "f", "()I", "size", "", "[J", "internalArray", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long[] internalArray = new long[2];

    public final boolean a(long value) {
        if (d(value)) {
            return false;
        }
        k(this.size, value);
        return true;
    }

    public final boolean b(long pointerId) {
        return a(pointerId);
    }

    public final void c() {
        this.size = 0;
    }

    public final boolean d(long pointerIdValue) {
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.internalArray[i12] == pointerIdValue) {
                return true;
            }
        }
        return false;
    }

    public final long e(int index) {
        return w.b(this.internalArray[index]);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final boolean g() {
        return this.size == 0;
    }

    public final boolean h(long pointerIdValue) {
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (pointerIdValue == e(i12)) {
                j(i12);
                return true;
            }
        }
        return false;
    }

    public final boolean i(long pointerId) {
        return h(pointerId);
    }

    public final boolean j(int index) {
        int i11 = this.size;
        if (index >= i11) {
            return false;
        }
        int i12 = i11 - 1;
        while (index < i12) {
            long[] jArr = this.internalArray;
            int i13 = index + 1;
            jArr[index] = jArr[i13];
            index = i13;
        }
        this.size--;
        return true;
    }

    public final void k(int index, long value) {
        long[] jArr = this.internalArray;
        if (index >= jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(index + 1, jArr.length * 2));
            s.j(jArrCopyOf, "copyOf(this, newSize)");
            this.internalArray = jArrCopyOf;
        }
        this.internalArray[index] = value;
        if (index >= this.size) {
            this.size = index + 1;
        }
    }
}
