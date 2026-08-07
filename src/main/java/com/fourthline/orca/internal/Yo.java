package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Yo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f29921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f29922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f29923c;

    public /* synthetic */ Yo(long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Yo)) {
            return false;
        }
        Yo yo2 = (Yo) obj;
        return k3.p1.r(this.f29921a, yo2.f29921a) && k3.p1.r(this.f29922b, yo2.f29922b) && k3.p1.r(this.f29923c, yo2.f29923c);
    }

    public int hashCode() {
        return (((k3.p1.x(this.f29921a) * 31) + k3.p1.x(this.f29922b)) * 31) + k3.p1.x(this.f29923c);
    }

    public String toString() {
        return "OrcaScannerConfirmation(textColor=" + k3.p1.y(this.f29921a) + ", backgroundColor=" + k3.p1.y(this.f29922b) + ", bulletListColor=" + k3.p1.y(this.f29923c) + ")";
    }

    private Yo(long j11, long j12, long j13) {
        this.f29921a = j11;
        this.f29922b = j12;
        this.f29923c = j13;
    }
}
