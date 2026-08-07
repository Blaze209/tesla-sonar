package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f7791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f7792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f7793c;

    private d0(View view, Runnable runnable) {
        this.f7791a = view;
        this.f7792b = view.getViewTreeObserver();
        this.f7793c = runnable;
    }

    public static d0 a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        d0 d0Var = new d0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(d0Var);
        view.addOnAttachStateChangeListener(d0Var);
        return d0Var;
    }

    public void b() {
        if (this.f7792b.isAlive()) {
            this.f7792b.removeOnPreDrawListener(this);
        } else {
            this.f7791a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f7791a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f7793c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f7792b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
