package io.sentry.react;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.v0;
import io.sentry.ILogger;
import io.sentry.android.core.n2;
import io.sentry.android.core.z;
import io.sentry.android.core.z0;
import io.sentry.b7;
import io.sentry.o5;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class RNSentryOnDrawReporterManager extends SimpleViewManager<a> {
    public static final String REACT_CLASS = "RNSentryOnDrawReporter";
    public static final String TTFD_PREFIX = "ttfd-";
    public static final String TTID_PREFIX = "ttid-";
    private final ReactApplicationContext mCallerContext;

    public RNSentryOnDrawReporterManager(ReactApplicationContext reactApplicationContext) {
        this.mCallerContext = reactApplicationContext;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @no.a(defaultBoolean = false, name = "fullDisplay")
    public void setFullDisplay(a aVar, boolean z11) {
        aVar.setFullDisplay(z11);
    }

    @no.a(defaultBoolean = false, name = "initialDisplay")
    public void setInitialDisplay(a aVar, boolean z11) {
        aVar.setInitialDisplay(z11);
    }

    @no.a(name = "parentSpanId")
    public void setParentSpanId(a aVar, String str) {
        aVar.setParentSpanId(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(v0 v0Var) {
        return new a(this.mCallerContext, new z0(new z()));
    }

    public static class a extends View {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final ILogger f81175h = new z("RNSentryOnDrawReporterView");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReactApplicationContext f81176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o5 f81177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final z0 f81178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f81179d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f81180e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f81181f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f81182g;

        public a(Context context) {
            super(context);
            this.f81177b = new n2();
            this.f81179d = false;
            this.f81180e = false;
            this.f81181f = false;
            this.f81182g = null;
            this.f81176a = null;
            this.f81178c = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            Double dValueOf = Double.valueOf(this.f81177b.now().f() / 1.0E9d);
            if (this.f81182g == null) {
                f81175h.c(b7.ERROR, "[TimeToDisplay] parentSpanId removed before frame was rendered.", new Object[0]);
                return;
            }
            if (this.f81179d) {
                w.e(RNSentryOnDrawReporterManager.TTID_PREFIX + this.f81182g, dValueOf);
                return;
            }
            if (!this.f81180e) {
                f81175h.c(b7.DEBUG, "[TimeToDisplay] display type removed before frame was rendered.", new Object[0]);
                return;
            }
            w.e(RNSentryOnDrawReporterManager.TTFD_PREFIX + this.f81182g, dValueOf);
        }

        private void c() {
            if (this.f81182g == null) {
                return;
            }
            if (this.f81181f) {
                f81175h.c(b7.DEBUG, "[TimeToDisplay] Already recorded time to display for spanId: " + this.f81182g, new Object[0]);
                return;
            }
            if (this.f81179d) {
                f81175h.c(b7.DEBUG, "[TimeToDisplay] Register initial display event emitter.", new Object[0]);
            } else {
                if (!this.f81180e) {
                    f81175h.c(b7.DEBUG, "[TimeToDisplay] Not ready, missing displayType prop.", new Object[0]);
                    return;
                }
                f81175h.c(b7.DEBUG, "[TimeToDisplay] Register full display event emitter.", new Object[0]);
            }
            if (this.f81178c == null) {
                f81175h.c(b7.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, buildInfo is null.", new Object[0]);
                return;
            }
            ReactApplicationContext reactApplicationContext = this.f81176a;
            if (reactApplicationContext == null) {
                f81175h.c(b7.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, reactContext is null.", new Object[0]);
                return;
            }
            ILogger iLogger = f81175h;
            Activity activityA = io.sentry.react.utils.a.a(reactApplicationContext, iLogger);
            if (activityA == null) {
                iLogger.c(b7.ERROR, "[TimeToDisplay] Won't emit next frame drawn event, activity is null.", new Object[0]);
            } else {
                this.f81181f = true;
                d(activityA, new Runnable() { // from class: io.sentry.react.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81221a.b();
                    }
                }, this.f81178c);
            }
        }

        protected void d(Activity activity, Runnable runnable, z0 z0Var) {
            io.sentry.android.core.internal.util.r.d(activity, runnable, z0Var);
        }

        public void setFullDisplay(boolean z11) {
            if (z11 != this.f81180e) {
                this.f81180e = z11;
                c();
            }
        }

        public void setInitialDisplay(boolean z11) {
            if (z11 != this.f81179d) {
                this.f81179d = z11;
                c();
            }
        }

        public void setParentSpanId(String str) {
            if (Objects.equals(str, this.f81182g)) {
                return;
            }
            this.f81182g = str;
            this.f81181f = false;
            c();
        }

        public a(ReactApplicationContext reactApplicationContext, z0 z0Var) {
            super(reactApplicationContext);
            this.f81177b = new n2();
            this.f81179d = false;
            this.f81180e = false;
            this.f81181f = false;
            this.f81182g = null;
            this.f81176a = reactApplicationContext;
            this.f81178c = z0Var;
        }
    }
}
