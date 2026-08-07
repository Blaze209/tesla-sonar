package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3567mo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f33625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f33626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f33627c;

    public /* synthetic */ C3567mo(long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3567mo)) {
            return false;
        }
        C3567mo c3567mo = (C3567mo) obj;
        return k3.p1.r(this.f33625a, c3567mo.f33625a) && k3.p1.r(this.f33626b, c3567mo.f33626b) && k3.p1.r(this.f33627c, c3567mo.f33627c);
    }

    public int hashCode() {
        return (((k3.p1.x(this.f33625a) * 31) + k3.p1.x(this.f33626b)) * 31) + k3.p1.x(this.f33627c);
    }

    public String toString() {
        return "OrcaBox(backgroundColor=" + k3.p1.y(this.f33625a) + ", borderColor=" + k3.p1.y(this.f33626b) + ", titleColor=" + k3.p1.y(this.f33627c) + ")";
    }

    private C3567mo(long j11, long j12, long j13) {
        this.f33625a = j11;
        this.f33626b = j12;
        this.f33627c = j13;
    }
}
