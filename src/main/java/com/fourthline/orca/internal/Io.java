package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Io {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f26353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f26356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f26357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f26358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f26359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f26360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f26361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f26362j;

    public /* synthetic */ Io(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Io)) {
            return false;
        }
        Io io2 = (Io) obj;
        return k3.p1.r(this.f26353a, io2.f26353a) && k3.p1.r(this.f26354b, io2.f26354b) && k3.p1.r(this.f26355c, io2.f26355c) && k3.p1.r(this.f26356d, io2.f26356d) && k3.p1.r(this.f26357e, io2.f26357e) && k3.p1.r(this.f26358f, io2.f26358f) && k3.p1.r(this.f26359g, io2.f26359g) && k3.p1.r(this.f26360h, io2.f26360h) && k3.p1.r(this.f26361i, io2.f26361i) && k3.p1.r(this.f26362j, io2.f26362j);
    }

    public int hashCode() {
        return (((((((((((((((((k3.p1.x(this.f26353a) * 31) + k3.p1.x(this.f26354b)) * 31) + k3.p1.x(this.f26355c)) * 31) + k3.p1.x(this.f26356d)) * 31) + k3.p1.x(this.f26357e)) * 31) + k3.p1.x(this.f26358f)) * 31) + k3.p1.x(this.f26359g)) * 31) + k3.p1.x(this.f26360h)) * 31) + k3.p1.x(this.f26361i)) * 31) + k3.p1.x(this.f26362j);
    }

    public String toString() {
        return "OrcaInputField(textColor=" + k3.p1.y(this.f26353a) + ", backgroundColor=" + k3.p1.y(this.f26354b) + ", borderColor=" + k3.p1.y(this.f26355c) + ", disabledTextColor=" + k3.p1.y(this.f26356d) + ", disabledBackgroundColor=" + k3.p1.y(this.f26357e) + ", disabledBorderColor=" + k3.p1.y(this.f26358f) + ", placeholderColor=" + k3.p1.y(this.f26359g) + ", titleColor=" + k3.p1.y(this.f26360h) + ", statusColor=" + k3.p1.y(this.f26361i) + ", errorColor=" + k3.p1.y(this.f26362j) + ")";
    }

    private Io(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21) {
        this.f26353a = j11;
        this.f26354b = j12;
        this.f26355c = j13;
        this.f26356d = j14;
        this.f26357e = j15;
        this.f26358f = j16;
        this.f26359g = j17;
        this.f26360h = j18;
        this.f26361i = j19;
        this.f26362j = j21;
    }
}
