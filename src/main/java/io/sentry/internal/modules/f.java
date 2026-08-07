package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.b7;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ClassLoader f80682e;

    public f(ILogger iLogger) {
        this(iLogger, f.class.getClassLoader());
    }

    @Override // io.sentry.internal.modules.d
    protected Map<String, String> b() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream resourceAsStream = this.f80682e.getResourceAsStream("sentry-external-modules.txt");
            try {
                if (resourceAsStream != null) {
                    Map<String, String> mapC = c(resourceAsStream);
                    resourceAsStream.close();
                    return mapC;
                }
                this.f80678a.c(b7.INFO, "%s file was not found.", "sentry-external-modules.txt");
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                    return treeMap;
                }
                return treeMap;
            } catch (Throwable th2) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException e11) {
            this.f80678a.a(b7.INFO, "Access to resources failed.", e11);
        } catch (SecurityException e12) {
            this.f80678a.a(b7.INFO, "Access to resources denied.", e12);
        }
    }

    f(ILogger iLogger, ClassLoader classLoader) {
        super(iLogger);
        this.f80682e = io.sentry.util.b.a(classLoader);
    }
}
