package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.d1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f80677d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ILogger f80678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.a f80679b = new io.sentry.util.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Map<String, String> f80680c = null;

    public d(ILogger iLogger) {
        this.f80678a = iLogger;
    }

    @Override // io.sentry.internal.modules.b
    public Map<String, String> a() {
        if (this.f80680c == null) {
            d1 d1VarA = this.f80679b.a();
            try {
                if (this.f80680c == null) {
                    this.f80680c = b();
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
        return this.f80680c;
    }

    protected abstract Map<String, String> b();

    protected Map<String, String> c(InputStream inputStream) {
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f80677d));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                this.f80678a.c(b7.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e11) {
            this.f80678a.a(b7.ERROR, "Error extracting modules.", e11);
            return treeMap;
        } catch (RuntimeException e12) {
            this.f80678a.b(b7.ERROR, e12, "%s file is malformed.", "sentry-external-modules.txt");
            return treeMap;
        }
    }
}
