package com.plaid.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class D6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f46274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E6 f46275d;

    public D6() {
        throw null;
    }

    public final String a() {
        return this.f46272a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D6)) {
            return false;
        }
        D6 d11 = (D6) obj;
        return p013kotlin.jvm.internal.s.f(this.f46272a, d11.f46272a) && this.f46273b == d11.f46273b && p013kotlin.jvm.internal.s.f(this.f46274c, d11.f46274c) && this.f46275d == d11.f46275d;
    }

    public final int hashCode() {
        return this.f46275d.hashCode() + ((this.f46274c.hashCode() + ((Long.hashCode(this.f46273b) + (this.f46272a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RemoteLogEvent(eventName=" + this.f46272a + ", timestamp=" + this.f46273b + ", metadata=" + this.f46274c + ", logLevel=" + this.f46275d + ")";
    }

    public D6(String eventName, Map metadata, E6 logLevel) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        p013kotlin.jvm.internal.s.k(eventName, "eventName");
        p013kotlin.jvm.internal.s.k(metadata, "metadata");
        p013kotlin.jvm.internal.s.k(logLevel, "logLevel");
        this.f46272a = eventName;
        this.f46273b = jCurrentTimeMillis;
        this.f46274c = metadata;
        this.f46275d = logLevel;
    }
}
