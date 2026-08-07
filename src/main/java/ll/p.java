package ll;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\nJ\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR(\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b!\u0010\n\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010'\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\nR\u001e\u0010,\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b)\u0010*\u0012\u0004\b+\u0010\nR\u001c\u00101\u001a\u00020-8\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b.\u0010/\u0012\u0004\b0\u0010\nR\u001c\u00104\u001a\u00020-8\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b2\u0010/\u0012\u0004\b3\u0010\nR\u001e\u00108\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b5\u00106\u0012\u0004\b7\u0010\nR\u0014\u0010:\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00106R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010\u001e\"\u0004\b<\u0010 R(\u0010=\u001a\u0004\u0018\u00010(2\b\u0010=\u001a\u0004\u0018\u00010(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lll/p;", "Lll/g;", "Landroid/graphics/drawable/Drawable;", "drawable", "Lll/s;", "scaleType", "<init>", "(Landroid/graphics/drawable/Drawable;Lll/s;)V", "Ljn0/h0;", "z", "()V", "newDelegate", "w", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "y", "Landroid/graphics/Matrix;", "transform", "m", "(Landroid/graphics/Matrix;)V", "e", "Lll/s;", "getMScaleType", "()Lll/s;", "setMScaleType", "(Lll/s;)V", "getMScaleType$annotations", "mScaleType", "", "f", "Ljava/lang/Object;", "getMScaleTypeState$annotations", "mScaleTypeState", "Landroid/graphics/PointF;", "g", "Landroid/graphics/PointF;", "getMFocusPoint$annotations", "mFocusPoint", "", "h", "I", "getMUnderlyingWidth$annotations", "mUnderlyingWidth", IntegerTokenConverter.CONVERTER_KEY, "getMUnderlyingHeight$annotations", "mUnderlyingHeight", "j", "Landroid/graphics/Matrix;", "getMDrawMatrix$annotations", "mDrawMatrix", "k", "tempMatrix", "B", "D", "focusPoint", "A", "()Landroid/graphics/PointF;", "C", "(Landroid/graphics/PointF;)V", "drawee_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private s mScaleType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Object mScaleTypeState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public PointF mFocusPoint;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int mUnderlyingWidth;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int mUnderlyingHeight;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public Matrix mDrawMatrix;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Matrix tempMatrix;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Drawable drawable, s scaleType) {
        super(drawable);
        p013kotlin.jvm.internal.s.k(scaleType, "scaleType");
        this.tempMatrix = new Matrix();
        this.mScaleType = scaleType;
    }

    private final void z() {
        boolean z11;
        s sVar = this.mScaleType;
        if (sVar instanceof e0) {
            p013kotlin.jvm.internal.s.i(sVar, "null cannot be cast to non-null type com.facebook.drawee.drawable.ScalingUtils.StatefulScaleType");
            Object state = ((e0) sVar).getState();
            p013kotlin.jvm.internal.s.j(state, "getState(...)");
            z11 = !p013kotlin.jvm.internal.s.f(state, this.mScaleTypeState);
            this.mScaleTypeState = state;
        } else {
            z11 = false;
        }
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        if (this.mUnderlyingWidth == current.getIntrinsicWidth() && this.mUnderlyingHeight == current.getIntrinsicHeight() && !z11) {
            return;
        }
        y();
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final PointF getMFocusPoint() {
        return this.mFocusPoint;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final s getMScaleType() {
        return this.mScaleType;
    }

    public final void C(PointF pointF) {
        if (pk.i.a(this.mFocusPoint, pointF)) {
            return;
        }
        if (pointF == null) {
            this.mFocusPoint = null;
        } else {
            if (this.mFocusPoint == null) {
                this.mFocusPoint = new PointF();
            }
            PointF pointF2 = this.mFocusPoint;
            p013kotlin.jvm.internal.s.h(pointF2);
            pointF2.set(pointF);
        }
        y();
        invalidateSelf();
    }

    public final void D(s scaleType) {
        p013kotlin.jvm.internal.s.k(scaleType, "scaleType");
        if (pk.i.a(this.mScaleType, scaleType)) {
            return;
        }
        this.mScaleType = scaleType;
        this.mScaleTypeState = null;
        y();
        invalidateSelf();
    }

    @Override // ll.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        p013kotlin.jvm.internal.s.k(canvas, "canvas");
        z();
        if (this.mDrawMatrix == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.mDrawMatrix);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // ll.g, ll.g0
    public void m(Matrix transform) {
        p013kotlin.jvm.internal.s.k(transform, "transform");
        u(transform);
        z();
        Matrix matrix = this.mDrawMatrix;
        if (matrix != null) {
            transform.preConcat(matrix);
        }
    }

    @Override // ll.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        p013kotlin.jvm.internal.s.k(bounds, "bounds");
        y();
    }

    @Override // ll.g
    public Drawable w(Drawable newDelegate) {
        Drawable drawableW = super.w(newDelegate);
        y();
        return drawableW;
    }

    public final void y() {
        float f11;
        Drawable current = getCurrent();
        if (current == null) {
            this.mUnderlyingHeight = 0;
            this.mUnderlyingWidth = 0;
            this.mDrawMatrix = null;
            return;
        }
        Rect bounds = getBounds();
        p013kotlin.jvm.internal.s.j(bounds, "getBounds(...)");
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.mUnderlyingWidth = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.mUnderlyingHeight = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.mDrawMatrix = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            current.setBounds(bounds);
            this.mDrawMatrix = null;
            return;
        }
        if (this.mScaleType == s.f90213a) {
            current.setBounds(bounds);
            this.mDrawMatrix = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.tempMatrix.reset();
        s sVar = this.mScaleType;
        Matrix matrix = this.tempMatrix;
        PointF pointF = this.mFocusPoint;
        float f12 = 0.5f;
        if (pointF != null) {
            p013kotlin.jvm.internal.s.h(pointF);
            f11 = pointF.x;
        } else {
            f11 = 0.5f;
        }
        PointF pointF2 = this.mFocusPoint;
        if (pointF2 != null) {
            p013kotlin.jvm.internal.s.h(pointF2);
            f12 = pointF2.y;
        }
        sVar.a(matrix, bounds, intrinsicWidth, intrinsicHeight, f11, f12);
        this.mDrawMatrix = this.tempMatrix;
    }
}
