package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes5.dex */
abstract class c<V extends View> extends e<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f41471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    OverScroller f41472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f41475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f41476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private VelocityTracker f41477j;

    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CoordinatorLayout f41478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final V f41479b;

        a(CoordinatorLayout coordinatorLayout, V v11) {
            this.f41478a = coordinatorLayout;
            this.f41479b = v11;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f41479b == null || (overScroller = c.this.f41472e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                c.this.R(this.f41478a, this.f41479b);
                return;
            }
            c cVar = c.this;
            cVar.T(this.f41478a, this.f41479b, cVar.f41472e.getCurrY());
            ViewCompat.h0(this.f41479b, this);
        }
    }

    public c() {
        this.f41474g = -1;
        this.f41476i = -1;
    }

    private void M() {
        if (this.f41477j == null) {
            this.f41477j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        boolean z11;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.f41477j;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f41477j.computeCurrentVelocity(1000);
                N(coordinatorLayout, v11, -P(v11), 0, this.f41477j.getYVelocity(this.f41474g));
                z11 = true;
            }
            this.f41473f = false;
            this.f41474g = -1;
            velocityTracker = this.f41477j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f41477j = null;
            }
            velocityTracker2 = this.f41477j;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.f41473f) {
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f41474g);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y11 = (int) motionEvent.getY(iFindPointerIndex);
            int i11 = this.f41475h - y11;
            this.f41475h = y11;
            S(coordinatorLayout, v11, i11, O(v11), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i12 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f41474g = motionEvent.getPointerId(i12);
                this.f41475h = (int) (motionEvent.getY(i12) + 0.5f);
            }
        }
        z11 = false;
        velocityTracker2 = this.f41477j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.f41473f || z11;
        z11 = false;
        this.f41473f = false;
        this.f41474g = -1;
        velocityTracker = this.f41477j;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f41477j = null;
        }
        velocityTracker2 = this.f41477j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f41473f) {
        }
    }

    boolean L(V v11) {
        return false;
    }

    final boolean N(CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11, int i12, float f11) {
        Runnable runnable = this.f41471d;
        if (runnable != null) {
            v11.removeCallbacks(runnable);
            this.f41471d = null;
        }
        if (this.f41472e == null) {
            this.f41472e = new OverScroller(v11.getContext());
        }
        this.f41472e.fling(0, I(), 0, Math.round(f11), 0, 0, i11, i12);
        if (!this.f41472e.computeScrollOffset()) {
            R(coordinatorLayout, v11);
            return false;
        }
        a aVar = new a(coordinatorLayout, v11);
        this.f41471d = aVar;
        ViewCompat.h0(v11, aVar);
        return true;
    }

    int O(@NonNull V v11) {
        return -v11.getHeight();
    }

    int P(@NonNull V v11) {
        return v11.getHeight();
    }

    int Q() {
        return I();
    }

    void R(CoordinatorLayout coordinatorLayout, V v11) {
    }

    final int S(CoordinatorLayout coordinatorLayout, V v11, int i11, int i12, int i13) {
        return U(coordinatorLayout, v11, Q() - i11, i12, i13);
    }

    int T(CoordinatorLayout coordinatorLayout, V v11, int i11) {
        return U(coordinatorLayout, v11, i11, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int U(CoordinatorLayout coordinatorLayout, V v11, int i11, int i12, int i13) {
        int iB;
        int I = I();
        if (i12 == 0 || I < i12 || I > i13 || I == (iB = o5.a.b(i11, i12, i13))) {
            return 0;
        }
        K(iB);
        return I - iB;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f41476i < 0) {
            this.f41476i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f41473f) {
            int i11 = this.f41474g;
            if (i11 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i11)) == -1) {
                return false;
            }
            int y11 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y11 - this.f41475h) > this.f41476i) {
                this.f41475h = y11;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f41474g = -1;
            int x11 = (int) motionEvent.getX();
            int y12 = (int) motionEvent.getY();
            boolean z11 = L(v11) && coordinatorLayout.isPointInChildBounds(v11, x11, y12);
            this.f41473f = z11;
            if (z11) {
                this.f41475h = y12;
                this.f41474g = motionEvent.getPointerId(0);
                M();
                OverScroller overScroller = this.f41472e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f41472e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f41477j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41474g = -1;
        this.f41476i = -1;
    }
}
