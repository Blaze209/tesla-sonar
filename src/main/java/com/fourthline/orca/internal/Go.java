package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Go {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f25989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25990b;

    public /* synthetic */ Go(long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Go)) {
            return false;
        }
        Go go2 = (Go) obj;
        return k3.p1.r(this.f25989a, go2.f25989a) && k3.p1.r(this.f25990b, go2.f25990b);
    }

    public int hashCode() {
        return (k3.p1.x(this.f25989a) * 31) + k3.p1.x(this.f25990b);
    }

    public String toString() {
        return "OrcaGraphic(backgroundColor=" + k3.p1.y(this.f25989a) + ", primaryColor=" + k3.p1.y(this.f25990b) + ")";
    }

    private Go(long j11, long j12) {
        this.f25989a = j11;
        this.f25990b = j12;
    }
}
