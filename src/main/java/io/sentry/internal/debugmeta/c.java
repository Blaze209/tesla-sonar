package io.sentry.internal.debugmeta;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.util.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ILogger f80662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f80663b;

    public c(ILogger iLogger) {
        this(iLogger, c.class.getClassLoader());
    }

    @Override // io.sentry.internal.debugmeta.a
    public List<Properties> a() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f80663b.getResources(d.f81455a);
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                try {
                    InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(urlNextElement);
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStreamOpenStream);
                        arrayList.add(properties);
                        this.f80662a.c(b7.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                        if (inputStreamOpenStream != null) {
                            inputStreamOpenStream.close();
                        }
                    } catch (Throwable th2) {
                        if (inputStreamOpenStream != null) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (RuntimeException e11) {
                    this.f80662a.b(b7.ERROR, e11, "%s file is malformed.", urlNextElement);
                }
            }
        } catch (IOException e12) {
            this.f80662a.b(b7.ERROR, e12, "Failed to load %s", d.f81455a);
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        this.f80662a.c(b7.INFO, "No %s file was found.", d.f81455a);
        return null;
    }

    c(ILogger iLogger, ClassLoader classLoader) {
        this.f80662a = iLogger;
        this.f80663b = io.sentry.util.b.a(classLoader);
    }
}
