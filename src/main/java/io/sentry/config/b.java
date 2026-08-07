package io.sentry.config;

import io.sentry.ILogger;
import io.sentry.b7;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: loaded from: classes9.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f80425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f80426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ILogger f80427c;

    public b(String str, ClassLoader classLoader, ILogger iLogger) {
        this.f80425a = str;
        this.f80426b = io.sentry.util.b.a(classLoader);
        this.f80427c = iLogger;
    }

    public Properties a() {
        try {
            InputStream resourceAsStream = this.f80426b.getResourceAsStream(this.f80425a);
            if (resourceAsStream == null) {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return null;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    resourceAsStream.close();
                    return properties;
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    resourceAsStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException e11) {
            this.f80427c.b(b7.ERROR, e11, "Failed to load Sentry configuration from classpath resource: %s", this.f80425a);
            return null;
        }
    }

    public b(ILogger iLogger) {
        this("sentry.properties", b.class.getClassLoader(), iLogger);
    }
}
