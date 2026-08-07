package androidx.collection;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\tJ\u0017\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/collection/b0;", "Landroidx/collection/m;", "", "initialCapacity", "<init>", "(I)V", "element", "", "g", "(I)Z", "index", "Ljn0/h0;", "f", "(II)V", "", "elements", "h", "(I[I)Z", "j", "([I)V", "capacity", IntegerTokenConverter.CONVERTER_KEY, "k", "l", "(I)I", "m", "(II)I", "n", "()V", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b0 extends m {
    public /* synthetic */ b0(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 16 : i11);
    }

    public final void f(int index, int element) {
        int i11;
        if (index < 0 || index > (i11 = this._size)) {
            throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
        }
        i(i11 + 1);
        int[] iArr = this.content;
        int i12 = this._size;
        if (index != i12) {
            p013kotlin.collections.n.n(iArr, iArr, index + 1, index, i12);
        }
        iArr[index] = element;
        this._size++;
    }

    public final boolean g(int element) {
        i(this._size + 1);
        int[] iArr = this.content;
        int i11 = this._size;
        iArr[i11] = element;
        this._size = i11 + 1;
        return true;
    }

    public final boolean h(int index, int[] elements) {
        int i11;
        p013kotlin.jvm.internal.s.k(elements, "elements");
        if (index < 0 || index > (i11 = this._size)) {
            throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
        }
        if (elements.length == 0) {
            return false;
        }
        i(i11 + elements.length);
        int[] iArr = this.content;
        int i12 = this._size;
        if (index != i12) {
            p013kotlin.collections.n.n(iArr, iArr, elements.length + index, index, i12);
        }
        p013kotlin.collections.n.s(elements, iArr, index, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    public final void i(int capacity) {
        int[] iArr = this.content;
        if (iArr.length < capacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(capacity, (iArr.length * 3) / 2));
            p013kotlin.jvm.internal.s.j(iArrCopyOf, "copyOf(this, newSize)");
            this.content = iArrCopyOf;
        }
    }

    public final void j(int[] elements) {
        p013kotlin.jvm.internal.s.k(elements, "elements");
        h(this._size, elements);
    }

    public final boolean k(int element) {
        int iC = c(element);
        if (iC < 0) {
            return false;
        }
        l(iC);
        return true;
    }

    public final int l(int index) {
        int i11;
        if (index < 0 || index >= (i11 = this._size)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Index ");
            sb2.append(index);
            sb2.append(" must be in 0..");
            sb2.append(this._size - 1);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int[] iArr = this.content;
        int i12 = iArr[index];
        if (index != i11 - 1) {
            p013kotlin.collections.n.n(iArr, iArr, index, index + 1, i11);
        }
        this._size--;
        return i12;
    }

    public final int m(int index, int element) {
        if (index >= 0 && index < this._size) {
            int[] iArr = this.content;
            int i11 = iArr[index];
            iArr[index] = element;
            return i11;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set index ");
        sb2.append(index);
        sb2.append(" must be between 0 .. ");
        sb2.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final void n() {
        int i11 = this._size;
        if (i11 == 0) {
            return;
        }
        p013kotlin.collections.n.P(this.content, 0, i11);
    }

    public b0(int i11) {
        super(i11, null);
    }
}
