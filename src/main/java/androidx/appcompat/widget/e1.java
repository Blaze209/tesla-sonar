package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
class e1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static e1 f2666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static e1 f2667k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f2668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f2669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f2671d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f2672e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f1 f2675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2676i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.this.g(false);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e1.this.c();
        }
    }

    private e1(View view, CharSequence charSequence) {
        this.f2668a = view;
        this.f2669b = charSequence;
        this.f2670c = androidx.core.view.p0.g(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f2668a.removeCallbacks(this.f2671d);
    }

    private void b() {
        this.f2673f = Integer.MAX_VALUE;
        this.f2674g = Integer.MAX_VALUE;
    }

    private void d() {
        this.f2668a.postDelayed(this.f2671d, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(e1 e1Var) {
        e1 e1Var2 = f2666j;
        if (e1Var2 != null) {
            e1Var2.a();
        }
        f2666j = e1Var;
        if (e1Var != null) {
            e1Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        e1 e1Var = f2666j;
        if (e1Var != null && e1Var.f2668a == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new e1(view, charSequence);
            return;
        }
        e1 e1Var2 = f2667k;
        if (e1Var2 != null && e1Var2.f2668a == view) {
            e1Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean h(MotionEvent motionEvent) {
        int x11 = (int) motionEvent.getX();
        int y11 = (int) motionEvent.getY();
        if (Math.abs(x11 - this.f2673f) <= this.f2670c && Math.abs(y11 - this.f2674g) <= this.f2670c) {
            return false;
        }
        this.f2673f = x11;
        this.f2674g = y11;
        return true;
    }

    void c() {
        if (f2667k == this) {
            f2667k = null;
            f1 f1Var = this.f2675h;
            if (f1Var != null) {
                f1Var.c();
                this.f2675h = null;
                b();
                this.f2668a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f2666j == this) {
            e(null);
        }
        this.f2668a.removeCallbacks(this.f2672e);
    }

    void g(boolean z11) {
        long longPressTimeout;
        long j11;
        long j12;
        if (ViewCompat.S(this.f2668a)) {
            e(null);
            e1 e1Var = f2667k;
            if (e1Var != null) {
                e1Var.c();
            }
            f2667k = this;
            this.f2676i = z11;
            f1 f1Var = new f1(this.f2668a.getContext());
            this.f2675h = f1Var;
            f1Var.e(this.f2668a, this.f2673f, this.f2674g, this.f2676i, this.f2669b);
            this.f2668a.addOnAttachStateChangeListener(this);
            if (this.f2676i) {
                j12 = 2500;
            } else {
                if ((ViewCompat.M(this.f2668a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j11 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j11 = 15000;
                }
                j12 = j11 - longPressTimeout;
            }
            this.f2668a.removeCallbacks(this.f2672e);
            this.f2668a.postDelayed(this.f2672e, j12);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2675h != null && this.f2676i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f2668a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f2668a.isEnabled() && this.f2675h == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f2673f = view.getWidth() / 2;
        this.f2674g = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
