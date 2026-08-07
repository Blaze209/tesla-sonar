package io.sentry.android.core;

import com.google.android.gms.location.DeviceOrientationRequest;
import io.sentry.b7;
import io.sentry.q7;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 extends io.sentry.logger.g implements y0.a {

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.this.b(DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
        }
    }

    public a0(q7 q7Var, io.sentry.b1 b1Var) {
        super(q7Var, b1Var);
        y0.C().p(this);
    }

    @Override // io.sentry.logger.g, io.sentry.logger.c
    public void a(boolean z11) {
        y0.C().J(this);
        super.a(z11);
    }

    @Override // io.sentry.android.core.y0.a
    public void c() {
    }

    @Override // io.sentry.android.core.y0.a
    public void o() {
        try {
            this.f80752a.getExecutorService().submit(new a());
        } catch (Throwable th2) {
            this.f80752a.getLogger().b(b7.ERROR, th2, "Failed to submit log flush in onBackground()", new Object[0]);
        }
    }
}
