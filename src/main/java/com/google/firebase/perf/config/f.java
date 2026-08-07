package com.google.firebase.perf.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends v<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f44425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Long, String> f44426b = Collections.unmodifiableMap(new a());

    class a extends HashMap<Long, String> {
        a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    private f() {
    }

    public static synchronized f e() {
        try {
            if (f44425a == null) {
                f44425a = new f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44425a;
    }

    protected static String f(long j11) {
        return f44426b.get(Long.valueOf(j11));
    }

    protected static boolean g(long j11) {
        return f44426b.containsKey(Long.valueOf(j11));
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.LogSourceName";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_log_source";
    }

    protected String d() {
        return hw.a.f73661c;
    }
}
