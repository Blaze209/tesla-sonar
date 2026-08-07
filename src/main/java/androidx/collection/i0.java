package androidx.collection;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0006J\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0012\u001a\u00028\u00002\b\b\u0001\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/collection/i0;", "E", "Landroidx/collection/p0;", "", "initialCapacity", "<init>", "(I)V", "element", "", "g", "(Ljava/lang/Object;)Z", "Ljn0/h0;", "h", "()V", "capacity", IntegerTokenConverter.CONVERTER_KEY, "j", "index", "k", "(I)Ljava/lang/Object;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i0<E> extends p0<E> {
    public i0() {
        this(0, 1, null);
    }

    public final boolean g(E element) {
        i(this._size + 1);
        Object[] objArr = this.content;
        int i11 = this._size;
        objArr[i11] = element;
        this._size = i11 + 1;
        return true;
    }

    public final void h() {
        p013kotlin.collections.n.z(this.content, null, 0, this._size);
        this._size = 0;
    }

    public final void i(int capacity) {
        Object[] objArr = this.content;
        if (objArr.length < capacity) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(capacity, (objArr.length * 3) / 2));
            p013kotlin.jvm.internal.s.j(objArrCopyOf, "copyOf(this, newSize)");
            this.content = objArrCopyOf;
        }
    }

    public final boolean j(E element) {
        int iB = b(element);
        if (iB < 0) {
            return false;
        }
        k(iB);
        return true;
    }

    public final E k(int index) {
        int i11;
        if (index < 0 || index >= (i11 = this._size)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Index ");
            sb2.append(index);
            sb2.append(" must be in 0..");
            sb2.append(this._size - 1);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        Object[] objArr = this.content;
        E e11 = (E) objArr[index];
        if (index != i11 - 1) {
            p013kotlin.collections.n.p(objArr, objArr, index, index + 1, i11);
        }
        int i12 = this._size - 1;
        this._size = i12;
        objArr[i12] = null;
        return e11;
    }

    public /* synthetic */ i0(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 16 : i11);
    }

    public i0(int i11) {
        super(i11, null);
    }
}
