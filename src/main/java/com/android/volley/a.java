package com.android.volley;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: com.android.volley.a$a, reason: collision with other inner class name */
    public static class C0410a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f20157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f20159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f20160d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f20161e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f20162f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Map<String, String> f20163g = Collections.EMPTY_MAP;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List<e> f20164h;

        public boolean a() {
            return b(System.currentTimeMillis());
        }

        boolean b(long j11) {
            return this.f20161e < j11;
        }

        boolean c(long j11) {
            return this.f20162f < j11;
        }
    }

    void a(String str, boolean z11);

    void b(String str, C0410a c0410a);

    C0410a get(String str);

    void initialize();
}
