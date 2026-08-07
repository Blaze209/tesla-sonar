package com.plaid.internal;

import com.google.android.gms.location.DeviceOrientationRequest;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions;

/* JADX INFO: renamed from: com.plaid.internal.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4505p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f48037c;

    /* JADX INFO: renamed from: com.plaid.internal.p4$a */
    public static final class a {
        public static C4505p4 a(Common$PollingOptions options) {
            p013kotlin.jvm.internal.s.k(options, "options");
            boolean zF = p013kotlin.jvm.internal.s.f(options, Common$PollingOptions.getDefaultInstance());
            long maxDurationMs = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
            if (zF) {
                X5.a.b(X5.f46812a, "No polling options received");
                long intervalMs = options.getIntervalMs() > 0 ? options.getIntervalMs() : 500L;
                if (options.getMaxDurationMs() > 0) {
                    maxDurationMs = options.getMaxDurationMs();
                }
                return new C4505p4(false, intervalMs, maxDurationMs);
            }
            if (options.getIntervalMs() <= 0 || options.getMaxDurationMs() <= 0) {
                X5.a.b(X5.f46812a, "Invalid polling options received - duration: " + options.getMaxDurationMs() + " interval: " + options.getIntervalMs());
            }
            long intervalMs2 = options.getIntervalMs() > 0 ? options.getIntervalMs() : 500L;
            if (options.getMaxDurationMs() > 0) {
                maxDurationMs = options.getMaxDurationMs();
            }
            return new C4505p4(true, intervalMs2, maxDurationMs);
        }
    }

    public C4505p4(boolean z11, long j11, long j12) {
        this.f48035a = z11;
        this.f48036b = j11;
        this.f48037c = j12;
    }

    public final long a() {
        return this.f48036b;
    }

    public final long b() {
        return this.f48037c;
    }

    public final boolean c() {
        return this.f48035a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4505p4)) {
            return false;
        }
        C4505p4 c4505p4 = (C4505p4) obj;
        return this.f48035a == c4505p4.f48035a && this.f48036b == c4505p4.f48036b && this.f48037c == c4505p4.f48037c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f48037c) + ((Long.hashCode(this.f48036b) + (Boolean.hashCode(this.f48035a) * 31)) * 31);
    }

    public final String toString() {
        return "OAuthPollingOptions(shouldPoll=" + this.f48035a + ", interval=" + this.f48036b + ", maxDuration=" + this.f48037c + ")";
    }
}
