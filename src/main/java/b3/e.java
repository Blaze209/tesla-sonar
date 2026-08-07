package b3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.collections.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\bR$\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019¨\u0006!"}, d2 = {"Lb3/e;", "", "<init>", "()V", "", "index", "Ljn0/h0;", "h", "(I)V", "g", "a", "b", IntegerTokenConverter.CONVERTER_KEY, "(II)V", "atLeast", "c", "()I", "handle", DateTokenConverter.CONVERTER_KEY, "default", "e", "(I)I", "value", "f", "<set-?>", "I", "getSize", "size", "", "[I", "values", "handles", "firstFreeHandle", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int[] values = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int[] index = new int[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int[] handles;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int firstFreeHandle;

    public e() {
        int[] iArr = new int[16];
        int i11 = 0;
        while (i11 < 16) {
            int i12 = i11 + 1;
            iArr[i11] = i12;
            i11 = i12;
        }
        this.handles = iArr;
    }

    private final int b() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i11 = length * 2;
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i12 + 1;
                iArr[i12] = i13;
                i12 = i13;
            }
            n.s(this.handles, iArr, 0, 0, 0, 14, null);
            this.handles = iArr;
        }
        int i14 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i14];
        return i14;
    }

    private final void c(int atLeast) {
        int[] iArr = this.values;
        int length = iArr.length;
        if (atLeast <= length) {
            return;
        }
        int i11 = length * 2;
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        n.s(iArr, iArr2, 0, 0, 0, 14, null);
        n.s(this.index, iArr3, 0, 0, 0, 14, null);
        this.values = iArr2;
        this.index = iArr3;
    }

    private final void d(int handle) {
        this.handles[handle] = this.firstFreeHandle;
        this.firstFreeHandle = handle;
    }

    private final void g(int index) {
        int i11;
        int[] iArr = this.values;
        int i12 = this.size >> 1;
        while (index < i12) {
            int i13 = (index + 1) << 1;
            int i14 = i13 - 1;
            if (i13 >= this.size || (i11 = iArr[i13]) >= iArr[i14]) {
                if (iArr[i14] >= iArr[index]) {
                    return;
                }
                i(i14, index);
                index = i14;
            } else {
                if (i11 >= iArr[index]) {
                    return;
                }
                i(i13, index);
                index = i13;
            }
        }
    }

    private final void h(int index) {
        int[] iArr = this.values;
        int i11 = iArr[index];
        while (index > 0) {
            int i12 = ((index + 1) >> 1) - 1;
            if (iArr[i12] <= i11) {
                return;
            }
            i(i12, index);
            index = i12;
        }
    }

    private final void i(int a11, int b11) {
        int[] iArr = this.values;
        int[] iArr2 = this.index;
        int[] iArr3 = this.handles;
        int i11 = iArr[a11];
        iArr[a11] = iArr[b11];
        iArr[b11] = i11;
        int i12 = iArr2[a11];
        iArr2[a11] = iArr2[b11];
        iArr2[b11] = i12;
        iArr3[iArr2[a11]] = a11;
        iArr3[iArr2[b11]] = b11;
    }

    public final int a(int value) {
        c(this.size + 1);
        int i11 = this.size;
        this.size = i11 + 1;
        int iB = b();
        this.values[i11] = value;
        this.index[i11] = iB;
        this.handles[iB] = i11;
        h(i11);
        return iB;
    }

    public final int e(int i11) {
        return this.size > 0 ? this.values[0] : i11;
    }

    public final void f(int handle) {
        int i11 = this.handles[handle];
        i(i11, this.size - 1);
        this.size--;
        h(i11);
        g(i11);
        d(handle);
    }
}
