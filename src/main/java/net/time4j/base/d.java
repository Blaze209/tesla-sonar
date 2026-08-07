package net.time4j.base;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f93975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f93976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f93977c;

    private static class a extends d {
        a() {
            if (d.f93975a) {
                throw new IllegalStateException("The module time4j-android is not active. Check your configuration.");
            }
        }

        @Override // net.time4j.base.d
        public InputStream e(URI uri, boolean z11) {
            if (uri != null && !d.f93977c) {
                try {
                    URL url = uri.toURL();
                    if (!z11) {
                        return FirebasePerfUrlConnection.openStream(url);
                    }
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                    uRLConnection.setUseCaches(false);
                    uRLConnection.connect();
                    return uRLConnection.getInputStream();
                } catch (IOException e11) {
                    if (uri.toString().contains(".repository")) {
                        System.err.println("Warning: Loading of resource " + uri + " failed (" + e11.getMessage() + "). Consider setting the system property \"net.time4j.base.useClassloaderOnly\" for reducing overhead.");
                        e11.printStackTrace(System.err);
                    }
                }
            }
            return null;
        }

        @Override // net.time4j.base.d
        public URI f(String str, Class<?> cls, String str2) {
            String externalForm;
            try {
                try {
                    ProtectionDomain protectionDomain = cls.getProtectionDomain();
                    CodeSource codeSource = protectionDomain == null ? null : protectionDomain.getCodeSource();
                    if (codeSource != null) {
                        externalForm = codeSource.getLocation().toExternalForm();
                        try {
                            if (externalForm.endsWith(".jar")) {
                                externalForm = "jar:" + externalForm + "!/";
                            }
                            externalForm = externalForm + str2;
                            return new URI(externalForm);
                        } catch (URISyntaxException unused) {
                            System.err.println("Warning: malformed resource path = " + externalForm);
                            return null;
                        }
                    }
                } catch (SecurityException unused2) {
                }
            } catch (URISyntaxException unused3) {
                externalForm = null;
            }
            return null;
        }

        @Override // net.time4j.base.d
        public <S> Iterable<S> g(Class<S> cls) {
            return ServiceLoader.load(cls, cls.getClassLoader());
        }
    }

    static {
        boolean zEqualsIgnoreCase = "Dalvik".equalsIgnoreCase(System.getProperty("java.vm.name"));
        f93975a = zEqualsIgnoreCase;
        f93977c = !zEqualsIgnoreCase && Boolean.getBoolean("net.time4j.base.useClassloaderOnly");
        String property = System.getProperty("net.time4j.base.ResourceLoader");
        if (property == null) {
            f93976b = new a();
            return;
        }
        try {
            f93976b = (d) Class.forName(property).newInstance();
        } catch (Exception e11) {
            throw new AssertionError("Wrong configuration of external resource loader: " + e11.getMessage());
        }
    }

    protected d() {
    }

    public static d c() {
        return f93976b;
    }

    public final InputStream d(Class<?> cls, String str, boolean z11) throws IOException {
        if (f93975a) {
            throw new FileNotFoundException(str);
        }
        URL resource = cls.getClassLoader().getResource(str);
        if (resource == null) {
            throw new FileNotFoundException(str);
        }
        if (!z11) {
            return FirebasePerfUrlConnection.openStream(resource);
        }
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(resource.openConnection());
        uRLConnection.setUseCaches(false);
        uRLConnection.connect();
        return uRLConnection.getInputStream();
    }

    public abstract InputStream e(URI uri, boolean z11);

    public abstract URI f(String str, Class<?> cls, String str2);

    public abstract <S> Iterable<S> g(Class<S> cls);
}
