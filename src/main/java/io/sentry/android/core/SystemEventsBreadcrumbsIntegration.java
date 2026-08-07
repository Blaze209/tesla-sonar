package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.b7;
import io.sentry.q7;
import java.io.Closeable;
import java.util.HashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public final class SystemEventsBreadcrumbsIntegration implements io.sentry.o1, Closeable, y0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f79324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile b f79325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f79326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.sentry.z0 f79327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f79328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f79329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f79330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile IntentFilter f79331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile HandlerThread f79332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f79333j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final io.sentry.util.a f79334k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f79335l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Handler f79336m;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Integer f79337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Boolean f79338b;

        a(Integer num, Boolean bool) {
            this.f79337a = num;
            this.f79338b = bool;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return io.sentry.util.y.a(this.f79337a, aVar.f79337a) && io.sentry.util.y.a(this.f79338b, aVar.f79338b);
        }

        public int hashCode() {
            return io.sentry.util.y.b(this.f79337a, this.f79338b);
        }
    }

    final class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.sentry.z0 f79339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SentryAndroidOptions f79340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.sentry.android.core.internal.util.n f79341c = new io.sentry.android.core.internal.util.n(io.sentry.android.core.internal.util.f.b(), 60000, 0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final char[] f79342d = new char[64];

        b(io.sentry.z0 z0Var, SentryAndroidOptions sentryAndroidOptions) {
            this.f79339a = z0Var;
            this.f79340b = sentryAndroidOptions;
        }

        private io.sentry.e a(long j11, Intent intent, String str, a aVar) {
            Bundle extras;
            io.sentry.e eVar = new io.sentry.e(j11);
            eVar.z("system");
            eVar.u("device.event");
            String strB = b(str);
            if (strB != null) {
                eVar.v("action", strB);
            }
            if (aVar != null) {
                if (aVar.f79337a != null) {
                    eVar.v("level", aVar.f79337a);
                }
                if (aVar.f79338b != null) {
                    eVar.v("charging", aVar.f79338b);
                }
            } else if (this.f79340b.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
                HashMap map = new HashMap(extras.size());
                for (String str2 : extras.keySet()) {
                    try {
                        Object obj = extras.get(str2);
                        if (obj != null) {
                            map.put(str2, obj.toString());
                        }
                    } catch (Throwable th2) {
                        this.f79340b.getLogger().b(b7.ERROR, th2, "%s key of the %s action threw an error.", str2, str);
                    }
                }
                eVar.v("extras", map);
            }
            eVar.w(b7.INFO);
            return eVar;
        }

        String b(String str) {
            if (str == null) {
                return null;
            }
            int length = str.length();
            int length2 = this.f79342d.length;
            for (int i11 = length - 1; i11 >= 0; i11--) {
                char cCharAt = str.charAt(i11);
                if (cCharAt == '.') {
                    char[] cArr = this.f79342d;
                    return new String(cArr, length2, cArr.length - length2);
                }
                if (length2 == 0) {
                    return io.sentry.util.f0.d(str);
                }
                length2--;
                this.f79342d[length2] = cCharAt;
            }
            return str;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            a aVar;
            String action = intent.getAction();
            if (!"android.intent.action.BATTERY_CHANGED".equals(action)) {
                aVar = null;
            } else {
                if (this.f79341c.a()) {
                    return;
                }
                Float fE = o1.e(intent, this.f79340b);
                a aVar2 = new a(fE != null ? Integer.valueOf(fE.intValue()) : null, o1.v(intent, this.f79340b));
                if (aVar2.equals(SystemEventsBreadcrumbsIntegration.this.f79335l)) {
                    return;
                }
                SystemEventsBreadcrumbsIntegration.this.f79335l = aVar2;
                aVar = aVar2;
            }
            io.sentry.e eVarA = a(System.currentTimeMillis(), intent, action, aVar);
            io.sentry.h0 h0Var = new io.sentry.h0();
            h0Var.k("android:intent", intent);
            this.f79339a.d(eVarA, h0Var);
        }
    }

    public SystemEventsBreadcrumbsIntegration(Context context) {
        this(context, H(), null);
    }

    private static String[] H() {
        return new String[]{"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
    }

    private void I(final io.sentry.z0 z0Var, final SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.f79329f && !this.f79330g && this.f79325b == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.t2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SystemEventsBreadcrumbsIntegration.p(this.f79749a, z0Var, sentryAndroidOptions);
                    }
                });
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().c(b7.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    private void J() {
        SentryAndroidOptions sentryAndroidOptions = this.f79326c;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.s2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79739a.T();
                }
            });
        } catch (RejectedExecutionException unused) {
            T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        io.sentry.d1 d1VarA = this.f79334k.a();
        try {
            this.f79330g = true;
            b bVar = this.f79325b;
            this.f79325b = null;
            if (d1VarA != null) {
                d1VarA.close();
            }
            if (bVar != null) {
                this.f79324a.unregisterReceiver(bVar);
            }
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static /* synthetic */ void p(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, io.sentry.z0 z0Var, SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.d1 d1VarA = systemEventsBreadcrumbsIntegration.f79334k.a();
        try {
            if (!systemEventsBreadcrumbsIntegration.f79329f && !systemEventsBreadcrumbsIntegration.f79330g && systemEventsBreadcrumbsIntegration.f79325b == null) {
                systemEventsBreadcrumbsIntegration.f79325b = systemEventsBreadcrumbsIntegration.new b(z0Var, sentryAndroidOptions);
                if (systemEventsBreadcrumbsIntegration.f79331h == null) {
                    systemEventsBreadcrumbsIntegration.f79331h = new IntentFilter();
                    for (String str : systemEventsBreadcrumbsIntegration.f79328e) {
                        systemEventsBreadcrumbsIntegration.f79331h.addAction(str);
                    }
                }
                if (systemEventsBreadcrumbsIntegration.f79336m == null && systemEventsBreadcrumbsIntegration.f79332i == null) {
                    systemEventsBreadcrumbsIntegration.f79332i = new HandlerThread("SystemEventsReceiver", 10);
                    systemEventsBreadcrumbsIntegration.f79332i.start();
                }
                try {
                    Handler handler = systemEventsBreadcrumbsIntegration.f79336m;
                    if (handler == null) {
                        handler = new Handler(systemEventsBreadcrumbsIntegration.f79332i.getLooper());
                    }
                    g1.t(systemEventsBreadcrumbsIntegration.f79324a, sentryAndroidOptions, systemEventsBreadcrumbsIntegration.f79325b, systemEventsBreadcrumbsIntegration.f79331h, handler);
                    if (!systemEventsBreadcrumbsIntegration.f79333j.getAndSet(true)) {
                        sentryAndroidOptions.getLogger().c(b7.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                        io.sentry.util.p.a("SystemEventsBreadcrumbs");
                    }
                } catch (Throwable th2) {
                    sentryAndroidOptions.setEnableSystemEventBreadcrumbs(false);
                    sentryAndroidOptions.getLogger().a(b7.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th2);
                }
                if (d1VarA != null) {
                    d1VarA.close();
                    return;
                }
                return;
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th3) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // io.sentry.android.core.y0.a
    public void c() {
        if (this.f79327d == null || this.f79326c == null) {
            return;
        }
        this.f79330g = false;
        I(this.f79327d, this.f79326c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.sentry.d1 d1VarA = this.f79334k.a();
        try {
            this.f79329f = true;
            this.f79331h = null;
            if (this.f79332i != null) {
                this.f79332i.quit();
            }
            this.f79332i = null;
            if (d1VarA != null) {
                d1VarA.close();
            }
            y0.C().J(this);
            J();
            SentryAndroidOptions sentryAndroidOptions = this.f79326c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(b7.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.o1
    public void n(io.sentry.z0 z0Var, q7 q7Var) {
        io.sentry.util.y.c(z0Var, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.y.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        this.f79326c = sentryAndroidOptions;
        this.f79327d = z0Var;
        sentryAndroidOptions.getLogger().c(b7.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f79326c.isEnableSystemEventBreadcrumbs()));
        if (this.f79326c.isEnableSystemEventBreadcrumbs()) {
            y0.C().p(this);
            if (g1.s()) {
                I(this.f79327d, this.f79326c);
            }
        }
    }

    @Override // io.sentry.android.core.y0.a
    public void o() {
        J();
    }

    SystemEventsBreadcrumbsIntegration(Context context, String[] strArr, Handler handler) {
        this.f79329f = false;
        this.f79330g = false;
        this.f79331h = null;
        this.f79332i = null;
        this.f79333j = new AtomicBoolean(false);
        this.f79334k = new io.sentry.util.a();
        this.f79336m = null;
        this.f79324a = g1.g(context);
        this.f79328e = strArr;
        this.f79336m = handler;
    }
}
