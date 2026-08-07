package io.sentry;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z8 f80311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f80312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f80313c;

    public c4(z8 z8Var, j jVar, Double d11, Map<String, Object> map) {
        this.f80311a = (z8) io.sentry.util.y.c(z8Var, "transactionContexts is required");
        this.f80312b = d11;
        this.f80313c = map == null ? Collections.EMPTY_MAP : map;
    }

    public Double a() {
        return this.f80312b;
    }

    public z8 b() {
        return this.f80311a;
    }
}
