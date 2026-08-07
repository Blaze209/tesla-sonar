package io.sentry;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes9.dex */
public final class z6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile z6 f81635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final io.sentry.util.a f81636d = new io.sentry.util.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile Boolean f81637e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final io.sentry.util.a f81638f = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f81639a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<io.sentry.protocol.y> f81640b = new CopyOnWriteArraySet();

    private z6() {
    }

    public static z6 d() {
        if (f81635c == null) {
            d1 d1VarA = f81636d.a();
            try {
                if (f81635c == null) {
                    f81635c = new z6();
                }
                if (d1VarA != null) {
                    d1VarA.close();
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
        return f81635c;
    }

    public void a(String str) {
        io.sentry.util.y.c(str, "integration is required.");
        this.f81639a.add(str);
    }

    public void b(String str, String str2) {
        io.sentry.util.y.c(str, "name is required.");
        io.sentry.util.y.c(str2, "version is required.");
        this.f81640b.add(new io.sentry.protocol.y(str, str2));
        d1 d1VarA = f81638f.a();
        try {
            f81637e = null;
            if (d1VarA != null) {
                d1VarA.close();
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

    public boolean c(ILogger iLogger) {
        Boolean bool = f81637e;
        if (bool != null) {
            return bool.booleanValue();
        }
        d1 d1VarA = f81638f.a();
        try {
            boolean z11 = false;
            for (io.sentry.protocol.y yVar : this.f81640b) {
                if (yVar.a().startsWith("maven:io.sentry:") && !"8.29.0".equalsIgnoreCase(yVar.b())) {
                    iLogger.c(b7.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", yVar.a(), "8.29.0", yVar.b());
                    z11 = true;
                }
            }
            if (z11) {
                b7 b7Var = b7.ERROR;
                iLogger.c(b7Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(b7Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(b7Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.c(b7Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            f81637e = Boolean.valueOf(z11);
            if (d1VarA != null) {
                d1VarA.close();
            }
            return z11;
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

    public Set<String> e() {
        return this.f81639a;
    }

    public Set<io.sentry.protocol.y> f() {
        return this.f81640b;
    }
}
