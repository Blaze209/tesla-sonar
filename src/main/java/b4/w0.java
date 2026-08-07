package b4;

import java.util.Arrays;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0013R$\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006\u0018"}, d2 = {"Lb4/w0;", "T", "", "<init>", "()V", "", "a", "()Z", "b", "()Ljava/lang/Object;", "Lt2/b;", "vector", "Ljn0/h0;", "c", "(Lt2/b;)V", "", "I", "size", "", "[I", "currentIndexes", "", "[Lt2/b;", "vectors", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class w0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int[] currentIndexes = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private t2.b<T>[] vectors = new t2.b[16];

    public final boolean a() {
        int i11 = this.size;
        return i11 > 0 && this.currentIndexes[i11 - 1] >= 0;
    }

    public final T b() {
        int i11 = this.size;
        if (i11 <= 0) {
            throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
        }
        int i12 = i11 - 1;
        int i13 = this.currentIndexes[i12];
        t2.b<T> bVar = this.vectors[i12];
        p013kotlin.jvm.internal.s.h(bVar);
        if (i13 > 0) {
            int[] iArr = this.currentIndexes;
            iArr[i12] = iArr[i12] - 1;
        } else if (i13 == 0) {
            this.vectors[i12] = null;
            this.size--;
        }
        return bVar.m()[i13];
    }

    public final void c(t2.b<T> vector) {
        if (vector.p()) {
            return;
        }
        int i11 = this.size;
        int[] iArr = this.currentIndexes;
        if (i11 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            p013kotlin.jvm.internal.s.j(iArrCopyOf, "copyOf(this, newSize)");
            this.currentIndexes = iArrCopyOf;
            t2.b<T>[] bVarArr = this.vectors;
            Object[] objArrCopyOf = Arrays.copyOf(bVarArr, bVarArr.length * 2);
            p013kotlin.jvm.internal.s.j(objArrCopyOf, "copyOf(this, newSize)");
            this.vectors = (t2.b[]) objArrCopyOf;
        }
        this.currentIndexes[i11] = vector.getSize() - 1;
        this.vectors[i11] = vector;
        this.size++;
    }
}
