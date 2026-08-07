package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Ho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f26134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26136c;

    public /* synthetic */ Ho(long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ho)) {
            return false;
        }
        Ho ho2 = (Ho) obj;
        return k3.p1.r(this.f26134a, ho2.f26134a) && k3.p1.r(this.f26135b, ho2.f26135b) && k3.p1.r(this.f26136c, ho2.f26136c);
    }

    public int hashCode() {
        return (((k3.p1.x(this.f26134a) * 31) + k3.p1.x(this.f26135b)) * 31) + k3.p1.x(this.f26136c);
    }

    public String toString() {
        return "OrcaHint(textColor=" + k3.p1.y(this.f26134a) + ", backgroundColor=" + k3.p1.y(this.f26135b) + ", borderColor=" + k3.p1.y(this.f26136c) + ")";
    }

    private Ho(long j11, long j12, long j13) {
        this.f26134a = j11;
        this.f26135b = j12;
        this.f26136c = j13;
    }
}
