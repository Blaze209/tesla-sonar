package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.r6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public final class ViewHierarchyEventProcessor implements io.sentry.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SentryAndroidOptions f79349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.n f79350b = new io.sentry.android.core.internal.util.n(io.sentry.android.core.internal.util.f.b(), 2000, 3);

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        this.f79349a = (SentryAndroidOptions) io.sentry.util.y.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            io.sentry.util.p.a("ViewHierarchy");
        }
    }

    public static /* synthetic */ void a(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, ILogger iLogger) {
        try {
            atomicReference.set(f(view, list));
            countDownLatch.countDown();
        } catch (Throwable th2) {
            iLogger.a(b7.ERROR, "Failed to process view hierarchy.", th2);
        }
    }

    private static void b(View view, io.sentry.protocol.k0 k0Var, List<io.sentry.internal.viewhierarchy.a> list) {
        if (view instanceof ViewGroup) {
            Iterator<io.sentry.internal.viewhierarchy.a> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().a(k0Var, view)) {
                    return;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt != null) {
                    io.sentry.protocol.k0 k0VarG = g(childAt);
                    arrayList.add(k0VarG);
                    b(childAt, k0VarG, list);
                }
            }
            k0Var.m(arrayList);
        }
    }

    public static io.sentry.protocol.j0 d(Activity activity, ILogger iLogger) {
        return e(activity, new ArrayList(0), io.sentry.android.core.internal.util.j.e(), iLogger);
    }

    public static io.sentry.protocol.j0 e(Activity activity, final List<io.sentry.internal.viewhierarchy.a> list, io.sentry.util.thread.a aVar, ILogger iLogger) {
        final ILogger iLogger2;
        Throwable th2;
        if (activity == null) {
            iLogger.c(b7.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.c(b7.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        final View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            iLogger.c(b7.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        try {
            if (!aVar.a()) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final AtomicReference atomicReference = new AtomicReference(null);
                iLogger2 = iLogger;
                try {
                    activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.u2
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewHierarchyEventProcessor.a(atomicReference, viewPeekDecorView, list, countDownLatch, iLogger2);
                        }
                    });
                    if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                        return (io.sentry.protocol.j0) atomicReference.get();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    iLogger2.a(b7.ERROR, "Failed to process view hierarchy.", th2);
                }
                return null;
            }
            try {
                return f(viewPeekDecorView, list);
            } catch (Throwable th4) {
                th2 = th4;
                iLogger2 = iLogger;
            }
        } catch (Throwable th5) {
            th = th5;
            iLogger2 = iLogger;
        }
        th2 = th;
        iLogger2.a(b7.ERROR, "Failed to process view hierarchy.", th2);
        return null;
    }

    public static io.sentry.protocol.j0 f(View view, List<io.sentry.internal.viewhierarchy.a> list) {
        ArrayList arrayList = new ArrayList(1);
        io.sentry.protocol.j0 j0Var = new io.sentry.protocol.j0("android_view_system", arrayList);
        io.sentry.protocol.k0 k0VarG = g(view);
        arrayList.add(k0VarG);
        b(view, k0VarG, list);
        return j0Var;
    }

    private static io.sentry.protocol.k0 g(View view) {
        io.sentry.protocol.k0 k0Var = new io.sentry.protocol.k0();
        k0Var.p(io.sentry.android.core.internal.util.k.a(view));
        try {
            k0Var.o(io.sentry.android.core.internal.gestures.i.b(view));
        } catch (Throwable unused) {
        }
        k0Var.t(Double.valueOf(view.getX()));
        k0Var.u(Double.valueOf(view.getY()));
        k0Var.s(Double.valueOf(view.getWidth()));
        k0Var.n(Double.valueOf(view.getHeight()));
        k0Var.l(Double.valueOf(view.getAlpha()));
        int visibility = view.getVisibility();
        if (visibility == 0) {
            k0Var.r("visible");
        } else if (visibility == 4) {
            k0Var.r("invisible");
        } else if (visibility == 8) {
            k0Var.r("gone");
        }
        return k0Var;
    }

    @Override // io.sentry.c0
    public r6 n(r6 r6Var, io.sentry.h0 h0Var) {
        io.sentry.protocol.j0 j0VarE;
        if (r6Var.z0()) {
            if (!this.f79349a.isAttachViewHierarchy()) {
                this.f79349a.getLogger().c(b7.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return r6Var;
            }
            if (!io.sentry.util.n.i(h0Var)) {
                boolean zA = this.f79350b.a();
                this.f79349a.getBeforeViewHierarchyCaptureCallback();
                if (!zA && (j0VarE = e(h1.c().b(), this.f79349a.getViewHierarchyExporters(), this.f79349a.getThreadChecker(), this.f79349a.getLogger())) != null) {
                    h0Var.o(io.sentry.b.c(j0VarE));
                }
            }
        }
        return r6Var;
    }

    @Override // io.sentry.c0
    public io.sentry.protocol.e0 o(io.sentry.protocol.e0 e0Var, io.sentry.h0 h0Var) {
        return e0Var;
    }
}
