package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;

/* JADX INFO: loaded from: classes4.dex */
public final class XE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NetworkEnvironment f29721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f29724d;

    public XE(NetworkEnvironment networkEnvironment, String workflowId, String statusAccessToken, String onboardingAccessToken) {
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
        p013kotlin.jvm.internal.s.k(statusAccessToken, "statusAccessToken");
        p013kotlin.jvm.internal.s.k(onboardingAccessToken, "onboardingAccessToken");
        this.f29721a = networkEnvironment;
        this.f29722b = workflowId;
        this.f29723c = statusAccessToken;
        this.f29724d = onboardingAccessToken;
    }

    public final NetworkEnvironment a() {
        return this.f29721a;
    }

    public final String b() {
        return this.f29724d;
    }

    public final String c() {
        return this.f29723c;
    }

    public final String d() {
        return this.f29722b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XE)) {
            return false;
        }
        XE xe2 = (XE) obj;
        return p013kotlin.jvm.internal.s.f(this.f29721a, xe2.f29721a) && p013kotlin.jvm.internal.s.f(this.f29722b, xe2.f29722b) && p013kotlin.jvm.internal.s.f(this.f29723c, xe2.f29723c) && p013kotlin.jvm.internal.s.f(this.f29724d, xe2.f29724d);
    }

    public int hashCode() {
        return (((((this.f29721a.hashCode() * 31) + this.f29722b.hashCode()) * 31) + this.f29723c.hashCode()) * 31) + this.f29724d.hashCode();
    }

    public String toString() {
        return "WorkflowNetworkConfig(networkEnvironment=" + this.f29721a + ", workflowId=" + this.f29722b + ", statusAccessToken=" + this.f29723c + ", onboardingAccessToken=" + this.f29724d + ")";
    }
}
