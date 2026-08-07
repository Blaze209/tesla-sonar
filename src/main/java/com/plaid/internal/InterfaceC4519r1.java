package com.plaid.internal;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.plaid.internal.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4519r1 {

    /* JADX INFO: renamed from: com.plaid.internal.r1$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f48079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48080c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f48081d;

        public a(String str, boolean z11, String str2, int i11) {
            this.f48078a = str;
            this.f48079b = z11;
            this.f48081d = str2;
            this.f48080c = i11;
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.r1$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f48083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f48084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map<String, String> f48085d;

        public b(int i11, String str, String str2, Map<String, List<String>> map) {
            this.f48082a = str2;
            this.f48083b = i11;
            this.f48084c = str;
            HashMap map2 = new HashMap();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    map2.put(entry.getKey().toLowerCase(), TextUtils.join(", ", entry.getValue()));
                }
            }
            this.f48085d = Collections.unmodifiableMap(map2);
        }
    }

    b a(a aVar);

    void a();

    EnumC4589z isConnected();
}
