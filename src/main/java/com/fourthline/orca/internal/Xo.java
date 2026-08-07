package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Xo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f29754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f29755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Yo f29756c;

    public /* synthetic */ Xo(long j11, long j12, Yo yo2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, yo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xo)) {
            return false;
        }
        Xo xo2 = (Xo) obj;
        return k3.p1.r(this.f29754a, xo2.f29754a) && k3.p1.r(this.f29755b, xo2.f29755b) && p013kotlin.jvm.internal.s.f(this.f29756c, xo2.f29756c);
    }

    public int hashCode() {
        return (((k3.p1.x(this.f29754a) * 31) + k3.p1.x(this.f29755b)) * 31) + this.f29756c.hashCode();
    }

    public String toString() {
        return "OrcaScanner(spinnerColor=" + k3.p1.y(this.f29754a) + ", progressColor=" + k3.p1.y(this.f29755b) + ", confirmation=" + this.f29756c + ")";
    }

    private Xo(long j11, long j12, Yo confirmation) {
        p013kotlin.jvm.internal.s.k(confirmation, "confirmation");
        this.f29754a = j11;
        this.f29755b = j12;
        this.f29756c = confirmation;
    }
}
