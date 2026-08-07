package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3524lo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f33371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f33372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f33373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f33374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f33375e;

    public /* synthetic */ C3524lo(long j11, long j12, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15);
    }

    public final long a() {
        return this.f33375e;
    }

    public final long b() {
        return this.f33373c;
    }

    public final long c() {
        return this.f33371a;
    }

    public final long d() {
        return this.f33372b;
    }

    public final long e() {
        return this.f33374d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3524lo)) {
            return false;
        }
        C3524lo c3524lo = (C3524lo) obj;
        return k3.p1.r(this.f33371a, c3524lo.f33371a) && k3.p1.r(this.f33372b, c3524lo.f33372b) && k3.p1.r(this.f33373c, c3524lo.f33373c) && k3.p1.r(this.f33374d, c3524lo.f33374d) && k3.p1.r(this.f33375e, c3524lo.f33375e);
    }

    public int hashCode() {
        return (((((((k3.p1.x(this.f33371a) * 31) + k3.p1.x(this.f33372b)) * 31) + k3.p1.x(this.f33373c)) * 31) + k3.p1.x(this.f33374d)) * 31) + k3.p1.x(this.f33375e);
    }

    public String toString() {
        return "OrcaAnimationColors(primary=" + k3.p1.y(this.f33371a) + ", success=" + k3.p1.y(this.f33372b) + ", danger=" + k3.p1.y(this.f33373c) + ", warning=" + k3.p1.y(this.f33374d) + ", caution=" + k3.p1.y(this.f33375e) + ")";
    }

    private C3524lo(long j11, long j12, long j13, long j14, long j15) {
        this.f33371a = j11;
        this.f33372b = j12;
        this.f33373c = j13;
        this.f33374d = j14;
        this.f33375e = j15;
    }
}
