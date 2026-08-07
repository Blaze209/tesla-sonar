package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\t*\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0013\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/platform/u0;", "Landroidx/compose/ui/platform/t0;", "Lk3/n3;", "tmpMatrix", "<init>", "([FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/view/View;", "view", "matrix", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;[F)V", "Landroid/graphics/Matrix;", "other", "b", "([FLandroid/graphics/Matrix;)V", "", "x", "y", "c", "([FFF)V", "a", "[F", "", "[I", "tmpLocation", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class u0 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float[] tmpMatrix;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int[] tmpLocation;

    public /* synthetic */ u0(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    private final void b(float[] fArr, Matrix matrix) {
        k3.o0.b(this.tmpMatrix, matrix);
        h0.i(fArr, this.tmpMatrix);
    }

    private final void c(float[] fArr, float f11, float f12) {
        h0.j(fArr, f11, f12, this.tmpMatrix);
    }

    private final void d(View view, float[] matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, matrix);
            c(matrix, -view.getScrollX(), -view.getScrollY());
            c(matrix, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.tmpLocation;
            view.getLocationInWindow(iArr);
            c(matrix, -view.getScrollX(), -view.getScrollY());
            c(matrix, iArr[0], iArr[1]);
        }
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        b(matrix, matrix2);
    }

    @Override // androidx.compose.ui.platform.t0
    public void a(View view, float[] matrix) {
        k3.n3.j(matrix);
        d(view, matrix);
    }

    private u0(float[] fArr) {
        this.tmpMatrix = fArr;
        this.tmpLocation = new int[2];
    }
}
