package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f28826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f28827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f28828c;

    public /* synthetic */ Uo(long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uo)) {
            return false;
        }
        Uo uo2 = (Uo) obj;
        return k3.p1.r(this.f28826a, uo2.f28826a) && k3.p1.r(this.f28827b, uo2.f28827b) && k3.p1.r(this.f28828c, uo2.f28828c);
    }

    public int hashCode() {
        return (((k3.p1.x(this.f28826a) * 31) + k3.p1.x(this.f28827b)) * 31) + k3.p1.x(this.f28828c);
    }

    public String toString() {
        return "OrcaPopup(titleColor=" + k3.p1.y(this.f28826a) + ", messageColor=" + k3.p1.y(this.f28827b) + ", backgroundColor=" + k3.p1.y(this.f28828c) + ")";
    }

    private Uo(long j11, long j12, long j13) {
        this.f28826a = j11;
        this.f28827b = j12;
        this.f28828c = j13;
    }
}
