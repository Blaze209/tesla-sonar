package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.po, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3696po {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f34615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f34616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f34617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f34618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f34619e;

    public /* synthetic */ C3696po(long j11, long j12, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3696po)) {
            return false;
        }
        C3696po c3696po = (C3696po) obj;
        return k3.p1.r(this.f34615a, c3696po.f34615a) && k3.p1.r(this.f34616b, c3696po.f34616b) && k3.p1.r(this.f34617c, c3696po.f34617c) && k3.p1.r(this.f34618d, c3696po.f34618d) && k3.p1.r(this.f34619e, c3696po.f34619e);
    }

    public int hashCode() {
        return (((((((k3.p1.x(this.f34615a) * 31) + k3.p1.x(this.f34616b)) * 31) + k3.p1.x(this.f34617c)) * 31) + k3.p1.x(this.f34618d)) * 31) + k3.p1.x(this.f34619e);
    }

    public String toString() {
        return "OrcaCell(backgroundColor=" + k3.p1.y(this.f34615a) + ", textColor=" + k3.p1.y(this.f34616b) + ", iconColor=" + k3.p1.y(this.f34617c) + ", borderColor=" + k3.p1.y(this.f34618d) + ", dividerColor=" + k3.p1.y(this.f34619e) + ")";
    }

    private C3696po(long j11, long j12, long j13, long j14, long j15) {
        this.f34615a = j11;
        this.f34616b = j12;
        this.f34617c = j13;
        this.f34618d = j14;
        this.f34619e = j15;
    }
}
