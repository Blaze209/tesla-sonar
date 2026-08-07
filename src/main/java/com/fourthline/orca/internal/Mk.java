package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.TimedAnalyticsEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Mk implements InterfaceC3354ho.a, TimedAnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Throwable f26949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f26950e;

    public Mk(String name, int i11, int i12, Throwable th2, long j11) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.f26946a = name;
        this.f26947b = i11;
        this.f26948c = i12;
        this.f26949d = th2;
        this.f26950e = j11;
    }

    private final Kk a(Throwable th2) {
        return p013kotlin.jvm.internal.s.f(th2, ZD.a.f30007a) ? Kk.Connectivity : Kk.Generic;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mk)) {
            return false;
        }
        Mk mk2 = (Mk) obj;
        return p013kotlin.jvm.internal.s.f(this.f26946a, mk2.f26946a) && this.f26947b == mk2.f26947b && this.f26948c == mk2.f26948c && p013kotlin.jvm.internal.s.f(this.f26949d, mk2.f26949d) && this.f26950e == mk2.f26950e;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public Map getAttributes() {
        String message;
        Map mapC = p013kotlin.collections.v0.c();
        mapC.put("name", this.f26946a);
        mapC.put(AnalyticsAttribute.ElapsedTime, Long.valueOf(getElapsedTime()));
        mapC.put("status_code", Integer.valueOf(this.f26948c));
        mapC.put("request_size", Integer.valueOf(this.f26947b));
        Kk kkA = a(this.f26949d);
        mapC.put(AnalyticsAttribute.Error, AbstractC3989wg.a(kkA));
        if (kkA == Kk.Generic) {
            Throwable th2 = this.f26949d;
            if (th2 == null || (message = th2.getMessage()) == null) {
                message = AnalyticsAttribute.NotAvailable;
            }
            mapC.put(AnalyticsAttribute.Reason, message);
        }
        return p013kotlin.collections.v0.b(mapC);
    }

    @Override // com.fourthline.analytics.internal.TimedAnalyticsEvent
    public long getElapsedTime() {
        return this.f26950e;
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getEventName() {
        return "network_request_failed";
    }

    @Override // com.fourthline.analytics.internal.NewAnalyticsEvent
    public String getSchema() {
        return "iglu:com.fourthline.sdk/network_request_failed/jsonschema/1-0-1";
    }

    public int hashCode() {
        int iHashCode = ((((this.f26946a.hashCode() * 31) + Integer.hashCode(this.f26947b)) * 31) + Integer.hashCode(this.f26948c)) * 31;
        Throwable th2 = this.f26949d;
        return ((iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31) + Long.hashCode(this.f26950e);
    }

    public String toString() {
        return "RequestFailed(name=" + this.f26946a + ", requestSize=" + this.f26947b + ", statusCode=" + this.f26948c + ", error=" + this.f26949d + ", elapsedTime=" + this.f26950e + ")";
    }
}
