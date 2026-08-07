package io.sentry.config;

import io.sentry.ILogger;
import io.sentry.b7;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/* JADX INFO: loaded from: classes9.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f80429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f80430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f80431c;

    public e(String str, ILogger iLogger) {
        this(str, iLogger, true);
    }

    public Properties a() {
        try {
            File file = new File(this.f80429a.trim());
            if (!file.isFile() || !file.canRead()) {
                if (file.isFile()) {
                    if (!file.canRead()) {
                        this.f80430b.c(b7.ERROR, "Failed to load Sentry configuration since it is not readable: %s", this.f80429a);
                    }
                } else if (this.f80431c) {
                    this.f80430b.c(b7.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", this.f80429a);
                }
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
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
            this.f80430b.b(b7.ERROR, th4, "Failed to load Sentry configuration from file: %s", this.f80429a);
            return null;
        }
    }

    public e(String str, ILogger iLogger, boolean z11) {
        this.f80429a = str;
        this.f80430b = iLogger;
        this.f80431c = z11;
    }
}
