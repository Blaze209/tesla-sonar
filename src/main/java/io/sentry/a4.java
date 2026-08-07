package io.sentry;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f79223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, String> f79224b;

    public a4(String str, Map<String, String> map) {
        io.sentry.util.y.c(str, "url is required");
        io.sentry.util.y.c(map, "headers is required");
        try {
            this.f79223a = URI.create(str).toURL();
            this.f79224b = map;
        } catch (MalformedURLException e11) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e11);
        }
    }

    public Map<String, String> a() {
        return this.f79224b;
    }

    public URL b() {
        return this.f79223a;
    }
}
