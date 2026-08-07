package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Qo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f27516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f27518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f27519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f27520e;

    public /* synthetic */ Qo(long j11, long j12, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Qo)) {
            return false;
        }
        Qo qo2 = (Qo) obj;
        return k3.p1.r(this.f27516a, qo2.f27516a) && k3.p1.r(this.f27517b, qo2.f27517b) && k3.p1.r(this.f27518c, qo2.f27518c) && k3.p1.r(this.f27519d, qo2.f27519d) && k3.p1.r(this.f27520e, qo2.f27520e);
    }

    public int hashCode() {
        return (((((((k3.p1.x(this.f27516a) * 31) + k3.p1.x(this.f27517b)) * 31) + k3.p1.x(this.f27518c)) * 31) + k3.p1.x(this.f27519d)) * 31) + k3.p1.x(this.f27520e);
    }

    public String toString() {
        return "OrcaNfcScanner(backgroundColor=" + k3.p1.y(this.f27516a) + ", scannerInstructionTextColor=" + k3.p1.y(this.f27517b) + ", progressColor=" + k3.p1.y(this.f27518c) + ", emptyProgressColor=" + k3.p1.y(this.f27519d) + ", closeButtonColor=" + k3.p1.y(this.f27520e) + ")";
    }

    private Qo(long j11, long j12, long j13, long j14, long j15) {
        this.f27516a = j11;
        this.f27517b = j12;
        this.f27518c = j13;
        this.f27519d = j14;
        this.f27520e = j15;
    }
}
