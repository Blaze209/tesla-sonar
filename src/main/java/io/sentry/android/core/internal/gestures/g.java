package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b7;
import io.sentry.b9;
import io.sentry.d4;
import io.sentry.f4;
import io.sentry.h0;
import io.sentry.i1;
import io.sentry.r8;
import io.sentry.util.j0;
import io.sentry.x0;
import io.sentry.z0;
import io.sentry.z8;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<Activity> f79437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0 f79438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SentryAndroidOptions f79439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.sentry.internal.gestures.b f79440d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i1 f79441e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f79442f = b.Unknown;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f79443g = new c(null);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f79444a;

        static {
            int[] iArr = new int[b.values().length];
            f79444a = iArr;
            try {
                iArr[b.Click.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f79444a[b.Scroll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f79444a[b.Swipe.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f79444a[b.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private enum b {
        Click,
        Scroll,
        Swipe,
        Unknown
    }

    public g(Activity activity, z0 z0Var, SentryAndroidOptions sentryAndroidOptions) {
        this.f79437a = new WeakReference<>(activity);
        this.f79438b = z0Var;
        this.f79439c = sentryAndroidOptions;
    }

    public static /* synthetic */ void b(g gVar, x0 x0Var, i1 i1Var, i1 i1Var2) {
        if (i1Var2 != null) {
            gVar.f79439c.getLogger().c(b7.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", i1Var.getName());
        } else {
            gVar.getClass();
            x0Var.s(i1Var);
        }
    }

    public static /* synthetic */ void d(g gVar, x0 x0Var, i1 i1Var) {
        if (i1Var == gVar.f79441e) {
            x0Var.u();
        }
    }

    private void e(io.sentry.internal.gestures.b bVar, b bVar2, Map<String, Object> map, MotionEvent motionEvent) {
        if (this.f79439c.isEnableUserInteractionBreadcrumbs()) {
            String strJ = j(bVar2);
            h0 h0Var = new h0();
            h0Var.k("android:motionEvent", motionEvent);
            h0Var.k("android:view", bVar.f());
            this.f79438b.d(io.sentry.e.B(strJ, bVar.d(), bVar.a(), bVar.e(), map), h0Var);
        }
    }

    private View h(String str) {
        Activity activity = this.f79437a.get();
        if (activity == null) {
            this.f79439c.getLogger().c(b7.DEBUG, "Activity is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            this.f79439c.getLogger().c(b7.DEBUG, "Window is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        this.f79439c.getLogger().c(b7.DEBUG, "DecorView is null in " + str + ". No breadcrumb captured.", new Object[0]);
        return null;
    }

    private String i(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private static String j(b bVar) {
        int i11 = a.f79444a[bVar.ordinal()];
        if (i11 == 1) {
            return "click";
        }
        if (i11 != 2) {
            return i11 != 3 ? "unknown" : "swipe";
        }
        return "scroll";
    }

    private void l(io.sentry.internal.gestures.b bVar, b bVar2) {
        boolean z11 = bVar2 == b.Click || !(bVar2 == this.f79442f && bVar.equals(this.f79440d));
        if (!this.f79439c.isTracingEnabled() || !this.f79439c.isEnableUserInteractionTracing()) {
            if (z11) {
                if (this.f79439c.isEnableAutoTraceIdGeneration()) {
                    j0.h(this.f79438b);
                }
                this.f79440d = bVar;
                this.f79442f = bVar2;
                return;
            }
            return;
        }
        Activity activity = this.f79437a.get();
        if (activity == null) {
            this.f79439c.getLogger().c(b7.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String strB = bVar.b();
        i1 i1Var = this.f79441e;
        if (i1Var != null) {
            if (!z11 && !i1Var.isFinished()) {
                this.f79439c.getLogger().c(b7.DEBUG, "The view with id: " + strB + " already has an ongoing transaction assigned. Rescheduling finish", new Object[0]);
                if (this.f79439c.getIdleTimeout() != null) {
                    this.f79441e.d();
                    return;
                }
                return;
            }
            m(r8.OK);
        }
        String str = i(activity) + "." + strB;
        String str2 = "ui.action." + j(bVar2);
        b9 b9Var = new b9();
        b9Var.v(true);
        long deadlineTimeout = this.f79439c.getDeadlineTimeout();
        b9Var.s(deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout));
        b9Var.t(this.f79439c.getIdleTimeout());
        b9Var.i(true);
        b9Var.g("auto.ui.gesture_listener." + bVar.c());
        final i1 i1VarV = this.f79438b.v(new z8(str, io.sentry.protocol.h0.COMPONENT, str2), b9Var);
        this.f79438b.s(new f4() { // from class: io.sentry.android.core.internal.gestures.d
            @Override // io.sentry.f4
            public final void a(x0 x0Var) {
                this.f79430a.f(x0Var, i1VarV);
            }
        });
        this.f79441e = i1VarV;
        this.f79440d = bVar;
        this.f79442f = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(final x0 x0Var, final i1 i1Var) {
        x0Var.O(new d4.c() { // from class: io.sentry.android.core.internal.gestures.e
            @Override // io.sentry.d4.c
            public final void a(i1 i1Var2) {
                g.b(this.f79432a, x0Var, i1Var, i1Var2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(final x0 x0Var) {
        x0Var.O(new d4.c() { // from class: io.sentry.android.core.internal.gestures.f
            @Override // io.sentry.d4.c
            public final void a(i1 i1Var) {
                g.d(this.f79435a, x0Var, i1Var);
            }
        });
    }

    public void k(MotionEvent motionEvent) {
        View viewH = h("onUp");
        io.sentry.internal.gestures.b bVar = this.f79443g.f79446b;
        if (viewH == null || bVar == null) {
            return;
        }
        if (this.f79443g.f79445a == b.Unknown) {
            this.f79439c.getLogger().c(b7.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
            return;
        }
        e(bVar, this.f79443g.f79445a, Collections.singletonMap("direction", this.f79443g.i(motionEvent)), motionEvent);
        l(bVar, this.f79443g.f79445a);
        this.f79443g.j();
    }

    void m(r8 r8Var) {
        i1 i1Var = this.f79441e;
        if (i1Var != null) {
            if (i1Var.getStatus() == null) {
                this.f79441e.m(r8Var);
            } else {
                this.f79441e.g();
            }
        }
        this.f79438b.s(new f4() { // from class: io.sentry.android.core.internal.gestures.c
            @Override // io.sentry.f4
            public final void a(x0 x0Var) {
                this.f79429a.g(x0Var);
            }
        });
        this.f79441e = null;
        if (this.f79440d != null) {
            this.f79440d = null;
        }
        this.f79442f = b.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.f79443g.j();
        this.f79443g.f79447c = motionEvent.getX();
        this.f79443g.f79448d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        this.f79443g.f79445a = b.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        View viewH = h("onScroll");
        if (viewH != null && motionEvent != null && this.f79443g.f79445a == b.Unknown) {
            io.sentry.internal.gestures.b bVarA = i.a(this.f79439c, viewH, motionEvent.getX(), motionEvent.getY(), io.sentry.internal.gestures.b.a.SCROLLABLE);
            if (bVarA == null) {
                this.f79439c.getLogger().c(b7.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                this.f79443g.f79445a = b.Scroll;
                return false;
            }
            this.f79439c.getLogger().c(b7.DEBUG, "Scroll target found: " + bVarA.b(), new Object[0]);
            this.f79443g.k(bVarA);
            this.f79443g.f79445a = b.Scroll;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewH = h("onSingleTapUp");
        if (viewH != null && motionEvent != null) {
            io.sentry.internal.gestures.b bVarA = i.a(this.f79439c, viewH, motionEvent.getX(), motionEvent.getY(), io.sentry.internal.gestures.b.a.CLICKABLE);
            if (bVarA == null) {
                this.f79439c.getLogger().c(b7.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            b bVar = b.Click;
            e(bVarA, bVar, Collections.EMPTY_MAP, motionEvent);
            l(bVarA, bVar);
        }
        return false;
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f79445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private io.sentry.internal.gestures.b f79446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f79447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f79448d;

        private c() {
            this.f79445a = b.Unknown;
            this.f79447c = BitmapDescriptorFactory.HUE_RED;
            this.f79448d = BitmapDescriptorFactory.HUE_RED;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String i(MotionEvent motionEvent) {
            float x11 = motionEvent.getX() - this.f79447c;
            float y11 = motionEvent.getY() - this.f79448d;
            if (Math.abs(x11) > Math.abs(y11)) {
                return x11 > BitmapDescriptorFactory.HUE_RED ? "right" : "left";
            }
            return y11 > BitmapDescriptorFactory.HUE_RED ? "down" : "up";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            this.f79446b = null;
            this.f79445a = b.Unknown;
            this.f79447c = BitmapDescriptorFactory.HUE_RED;
            this.f79448d = BitmapDescriptorFactory.HUE_RED;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(io.sentry.internal.gestures.b bVar) {
            this.f79446b = bVar;
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }
}
