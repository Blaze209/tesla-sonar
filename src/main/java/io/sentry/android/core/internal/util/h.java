package io.sentry.android.core.internal.util;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements io.sentry.util.runtime.a {
    public static /* synthetic */ Object c(Runnable runnable) {
        runnable.run();
        return null;
    }

    @Override // io.sentry.util.runtime.a
    public <T> T a(io.sentry.util.runtime.a.InterfaceC1708a<T> interfaceC1708a) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        try {
            return interfaceC1708a.run();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // io.sentry.util.runtime.a
    public void b(final Runnable runnable) {
        a(new io.sentry.util.runtime.a.InterfaceC1708a() { // from class: io.sentry.android.core.internal.util.g
            @Override // io.sentry.util.runtime.a.InterfaceC1708a
            public final Object run() {
                return h.c(runnable);
            }
        });
    }
}
