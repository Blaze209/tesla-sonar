package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.a0;
import com.google.android.material.progressindicator.b;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a<S extends com.google.android.material.progressindicator.b> extends ProgressBar {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f42465o = zs.l.I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    S f42466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f42469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f42470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f42471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f42472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ot.a f42473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f42474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f42475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f42476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f42477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f42478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f42479n;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.a$a, reason: collision with other inner class name */
    class RunnableC0669a implements Runnable {
        RunnableC0669a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.k();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.j();
            a.this.f42472g = -1L;
        }
    }

    class c extends androidx.vectordrawable.graphics.drawable.b {
        c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            a.this.setIndeterminate(false);
            a aVar = a.this;
            aVar.setProgressCompat(aVar.f42467b, a.this.f42468c);
        }
    }

    class d extends androidx.vectordrawable.graphics.drawable.b {
        d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            super.b(drawable);
            if (a.this.f42474i) {
                return;
            }
            a aVar = a.this;
            aVar.setVisibility(aVar.f42475j);
        }
    }

    protected a(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(wt.a.c(context, attributeSet, i11, f42465o), attributeSet, i11);
        this.f42472g = -1L;
        this.f42474i = false;
        this.f42475j = 4;
        this.f42476k = new RunnableC0669a();
        this.f42477l = new b();
        this.f42478m = new c();
        this.f42479n = new d();
        Context context2 = getContext();
        this.f42466a = (S) i(context2, attributeSet);
        TypedArray typedArrayI = a0.i(context2, attributeSet, zs.m.f128891g0, i11, i12, new int[0]);
        this.f42470e = typedArrayI.getInt(zs.m.f128963m0, -1);
        this.f42471f = Math.min(typedArrayI.getInt(zs.m.f128939k0, -1), 1000);
        typedArrayI.recycle();
        this.f42473h = new ot.a();
        this.f42469d = true;
    }

    private h<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().w();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ((g) getCurrentDrawable()).q(false, false, true);
        if (m()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f42471f > 0) {
            this.f42472g = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean m() {
        if (getProgressDrawable() == null || !getProgressDrawable().isVisible()) {
            return getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible();
        }
        return false;
    }

    private void n() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().v().d(this.f42478m);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().m(this.f42479n);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m(this.f42479n);
        }
    }

    private void o() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().s(this.f42479n);
            getIndeterminateDrawable().v().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().s(this.f42479n);
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f42466a.f42489f;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f42466a.f42486c;
    }

    public int getIndicatorTrackGapSize() {
        return this.f42466a.f42490g;
    }

    public int getShowAnimationBehavior() {
        return this.f42466a.f42488e;
    }

    public int getTrackColor() {
        return this.f42466a.f42487d;
    }

    public int getTrackCornerRadius() {
        return this.f42466a.f42485b;
    }

    public int getTrackThickness() {
        return this.f42466a.f42484a;
    }

    protected void h(boolean z11) {
        if (this.f42469d) {
            ((g) getCurrentDrawable()).q(p(), false, z11);
        }
    }

    abstract S i(@NonNull Context context, @NonNull AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    boolean l() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        n();
        if (p()) {
            k();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f42477l);
        removeCallbacks(this.f42476k);
        ((g) getCurrentDrawable()).i();
        o();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(@NonNull Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i11, int i12) {
        try {
            h<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i11) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i12) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i11) {
        super.onVisibilityChanged(view, i11);
        h(i11 == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i11) {
        super.onWindowVisibilityChanged(i11);
        h(false);
    }

    boolean p() {
        return ViewCompat.S(this) && getWindowVisibility() == 0 && l();
    }

    public void setAnimatorDurationScaleProvider(@NonNull ot.a aVar) {
        this.f42473h = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f42523c = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f42523c = aVar;
        }
    }

    public void setHideAnimationBehavior(int i11) {
        this.f42466a.f42489f = i11;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z11) {
        try {
            if (z11 == isIndeterminate()) {
                return;
            }
            g gVar = (g) getCurrentDrawable();
            if (gVar != null) {
                gVar.i();
            }
            super.setIndeterminate(z11);
            g gVar2 = (g) getCurrentDrawable();
            if (gVar2 != null) {
                gVar2.q(p(), false, false);
            }
            if ((gVar2 instanceof j) && p()) {
                ((j) gVar2).v().g();
            }
            this.f42474i = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof j)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((g) drawable).i();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{ht.a.b(getContext(), zs.c.f128591s, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f42466a.f42486c = iArr;
        getIndeterminateDrawable().v().c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i11) {
        S s11 = this.f42466a;
        if (s11.f42490g != i11) {
            s11.f42490g = i11;
            s11.e();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i11) {
        if (isIndeterminate()) {
            return;
        }
        setProgressCompat(i11, false);
    }

    public void setProgressCompat(int i11, boolean z11) {
        if (!isIndeterminate()) {
            super.setProgress(i11);
            if (getProgressDrawable() == null || z11) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f42467b = i11;
            this.f42468c = z11;
            this.f42474i = true;
            if (!getIndeterminateDrawable().isVisible() || this.f42473h.a(getContext().getContentResolver()) == BitmapDescriptorFactory.HUE_RED) {
                this.f42478m.b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().v().f();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof f)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            f fVar = (f) drawable;
            fVar.i();
            super.setProgressDrawable(fVar);
            fVar.B(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i11) {
        this.f42466a.f42488e = i11;
        invalidate();
    }

    public void setTrackColor(int i11) {
        S s11 = this.f42466a;
        if (s11.f42487d != i11) {
            s11.f42487d = i11;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i11) {
        S s11 = this.f42466a;
        if (s11.f42485b != i11) {
            s11.f42485b = Math.min(i11, s11.f42484a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i11) {
        S s11 = this.f42466a;
        if (s11.f42484a != i11) {
            s11.f42484a = i11;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i11) {
        if (i11 != 0 && i11 != 4 && i11 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f42475j = i11;
    }

    @Override // android.widget.ProgressBar
    public j<S> getIndeterminateDrawable() {
        return (j) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public f<S> getProgressDrawable() {
        return (f) super.getProgressDrawable();
    }
}
