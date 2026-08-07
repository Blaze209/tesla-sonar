package io.sentry.profiling;

import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.c1;
import io.sentry.i2;
import io.sentry.n0;
import io.sentry.n2;
import io.sentry.p4;
import io.sentry.w0;
import java.util.Iterator;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static n0 a(ILogger iLogger, String str, int i11, c1 c1Var) {
        try {
            a aVar = (a) c(a.class);
            if (aVar != null) {
                iLogger.c(b7.DEBUG, "Loaded continuous profiler from provider: %s", aVar.getClass().getName());
                return aVar.a(iLogger, str, i11, c1Var);
            }
            iLogger.c(b7.DEBUG, "No continuous profiler provider found, using NoOpContinuousProfiler", new Object[0]);
            return i2.g();
        } catch (Throwable th2) {
            iLogger.a(b7.ERROR, "Failed to load continuous profiler provider, using NoOpContinuousProfiler", th2);
            return i2.g();
        }
    }

    public static w0 b() {
        ILogger logger = p4.g().B().getOptions().getLogger();
        try {
            b bVar = (b) c(b.class);
            if (bVar != null) {
                logger.c(b7.DEBUG, "Loaded profile converter from provider: %s", bVar.getClass().getName());
                return bVar.a();
            }
            logger.c(b7.DEBUG, "No profile converter provider found, using NoOpProfileConverter", new Object[0]);
            return n2.b();
        } catch (Throwable th2) {
            logger.a(b7.ERROR, "Failed to load profile converter provider, using NoOpProfileConverter", th2);
            return n2.b();
        }
    }

    private static <T> T c(Class<T> cls) {
        Iterator it = ServiceLoader.load(cls).iterator();
        if (it.hasNext()) {
            return (T) it.next();
        }
        return null;
    }
}
