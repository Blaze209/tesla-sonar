package io.sentry.android.core.cache;

import com.adyen.checkout.components.core.Address;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.performance.h;
import io.sentry.b7;
import io.sentry.cache.f;
import io.sentry.h0;
import io.sentry.p5;
import io.sentry.q7;
import io.sentry.transport.p;
import io.sentry.util.i;
import io.sentry.util.n;
import io.sentry.util.y;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p f79381j;

    public d(SentryAndroidOptions sentryAndroidOptions) {
        this(sentryAndroidOptions, io.sentry.android.core.internal.util.f.b());
    }

    public static /* synthetic */ void F(d dVar, SentryAndroidOptions sentryAndroidOptions, AnrV2Integration.b bVar) {
        dVar.getClass();
        Long lB = bVar.b();
        sentryAndroidOptions.getLogger().c(b7.DEBUG, "Writing last reported ANR marker with timestamp %d", lB);
        dVar.K(lB);
    }

    public static boolean H(q7 q7Var) {
        String outboxPath = q7Var.getOutboxPath();
        if (outboxPath == null) {
            q7Var.getLogger().c(b7.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
            return false;
        }
        final File file = new File(outboxPath, "startup_crash");
        try {
            boolean zBooleanValue = ((Boolean) q7Var.getRuntimeManager().a(new io.sentry.util.runtime.a.InterfaceC1708a() { // from class: io.sentry.android.core.cache.a
                @Override // io.sentry.util.runtime.a.InterfaceC1708a
                public final Object run() {
                    return Boolean.valueOf(file.exists());
                }
            })).booleanValue();
            if (!zBooleanValue || ((Boolean) q7Var.getRuntimeManager().a(new io.sentry.util.runtime.a.InterfaceC1708a() { // from class: io.sentry.android.core.cache.b
                @Override // io.sentry.util.runtime.a.InterfaceC1708a
                public final Object run() {
                    return Boolean.valueOf(file.delete());
                }
            })).booleanValue()) {
                return zBooleanValue;
            }
            q7Var.getLogger().c(b7.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
            return zBooleanValue;
        } catch (Throwable th2) {
            q7Var.getLogger().a(b7.ERROR, "Error reading/deleting the startup crash marker file on the disk", th2);
            return false;
        }
    }

    public static Long I(q7 q7Var) {
        File file = new File((String) y.c(q7Var.getCacheDirPath(), "Cache dir path should be set for getting ANRs reported"), "last_anr_report");
        try {
            String strC = i.c(file);
            if (strC.equals(Address.ADDRESS_NULL_PLACEHOLDER)) {
                return null;
            }
            return Long.valueOf(Long.parseLong(strC.trim()));
        } catch (Throwable th2) {
            if (th2 instanceof FileNotFoundException) {
                q7Var.getLogger().c(b7.DEBUG, "Last ANR marker does not exist. %s.", file.getAbsolutePath());
            } else {
                q7Var.getLogger().a(b7.ERROR, "Error reading last ANR marker", th2);
            }
            return null;
        }
    }

    private boolean J(p5 p5Var, h0 h0Var) {
        boolean zF3 = super.f3(p5Var, h0Var);
        final SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f80348a;
        io.sentry.android.core.performance.i iVarR = h.q().r();
        if (n.h(h0Var, UncaughtExceptionHandlerIntegration.a.class) && iVarR.m()) {
            long jA = this.f79381j.a() - iVarR.j();
            if (jA <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                sentryAndroidOptions.getLogger().c(b7.DEBUG, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jA));
                L();
            }
        }
        n.k(h0Var, AnrV2Integration.b.class, new n.a() { // from class: io.sentry.android.core.cache.c
            @Override // io.sentry.util.n.a
            public final void accept(Object obj) {
                d.F(this.f79379a, sentryAndroidOptions, (AnrV2Integration.b) obj);
            }
        });
        return zF3;
    }

    private void K(Long l11) {
        String cacheDirPath = this.f80348a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f80348a.getLogger().c(b7.DEBUG, "Cache dir path is null, the ANR marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, "last_anr_report"));
            try {
                fileOutputStream.write(String.valueOf(l11).getBytes(f80347e));
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            this.f80348a.getLogger().a(b7.ERROR, "Error writing the ANR marker to the disk", th4);
        }
    }

    private void L() {
        String outboxPath = this.f80348a.getOutboxPath();
        if (outboxPath == null) {
            this.f80348a.getLogger().c(b7.DEBUG, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
            return;
        }
        try {
            new File(outboxPath, "startup_crash").createNewFile();
        } catch (Throwable th2) {
            this.f80348a.getLogger().a(b7.ERROR, "Error writing the startup crash marker file to the disk", th2);
        }
    }

    @Override // io.sentry.cache.f, io.sentry.cache.g
    public void W2(p5 p5Var, h0 h0Var) {
        J(p5Var, h0Var);
    }

    @Override // io.sentry.cache.f, io.sentry.cache.g
    public boolean f3(p5 p5Var, h0 h0Var) {
        return J(p5Var, h0Var);
    }

    d(SentryAndroidOptions sentryAndroidOptions, p pVar) {
        super(sentryAndroidOptions, (String) y.c(sentryAndroidOptions.getCacheDirPath(), "cacheDirPath must not be null"), sentryAndroidOptions.getMaxCacheItems());
        this.f79381j = pVar;
    }
}
