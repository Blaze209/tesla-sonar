package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Dh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f25468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f25469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f25470c;

    public /* synthetic */ Dh(boolean z11, long j11, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, j11, f11);
    }

    public final long a() {
        return this.f25469b;
    }

    public final boolean b() {
        return this.f25468a;
    }

    public final float c() {
        return this.f25470c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dh)) {
            return false;
        }
        Dh dh2 = (Dh) obj;
        return this.f25468a == dh2.f25468a && k3.p1.r(this.f25469b, dh2.f25469b) && w4.h.i(this.f25470c, dh2.f25470c);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f25468a) * 31) + k3.p1.x(this.f25469b)) * 31) + w4.h.j(this.f25470c);
    }

    public String toString() {
        return "IndicatorSettings(showIndicator=" + this.f25468a + ", color=" + k3.p1.y(this.f25469b) + ", width=" + w4.h.k(this.f25470c) + ")";
    }

    private Dh(boolean z11, long j11, float f11) {
        this.f25468a = z11;
        this.f25469b = j11;
        this.f25470c = f11;
    }

    public /* synthetic */ Dh(boolean z11, long j11, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? k3.p1.INSTANCE.a() : j11, (i11 & 4) != 0 ? w4.h.g(4) : f11, null);
    }
}
