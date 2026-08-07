package com.fourthline.orca.internal;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class Po implements Jk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3438jo f27374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f27375b;

    public Po(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        this.f27374a = tracker;
        this.f27375b = new LinkedHashMap();
    }

    private final Pair b(String str) {
        return jn0.x.a("request_duration", Long.valueOf(e(str)));
    }

    private final Pair c(String str) {
        return jn0.x.a("request_name", str);
    }

    private final Pair d(String str) {
        if (str == null) {
            str = "N/A";
        }
        return jn0.x.a("trace_id", str);
    }

    private final long e(String str) {
        Long l11 = (Long) this.f27375b.get(str);
        if (l11 == null) {
            return -1L;
        }
        return a() - l11.longValue();
    }

    @Override // com.fourthline.orca.internal.Jk
    public void a(String requestName, Integer num) {
        p013kotlin.jvm.internal.s.k(requestName, "requestName");
        this.f27375b.put(requestName, Long.valueOf(a()));
        C3103bt.a(C3103bt.f30707a, "orca_network_request_start", null, p013kotlin.collections.v0.m(c(requestName), jn0.x.a("isPublic", Boolean.FALSE)), 2, null);
        this.f27374a.a(new Nk(requestName, num != null ? num.intValue() : 0));
    }

    private final Pair b(Integer num) {
        return jn0.x.a("status_code", Integer.valueOf(num != null ? num.intValue() : -1));
    }

    @Override // com.fourthline.orca.internal.Jk
    public void a(String requestName, Integer num, Integer num2, String str) {
        p013kotlin.jvm.internal.s.k(requestName, "requestName");
        C3103bt.a(C3103bt.f30707a, "orca_network_request_succeed", null, p013kotlin.collections.v0.m(c(requestName), b(requestName), a(num), d(str), b(num2), jn0.x.a("isPublic", Boolean.FALSE)), 2, null);
        this.f27374a.a(new Lk(requestName, num != null ? num.intValue() : 0, num2 != null ? num2.intValue() : -1, e(requestName)));
    }

    @Override // com.fourthline.orca.internal.Jk
    public void a(String requestName, Integer num, Integer num2, String str, Throwable th2) {
        p013kotlin.jvm.internal.s.k(requestName, "requestName");
        C3103bt.a(C3103bt.f30707a, "orca_network_request_failed", null, p013kotlin.collections.v0.m(c(requestName), b(requestName), a(num), d(str), b(num2), a(th2 != null ? AbstractC3396io.b(th2) : null), jn0.x.a("isPublic", Boolean.FALSE)), 2, null);
        this.f27374a.a(new Mk(requestName, num != null ? num.intValue() : 0, num2 != null ? num2.intValue() : -1, th2, e(requestName)));
    }

    private final Pair a(Integer num) {
        return jn0.x.a("request_size", Long.valueOf(num == null ? 0L : num.intValue()));
    }

    private final Pair a(String str) {
        if (str == null) {
            str = "N/A";
        }
        return jn0.x.a("error_message", str);
    }

    private final long a() {
        return SystemClock.uptimeMillis();
    }
}
