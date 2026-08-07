package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Bitmap;
import com.reactnativecommunity.clipboard.ClipboardModule;
import io.sentry.b7;
import io.sentry.r6;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
public final class ScreenshotEventProcessor implements io.sentry.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SentryAndroidOptions f79306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0 f79307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.n f79308c = new io.sentry.android.core.internal.util.n(io.sentry.android.core.internal.util.f.b(), 2000, 3);

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, z0 z0Var) {
        this.f79306a = (SentryAndroidOptions) io.sentry.util.y.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f79307b = (z0) io.sentry.util.y.c(z0Var, "BuildInfoProvider is required");
        if (sentryAndroidOptions.isAttachScreenshot()) {
            io.sentry.util.p.a("Screenshot");
        }
    }

    @Override // io.sentry.c0
    public r6 n(r6 r6Var, io.sentry.h0 h0Var) {
        final Bitmap bitmapC;
        if (r6Var.z0()) {
            if (!this.f79306a.isAttachScreenshot()) {
                this.f79306a.getLogger().c(b7.DEBUG, "attachScreenshot is disabled.", new Object[0]);
                return r6Var;
            }
            Activity activityB = h1.c().b();
            if (activityB != null && !io.sentry.util.n.i(h0Var)) {
                boolean zA = this.f79308c.a();
                this.f79306a.getBeforeScreenshotCaptureCallback();
                if (!zA && (bitmapC = io.sentry.android.core.internal.util.w.c(activityB, this.f79306a.getThreadChecker(), this.f79306a.getLogger(), this.f79307b)) != null) {
                    h0Var.m(io.sentry.b.a(new Callable() { // from class: io.sentry.android.core.h2
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return io.sentry.android.core.internal.util.w.d(bitmapC, this.f79411a.f79306a.getLogger());
                        }
                    }, "screenshot.png", ClipboardModule.MIMETYPE_PNG, false));
                    h0Var.k("android:activity", activityB);
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
