package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f30095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f30096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f30097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f30098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f30099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C3739qo f30100f;

    public /* synthetic */ Zo(long j11, long j12, long j13, long j14, long j15, C3739qo c3739qo, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15, c3739qo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Zo)) {
            return false;
        }
        Zo zo2 = (Zo) obj;
        return k3.p1.r(this.f30095a, zo2.f30095a) && k3.p1.r(this.f30096b, zo2.f30096b) && k3.p1.r(this.f30097c, zo2.f30097c) && k3.p1.r(this.f30098d, zo2.f30098d) && k3.p1.r(this.f30099e, zo2.f30099e) && p013kotlin.jvm.internal.s.f(this.f30100f, zo2.f30100f);
    }

    public int hashCode() {
        return (((((((((k3.p1.x(this.f30095a) * 31) + k3.p1.x(this.f30096b)) * 31) + k3.p1.x(this.f30097c)) * 31) + k3.p1.x(this.f30098d)) * 31) + k3.p1.x(this.f30099e)) * 31) + this.f30100f.hashCode();
    }

    public String toString() {
        return "OrcaScreen(backgroundColor=" + k3.p1.y(this.f30095a) + ", headerColor=" + k3.p1.y(this.f30096b) + ", titleColor=" + k3.p1.y(this.f30097c) + ", messageColor=" + k3.p1.y(this.f30098d) + ", dividerColor=" + k3.p1.y(this.f30099e) + ", tableCells=" + this.f30100f + ")";
    }

    private Zo(long j11, long j12, long j13, long j14, long j15, C3739qo tableCells) {
        p013kotlin.jvm.internal.s.k(tableCells, "tableCells");
        this.f30095a = j11;
        this.f30096b = j12;
        this.f30097c = j13;
        this.f30098d = j14;
        this.f30099e = j15;
        this.f30100f = tableCells;
    }
}
