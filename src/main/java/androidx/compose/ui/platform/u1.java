package androidx.compose.ui.platform;

import android.graphics.Matrix;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u000eR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/u1;", "T", "", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "Ljn0/h0;", "getMatrix", "<init>", "(Lwn0/p;)V", "c", "()V", "target", "Lk3/n3;", "b", "(Ljava/lang/Object;)[F", "a", "Lwn0/p;", "Landroid/graphics/Matrix;", "androidMatrixCache", "previousAndroidMatrix", DateTokenConverter.CONVERTER_KEY, "[F", "matrixCache", "e", "inverseMatrixCache", "", "f", "Z", "isDirty", "g", "isInverseDirty", "h", "isInverseValid", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<T, Matrix, jn0.h0> getMatrix;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Matrix androidMatrixCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Matrix previousAndroidMatrix;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float[] matrixCache;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float[] inverseMatrixCache;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isInverseDirty = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isInverseValid = true;

    /* JADX WARN: Multi-variable type inference failed */
    public u1(wn0.p<? super T, ? super Matrix, jn0.h0> pVar) {
        this.getMatrix = pVar;
    }

    public final float[] a(T target) {
        float[] fArrC = this.inverseMatrixCache;
        if (fArrC == null) {
            fArrC = k3.n3.c(null, 1, null);
            this.inverseMatrixCache = fArrC;
        }
        if (this.isInverseDirty) {
            this.isInverseValid = s1.a(b(target), fArrC);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArrC;
        }
        return null;
    }

    public final float[] b(T target) {
        float[] fArrC = this.matrixCache;
        if (fArrC == null) {
            fArrC = k3.n3.c(null, 1, null);
            this.matrixCache = fArrC;
        }
        if (!this.isDirty) {
            return fArrC;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(target, matrix);
        Matrix matrix2 = this.previousAndroidMatrix;
        if (matrix2 == null || !p013kotlin.jvm.internal.s.f(matrix, matrix2)) {
            k3.o0.b(fArrC, matrix);
            this.androidMatrixCache = matrix2;
            this.previousAndroidMatrix = matrix;
        }
        this.isDirty = false;
        return fArrC;
    }

    public final void c() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }
}
