package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3506lC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f33260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f33261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.l f33262c;

    public /* synthetic */ C3506lC(boolean z11, long j11, wn0.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, j11, lVar);
    }

    public final wn0.l a() {
        return this.f33262c;
    }

    public final long b() {
        return this.f33261b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3506lC)) {
            return false;
        }
        C3506lC c3506lC = (C3506lC) obj;
        return this.f33260a == c3506lC.f33260a && k3.p1.r(this.f33261b, c3506lC.f33261b) && p013kotlin.jvm.internal.s.f(this.f33262c, c3506lC.f33262c);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f33260a) * 31) + k3.p1.x(this.f33261b)) * 31) + this.f33262c.hashCode();
    }

    public String toString() {
        return "TopBarButtonState(enabled=" + this.f33260a + ", tint=" + k3.p1.y(this.f33261b) + ", onClick=" + this.f33262c + ")";
    }

    private C3506lC(boolean z11, long j11, wn0.l onClick) {
        p013kotlin.jvm.internal.s.k(onClick, "onClick");
        this.f33260a = z11;
        this.f33261b = j11;
        this.f33262c = onClick;
    }
}
