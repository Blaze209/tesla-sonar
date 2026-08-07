package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.z0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public class r implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f79542a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<View> f79543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f79544c;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(r.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private r(View view, Runnable runnable) {
        this.f79543b = new AtomicReference<>(view);
        this.f79544c = runnable;
    }

    public static /* synthetic */ void a(r rVar, View view) {
        rVar.getClass();
        view.getViewTreeObserver().removeOnDrawListener(rVar);
    }

    public static /* synthetic */ void b(Window window, Window.Callback callback, Runnable runnable, z0 z0Var) {
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            window.setCallback(callback);
            e(viewPeekDecorView, runnable, z0Var);
        }
    }

    private static boolean c(View view) {
        return view.getViewTreeObserver().isAlive() && view.isAttachedToWindow();
    }

    public static void d(Activity activity, final Runnable runnable, final z0 z0Var) {
        final Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                e(viewPeekDecorView, runnable, z0Var);
            } else {
                final Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.j(callback != null ? callback : new io.sentry.android.core.internal.gestures.b(), new Runnable() { // from class: io.sentry.android.core.internal.util.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.b(window, callback, runnable, z0Var);
                    }
                }));
            }
        }
    }

    public static void e(View view, Runnable runnable, z0 z0Var) {
        r rVar = new r(view, runnable);
        if (z0Var.d() >= 26 || c(view)) {
            view.getViewTreeObserver().addOnDrawListener(rVar);
        } else {
            view.addOnAttachStateChangeListener(rVar.new a());
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View andSet = this.f79543b.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.q
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                r.a(this.f79540a, andSet);
            }
        });
        this.f79542a.postAtFrontOfQueue(this.f79544c);
    }
}
