package io.sentry.internal;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.sentry.d1;
import io.sentry.z6;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f80654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final io.sentry.util.a f80655e = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f80656a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1700a f80657b = new C1700a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.sentry.util.a f80658c = new io.sentry.util.a();

    /* JADX INFO: renamed from: io.sentry.internal.a$a, reason: collision with other inner class name */
    public static final class C1700a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile String f80659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile String f80660b;
    }

    private a() {
    }

    public static a a() {
        if (f80654d == null) {
            d1 d1VarA = f80655e.a();
            try {
                if (f80654d == null) {
                    f80654d = new a();
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
        return f80654d;
    }

    public void b() {
        if (this.f80656a) {
            return;
        }
        try {
            d1 d1VarA = this.f80658c.a();
            try {
                if (this.f80656a) {
                    if (d1VarA != null) {
                        d1VarA.close();
                    }
                    this.f80656a = true;
                    return;
                }
                Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
                while (resources.hasMoreElements()) {
                    try {
                        Attributes mainAttributes = new Manifest(FirebasePerfUrlConnection.openStream(resources.nextElement())).getMainAttributes();
                        if (mainAttributes != null) {
                            String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                            String value2 = mainAttributes.getValue("Implementation-Version");
                            String value3 = mainAttributes.getValue("Sentry-SDK-Name");
                            String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                            if (value != null && value2 != null) {
                                this.f80657b.f80659a = value;
                                this.f80657b.f80660b = value2;
                                String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                                if (value5 != null) {
                                    z6.d().b("maven:io.opentelemetry:opentelemetry-sdk", value5);
                                    z6.d().a("OpenTelemetry");
                                }
                                String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                                if (value6 != null) {
                                    z6.d().b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                                    z6.d().a("OpenTelemetry-Agent");
                                }
                                if (value.equals("sentry.java.opentelemetry.agentless")) {
                                    z6.d().a("OpenTelemetry-Agentless");
                                }
                                if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                                    z6.d().a("OpenTelemetry-Agentless-Spring");
                                }
                            }
                            if (value3 != null && value2 != null && value4 != null && value3.startsWith("sentry.java")) {
                                z6.d().b(value4, value2);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                if (d1VarA != null) {
                    d1VarA.close();
                }
                this.f80656a = true;
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
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f80656a = true;
            throw th4;
        }
        this.f80656a = true;
    }
}
