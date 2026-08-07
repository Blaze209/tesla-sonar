package com.fourthline.orca.internal;

import com.fourthline.orca.core.ProductConfig;

/* JADX INFO: renamed from: com.fourthline.orca.internal.nx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3619nx implements ProductConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4006wx f34005a;

    public C3619nx(C4006wx flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f34005a = flowConfig;
    }

    public final C4006wx a() {
        return this.f34005a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3619nx) && p013kotlin.jvm.internal.s.f(this.f34005a, ((C3619nx) obj).f34005a);
    }

    public int hashCode() {
        return this.f34005a.hashCode();
    }

    public String toString() {
        return "SelfieConfig(flowConfig=" + this.f34005a + ")";
    }
}
