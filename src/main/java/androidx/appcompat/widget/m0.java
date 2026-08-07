package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f2739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final View f2742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f2743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f2744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f2747i = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = m0.this.f2742d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m0.this.e();
        }
    }

    public m0(View view) {
        this.f2742d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2739a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2740b = tapTimeout;
        this.f2741c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f2744f;
        if (runnable != null) {
            this.f2742d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f2743e;
        if (runnable2 != null) {
            this.f2742d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        k0 k0Var;
        View view = this.f2742d;
        o.e eVarB = b();
        if (eVarB != null && eVarB.a() && (k0Var = (k0) eVarB.j()) != null && k0Var.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            i(view, motionEventObtainNoHistory);
            j(k0Var, motionEventObtainNoHistory);
            boolean zE = k0Var.e(motionEventObtainNoHistory, this.f2746h);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z11 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zE && z11) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    private boolean g(MotionEvent motionEvent) {
        View view = this.f2742d;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2746h = motionEvent.getPointerId(0);
            if (this.f2743e == null) {
                this.f2743e = new a();
            }
            view.postDelayed(this.f2743e, this.f2740b);
            if (this.f2744f == null) {
                this.f2744f = new b();
            }
            view.postDelayed(this.f2744f, this.f2741c);
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f2746h);
            if (iFindPointerIndex >= 0 && !h(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f2739a)) {
                a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            a();
        }
        return false;
    }

    private static boolean h(View view, float f11, float f12, float f13) {
        float f14 = -f13;
        return f11 >= f14 && f12 >= f14 && f11 < ((float) (view.getRight() - view.getLeft())) + f13 && f12 < ((float) (view.getBottom() - view.getTop())) + f13;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f2747i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f2747i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public abstract o.e b();

    protected abstract boolean c();

    protected boolean d() {
        o.e eVarB = b();
        if (eVarB == null || !eVarB.a()) {
            return true;
        }
        eVarB.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f2742d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f2745g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        boolean z12 = this.f2745g;
        if (z12) {
            z11 = f(motionEvent) || !d();
        } else {
            z11 = g(motionEvent) && c();
            if (z11) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                this.f2742d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f2745g = z11;
        return z11 || z12;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f2745g = false;
        this.f2746h = -1;
        Runnable runnable = this.f2743e;
        if (runnable != null) {
            this.f2742d.removeCallbacks(runnable);
        }
    }
}
